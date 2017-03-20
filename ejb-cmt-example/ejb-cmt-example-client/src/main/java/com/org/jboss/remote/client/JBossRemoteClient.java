package com.org.jboss.remote.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.org.jboss.CMTExample;
import com.org.jboss.impl.CMTExampleBean;

public class JBossRemoteClient {

    public static void main(String[] args) throws Exception {
        JBossRemoteClient jrc = new JBossRemoteClient();
        CMTExample cmtExample = jrc.lookup();
        cmtExample.required();
        cmtExample.callMandatory();
        try {
            cmtExample.callNeverWithTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cmtExample.callMandatoryWithoutTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public CMTExample lookup() throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        props.put(Context.PROVIDER_URL, "remote://localhost:4447");
        props.put(Context.SECURITY_PRINCIPAL, "admin");
        props.put(Context.SECURITY_CREDENTIALS, "secret");

        final Context context = new InitialContext(props);
        final String appName = "";
        final String moduleName = "cmt";
        final String distinctName = "";
        final String beanName = CMTExampleBean.class.getSimpleName();
        final String viewClassName = CMTExample.class.getName();

        return (CMTExample) context.lookup(
                "java:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
    }
}

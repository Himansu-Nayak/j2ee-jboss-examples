package com.org.jboss.cluster;

import javax.ejb.Remote;

@Remote
public interface RemoteStateless {
    String getNodeName();
}

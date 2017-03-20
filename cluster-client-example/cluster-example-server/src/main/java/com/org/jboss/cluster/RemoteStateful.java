package com.org.jboss.cluster;

public interface RemoteStateful {
    int getAndIncrementCounter();

    String getNodeName();

    void activate();

    void passivate();

    void destroy();
}

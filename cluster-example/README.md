
Description
-----------

This demo will show clustering of stateless- and stateful-session-beans. The stateful-session-bean is associated to the HTTP session. The HTTP Session will replicated to all cluster nodes.

It has been tested unter jboss 7.1.2.Final (which is in fact no real release), see
	https://github.com/jbossas/jboss-as/zipball/7.1.2.Final

There is a blogpost on http://blog.akquinet.de/ with a detailed description and explanation.


Start the JBoss Server
-------------------------

1. Open a command line and navigate to the root of the JBoss server directory.
2. The following shows the command line to start the server:

        For Linux:   JBOSS_HOME/bin/standalone.sh
        For Windows: JBOSS_HOME\bin\standalone.bat

 
Build and Deploy the Quickstart
-------------------------

_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Build and Deploy the Quickstarts](../README.md#build-and-deploy-the-quickstarts) for complete instructions and additional options._

1. Make sure you have started the JBoss Server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. Type this command to build and deploy the archive:

        mvn clean install jboss-as:deploy

4. This will deploy `target/cluster-example{version}.war` to the running instance of the server.


Access the application 
---------------------
The application will be running at the following URL <http://localhost:8080/cluster/>.

JBoss Clustering
----------------

[1. Introduction and Quick Start](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html)

[1.1. Quick Start Guide](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart)

[1.1.1. Initial Preparation](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart-setup)

[1.1.2. Launching a JBoss AS Cluster](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart-launching)

[1.1.3. Web Application Clustering Quick Start](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart-http)

[1.1.4. EJB Session Bean Clustering Quick Start](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart-ejbsessions)

[1.1.5. Entity Clustering Quick Start](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-intro.chapt.html#clustering-quickstart-ejb3entities)

[2. Clustering Concepts](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html)

[2.1. Cluster Definition](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-def)

[2.2. Service Architectures](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-arch)

[2.2.1. Client-side interceptor architecture](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-arch-proxy)

[2.2.2. External Load Balancer Architecture](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-arch-balancer)

[2.3. Load-Balancing Policies](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-balancepolicy)

[2.3.1. Client-side interceptor architecture](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#clustering-concepts-balancepolicy-30)

[2.3.2. External load balancer architecture](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/cluster.concepts.chapt.html#d0e606)

[3. Clustering Building Blocks](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html)

[3.1. Group Communication with JGroups](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-blocks-jgroups)

[3.1.1. The Channel Factory Service](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-blocks-jgroups-channelfactory)

[3.1.2. The JGroups Shared Transport](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-blocks-jgroups-sharedtransport)

[3.2. Distributed Caching with JBoss Cache](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-blocks-jbc)

[3.2.1. The JBoss AS CacheManager Service](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-blocks-jbc-cachemanager)

[3.3. The HAPartition Service](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-hapartition)

[3.3.1. DistributedReplicantManager Service](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-hapartition-drm)

[3.3.2. DistributedState Service](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-hapartition-distributedstate)

[3.3.3. Custom Use of HAPartition](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/clustering-blocks.chapt.html#clustering-hapartition-customsvcs)

[4. Clustered Deployment Options](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/deployment.chapt.html)

[4.1. Clustered Singleton Services](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/deployment.chapt.html#d0e1214)

[4.1.1. HASingleton Deployment Options](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/deployment.chapt.html#d0e1225)

[4.1.2. Determining the master node](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/deployment.chapt.html#d0e1353)

[4.2. Farming Deployment](https://docs.jboss.org/jbossclustering/cluster_guide/5.1/html/deployment.chapt.html#clustering-intro-farm)
What is it?
-----------

This quickstart demonstrates how to use *CDI 1.0 Events* in  Red Hat JBoss Enterprise Application Platform.

The JSF front-end client allows you to create both credit and debit operation events.

To test this quickstart, enter an amount, choose either a Credit or Debit operation, and then click on *Pay* to create the event.

A Session scoped (@SessionScoped) payment event handler catches the operation and produces (@Produces) a named list of all operations performed during this session.  The event is logged in the JBoss console and the event list is displayed in a table at the bottom of the form.
 
The payment-cdi-event quickstart defines the following classes:
 
 *   PaymentBean: 
     *   A session scoped bean that stores the payment form information: 
         *   payment amount
         *   operation type: debit or credit
     *   It contains the following utilities methods:
         *   public String pay(): Process the operation when the user clicks on submit. We have only one JSP page, so the method does not return anything and the flow of control doesn't change.
         *   public void reset(): Clear the payment form data.
 *   PaymentEvent: We have only one Event. It handles both credit and debit operations. Qualifiers help us to make the difference at injection point.
 *   PaymentTypeEnum:  A typesafe enum is used to represent the operation payment type. It contains utility methods to convert between String and Enum.
 *   The qualifiers package contains the Credit and Debit classes. The annotation determines the operation of injecting Event.
 *   The handler package containss Interfaces and implementations of PaymentEvent Observers.
     *   ICreditEventObserver: Interface to listen to CREDIT Event Only (@Observes @Credit).
     *   IDebitEventObserver: Interface to listen to DEBIT Event (@Observes @Debit).
 *   PaymentHandler: 
     *   The concrete implementation of the payment handler, it implements both IcreditEventObserver and IDebitEventObserver.
     *   The payment handler exposes the list of events caught during a session ( @Named  name=payments).
 

System requirements
-------------------

The application this project produces is designed to be run on Red Hat JBoss Enterprise Application Platform 6.1 or later. 

All you need to build this project is Java 6.0 (Java SDK 1.6) or later, Maven 3.0 or later.

 
Configure Maven
---------------

If you have not yet done so, you must [Configure Maven](../README.md#configure-maven) before testing the quickstarts.


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

4. This will deploy `target/jboss-payment-cdi-event.war` to the running instance of the server.


Access the application 
---------------------

The application will be running at the following URL: <http://localhost:8080/jboss-payment-cdi-event/>.


Undeploy the Archive
--------------------

1. Make sure you have started the JBoss Server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. When you are finished testing, type this command to undeploy the archive:

        mvn jboss-as:undeploy


Run the Quickstart in JBoss Developer Studio or Eclipse
-------------------------------------
You can also start the server and deploy the quickstarts from Eclipse using JBoss tools. For more information, see [Use JBoss Developer Studio or Eclipse to Run the Quickstarts](../README.md#use-jboss-developer-studio-or-eclipse-to-run-the-quickstarts) 


Debug the Application
------------------------------------

If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc

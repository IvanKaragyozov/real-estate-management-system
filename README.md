**Real Estate Agency Management System**

Currently the application has the capability to retieve an agent from the Real Estate Agency by their name.

**SOAP Service Documentation**
The service can be started by running the main method located in the 'ServiceApplication' class
or by running 'mvn spring-boot:run'.
The service is set to run at port:8091

**WSDL Extraction**
To retrieve the WSDL file from the service, you can use the following URL:
http://localhost:8091/ws/real-estate.wsdl

It is expected to see the following:
![Screenshot](soap-client-service\servicesrc\main\resources\images\wsdl-example.png)

**SOAP Client Documentation**
The client can be started by running the main method located in the 'ClientApplication' class
or by running 'mvn spring-boot:run'.

After the client is started, you will be promted to enter an agent name or type 'Exit' to exit the application.
![Screenshot](soap-client-service\service\src\main\resources\images\get-agent-example-console.png)


Note: You can still send requests using the service only with the following way:
1. In the resources folder of the service you will find the following example request:
get-agent-request.xml
2. Send the request using Postman or similar and set the method to POST,
the Content-Type to text/xml the body to be of type raw XML
3. Replace the name 'Tony' of your liking. The application will either return you the agent information
   or tell if no such agent exists.

![Screenshot](soap-client-service\service\src\main\resources\images\get-agent-example-xml.png)

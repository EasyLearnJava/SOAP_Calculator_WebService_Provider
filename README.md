# SOAP_Calculator_WebService_Provider

Run the project and hit any of the below urls:
* http://localhost:8080/SOAP_Calculator_WebService_Provider/calc
* http://localhost:8080/SOAP_Calculator_WebService_Provider/icalc

The two WSDLS shown are 
* http://localhost:8080/SOAP_Calculator_WebService_Provider/calc?wsdl
* http://localhost:8080/SOAP_Calculator_WebService_Provider/icalc?wsdl

Download SoapUI and test the WSDL's

To generate client side classes use
* wsimport -keep http://localhost:8080/SOAP_Calculator_WebService_Provider/calc?wsdl
* wsimport -keep http://localhost:8080/SOAP_Calculator_WebService_Provider/icalc?wsdl

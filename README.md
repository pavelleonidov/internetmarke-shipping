# InternetmarkeShipping - a JAVA Application with Magento 2 connector to handle shop orders using the 1C4A Internetmarke webservice by Deutsche Post

This application is an approach to offer a software for a quick and smooth handling of open orders, automatic printing of shipping labels (compatible both with label printers and desktop printers) and trigger shipment notifications to the customers. It is also an approach to fill the gap in available documentations and code examples both for the Magento 2 REST API in the JAVA language and for the ProdWS and Internetmarke webservices operated by Deutsche Post AG.

While this software was originally written for a running online shop called **All About Apple**, you may find it useful if you already are using Magento 2 in combination with the Internetmarke service. And even if you don't, I hope it will save you some headaches when you are developing applications to solve similar tasks.

InternetmarkeShipping is written in JAVA 1.8 in top of JavaFX and the Spring Boot Framework v2.

## Requirements

To run the application, you need at least version 1.8 of JDK: <http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html>

In the settings panel you need to set the application token of your running Magento 2 store, see the official documentation for details: <http://devdocs.magento.com/guides/v2.2/get-started/authentication/gs-authentication-token.html>
After setting the integration token, you basically need just to copy the API URL (example: https://<url-of-your-magento2-store>/rest/default) and the **Access Token**.

You also need to set required authentication data of the ProdWS and Internetmarke services. To gain access to the ProdWS and Internetmarke services, you need to contact <pcf-1click@deutschepost.de>. You will receive the following integration data:

* Internetmarke Partner ID
* Internetmarke Partner signature
* ProdWS username
* ProdWS passsword
* ProdWS Mandant ID

You'll also get a sandbox username and password for the Internetmarke service - it's recommended to test with these credentials before using your productive "Portokasse" (<https://portokasse.deutschepost.de/portokasse/#!/>) account.

## Installation
You can compile and install the application using Maven:

```
mvn clean compile
mvn package
```

The compile command will generate the necessary JAVA dependencies from the official ProdWS+Internetmarke WSDLs and from the modified Magento 2 schema (src/main/resources/yaml/magento2-schema.yaml)


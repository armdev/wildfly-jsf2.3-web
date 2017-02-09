# wildfly-jsf2.3-web
Java EE application: JSF2.3/Primefaces, EJB3.2/CDI, Wildfly10/Mysql
For show contact lis in the web page JSF bean connect via REST client to REST service, which is by itself connected with EJB stateless facade.

Access via REST  http://localhost:{port}/jsf-web/webresources/v1/contacts

Before start.

1. Have a look at jsf2.3-web\config-files
2. You should restore db dump.
3. You should copy mysql folder to wildfly-10.0.0.Final\modules\system\layers\base\com .
4. You should copy mysql datasource from standalone.xml to your config.
5. Edit src\main\resources\META-INF\persistence.xml if needed.
6. Have a look at ContactsRESTClient.java, I am used 8888 port for wildfly.
7. Have a look at ApplicationConfig.java

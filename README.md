# ecommerce-platform-backend-spring-boot



# Entity
- Product : 
  
This code represents a Java class named Product which is part of an e-commerce project. The class is annotated with JPA (Java Persistence API) annotations, indicating that it is an entity class that will be mapped to a database table. The class has several fields representing the properties of a product, such as id, category, sku, name, description, unit price, image URL, active status, units in stock, date created, and last updated.


![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/7f8b1fa2-56f2-4324-9de6-cc6c82dac700)
![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/041ddd85-f31f-42ed-86bb-04990095790f)





- Product category :
  
This code represents another Java class named ProductCategory, which is also part of the e-commerce project. Similar to the Product class, it is annotated with JPA annotations, indicating that it is an entity class that will be mapped to a database table. The class has fields representing the properties of a product category, such as id, category name, and a set of products belonging to this category.

![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/f9e7f1dc-dce1-4e21-87b1-fea51f23f803)
![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/667e6f90-f069-4dc2-b81f-5c908596b8b3)



# DAO

- Product repository

This code represents a Java interface named ProductRepository, which is part of the e-commerce project. It extends JpaRepository and is used for accessing the Product entities from the database. The interface is annotated with @CrossOrigin, allowing cross-origin requests from the specified origin. It has two methods, findByCategoryId and findByNameContaining, which are used to retrieve products by category ID and by name, respectively.

![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/43b9f72e-4b66-4c76-8f7d-f6664e88f221)


- ProductCategory repository

This code represents a Java interface named ProductCategoryRepository, which is part of the e-commerce project. It extends JpaRepository and is used for accessing the ProductCategory entities from the database. The interface is annotated with @CrossOrigin, allowing cross-origin requests from the specified origin, and @RepositoryRestResource, which customizes the exposed REST endpoint.

![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/f036900e-eb5d-4314-906a-c75b94567c36)




# Config


This code represents a Java configuration class named MyDataRestConfig, which is part of the e-commerce project. The class implements the RepositoryRestConfigurer interface and is annotated with @Configuration, indicating that it is a configuration class. It is used to customize the configuration of Spring Data REST. Specifically, it disables certain HTTP methods (PUT, POST, DELETE, PATCH) for Product and ProductCategory domain types and exposes entity IDs in the REST API.

![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/de49122f-0543-45a2-8583-7fd535eff488)



# Application propreties

spring.datasource.driver-class-name: Specifies the JDBC driver class for MySQL.
spring.datasource.url: Specifies the JDBC URL for connecting to the MySQL database. It includes the database name (full-stack-ecommerce), character encoding settings, and other parameters.
spring.datasource.username: Specifies the username for connecting to the MySQL database. In this case, it is set to root.
spring.datasource.password: Specifies the password for connecting to the MySQL database. It is left blank.
spring.jpa.properties.hibernate.dialect: Specifies the Hibernate dialect to be used, which in this case is for MySQL 8.
spring.data.rest.base-path: Specifies the base path for the RESTful web services. In this case, it is set to /api.
This configuration file is typically named application.properties and is used to configure the database connection and other settings for a Spring Boot application.

![image](https://github.com/ayoubterari/ecommerce-platform-backend-spring-boot/assets/65574293/d953dbb8-32ae-421e-a596-4c33e179f764)

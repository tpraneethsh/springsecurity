<h1 align="center"> Spring Security Example - Section3 </h1> <br>

<p align="center">
  Spring security Example
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Testing](#testing)
- [API](#requirements)




## Introduction

In this example we can understand, how to configure user details inside java class instead of application.properties.

There are two approaches one is: create UserDeatils with User.withDefaultPasswordEncoder()
second approach is create a beanof PasswordEncoder separately.

For JDBC based Authentication, changes below  
Pom.xml, add below dependencies  
spring-boot-starter-jdbc, mysql-connector-j, spring-boot-starter-data-jpa  

## Features

Starting from Spring Security 6.1 and Spring Boot 3.1.0 versions, the Spring Security framework team recommends using the Lambda DSL style for configuring security for APIs, web paths, etc. Consequently, they have deprecated a few methods within the framework.

remove userdetails from application.properties 
add admin, user details inside java class [ProjectSecurityConfig.java]

**Configuration using lambdas**
`http
    .authorizeHttpRequests(authorize -> authorize
    .requestMatchers("/blog/**").permitAll()
    .anyRequest().authenticated()
    )
    .formLogin(formLogin -> formLogin
    .loginPage("/login")
    .permitAll()
    )
    .rememberMe(Customizer.withDefaults());`

**Equivalent configuration without using lambdas**
`http
    .authorizeHttpRequests()
    .requestMatchers("/blog/**").permitAll()
    .anyRequest().authenticated()
    .and()
    .formLogin()
    .loginPage("/login")
    .permitAll()
    .and()
    .rememberMe();`
Ref: https://docs.spring.io/spring-security/reference/migration-7/configuration.html

## Requirements
The required technologies are : Java20, Intellij, Springboot 3.0.6, Spring 6.0.8

## Quick Start
After importing this project into IDE, Please check the Project jdk setup, maven and build the project.

## Run Local
Run / Debug the EazyBankBackendApplication and check the URLs

Application will run on port `8081`

Configure the port by changing `server.port` in __application.properties__

## Testing
* http://localhost:8081/notices : should display response "Here are the notices details from DB"
* http://localhost:8081/contact : should display response "Inquiry details are saved to DB"
* http://localhost:8081/myAccount : Should redirect to login page
* http://localhost:8081/myCards : Should redirect to login page
* http://localhost:8081/myLoans : Should redirect to login page
* http://localhost:8081/myBalance : Should redirect to login page


## API
TODO: Implement simple Swagger API. 
Skipping for now, as our major focus is understanding spring security



----------
Create MySQL DB in Amazon AWS
Login to AWS console -> goto RDS page - > Create database
Choose a database creation method : Easy Create
Configuration : My Sql
Edition : MySQL Community
DB instance size : Free tier
DB instance identifier : springsecurity
Master username : admin
Master password : mysqlspringsecurity
Enable access to public
    Select Database and click Modify - Additional Configuration
    Apply immediately  



#### Important Links
Spring website to generate projects - https://start.spring.io/  
Spring Website - https://spring.io/  
Spring Projects website - https://spring.io/projects  
Spring Boot properties - https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html  
AWS website - https://aws.amazon.com/  
SQLECTRON website - https://sqlectron.github.io  
Free MySQL DB website - https://www.freemysqlhosting.net  
OAuth2 Website - https://oauth.net/2/  
OAuth2 playground - https://www.oauth.com/playground/  
KeyCloak website - https://www.keycloak.org  
KeyCloak Download page - https://www.keycloak.org/downloads  
KeyCloak setup - https://www.keycloak.org/getting-started/getting-started-zip  
KeyCloak guides - https://www.keycloak.org/guides  
KeyCloak Well known APIs - http://localhost:8180/realms/eazybankdev/.well-known/openid-configuration  
Angular Keycloak library - https://www.npmjs.com/package/keycloak-angular  
Keycloak official documentation - https://www.keycloak.org/documentation  
Keycloak Admin REST APIs - https://www.keycloak.org/docs-api/19.0.2/rest-api/index.html  
<h1 align="center"> Spring Security Example - Section2 </h1> <br>

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

This example helps to understand the Spring security. We have 6 APIs. Out of these 6 APIs we need to provide security for 4 APIs. 
The 2 APIs can be accessed by anyone.

## Features

Starting from Spring Security 6.1 and Spring Boot 3.1.0 versions, the Spring Security framework team recommends using the Lambda DSL style for configuring security for APIs, web paths, etc. Consequently, they have deprecated a few methods within the framework.

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

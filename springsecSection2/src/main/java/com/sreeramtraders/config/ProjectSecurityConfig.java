package com.sreeramtraders.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        //Just for Knowledge: To deny all requests use denyAll(): Its not production recommended.
        /*http.authorizeHttpRequests(authorize ->
                        authorize.anyRequest().denyAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        ####### permitAll ###########
        http.authorizeHttpRequests(authorize ->
                        authorize.anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());*/

        http.authorizeHttpRequests(authorize ->
                authorize.requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                        .requestMatchers("/notices","/contact").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

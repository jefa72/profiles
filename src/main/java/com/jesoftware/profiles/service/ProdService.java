package com.jesoftware.profiles.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "db-connection-parameters-service")
@Component
public class ProdService {

    private String env;
    private String host;
    private String userName;
    private String password;


    public String getEnv() {
        return env;
    }


    public String getHost() {
        return host;
    }


    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public void setEnv(String env) {
        this.env = env;
    }


    public void setHost(String host) {
        this.host = host;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}

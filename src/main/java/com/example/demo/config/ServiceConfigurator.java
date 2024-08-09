package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfigurator {

    @Value("${keystore.filepath}")
    private String keystoreFilepath;

    public String getKeystoreFilepath() {
        return keystoreFilepath;
    }
    public void setKeystoreFilepath(String keystoreFilepath) {
        this.keystoreFilepath = keystoreFilepath;
    }
}

package com.inpowered.test.config;

import com.inpowered.test.services.FileManager;
import com.inpowered.test.services.FileOperations;
import com.inpowered.test.services.impl.FileManagerImpl;
import com.inpowered.test.services.impl.FileOperationsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FileManager fileManager() {
        return new FileManagerImpl();
    }

    @Bean
    public FileOperations fileOperations() {
        return new FileOperationsImpl();
    }

}

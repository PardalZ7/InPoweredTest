package com.inpowered.test.config;

import com.inpowered.test.services.FileManager;
import com.inpowered.test.services.impl.FileManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FileManager knockDownPines() {
        return new FileManagerImpl();
    }

}

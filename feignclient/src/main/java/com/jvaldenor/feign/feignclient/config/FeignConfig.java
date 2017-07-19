package com.jvaldenor.feign.feignclient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 81013534 on 19/07/2017.
 */
@Configuration
public class FeignConfig{

    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomerErrorDecoder();
    }
}

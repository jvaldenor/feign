package com.jvaldenor.feign.feignclient.client;

import com.jvaldenor.feign.feignclient.config.FeignConfig;
import com.jvaldenor.feign.feignclient.dto.CustomerResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 81013534 on 19/07/2017.
 */
@FeignClient(value = "restserver", configuration = FeignConfig.class)
public interface CustomerClient {

    @RequestMapping("/customer/{customerId}")
    ResponseEntity<CustomerResponse> getCustomer(@PathVariable("customerId") Long id);
}

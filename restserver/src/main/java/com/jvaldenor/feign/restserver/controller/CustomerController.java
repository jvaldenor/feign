package com.jvaldenor.feign.restserver.controller;

import com.jvaldenor.feign.restserver.model.CustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 81013534 on 19/07/2017.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(
            value = "/{customerId}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public CustomerResponse getCustomerName(@PathVariable("customerId") Long customerId) {
        if(customerId==1L) {
            return new CustomerResponse("Jeff", 20, "Male");
        }if(customerId==2L){
            throw new IllegalArgumentException("argument error");
        }
        return null;
    }
}

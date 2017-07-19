package com.jvaldenor.feign.feignclient.controller;

import com.jvaldenor.feign.feignclient.client.CustomerClient;
import com.jvaldenor.feign.feignclient.dto.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.AssertTrue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 81013534 on 19/07/2017.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private CustomerClient customerClient;

    @RequestMapping("/testSuccess/")
    @ResponseBody
    public ResponseEntity<CustomerResponse> getSuccessFeignCall() {
        ResponseEntity<CustomerResponse> customer = customerClient.getCustomer(1l);
        return customer;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<CustomerResponse> getSuccessFeignCall(@PathVariable("customerId") Long customerId) {
        ResponseEntity<CustomerResponse> customer = customerClient.getCustomer(customerId);
        return customer;
    }
}

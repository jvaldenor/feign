# Why
    To test different behaviour of feign

# How
    * Start the eureka service then access ``http://localhost:8761/``
    * run restserver ``http://localhost:9000/customer/1``
    * run feign-client ``http://localhost:9001/client/testSuccess``
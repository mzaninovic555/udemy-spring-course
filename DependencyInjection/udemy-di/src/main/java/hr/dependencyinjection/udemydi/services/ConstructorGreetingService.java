package hr.dependencyinjection.udemydi.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - Constructor";
    }
}
package hr.dependencyinjection.udemydi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world! - Property";
    }
}

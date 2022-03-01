package hr.dependencyinjection.udemydi.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - Primary bean";
    }
}

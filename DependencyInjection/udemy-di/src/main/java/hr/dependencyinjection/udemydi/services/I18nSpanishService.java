package hr.dependencyinjection.udemydi.services;

public class I18nSpanishService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - Spanish";
    }
}

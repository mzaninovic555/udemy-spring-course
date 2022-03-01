package hr.dependencyinjection.udemydi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello world - EN";
    }
}

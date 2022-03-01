package hr.dependencyinjection.udemydi.services;

import hr.dependencyinjection.udemydi.repositories.EnglishGreetingRepository;

public class I18nEnglishService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}

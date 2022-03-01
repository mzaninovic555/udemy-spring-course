package hr.dependencyinjection.udemydi;

import hr.dependencyinjection.udemydi.config.SfgConfiguration;
import hr.dependencyinjection.udemydi.config.SfgConstructorConfig;
import hr.dependencyinjection.udemydi.controllers.*;
import hr.dependencyinjection.udemydi.datasource.FakeDataSource;
import hr.dependencyinjection.udemydi.services.PrototypeBean;
import hr.dependencyinjection.udemydi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UdemyDiApplication.class, args);

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("------ Primary");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("------- Bean Scopes ---------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("----------- Fake Source ------------");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername() + " " + fakeDataSource.getPassword()
								   + " " + fakeDataSource.getJdbcurl());

		System.out.println("----------- Config Bean -------------");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername()
								   + " " + sfgConfiguration.getPassword()
								   + " " + sfgConfiguration.getJdbcurl());

		System.out.println("----------- Constructor binding -------------");
		SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername()
								   + " " + sfgConstructorConfig.getPassword()
								   + " " + sfgConstructorConfig.getJdbcurl());
	}
}

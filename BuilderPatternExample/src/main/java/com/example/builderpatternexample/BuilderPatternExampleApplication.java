package com.example.builderpatternexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternExampleApplication {

    static Logger logger  = LoggerFactory.getLogger(BuilderPatternExampleApplication.class);
    static User.UserBuilder userBuilder = new User.UserBuilder();

	public static void main(String[] args) {

        SpringApplication.run(BuilderPatternExampleApplication.class, args);
        User user = new User("Francisco","Palma","fpalmab.04@gmail.com","admin");
        logger.info("The first name of the user is {}",user.getFirstName());

        User teacher = userBuilder
                .firstName("Pedro")
                .lastName("Armendariz")
                .email("pedro.armendariz@mycompany.org")
                .role("professor")
                .build();

        logger.info("The first name of the user is {}",teacher.getFirstName());


    }

}

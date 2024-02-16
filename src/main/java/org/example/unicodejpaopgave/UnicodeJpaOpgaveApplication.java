package org.example.unicodejpaopgave;

import org.example.unicodejpaopgave.controller.InitData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UnicodeJpaOpgaveApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UnicodeJpaOpgaveApplication.class, args);

        // Hent InitData bean fra applikationskonteksten
        InitData initData = context.getBean(InitData.class);

        // Kald saveUnicodeLetters metoden
        initData.saveUnicodeLetters();
    }
}

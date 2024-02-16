package org.example.unicodejpaopgave.controller;

import org.example.unicodejpaopgave.model.Unicode;
import org.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData {
        private final UnicodeRepository unicodeRepository;

        @Autowired
                public InitData(UnicodeRepository unicodeRepository) {
            this.unicodeRepository = unicodeRepository;
        }
    public void saveUnicodeLetters() {
        Set<Character> letters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }

        for (char letter : letters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) letter);
            unicode.setLetter(letter);
            // Description of letter
            unicode.setDescription("Beskrivelse af bogstav " + letter);
            unicodeRepository.save(unicode);
        }

    }




    }


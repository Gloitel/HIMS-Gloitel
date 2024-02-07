package com.HIMSBackend.HIMSBackend.Util;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RandomPasswordGenerator {

        private static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        public static String generateRandomString(int length) {
            return new Random().ints(length, 0, ALLOWED_CHARACTERS.length())
                    .mapToObj(ALLOWED_CHARACTERS::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());
        }
}


package com.kishor.basicz;

import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {

        String[] str = new String[5];
        str[0] = "kis";
        str[1] = "lik";
        str[2] = "lol";
        str[3] = "kok";
        Optional<String> checkNull = Optional.ofNullable(str[2]);
        if (checkNull.isPresent()) {
            String word = str[2].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("String is null");
        }
    }
}

/*
 * Copyright [2020] [MaxKey of copyright http://www.maxkey.top]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 

package org.maxkey.crypto.password;

import java.util.Random;

/**
 * PasswordGen.
 * @author Crystal.Sea
 * 
 *
 */
public class PasswordGen {

    public static String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static String CHAR_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String CHAR_NUMBERS = "0123456789";
    public static String CHAR_SPECIAL = "~@#^()[]*$-+?_&=!%{}/";
    public static String CHAR_DEFAULT = CHAR_LOWERCASE + CHAR_NUMBERS + CHAR_UPPERCASE;
    private Random random = new Random();
    public static int DEFAULT_LENGTH = 8;

    public PasswordGen() {

    }

    public String gen() {
        return gen(DEFAULT_LENGTH);
    }

    public String gen(int length) {
        return gen(CHAR_DEFAULT, length);
    }

    /**
     * gen .
     * @param lowerCase int
     * @param upperCase int
     * @param numbers int
     * @param special int
     * @return
     */
    public String gen(int lowerCase, int upperCase, int numbers, int special) {
        StringBuffer password = new StringBuffer("");
        password.append(gen(CHAR_LOWERCASE, lowerCase));
        password.append(gen(CHAR_NUMBERS, numbers));
        password.append(gen(CHAR_UPPERCASE, upperCase));
        password.append(gen(CHAR_SPECIAL, special));
        // random generator String by sequence password
        return gen(password.toString(), password.length());
    }

    /**
     * gen.
     * @param charString String
     * @param length int
     * @return
     */
    public String gen(final String charString, int length) {
        if (length < 1) {
            return "";
        }
        int i = 0;
        StringBuffer password = new StringBuffer("");
        while (i < length) {
            int randomPosition = random.nextInt(charString.length());
            // duplicate check
            if (password.indexOf(charString.charAt(randomPosition) + "") < 0) {
                password.append(charString.charAt(randomPosition));
                i++;
            }
        }
        return password.toString();
    }
}

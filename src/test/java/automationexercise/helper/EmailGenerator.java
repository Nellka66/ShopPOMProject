package automationexercise.helper;

import org.apache.commons.lang3.RandomStringUtils;

public class EmailGenerator {
    public static String getRandomEmail(int length, boolean useLetters, boolean useNumbers){
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString+"@gmail.com";
    }

}

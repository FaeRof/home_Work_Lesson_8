package com.home_work_lesson_8;

import com.home_work_lesson_8.exception.InvalidFormatException;
import com.home_work_lesson_8.exception.incorrect_format_exception.IncorrectFormatException;
import com.home_work_lesson_8.exception.incorrect_format_exception.IncorrectFirstNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeCheck {
    public static void CheckInputString(String a) throws InvalidFormatException{
        String ex1 = "^([0-9]{4})([-]{1})" +
                "([a-zA-z]{3})([-]{1})" +
                "([0-9]{4})([-]{1})" +
                "([a-zA-z]{3})([-]{1})" +
                "([0-9]{1})([a-zA-z]{1})([0-9]{1})([a-zA-z]{1})";

        String exRussianLanguage = "^[а-яА-ЯёЁ]";                         // Rus Letters

        String ex_1111_atTheBegin = "^[1]{4}";                           // "1111" at the begin


        Pattern patternFullFormat = Pattern.compile(ex1);
        Matcher matcher1 = patternFullFormat.matcher(a);

        Pattern patternRusLetters = Pattern.compile(exRussianLanguage);
        Matcher matcher2 = patternRusLetters.matcher(a);

        Pattern pattern_1111_atTheBegin = Pattern.compile(ex_1111_atTheBegin);
        Matcher matcher3 = pattern_1111_atTheBegin.matcher(a);

        boolean isFormatValid = matcher1.find() && !matcher2.find();
        boolean isStartingNumbersValid = !matcher3.find();


        if (!isFormatValid){

            throw new IncorrectFormatException("Incorrect Format " +
                    "(Please, check that your code has format " +
                    "XXXX-YYY-XXXX-YYY-XYXY " +
                    "where X - numbers and Y - letters), " +
                    "and you used only english letters! " +
                    "Be careful with the input.");
        }

        if (!isStartingNumbersValid){
            throw new IncorrectFirstNumberException("Incorrect Format " +
                    "('1111' can't be at the begin of code)!" +
                    " Be careful with the input.");
        }
    }
}

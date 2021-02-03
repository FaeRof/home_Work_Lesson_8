import com.home_work_lesson_8.CodeCheck;
import com.home_work_lesson_8.exception.InvalidFormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        scanner.close();

        try {
            CodeCheck.CheckInputString(st1);
            System.out.println(st1);
            /**
             * Вывести на экран в одну строку два первых блока по 4 цифры(это сделайте с помощью использования Pattern и Matcher)
             */

            String Ex = "\\d{4}";

            Pattern pattern = Pattern.compile(Ex);
            Matcher matcher = pattern.matcher(st1);

            StringBuffer so = new StringBuffer();

            while (matcher.find()) {
                so.append(matcher.group());
            }

            System.out.println(so);

            /**
             * Вывести на экран номер документа, но блоки из трех букв заменить на *
             **/

            String Ex2 = "[a-zA-Z]{3}";
            System.out.println(st1.replaceAll(Ex2, "***"));

            /**
             * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y
             */

            String Ex3 = "\\D{1,}";
            String st2 = st1.replaceAll("[-]", "");

            StringBuffer so2 = new StringBuffer();

            pattern = Pattern.compile(Ex3);
            matcher = pattern.matcher(st2);

            while (matcher.find()) {
                so2.append(matcher.group() + "/");
            }

            so2.replace(so2.length() - 1, so2.length(), "");

            System.out.println(so2);


            /**
             * вывести на экран все числа (от себя)))
             */

            String Ex4 = "\\d{1,}";


            Pattern pattern1 = Pattern.compile(Ex4);
            Matcher matcher1 = pattern1.matcher(st1);

            StringBuffer so3 = new StringBuffer();

            while (matcher1.find()) {
                so3.append(matcher1.group() + "-");
            }
            so3.replace(so3.length() - 1, so3.length(), "");
            System.out.println(so3);
        } catch (InvalidFormatException a){
            a.printStackTrace();
        }
    }
}


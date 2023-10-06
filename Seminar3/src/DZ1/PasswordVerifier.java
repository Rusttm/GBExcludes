//Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
//
//        Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:
//
//        Пароль должен быть не менее 8 символов.
//        Пароль должен содержать хотя бы одну цифру.
//        Пароль должен содержать хотя бы одну заглавную букву.
//        Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.




package DZ1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier {
    public static void main(String[] args) {
        String passwd = PasswordReader.Request();
        boolean result = false;
        try {
            result = Verify(passwd);
        } catch (PassLengthException | PassNumException | PassCapitalException e) {
            System.out.println("Error: " + e);
        }

        if (result) {
            System.out.println("Password " + passwd +"  is correct");
            System.out.println(passwd);
        }
    }

    public static boolean Verify(String passwd) throws PassLengthException, PassNumException, PassCapitalException {
        boolean result;
        // check length
        if (passwd.length() != 8) {
            throw new PassLengthException("Password length should get 8 symbols");
        }

        // check number
        Pattern dig_pattern = Pattern.compile("[0-9]");
        Matcher dig_matcher = dig_pattern.matcher(passwd);
        result = dig_matcher.find();
        if (!result) {
            throw new PassNumException("Password should contain digit");
        }

        // check Capitalized character
        Pattern cap_pattern = Pattern.compile("[A-Z]");
        Matcher cap_matcher = cap_pattern.matcher(passwd);
        result = cap_matcher.find();
        if (!result) {
            throw new PassCapitalException("Password should contain Capitalized character");
        }
        return true;
    }
}

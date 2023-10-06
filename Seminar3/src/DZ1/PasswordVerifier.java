//Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
//
//        Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:
//
//        Пароль должен быть не менее 8 символов.
//        Пароль должен содержать хотя бы одну цифру.
//        Пароль должен содержать хотя бы одну заглавную букву.
//        Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.




package DZ1;

public class PasswordVerifier {
    public static void main(String[] args) {
        String passwd = PasswordReader.Request();
        boolean result = Verify(passwd);
        System.out.println(result);
    }

    public static boolean Verify(String passwd) {

        return  true;
    }
}

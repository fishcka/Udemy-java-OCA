package lesson_16;

public class PrintEmail {
    public static void emailPrinting(String emailList) {
        for (int i = 0; i < emailList.length(); i++) {
            int c1 = emailList.indexOf('@');
            int c2 = emailList.indexOf('.');
            int semicolon = emailList.indexOf(';');
            String email = emailList.substring(c1 + 1, c2);
            System.out.println(email);
            emailList = emailList.substring(semicolon + 1);
        }
    }

    public static void main(String[] args) {
        emailPrinting("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

/*
output:
        yahoo
        mail
        gmail */

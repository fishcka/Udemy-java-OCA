package lesson_16;
// варіант Заура

public class PrintEmail_var2 {
    public void email(String s) {
        int a = 0; // позиція символа @
        int b = 0; // позиція символа .
        int c = 0; // позиція символа ;

        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        PrintEmail_var2 l16 = new PrintEmail_var2();
        l16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

/*
output:
        yahoo
        mail
        gmail */

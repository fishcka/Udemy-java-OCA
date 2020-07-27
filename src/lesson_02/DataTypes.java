package lesson_02;

public class DataTypes {
    public static void main(String[] args) {
        //1-dec, 2-bin, 3-oct, 4-hex

        byte b1 = 12, b2 = 0B1100, b3 = 014, b4 = 0xC;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        byte b5 = (byte) 128; //кастинг
        //диапазон byte -128;127 поэтому 128 выходит за диапазон и показывает первый его символ
        System.out.println(b5);

        short s1 = 1300, s2 = 0B010100010100, s3 = 02424, s4 = 0x514;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        int i1 = 0, i2 = 0B0, i3 = 00, i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        long l1 = 123456789, l2 = 0B0111010110111100110100010101, l3 = 0726746425, l4 = 0x75BCD15;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        float f1 = 375.14F, f2 = 2;
        System.out.println(f1 + " " + f2);

        double d1 = 5.5D, d2 = 0.000045158458;
        System.out.printf(d1 + " " + "%.12f%n", d2);
        System.out.println(d2);

        boolean bo1 = true, bo2 = false;
        System.out.println(bo1 + " " + bo2);

        char c1 = 'L';
        char c2 = 1234; //c4 принимает значение 300-го символа в юникоде в 10-чной системе счисления
        char c3 = '\u1234'; // символ юникод в 16-ричной системе счисления
        char c4 = 0x1234; // символ юникод в 16-ричной системе счисления
        char c5 = '\357'; //символ кодовой таблицы Latin-1, восьмеричный формат
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
    }
}

/*
output:
        12 12 12 12
        -128
        1300 1300 1300 1300
        0 0 0 0
        123456789 123456789 123456789 123456789
        375.14 2.0
        5.5 0,000045158458
        4.5158458E-5
        true false
        L Ӓ ሴ ሴ ï  */

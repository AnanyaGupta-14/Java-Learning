public class charDataType {
    public static void main(String[] args) {
        char anu = 'A';
        System.out.println(anu);
        char anu1 = 'a';
        System.out.println(anu1);

        //ascii value of char
        char ch = 'A';
        int x = ch; //implicit typecasting
        System.out.println(x);

        char char2 = 'a';
        int y = (int)char2; //explicit typecasting
        System.out.println(y);

        char ch3 = '4';
        int z = ch3;
        System.out.println(z);

        char ch4 = 'b';
        System.out.println(ch4+0);

        //interger to character
        System.out.println("Integer to character");
        int ch5 = 65;
        char a = (char)ch5;
        System.out.println(a);

        int ch6 = 32;
        char b = (char)ch6;
        System.out.println(b);

        int ch7 = 48;
        char c = (char)ch7;
        System.out.println(c);
}}


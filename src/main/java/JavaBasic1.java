public class JavaBasic1 {
    public static void main(String args[]) {

        byte aByte = 100;
        short aShort = 200;
        short aInt = 3000;
        int maxInt = Integer.MAX_VALUE;
        long aLong = 300L;
        float aFloat = 1.234f;
        double aDouble = 2.89d;
        boolean aBoolean = true;
        boolean bBoolean = false;

        System.out.println("Сложение: "+(aByte + aShort));
        System.out.println("Вычитание: "+(maxInt - aByte));
        System.out.println("Умножение: "+(aByte * aByte));
        System.out.println("Деление: "+(aLong/aByte));
        System.out.println("Остаток: "+(maxInt%aByte));
        System.out.println("Переполнение: "+(maxInt + aShort));
        System.out.println("Логическое и: "+ (aBoolean&&bBoolean));
        System.out.println("Логическое или: "+ (aBoolean||bBoolean));
        System.out.println("Логическое не: "+ !(aBoolean&&bBoolean));
        System.out.println("Сложение  int и double: "+(aInt + aDouble));
        System.out.println("Вычитание  int и float: "+(aInt - aFloat));
    }
}

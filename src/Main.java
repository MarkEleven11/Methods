public class Main {

    public static void checkDate(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 != 0) {
            System.out.println(year + " год не високосный");
        } else  {
            System.out.println(year + " год не високосный");
        }
    }

    public static void currentYear(int version, int opSys) {
        if (version <= 2015 && opSys == 0) {
            System.out.println("Установите Lite версию приложения на Ваш IOS");
        } else if (version > 2015 && opSys == 0) {
            System.out.println("Установите приложение на Ваш IOS");
        }
        if (version <= 2015 && opSys == 1) {
            System.out.println("Установите Lite версию приложения на Ваш Android");
        } else if (version > 2015 && opSys == 1) {
            System.out.println(("Установите приложение на Ваш Android"));
        }

    }

    public static void delivery(int deliveryDistance) {
        int sum = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + sum);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (sum + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (sum + 2));
        }
    }


    public static void main(String[] args) {

        ///Task 1.
        System.out.println("Task 1");
        checkDate(2022);

        ///Task 2.
        System.out.println("Task 2");
        currentYear(2018, 0);

        ///Task 3.
        System.out.println("Task 3");
        delivery(95);

    }
}
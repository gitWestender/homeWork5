public class Main {
    public static void main(String[] args) {
        task1();
        task2("Android", 2021);
        task3(2100);
        task4();
    }

    static void task1() {
        System.out.println("Задание 1:");
        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Под вашу операционную систему нечего скачивать");
        }
    }

    static void task2(String clientOS, int manufactureDate) {
        System.out.println("\nЗадание 2:");

        switch (clientOS) {
            case "iOS":
                if (manufactureDate < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case "Android":
                if (manufactureDate < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Под вашу операционную систему нечего скачивать");
        }
    }

    static void task3(int year) {
        System.out.println("\nЗадание 3:");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    static void task4() {
        System.out.println("\nЗадание 4:");
        int deliveryDistance = 95;
        int daysToGo;

        if (deliveryDistance < 20) {
            daysToGo = 1;
            System.out.println("Потребуется дней: " + daysToGo);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysToGo = 2;
            System.out.println("Потребуется дней: " + daysToGo);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysToGo = 3;
            System.out.println("Потребуется дней: " + daysToGo);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
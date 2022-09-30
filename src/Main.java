public class Main {
    public static void main(String[] args) {
/*
        Чтобы запустить код, введите значение, соответственно условию каждой задачи.
        Чтобы посмотреть код, спуститесь в соответствующий метод.
        Методы названы по номеру задач в ДЗ.
        Ответы программы дают на английском языке.

        1. Введите в task1 "0" для IOS или "1" для Android.
        2. Введите в task2 "0" для IOS или "1" для Android + год выпуска (до 2015 облегченная, обычная версия с 2015).
        3. Введите в task3 любой год, чтобы узнать, високосный он, или нет.
        4. Введите в task4 расстояние, чтобы узнать, сколько времени займет её доставка.
        5. Введите в task5 номер месяца, чтобы узнать, какое идет время года.
*/
        task1(1);
        task2(1, 2015);
        task3(2021);
        task4(95);
        task5(13);
    }
    public static int task1(int clientOS) {
        System.out.println();
        System.out.println("Task №1");
        if (clientOS == 1) {
            System.out.println("Install the app for Android by the link, please!");
        } else if (clientOS == 0) {
            System.out.println("Install the app for IOS by the link, please!");
        } else {
            System.out.println("Your OS is not provided! There is only apps for Android or IOS.");
        }
        return 0;
    }
    public static int task2(int clientOS, int clientDeviceYear) {
        System.out.println();
        System.out.println("Task №2");
        boolean IOS = clientOS == 0 && clientDeviceYear >= 2015;
        boolean lightIOS = clientOS == 0 && clientDeviceYear < 2015;
        boolean android = clientOS == 1 && clientDeviceYear >= 2015;
        boolean lightAndroid = clientOS == 1 && clientDeviceYear < 2015;
        if (android) {
            System.out.println("Install the app for Android by the link, please!");
        } else if (lightAndroid) {
            System.out.println("Install the light version of the Android app by the link, please!");
        }
        if (IOS) {
            System.out.println("Install the app for IOS by the link, please!");
        } else if (lightIOS) {
            System.out.println("Install the light version of the IOS app by the link, please!");
        } else {
            System.out.println("Your OS is not provided! There is only apps for Android or IOS.");
        }
        return 0;
    }

    public static int task3(int year) {
        System.out.println();
        System.out.println("Task №3");
        boolean notLeap = year%100 == 0 && year%4 != 0 || year%100 == 0 && year%400 != 0;
        if (notLeap) {
            System.out.println("The year is not leap");
        } else {
            System.out.println("The year is leap");
        }
        return 0;
    }

    public static int task4(int deliveryDistance) {
        System.out.println();
        System.out.println("Task №4");
        boolean day = deliveryDistance < 20;
        boolean plusDay = deliveryDistance >= 20 && deliveryDistance <= 60;
        boolean plusTwo = deliveryDistance > 60 && deliveryDistance <= 100;
        if (day) {
            System.out.println("It takes 1 day to deliver the card.");
        } else if (plusDay) {
            System.out.println("It takes 2 days to deliver the card.");
        } else if (plusTwo) {
            System.out.println("It takes 3 days to deliver the card.");
        } else {
            System.out.println("It takes more than 3 days to deliver the card.");
        }
        return 0;
    }
    public static int task5(int month) {
        System.out.println();
        System.out.println("Task №5");
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter now! Go snowboarding!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring now! Buy wellington boots!");
                break;
            case 6:
            case 7:
            case 8:
            System.out.println("It's summer now! Go to the beach!");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("It's autumn now! Take an umbrella!");
            break;
            default:
                System.out.println("Incorrect month number. Input 1-12 month!");
        }
        return 0;
    }
}


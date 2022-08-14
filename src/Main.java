public class Main {
    public static void main(String[] args) {

        byte clientOS=0;
        //Задание 1
        System.out.println("Задание 1:");
        switch(clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Входные данные некорректны. Введите 0 или 1");
                break;
        }

        //Задание 2
        System.out.println("Задание 2:");
        int clientDeviceYear=2014;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.print("Установите ");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Входные данные некорректны.");
                break;
        }

        //Задание 3
        System.out.println("Задание 3:");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " " + "год является високосным");
        } else
            System.out.println(year + " год не является високосным");


        //Задание 4
        System.out.println("Задание 4:");
            int deliveryDistance = 95;
            int day=0;
            //расчет количества дней
            if (deliveryDistance<=0) {
                day = -1;
            } else if (deliveryDistance<20) {
                day = 1;
            } else if(deliveryDistance<60){
                day =2;
            } else if (deliveryDistance<100){
                day=3;
            }
            //вывод в консоль
            if (day>0){
                System.out.println("Потребуется дней: "+day);
            } else if (day==0){
                System.out.println("Слишком большое расстояние для доставки.");
            } else {
                System.out.println("Введено некорректное значение расстояния.");
            }
        //Задание 5
        System.out.println("Задание 5:");
            int monthNumber=2;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Месяц " + monthNumber + " - это зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " - это весна");
                    break;
               case 6:
               case 7:
               case 8:
                    System.out.println("Месяц " + monthNumber + " - это лето");
                    break;
               case 9:
               case 10:
               case 11:
                    System.out.println("Месяц " + monthNumber + " - это осень");
                    break;
               default:
                    System.out.println("Введен некорректный номер месяца");
               }

        //Доп. задание 6
        System.out.println("Доп. задание 6:");
        int age = 25;
        int salary = 60000;
        double creditSum = 1;
        //проверяем возраст
        if (age>=23){
              creditSum = salary*3;
        } else{
              creditSum = salary*2;
        }
        //проверяем з/п
        if (salary>=80000){
            creditSum=creditSum*1.5;
        } else if (salary>=50000){
            creditSum=creditSum*1.2;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом  " + creditSum + " рублей.");

        //Доп. задание 7
        System.out.println("Доп. задание 7:");
        int wantedSum=330000;
        double rate = 10;
        //считаем ставку
        if (age<23){
            rate=rate+1;
        } else if(age<30){
            rate=rate+0.5;
        }
        if (salary >80000){
            rate=rate-0.7;
        }
        //рассчитаем ежемесячный платеж
        rate=(rate/100)+1;
        int monthPayment= (int) (wantedSum*rate/12);
        System.out.print("Максимальный ежемесячный платеж при ЗП "+salary+" рублей равен "+salary/2 +" рублей. Платеж по кредиту "+monthPayment+" рублей. ");
        if (monthPayment/2>salary){
            System.out.println("Отказано.");
        } else {
            System.out.println("Одобрено.");
        }
    }
}

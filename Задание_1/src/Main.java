import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // коллекция для хранения всех машин
    private static ArrayList<Car> cars = new ArrayList<>();

    // точка входа приложения
    public static void main(String[] args) {

        // сканер для  ввода от пользователя
        Scanner scanner = new Scanner(System.in);
        // приглашаем к вводу
        System.out.println("1. Ввод через консоль\n2. Ввод через файл\n0. Выход");

        boolean flag = true;

        // цикл диалога с пользователем
        while (flag) {
            String userInput = scanner.nextLine();
            // проверяем ввод пользователя с помощью switch
            switch (userInput) {
                case "1":
                    consoleInput();
                    flag = false;
                    break;
                case "2":
                    loadDataFromFile("src/TEXT");
                    flag = false;
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("Нет такого пункта меню");
                    break;
            }
        }

        flag = true;

        while (flag) {
            System.out.println("""
                    1. Общая стоимость расходов на ГСМ, и расходы на каждый класс автомобиля
                    2. Тип авто имеющий наибольшую стоимость расходов
                    3. Тип авто имеющий наименьшую стоимость расходов
                    4. Информация о каждом авто
                    0. Выход""");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    printExpensesTotalCost();
                    break;
                case "2":
                    printHighestConsumptionCarType();
                    break;
                case "3":
                    printLowestConsumptionCarType();
                    break;
                case "4":
                    printCarsInfo();
                    break;
                default:
                    System.out.println("Нет такого пункта меню");
                    break;
            }
        }

    }

    private static void  loadDataFromFile(String path){
        try {
            File file = new File(path);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                cars.add(splitter(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printCarsInfo() {
        System.out.println("Легковые автомобили:");
        for(Car car:cars){
            if (car.getCode() == LightCar.CODE) {
                System.out.println(car);
            }
        }

        System.out.println("\nГрузовые автомобили:");
        for(Car car:cars){
            if (car.getCode() == CargoCar.CODE) {
                System.out.println(car);
            }
        }

        System.out.println("\nПассажирский транспорт:");
        for(Car car:cars){
            if (car.getCode() == PassengerTransport.CODE) {
                System.out.println(car);
            }
        }

        System.out.println("\nТяжелые машины:");
        for(Car car:cars){
            if (car.getCode() == HeavyMachine.CODE) {
                System.out.println(car);
            }
        }

    }

    // печатаем авто с самым большим расходом
    private static void printHighestConsumptionCarType() {
        // в циклах подсчитываем расходы общие и для каждого типа
        double totalExpenses = 0;
        double lightCarExpenses = 0;
        double cargoCarExpenses = 0;
        double passengerTransportExpenses = 0;
        double heavyMachineExpenses = 0;
        for (Car car : cars) {
            totalExpenses += car.getExpense();
            if (car.getCode() == LightCar.CODE) {
                lightCarExpenses += car.getExpense();
            }
            if (car.getCode() == CargoCar.CODE) {
                cargoCarExpenses += car.getExpense();
            }
            if (car.getCode() == PassengerTransport.CODE) {
                passengerTransportExpenses += car.getExpense();
            }
            if (car.getCode() == HeavyMachine.CODE) {
                heavyMachineExpenses += car.getExpense();
            }
        }

    }

    // печатаем авто с самым маленьким расходом
    private static void printLowestConsumptionCarType() {
        // в циклах подсчитываем расходы общие и для каждого типа
        double totalExpenses = 0;
        double lightCarExpenses = 0;
        double cargoCarExpenses = 0;
        double passengerTransportExpenses = 0;
        double heavyMachineExpenses = 0;
        for (Car car : cars) {
            totalExpenses += car.getExpense();
            if (car.getCode() == LightCar.CODE) {
                lightCarExpenses += car.getExpense();
            }
            if (car.getCode() == CargoCar.CODE) {
                cargoCarExpenses += car.getExpense();
            }
            if (car.getCode() == PassengerTransport.CODE) {
                passengerTransportExpenses += car.getExpense();
            }
            if (car.getCode() == HeavyMachine.CODE) {
                heavyMachineExpenses += car.getExpense();
            }
        }
    }

    // печать расходов
    private static void printExpensesTotalCost() {
        // подготовливаем шаблон строки
        String outputString = """
                Общая стоимость расходов - %.2fруб
                Стоимость расходов легковых авто - %.2fруб
                Стоимость расходов грузовых авто - %.2fруб
                Стоимость расходов пассажирского транспорта - %.2fруб
                Стоимость расходов на тяжелую технику - %.2fруб
                """;

        // в циклах подсчитываем расходы общие и для каждого типа
        double totalExpenses = 0;
        double lightCarExpenses = 0;
        double cargoCarExpenses = 0;
        double passengerTransportExpenses = 0;
        double heavyMachineExpenses = 0;
        for (Car car : cars) {
            totalExpenses += car.getExpense();
            if (car.getCode() == LightCar.CODE) {
                lightCarExpenses += car.getExpense();
            }
            if (car.getCode() == CargoCar.CODE) {
                cargoCarExpenses += car.getExpense();
            }
            if (car.getCode() == PassengerTransport.CODE) {
                passengerTransportExpenses += car.getExpense();
            }
            if (car.getCode() == HeavyMachine.CODE) {
                heavyMachineExpenses += car.getExpense();
            }
        }

        // печатаем предварительно отформатировав
        System.out.printf((outputString) + "%n", totalExpenses, lightCarExpenses, cargoCarExpenses, passengerTransportExpenses, heavyMachineExpenses);

    }

    // возвращает обьект класса машины разделив строку по нужным символам
    private static Car splitter(String inputString) {
        int carCode = Integer.parseInt(inputString.split("_")[0]);
        if (carCode == LightCar.CODE) {
            return new LightCar(inputString.split("_")[1].split("-")[0], Integer.parseInt(inputString.split("_")[1].split("-")[1]));
        } else if (carCode == CargoCar.CODE) {
            return new CargoCar(inputString.split("_")[1].split("-")[0], Integer.parseInt(inputString.split("_")[1].split("-")[1]), Integer.parseInt(inputString.split("_")[1].split("-")[2]));
        } else if (carCode == PassengerTransport.CODE) {
            return new PassengerTransport(inputString.split("_")[1].split("-")[0], Integer.parseInt(inputString.split("_")[1].split("-")[1]), Integer.parseInt(inputString.split("_")[1].split("-")[2]));
        } else if (carCode == HeavyMachine.CODE) {
            return new HeavyMachine(inputString.split("_")[1].split("-")[0], Integer.parseInt(inputString.split("_")[1].split("-")[1]), Integer.parseInt(inputString.split("_")[1].split("-")[2]));
        }
        return null;
    }

    // метод для консольного ввода данных (обьектов класса Car)
    private static void consoleInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку формата C(CODE_CAR)_гос номер-Пробег-(доп. параметр) или 0 для выхода");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("0")) {
                break;
            } else {
                {
                    // добавляем в нашу коллекцию результат вызова метода splitter , методу splitter передаем то что ввел пользователь
                    cars.add(splitter(userInput));
                }
            }

        }
    }


}

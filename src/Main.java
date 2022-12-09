import animals.Cat;
import transport.Car;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
        // Задание 1-1
        System.out.println("Задание 1-1");
        Human maksim = new Human(
                -5,
                "Максим",
                "Минск",
                "бренд-менеджер");
        Human ann = new Human(
                1993,
                "",
                null,
                "методист образовательных програм"
        );
        Human kate = new Human(
                1992,
                "Катя",
                "",
                null
        );
        Human artem = new Human(
                1995,
                null,
                "Москва",
                ""
        );
        System.out.println(maksim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println();

        Human vladimir = new Human(
                -5,
                "Владимир",
                null,
                "не работает"
        );
        System.out.println(vladimir);
        vladimir.setTown("Казань");
        vladimir.setYearOfBirth(2001);
        System.out.println(vladimir);
        System.out.println();

        // Задание 1-2
        System.out.println("Задание 1-2");
        Flower rose = new Flower(
                "Роза обыкновенная",
                "Голландия",
                35.59,
                null
        );
        Flower chrysanthemum = new Flower(
                "Хризантема",
                null,
                15,
                5
        );
        Flower peony = new Flower(
                "Пион",
                "Англия",
                69.9,
                1
        );
        Flower gypsophila = new Flower(
                "Гипсофила",
                "Турция",
                19.5,
                10
        );
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
        System.out.println();

        // Задание 1-3 доп.
        System.out.println("Задание 1-3 доп.");
        Flower[] flowers = {
                rose,
                rose,
                rose,
                chrysanthemum,
                chrysanthemum,
                chrysanthemum,
                chrysanthemum,
                chrysanthemum,
                gypsophila,
                };
        Bouquet firstBouquet = new Bouquet(flowers);
        System.out.println(firstBouquet);
        Bouquet secondBouques = new Bouquet(new Flower[] {chrysanthemum, null, gypsophila});
        System.out.println(secondBouques);
        System.out.println();

        // Задание 2-1, 2-2
        System.out.println("Задание 2-1, 2-2");
        Car ladaGranta = new Car(
                "",
                null,
                1.7,
                "желтый",
                2015,
                "Россия",
                "Механика",
                "Универсал",
                "0000ММ178",
                5,
                false
        );
        Car audiA8 = new Car(
                "Audi",
                "",
                3.0,
                null,
                2020,
                "Германия",
                "Автомат",
                "Хэтчбэк",
                "М001ММ178",
                5 ,
                true
        );
        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                -5.3,
                "черный",
                2021,
                null,
                "   ",
                "",
                "",
                5,
                false);
        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "",
                "",
                "   ",
                "   ",
                -5,
                true
        );
        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                -101,
                "Южная Корея",
                null,
                null,
                null,
                null,
                null
        );

        // Задание 3-1, 3-2
        ladaGranta.setKey(new Car.Key(
                false,
                false
        ));
        //ladaGranta.setKey(ladaGrantaKey);
        audiA8.setKey(new Car.Key(
                null,
                null
        ));
        //audiA8.setKey(audiA8Key);
        bmwZ8.setKey(new Car.Key(
                true,
                true
        ));
        //bmwZ8.setKey(bmwZ8Key);
        kiaSportage.setKey(new Car.Key(
                true,
                false
        ));
        //kiaSportage.setKey(kiaSportageKey);
        hyundaiAvante.setKey(new Car.Key(
                false,
                true
        ));
        //hyundaiAvante.setKey(hyundaiAvanteKey);

        ladaGranta.setInsurance(new Car.Insurance(
                LocalDate.now(),
                2_000,
                "654874657"
        ));
        //ladaGranta.setInsurance(ladaGrantaIns);
        audiA8.setInsurance(new Car.Insurance(
                null,
                null,
                null
        ));
        //audiA8.setInsurance(audiA8Ins);
        bmwZ8.setInsurance(new Car.Insurance(
                LocalDate.of(2022,01,01),
                -5,
                "88888888"
        ));
        //bmwZ8.setInsurance(bmwZ8Ins);
        kiaSportage.setInsurance(new Car.Insurance(
                LocalDate.of(2020,01,01),
                5_000,
                "687616657"
        ));
        //kiaSportage.setInsurance(kiaSportageIns);
        hyundaiAvante.setInsurance(new Car.Insurance(
                LocalDate.EPOCH,
                -5,
                "-4"
        ));
        //hyundaiAvante.setInsurance(hyundaiAvanteIns);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println();
        hyundaiAvante.changeTires(12);
        System.out.println(hyundaiAvante);
        kiaSportage.getInsurance().printValidityControl();
        ladaGranta.getInsurance().printValidityControl();
        bmwZ8.getInsurance().printNumberControl();
        hyundaiAvante.getInsurance().printNumberControl();
    }
}
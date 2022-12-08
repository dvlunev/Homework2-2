package transport;

import java.time.LocalDate;

public class Car {

    public class Key {
        private final Boolean remoteEngineStart;
        private final Boolean lessEntry;

        public Key(Boolean remoteEngineStart, Boolean lessEntry) {
            if (remoteEngineStart == null) {
                remoteEngineStart = false;
            }
            this.remoteEngineStart = remoteEngineStart;
            if (lessEntry == null) {
                lessEntry = false;
            }
            this.lessEntry = lessEntry;
        }

        public Boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public Boolean getKeylessEntry() {
            return lessEntry;
        }
    }

    public class Insurance {
        private final LocalDate validity;
        private final Integer price;
        private final String number;

        public Insurance(LocalDate validity, Integer price, String number) {
            if (validity == null) {
                validity = LocalDate.now();
            }
            this.validity = validity;
            if (price == null || price <= 0) {
                price = 3_000;
            }
            this.price = price;
            if (number == null || number.isEmpty() || number.isBlank()) {
                number = "000000000";
            }
            this.number = number;
        }

        public LocalDate getValidity() {
            return validity;
        }

        public int getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void printValidityControl() {
            if (validity.isBefore(LocalDate.now())) {
                System.out.println("Ваша страховка просрочена, необходимо срочно оформить новую страховку!");
            } else if (validity.equals(LocalDate.now())) {
                System.out.println("Ваша страховка заканчивается в этом году, не забудьте оформить новую страховку!");
            }
        }

        public void printNumberControl() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer seatAmount;
    private Boolean winterTires;
    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, Double engineVolume, String color, Integer year, String country,
               String transmission, String bodyType, String registrationNumber, Integer seatAmount,
               Boolean winterTires) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year == null || year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        }
        this.country = country;
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        if (seatAmount == null || seatAmount <= 0) {
            seatAmount = 5;
        }
        this.seatAmount = seatAmount;
        setWinterTires(winterTires);
    }

    @Override
    public String toString() {
        return "Автомобиль: Марка " + brand +
                ", Модель " + model +
                ", Объем двигателя в литрах " + engineVolume +
                ", Цвет кузова " + color +
                ", Год производства " + year +
                ", Страна сборки " + country +
                ", Коробка передач " + transmission +
                ", Тип кузова " + bodyType +
                ", Регистрационный номер " + registrationNumber +
                ", Количество мест " + seatAmount +
                ", Сезонность установленных покрышек " + getTires() +
                ", Удалённый запуск двигателя " + key.getRemoteEngineStart() +
                ", Бесключевой доступ " + key.getKeylessEntry() +
                ", Срок действия страховки " + insurance.getValidity() +
                ", Стоимость страховки " + insurance.getPrice() +
                ", Номер страховки " + insurance.getNumber();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public Boolean getWinterTires() {
        return winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public String getTires() {
        String tires;
        if (!isWinterTires()) {
            tires = "Летние";
        } else {
            tires = "Зимние";
        }
        return tires;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        this.color = color;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank() ||
                !checkRegistrationNumber(registrationNumber)) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(Boolean winterTires) {
        if (winterTires == null ) {
            winterTires = false; // летние покрышки по умолчанию это false
        }
        this.winterTires = winterTires;
    }

    public void changeTires(Integer month) {
        if (month != null && month > 0 && month <= 12) {
            if (month <= 3 && month >= 1 || month >= 11 && month <= 12) {
                setWinterTires(true);
            } else if (month >= 4 && month <= 10) {
                setWinterTires(false);
            }
        }
    }

    public boolean checkRegistrationNumber(String registrationNumber) {
        return registrationNumber.length() == 9 &&

                Character.isLetter(registrationNumber.charAt(0)) &&

                Character.isDigit(registrationNumber.charAt(1)) &&
                Character.isDigit(registrationNumber.charAt(2)) &&
                Character.isDigit(registrationNumber.charAt(3)) &&

                Character.isLetter(registrationNumber.charAt(4)) &&
                Character.isLetter(registrationNumber.charAt(5)) &&

                Character.isDigit(registrationNumber.charAt(6)) &&
                Character.isDigit(registrationNumber.charAt(7)) &&
                Character.isDigit(registrationNumber.charAt(8));
    }
}

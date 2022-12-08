public class Human {
    private Integer yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(Integer yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        if (name == null || name.isEmpty() || name.isBlank()) {
            name = "Информация не указана";
        }
        this.name = name;
        setTown(town);
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            jobTitle = "Информация не указана";
        }
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " +
                name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth == null || yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            town = "Информация не указана";
        }
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

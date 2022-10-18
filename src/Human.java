import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Human {
    private int birthDate;
    private String name;
    private String cityOfResidence;
    String post;

    public Human(int age, String name, String cityOfResidence, String post) {
        this.setBirthDate(age);
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        this.setCityOfResidence(cityOfResidence);
        if (post == null) {
            this.post = "Информация не указана";
        } else {
            this.post = post;
        }
    }

    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился в " + birthDate + " году. Я работаю на должности " + post + ". Будем знакомы!");
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        if (cityOfResidence == null || cityOfResidence.isEmpty()) {
            this.cityOfResidence = "Информация не указана";
        } else {
            this.cityOfResidence = cityOfResidence;
        }
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int age) {
        if (age <= 0) {
            this.birthDate = 0;
        } else {
            this.birthDate = LocalDate.now().getYear() - age;
        }
    }
}



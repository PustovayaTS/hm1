public class Human {
    private int birthDate;
    private String name;
    private String cityOfResidence;
    String post;

    public Human(int birthDate, String name, String cityOfResidence, String post) {
        if (birthDate < 0) {
            this.birthDate = 0;
        } else {
            this.birthDate = birthDate;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (cityOfResidence == null) {
            this.cityOfResidence = "Информация не указана";
        } else {
            this.cityOfResidence = cityOfResidence;
        }
        if (post == null) {
            this.post = "Информация не указана";
        } else {
            this.post = post;
        }
    }

    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился в " + birthDate + " году. Я работаю на должности " + post + ". Будем знакомы!");
    }
}



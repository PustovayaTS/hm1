public class Human {
    private int birthDate;
    private String name;
    private String cityOfResidence;
    String post;

    public Human(int birthDate, String name, String cityOfResidence, String post) {
        this.birthDate = birthDate;
        this.name = name;
        this.cityOfResidence = cityOfResidence;
        this.post = post;
    }

    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился в " + birthDate + " году. Я работаю на должности " + post + ". Будем знакомы!");
    }
}



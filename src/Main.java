public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human Ania = new Human(1993,"Аня", "Москва", "методист образовательных программ");
        Human Kate = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        Human Artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Maksim.hello();
        Ania.hello();
        Kate.hello();
        Artem.hello();
    }
}
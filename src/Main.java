public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human Ania = new Human(29,"Аня", "Москва", "методист образовательных программ");
        Human Kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human Artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        Human Vladimir = new Human(21, "Владимир", "Казань", null);
        Human Sasha = new Human(-3, null, null, null);

        Maksim.hello();
        Ania.hello();
        Kate.hello();
        Artem.hello();
        Vladimir.hello();
        Sasha.hello();

        Flower rose = new Flower("Роза обыкновенная", null, "Голандия", 35.59, 0);
        Flower chrys = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gyps = new Flower("Гипсофила", null, "Турция", 19.5, 10);

        rose.flowerInfo();
        chrys.flowerInfo();
        pion.flowerInfo();
        gyps.flowerInfo();
    }
}
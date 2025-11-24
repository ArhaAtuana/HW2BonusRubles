public class Main {
    public static void main(String[] args) {

        int amount = 300;
        int adding = 3_600;
        int total = amount + adding;

        if (adding > 1000) {
            total = total + adding / 100;
        } else {
            total = amount + adding;
        }
        System.out.println("Итоговый счет:" + total);

        int bonus;

        if (adding > 1000) {
            bonus = adding/100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус составил:" + bonus);
    }
}
public class Main {
    public static void main(String[] args) {

        int amount = 300;
        int adding = 2600;
        int total = amount + adding;

        if (adding > 1000){total = total + adding/100;}
        System.out.println(total);
    }
}
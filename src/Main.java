public class Main {
    public static void main(String[] args) {
        // стоимости билета
                int amount = 1000000;
        // бонусные милли
                int percent = 2000;
        // Рассчитываете количество бонусных милль, используя
                int bonus = amount / percent;
        // новую переменную и выводите на экран
                System.out.println("Спасибо что выбрали нашу авиакомпанию, у вас "+ bonus +" бонусных/ая миль/я");
    }
}

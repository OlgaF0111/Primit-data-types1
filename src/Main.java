public class Main {
    public static void main(String[] args) {
        int score = 2000;  //сумма на текущем счете клиента
        int replenishment = 1001;  // сумма пополнения
        int gift = 100;  // стоимость 1 подарочного рубля
        if (replenishment >= 1001) {
            System.out.println("Количество бонусных рублей" + (replenishment / gift));
        } else {
            System.out.println("Количество бонусных рублей" + 0);
        }
        System.out.println("Итоговый счет" + (score + replenishment));
    }
}

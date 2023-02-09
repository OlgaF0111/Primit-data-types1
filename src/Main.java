public class Main {
    public static void main(String[] args) {
        int a = 2000;  //сумма на текущем счете клиента
        int b = 1001;  // сумма пополнения
        int c = 100;  // стоимость 1 подарочного рубля
        if (b >= 1001) {
            System.out.println("Количество бонусных рублей" + (b / c));
        } else {
            System.out.println("Количество бонусных рублей" + 0);
        }
        System.out.println("Итоговый счет" + (a + b));
    }
}

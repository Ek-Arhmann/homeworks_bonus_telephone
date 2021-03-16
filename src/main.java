public class main {
    public static void main(String[] args) {
        int refill = 1000;
        int balance = 200;
        int accountRefill = 1200;
        int bonus;
        String resultBall = "Ваше кол-во балов равно ";
        String resultCounter = "Ваш текущий баланс равен ";
        if (accountRefill >= refill) {
            bonus = accountRefill / 100;

        } else {
            bonus = 0;
        }
        System.out.println(resultBall + bonus);

        int totalAmount ;
        totalAmount = bonus + accountRefill + balance;
        System.out.println(resultCounter + totalAmount);
    }
}


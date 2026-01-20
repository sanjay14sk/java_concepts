class ATM extends Thread {
    public void run() {
        System.out.println(
            "Transaction handled by: " + Thread.currentThread().getName()
        );
    }

    public static void main(String[] args) {
        ATM user1 = new ATM();
        ATM user2 = new ATM();
        ATM user3 = new ATM();

        user1.start();
        user2.start();
        user3.start();
    }
}


public class Main {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        for (int i = 0; i < 10; i++) {
            System.out.println(myDice.getDiceFace());
        }
    }
}

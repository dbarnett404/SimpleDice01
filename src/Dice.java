public class Dice {
    private final int MAX_NUM = 6;
    public int getDiceFace() {
        return (int)(Math.random() * MAX_NUM) + 1;
    }
}

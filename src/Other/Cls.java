package Other;

public class Cls {
    public void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

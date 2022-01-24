package mint;

public class Mint {
    public static void main(String[] args) {
        System.out.println("MINT - Version 1.0.0 (Build 20220125)");
        if (args.length > 0 && "-v".equals(args[0])) {
            return;
        }
        System.out.println("A Java based implementation of the MINT interpreter.");
    }
}

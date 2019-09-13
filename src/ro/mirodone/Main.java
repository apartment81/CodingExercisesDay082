package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        TenMinWalk tenMinWalk = new TenMinWalk();

        System.out.println(tenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(tenMinWalk.isValid(new char[] {'n','s','n','s'}));
    }
}

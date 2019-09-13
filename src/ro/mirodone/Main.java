package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        TenMinWalk tenMinWalk = new TenMinWalk();

        System.out.println(tenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(tenMinWalk.isValid(new char[] {'n','s','n','s'}));
        System.out.println(tenMinWalk.isValid(new char[] {'n','n','n','n','n','s','s','s','s','s'}));
        System.out.println(tenMinWalk.isValid(new char[] {'e','e','e','e','e','w','w','w','w','w'}));

        TenMinWalk0 tenMinWalk0 = new TenMinWalk0();

        System.out.println(tenMinWalk0.isValid(new char[] {'e','e','e','e','e','w','w','w','w','w'}));
    }
}

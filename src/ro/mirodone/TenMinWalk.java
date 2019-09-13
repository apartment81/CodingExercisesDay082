package ro.mirodone;

public class TenMinWalk {

    public boolean isValid(char[] walk) {

        int sum = 0;

        if (walk.length == 10) {

            for (char aWalk : walk) {
                if (aWalk == 'n') {
                    sum++;
                } else if (aWalk == 's') {
                    sum--;
                } else if (aWalk == 'w') {
                    sum += 2;
                } else if (aWalk == 'e') {
                    sum -= 2;
                }

            }
            return (sum == 0);//if sum !0 , you are not in the initial position


        } else return false;

    }
}

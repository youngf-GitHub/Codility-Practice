package au.com.test.codility;

public class FrogJmp {

    public static void main(String[] args) {

        FrogJmp obj = new FrogJmp();
        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(obj.solution(X,Y,D));
    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        int cnt = (Y-X) / D;
        int left = (Y-X) % D;

        if (left != 0) {
            cnt ++;
        }

        return cnt;
    }
}

package au.com.test.codility;

import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {

        FrogRiverOne obj = new FrogRiverOne();
        int X = 5;
        int[] A = new int[]{1,3,1,4,2,3,5,4};

        System.out.println(obj.solution(X, A));
    }

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=1; i<=X; i++) {
            set.add(i);
        }

        for (int i=0; i<A.length; i++) {

            if (!set.contains(A[i])) {
                continue;
            }

            set.remove(A[i]);

            if (set.size() == 0) {
                return i;
            }
        }

        return -1;
    }
}

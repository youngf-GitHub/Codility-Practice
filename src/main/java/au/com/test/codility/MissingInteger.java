package au.com.test.codility;

import java.util.HashSet;

/**
 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

 For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

 Given A = [1, 2, 3], the function should return 4.

 Given A = [−1, −3], the function should return 1.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class MissingInteger {

    public static void main(String[] args) {

        MissingInteger obj = new MissingInteger();
        int[] A = new int[]{1,3,6,4,1,2};

        System.out.println(obj.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0; i<A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        int ans = 1;

        while (set.contains(ans)) {
            ans ++;
        }

        return ans;
    }
}

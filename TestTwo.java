import java.util.ArrayList;

public class TestTwo {
    public int solution(int[] A) {

        ArrayList<Integer> B = new ArrayList<Integer>();
        int result = A.length;

        for (int i = 0; i < A.length; i++) {
            if (!B.contains(A[i])) {
                B.add(A[i]);
            }
        }

        for (int k = 0; k < A.length; k++) {
            ArrayList<Integer> C = new ArrayList<Integer>();
            for (int i = k; i < A.length; i++) {
                C.add(A[i]);
                for (int j = 0; j < B.size(); j++) {
                    if (C.contains(B.get(j)) && j == B.size() - 1) {
                        result = Math.min(result, C.size());
                        return result;
                    }

                }

            }

        }

        return result;
    }

}

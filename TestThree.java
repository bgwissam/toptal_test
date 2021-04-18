public class TestThree {
    public int solution(int[] A, int B) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            counter = 0;
            int total = 0;
            for (int j = i; j < A.length; j++) {
                counter++;
                total += A[j];
                double mean = total / counter;

                if (mean == B && total % counter == 0) {

                    result++;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}

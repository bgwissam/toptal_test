
public class TestOne {
    public int solution(String[] T, String[] R) {
        int result = 0;

        for (int i = 0; i < T.length; i++) {
            char end = T[i].charAt(T[i].length() - 1);
            try {
                int value = Integer.parseInt(String.valueOf(end));

                if (value > 0) {
                    if (R[i] == "OK") {
                        result++;
                    }
                }
                System.out.print(result);

            } catch (Exception e) {

                System.out.print("Error: " + e);
            }

        }

        return result;

    }
}

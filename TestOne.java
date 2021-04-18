
public class TestOne {
    public int solution(String[] T, String[] R) {
        int result = 0;
        int counter = 0;

        String testGroup = "";

        int testGroupsCounter = 0;
        for (int i = 0; i < T.length; i++) {

            if (Character.isDigit(T[i].charAt(T[i].length() - 1))) {
                testGroupsCounter++;
                if (R[i].equals("Ok")) {
                    counter++;
                }
            } else {
                if (Character.isDigit(T[i].charAt(T[i].length() - 2)) && testGroup.isEmpty()) {
                    int numberOfTest = 0;
                    int subCounter = 0;
                    testGroupsCounter++;
                    testGroup = T[i].substring(0, T[i].length() - 1);

                    for (int j = 0; j < T.length; j++) {

                        if (testGroup.equals(T[j].substring(0, T[j].length() - 1))) {
                            numberOfTest++;
                            if (R[j].equals("Ok")) {

                                subCounter++;
                            }
                        }
                    }
                    if (subCounter == numberOfTest) {
                        counter++;
                    }
                }
            }

        }
        result = (counter * 100) / testGroupsCounter;
        System.out.println(result);
        return result;

    }
}

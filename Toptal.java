class Toptal {
    public static void main(String[] args) {
        testOne();
    }

    public static void testOne() {
        TestOne test = new TestOne();
        String[] T = { "test1a", "test2", "test1b", "test1c", "test3" };

        String[] R = { "Wrong Answer", "Ok", "Ok", "Ok", "Time Limit Exceeded" };
        test.solution(T, R);

    }

    public static void testTwo() {
        TestTwo test = new TestTwo();
        int[] A = { 2, 1, 1, 3, 2, 1, 1, 3 };

        int val = test.solution(A);
        System.out.println(val);
    }

    public static void testThree() {
        TestThree test = new TestThree();
        int[] A = { 2, 1, 3 };
        int B = 2;
        test.solution(A, B);
    }

}
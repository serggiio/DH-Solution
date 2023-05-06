public class App {
    public static void main(String[] args) throws Exception {
        int [] arrary = {1, 1, 4, 6, 1, 5, 5};
        int[] result = solution(5,arrary);

        for(int value : result) {
            System.out.println(value);
        }
    }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int currentMax = 0;
        
        for (int i = 0; i < A.length; i++) {

            int arrayValue = A[i];
            if (arrayValue >= 1 && arrayValue <= N) {
                counters[arrayValue-1] = counters[arrayValue-1] > currentMax ? counters[arrayValue-1] : currentMax;
                counters[arrayValue-1]++;
                maxCounter = maxCounter > counters[arrayValue-1] ? maxCounter : counters[arrayValue-1];
            } else if (arrayValue == (N + 1)) {
                currentMax = maxCounter;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = counters[i] > currentMax ? counters[i] : currentMax;
        }
        
        return counters;
    }
}



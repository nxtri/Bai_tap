class Bai_Tap {
  public static boolean sumExists(int [] in, int sum) {
       int currentSum = 0;
        int startIdx = 0;
        for (int i = 0; i < in.length; i++) {
            if (currentSum > sum) {
                while (currentSum > sum && startIdx < i) {
                    currentSum -= in[startIdx++];
                }
            }

            if (currentSum == sum) {
                return true;
            }
            currentSum += in[i];
        }
        return false;
    }

    public static void main(String[] args)
    {

        int A[] = { 2, 1, 2, 4, 3, 5, 2, 6 };
        int x = 14;


        if (sumExists(A, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
 
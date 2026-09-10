import java.util.*;
public class BOlyaAndGameWithArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> firstMin = new ArrayList<>();
            ArrayList<Integer> secondMin = new ArrayList<>();

            for (int i=0;i<n; i++) {
                int size = sc.nextInt();
                ArrayList<Integer> list = new ArrayList<>();

                for (int j=0;j <size; j++){
                    list.add(sc.nextInt());
                }

                Collections.sort(list);
                firstMin.add(list.get(0));
                secondMin.add(list.get(1));
            }

            int low =Collections.min(firstMin);

            int secondLow = Collections.min(secondMin);

            long sum = 0;

            for (int x :secondMin) {
                sum += x;
            }

            sum -= secondLow;
            sum += low;

            System.out.println(sum);
        }

    }
}

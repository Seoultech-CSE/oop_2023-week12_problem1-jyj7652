import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }

        for (int i = 0; i < 5; i++) {
            double input = scanner.nextDouble();
            list.add(input);
        }

        sort(list);

        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void sort(ArrayList<Number> list) {
        int n = list.size();
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
		}
    }
}

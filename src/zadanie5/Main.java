package zadanie5;


public class Main {

    // Задание 1
    static void func1(int n)
    {
        int k = 0;

        for (int i = 0; i < n; i++)
        {
            if (i != n - 1) System.out.print((k + 1) + ", ");
            else System.out.println(k + 1);

            if (i == k * (k + 1))
                k++;
        }
    }

    // Задание 2
    static void func2(int n)
    {
        func3(1, n);
    }

    // Задание 3
    static void func3(int t0, int t1)
    {
        if (t0 > t1) return;

        for (int i = 0; i < t0; i++)
        {
            if (i != t0 - 1) System.out.print(t0 + ", ");
            else System.out.println(t0);
        }

        func3(t0 + 1, t1);
    }

    //задача 4
    public static int func4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += func4(len + 1, sum + i, k, s);
        }
        return res;
    }

    //задача 5
    public static int func5(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + func5(n / 10);
        }
    }

    public static void main(String[] args) {
        func1(3);
        System.out.println();
        func2(3);
        System.out.println();
        func3(3, 9);
        System.out.println(func4(0, 0, 3, 15));
        System.out.println(func5(123));
    }

}

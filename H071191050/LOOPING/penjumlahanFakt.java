import java.util.Scanner;
    class penjumlahanFakt {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int sum = 0;
            for(int i = 1; i <= a; i++) {
                if(a % i == 0) {
                sum += i;
            }
            }
                System.out.printf("sum = %d",sum);
    }
}
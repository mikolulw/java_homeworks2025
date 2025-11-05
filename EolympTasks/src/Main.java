//8520
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y;
        if(x < 5){
            y = x * x - 3 * x + 4;
        }else{
            y = x + 7;
        }
        System.out.print(y);
    }
}

//4817
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int m = in.nextInt();
            int p = (n + m) * 2;
            int s = n * m;
            System.out.println(p + " " + s);
        }
        in.close();
    }
}

//8954
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(arr[n - 1]);
        for(int i = n - 2; i > -1; i--){
            System.out.print(" " + arr[i]);
        }
        in.close();
    }
}
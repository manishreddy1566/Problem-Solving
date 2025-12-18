import java.util.*;
public class Program1 {
    public  static  int[] productArray(int[] a){
        int[] res=new int[a.length];
        int k=0;
        int count=0;
        for(int i=0; i<a.length; i++){
            int product=1;
            for(int j=0; j<a.length; j++){
                if(j==i){
                    continue;
                }
                product=product*a[j];
            }
            res[k++]=product;


        }
        return res;
    }


    public static void anotherMethod(int[] a) {

        int n = a.length;
        int[] res = new int[n];

        // Left products
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }

        // Right product
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * a[i];
        }

        for (int x : res) {
            System.out.println(x);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a={1, 2, 4, 6};
        anotherMethod(a);




    }
}


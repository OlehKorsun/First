import java.util.Arrays;

public class FuncStat {
    public static void main(String[] args) {
        System.out.println(fiboR(45));
        System.out.println(fiboI(45));
        System.out.println(factR(12));
        System.out.println(factI(12));
        System.out.println(gcdR(12125, 40643));
        System.out.println(gcdI(12125, 40643));

        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println(maxElem(a, 0));
        System.out.println(numElem(a, 0));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reverse(a, 0)));
        System.out.println(isPalindrom("abba"));
        System.out.println(isPalindrom("radar"));
        System.out.println(isPalindrom("rower"));

    }

    public static int fiboR(int n){
        if(n>=0 && n<2)
            return n;

        return fiboR(n-1) + fiboR(n-2);
    }
    public static int fiboI(int n){
        if(n>=0 && n<2)
            return n;
        int fib = 1, prevFib = 1;
        for(int i = 2; i<n; i++){
            int tmp = fib;
            fib += prevFib;
            prevFib = tmp;
        }
    return fib;
    }

    public static int factR(int n){
        if(n>1)
            n = n*factR(n-1);
        else
            return 1;
        return n;
    }
    public static int factI(int n){
        for(int i = n-1; i>0; i--){
            n = n*i;
        }
        return n;
    }

//    public static int gcdR(int a, int b){
//        if(a==b)
//            return a;
//        if(a>b)
//            a-=b;
//        else
//            b-=a;
//        if(a==1 || b==1)
//            return 1;
//        else
//            a = gcdR(a, b);
//        return a;
//    }

    public static int gcdR(int a, int b){
        if(a==b)
            return a;
        return a>b? gcdR(a-b,b): gcdR(a, b-a);
    }
    public static int gcdI(int a, int b){
        if(a==b)
            return a;
        while(a!=b){
            a = a>b? a-b: a;
            b = b>a? b-a: b;
        }
        return a;
    }

    public static int maxElem(int[] arr, int from){
        if(from>=arr.length-1)
            return arr[from];
        if(arr[from]<maxElem(arr, from+1))
            return maxElem(arr, from+1);
        else
            return arr[from];
    }

    public static int numElem(int[] arr, int from){
        if(from==arr.length)
            return 0;
        int parzyste = arr[from]%2==0? 1:0;
        int parzysteDalej = numElem(arr, from+1);
        return parzyste + parzysteDalej;
    }

    public static int[] reverse(int[] arr, int from){
        if(from>=arr.length/2)
            return arr;
        int tmp = arr[from];
        arr[from] = arr[arr.length-1-from];
        arr[arr.length-1-from] = tmp;
        reverse(arr, from+1);
        return arr;
    }

    public static boolean isPalindrom(String s){
        if(s.length()<2)
            return true;
        boolean bool = s.charAt(0)!=s.charAt(s.length()-1)? false: isPalindrom(s.substring(1, s.length()-1));
        return bool;
    }
}

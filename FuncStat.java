public class FuncStat {
    public static void main(String[] args) {
        //System.out.println(fiboR(3));
        //System.out.println(fiboI(6));
        //System.out.println(factR(6));
        //System.out.println(factI(6));
        System.out.println(gcdR(16, 12));
        System.out.println(gcdI(16, 12));

        int[] a = {3,8, 2, 9, 7, 4};

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
        return arr[from]>arr[from+1]? arr[from]: maxElem(arr, from+1);
    }
}

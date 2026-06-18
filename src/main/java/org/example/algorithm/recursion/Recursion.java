package org.example.algorithm.recursion;

public class Recursion {

    public static int fact(int n) {
        //base case for which you know the answer

        if (n == 1) {
            return 1;
        }

        //recursive assumption pattern
        int subproblem = fact(n - 1);

        //self work bind recursive assumption and some logic to build the bigger problem answer

        return n * subproblem;

    }

    public static int fibonacci(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }
        //recursive assumption
        int currentValue = fibonacci(n - 2) + fibonacci(n - 1);
        //self work
        return currentValue;
    }

    public static void printNatural(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNatural(n - 1);
        System.out.println(n);
    }

    public static void printNaturalInDescendingOrder(int n) {
        //base case
        if (n == 0) {
            return;
        }
        //recursive function
        printNaturalInDescendingOrder(n - 1);
        //self work
        System.out.println(n);
    }

    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

    public static int printNoConsecutiveOnes(int n) {
        //base case
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        }

        //recursive function
        int previousTwo = printNoConsecutiveOnes(n - 2);
        int previousOne = printNoConsecutiveOnes(n - 1);
        //selfwork
        return previousTwo + previousOne;
    }

    public static int findNumberOfWayPersonCanGoAloneOrInPair(int n) {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }

        //recursive assumption
        int result = findNumberOfWayPersonCanGoAloneOrInPair(n - 1) + (n - 1) * findNumberOfWayPersonCanGoAloneOrInPair(n - 2);

        //self work
        return result;
    }

    public static int numberOfPower(int a, int b) {
        //base case
        if (b == 0) {
            return 1;
        }
        //recursive assumption
        int pow = numberOfPower(a, b - 1);
        //self work
        return pow * a;
    }

    public static void pattern1(int n) {
        //base case
        if (n == 0) {
            return;
        }
        //self work
        for (int i = n; i > 0; --i) {
            System.out.print("*");
        }
        System.out.println();
        pattern1(n - 1);
    }

    //    public static String pattern2(int n,String result){
//        if(n==0){
//            return "";
//        }
////        recursive intution
//        String res=pattern2(n-1,result);
//        res=res+"*";
//        System.out.println(res);
//        return res;
//    }
    public static void pattern2(int n,int i) {
        if(n==0){
            return ;
        }
        if(i<n){
            System.out.print("*");
            pattern2(n,i+1);
        }else {
            System.out.println();
            pattern2(n-1,0);
        }
        System.out.println("value of N"+n);
    }

    public static void pattern3(int n,int i){
        if(n==0){
            return;
        }
        pattern3(n-1,0);
        if(i<n){
            System.out.print("*");
            pattern3(n,i+1);
        }
    }

    public static void printSubset(int arr[],int i,String result){
        //base case

        if(i>=arr.length){
            System.out.println("["+result+"]");
            return;
        }

        //recursive assumption
        printSubset(arr,i+1,result+arr[i]);
        printSubset(arr,i+1,result);
    }

    public static void noConsecutiveOnes(int n,String result){
        if(result.length()==n){
            System.out.println(result);
            return;
        }
        //recursive assumption
        if(!result.isEmpty()&&result.charAt(result.length()-1)=='0'){
            noConsecutiveOnes(n,result+"1");
        }
        noConsecutiveOnes(n,result+"0");
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(2));
//        printNatural(5);
//        System.out.println(numberOfPower(3,2));
//        pattern1(5);
//        pattern3(5, 0);
//        int arr[]={1,2,3};
//        printSubset(arr,0,"");
        noConsecutiveOnes(3,"");
    }
}

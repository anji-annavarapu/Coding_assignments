
public class SwapNumbers {
    public static void main(String[] args) {
        int n1=16;
        int n2=10;
        System.out.println(swapWtOutThirdVar(n1,n2)[0]+" "+swapWtOutThirdVar(n1,n2)[1]);

    }

    private static int[] swapWtOutThirdVar(int n1,int n2){
        n2=n1+n2;
        n1=n2-n1;
        n2=n2-n1;
        return new int[]{n1,n2};
    }
    private static int[] swapNumbers(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
        return new int[]{n1,n2};

    }

}

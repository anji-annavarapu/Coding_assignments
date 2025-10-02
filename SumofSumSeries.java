
//Given a natural number, find the sum of the sum-series of the first N natural number
public class SumofSumSeries {
    private int N;
    //numeric value for natural number
    public SumofSumSeries(int N){
        this.N=N;
    }
    public int sumOfSumseries(){
        int sum=0;
        int sumOfSeries=0;
        if(N==0) return 0;
        else{
            for(int i=1;i<=N;i++){
                sum+=i;
                sumOfSeries+=sum;
            }
            return sumOfSeries;
        }
    }

}

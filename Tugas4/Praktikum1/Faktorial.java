public class Faktorial{
    public int nilai;

    public int faktoialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto *= i;
        }
        return fakto;
    }

    public int faktoialDC(int n){
        if(n == 1){
            return 1;
        }else{
            int fakto = n* faktoialDC(n-1);
            return fakto;
        }
    }
}
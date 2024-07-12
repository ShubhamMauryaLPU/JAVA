
public class deletionA {
    public static void main(String args[]){
        int A[]={1,2,3,4,5};
        int B[]={6,7,8};
        int n=A.length+3;
        for(int i=0;i<n;i++){
            A[n-3+i]=B[i];
        }
        for(int i=0;i<A.length+B.length;i++){
            System.out.print(A[i]);
        }

    }
}

public class ques21 {
    public static void main(String args[]){
        int real1=2;
        int real2=3;
        int img1=4;
        int img2=3;
        complex c=new complex(real1, img1, real2, img2);
        c.sum();
        c.multipy();
        c.substract();
    }
}
class complex{
    int real1;
    int img1;
    int real2;
    int img2;
    complex(int real1 ,int img1,int real2,int img2){
        this.real1=real1;
        this.img1=img1;
        this.real2=real2;
        this.img2=img2;
    }
    void sum(){
        System.out.println((real1+real2)+" + "+(img1+img2)+" i");
    }
    void multipy(){
        System.out.println((real1*real2)+" + "+(img1*img2)+" i");
    }
    void substract(){
        System.out.println((real1-real2)+" + "+(img1-img2)+" i");
    }
    
}

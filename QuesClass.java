public class QuesClass {
    public static void main(String args[]){

    }
}
class RealNo{
    int real;
    void real(int real){
        this.real=real;
    }
}
class ComplexNo extends RealNo{
    int complex;
    void complex(int complex){
        this.complex=complex;
    }
    void print(){
        System.out.println(real+"i"+);
    }
}
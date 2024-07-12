public class Eboxpoly4 {
    public static void main(String[] args) {
        
    }
}
class Account{
    protected String accName;
    protected String accNo;
    protected String bankName;
    void setAccName(String accName){
        this.accName=accName;
    }
    String getAccName(){
        return accName;
    }
    void setAccNo(String accNo){
        this.accNo=accNo;
    }
    String getAccNo(){
        return accNo;
    }
    void setBankName(String bankName){
        this.bankName=bankName;
    }
    String getBankName(){
        return bankName;
    }
}
class CurrentAccount extends Account{

}

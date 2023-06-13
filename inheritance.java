//inheritance for account
import java.util.*;
class Account{
    private int accNo;
    private String name="";
    private String adress="";
    private String phoneNo="";
    public int balance=0;
    Account(int accNo,String name,String phoneNo,String adress,int balance){
        this.accNo=accNo;
        this.name=name;
        this.adress=adress;
        this.phoneNo=phoneNo;
        this.balance=balance;
    }
    public int getaccNo(){
        return accNo;
    }
    public String name(){
        return name;
    }
    public String adress(){
        return adress;
    }
    public String phoneNo(){
        return phoneNo;
    }
    public String toString(){
        return "Account No :\t"+accNo+"\n Name :\t"+name+"\nAdress :\t"+adress+"\n Phone no:\t"+phoneNo;
    }
}
class SavingAccount extends Account{
    public SavingAccount(int x,String y,String s,String d,int f){
        super(x,y,s,d,f);
    }
    public  int deposit(long x){
        balance+=x;
        return balance;
    }
    public int withdraw(long amt){
        balance-=amt;
        return balance;
    }
}
class LoanAccount extends Account{
     public LoanAccount(int x,String y,String s,String d,int f){
        super(x,y,s,d,f);
    }
    public  int payEmi(long amt){
        balance-=amt;
        return balance;
    }
}
class Program91{
    public static void main(String[] args){
        //Account a1=new Account(23456,"payal","3456789433","at post:lohata",1111);
        SavingAccount s1=new SavingAccount(23456,"payal","3456789433","at post:lohata",1111);
        System.out.println("Deposit after adding balance :"+s1.deposit(56789));
        System.out.println("withdraw after subtracting balance :"+s1.withdraw(7654));
        LoanAccount l1=new LoanAccount(23456,"payal","3456789433","at post:lohata",1111);
         System.out.println("Emi  balance :"+l1.payEmi(10));
        
    }
}
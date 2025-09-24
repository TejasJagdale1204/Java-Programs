class BankAccount 
{
    static String bankName;
    static String branchName;
    static String ifsc;

    long AccNum;
    String AccHName;
    double balance;

    //static and non-static methods for initializing the above static and non-static fields

    //initializing static fields 
    static void setStaticFields(String bankName,String branchName,String ifsc)
    {
        BankAccount.bankName=bankName;
        BankAccount.branchName=branchName;
        BankAccount.ifsc=ifsc;
    }
    //initializing non-static fields
    void setNonStaticFields(long AccNum,String AccHName,double balance)
    {
        this.AccNum=AccNum;
        this.AccHName=AccHName;
        this.balance=balance;
    }

    //for displaying all static and non-static fields of an object
    void display()
    {
        System.out.println(bankName);
        System.out.println(branchName);
        System.out.println(ifsc);
        System.out.println(AccNum);
        System.out.println(AccHName);
        System.out.println(balance);
    }
    
}
class Bank 
{
    public static void main (String [] args)
    {
    //initializing BankAccount class static fields common to all objects 
    BankAccount.setStaticFields("HDFC","Ameerpet","HD123AM");
    
    //creating two instances from the class BankAccount
    BankAccount acc1=new BankAccount();       //for HK
    BankAccount acc2=new BankAccount();       //for BK

    //displaying acc1 object values before initialization
    System.out.println("acc1 object values");
    acc1.display();

    //displaying acc2 object values before initialization
    System.out.println("\nacc2 object values");
    acc2.display();

    //initializing acc1 instance with the object HK values 
    acc1.setNonStaticFields(123456789012L,"HK",9999);

    //initializing acc2 instance with the object HK values 
    acc2.setNonStaticFields(123456789013L,"BK",9998);

    //displaying acc1 object values after initialization 
    System.out.println("\nacc1 object values");
    acc1.display();

    //displaying acc1 object values after initialization 
    System.out.println("\nacc2 object values");
    acc2.display();
    }

}


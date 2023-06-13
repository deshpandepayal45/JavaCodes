
interface member
{
    void callBack();
}
class Store
{
    member mem=new member[100];
    int count=0;

    void register(member m)
    {
        mem[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callBack();
        }
    }
}

class Customer
{
    String name;
    Customer(String m)
    {
        name=m;
    }
    public void callBack()
    {
        System.out.println("ok,i will visit ,"+name);
    }
}


class storeCustomerInterface
{
    public static void main(String[] args)
    {
        Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Payal");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
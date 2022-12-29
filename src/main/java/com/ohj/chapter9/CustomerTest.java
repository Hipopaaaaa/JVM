package com.ohj.chapter9;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer();
    }
}

class Customer{
    int id=1001;
    String name;
    Account acct;
    {
        name="匿名客户";
    }

    public Customer() {
        this.acct =new Account();
    }
}
class Account{

}

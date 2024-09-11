public class Customer {
    private String id;
    private String name;
    private String address;

    public Customer(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("customer name is " + this.name);
    }
}

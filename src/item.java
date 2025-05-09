public class item {
    private double price;
    private String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public item(){
        name = "";
        price = 0.00;

    }


    public item(String name){
        this.name = name;
        this.price = calcPrice(name);

    }





    private double calcPrice(String itemName){
        String str = itemName.toLowerCase();
        switch (str){
            case "pepperoni": return 1.00;
            case "green papers": return 0.90;
            case "mushrooms": return 1.20;
            default: return 0.00;
         }
    }



    public String toString(){
        return String.format("%s $%.2f",getName(),getPrice());
    }


}

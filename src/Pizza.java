public class Pizza {

    //Instance Vars

    private String customerName;
    private String size;
    private item item1;
    private item item2;
    private item item3;





    public Pizza(String customerName , String size){
        this.customerName = customerName;
        this.size = size;
        this.item1 = new item();
        this.item2 = new item();
        this.item3 = new item();


    }

    public void setTopping(item i1 , item i2 ,item i3 ){
        item1 = i1;
        item2 = i2;
        item3 = i3;
    }

    public double getPrice(){
        double total = 0.00;
        switch (size.toLowerCase()){
            case "large":{
                total = 7.00;
                break;
            }
            case "medium":{
                total = 5.00;
                break;
            }
            case "small":{
                total = 3.00;
                break;
            }
            default:{
                total = 0.00;
                break;
            }
        }

        total+= item1.getPrice();
        total+= item2.getPrice();
        total+= item3.getPrice();

        return total;
    }

    public String toString(){
        String str = customerName;
        str += ": ";
        str += size;
        str += " - ";
        str += String.format("%s %s %s $%.2f", item1.getName() , item2.getName(),item3.getName(), getPrice());
        return str;
    }




}

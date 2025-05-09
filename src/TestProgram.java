public  class TestProgram {

    public static void main(String[] args) {
        item p = new item("pepperoni");
        item m = new item("mushrooms");
        item g = new item("green papers");
        item n = new item();

        Pizza p1 = new Pizza ("Dave", "large");
        p1.setTopping(p,n,n);

        Pizza p2 = new Pizza ("Jack", "medium");
        p2.setTopping(p,m,g);

        System.out.println(p1);
        System.out.println(p2);

    }
}
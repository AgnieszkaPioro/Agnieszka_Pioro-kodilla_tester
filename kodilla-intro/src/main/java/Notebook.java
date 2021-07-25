public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700 ) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight <= 1500) {
            System.out.println("This notebook is not so heavy. ");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYearAndPrice() {
        if (this.price <= 1000 && this.year >= 2010) {
            System.out.println("This notebook is worth the money.");
        } else {
            System.out.println("This notebook is not worth the money.");
        }
    }

}
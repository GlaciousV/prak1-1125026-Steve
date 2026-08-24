package minggu1;

public class Menu {
    public String name;
    public double price;
    public String category;
    public static int totalMenu = 0;

    public Menu(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        totalMenu++;
    }
    public void showMenu() {
        System.out.println("Nama     : " + this.name);
        System.out.println("Harga    : " + this.price);
        System.out.println("Kategori : " + this.category);
        System.out.println();
    }

    
    public double discount(double percentage){
        return price - (price * percentage / 100);
    }

    public void changePrice(double newPrice){
        price = newPrice;
    }
    public static void main(String[] args) {
        Menu Espressoo = new Menu("Espressoo", 20000, "Beverage");
        Menu Croissant = new Menu("Croissant", 25000, "Food");
        Menu Matcha = new Menu("Matcha", 22000, "Beverage");
        Menu Sandwich = new Menu("Sandwich", 30000, "Food");
        
        Espressoo.showMenu();
        Croissant.showMenu();
        Matcha.showMenu();
        Sandwich.showMenu();

        System.out.println("After Update");
        System.out.println("Espressoo");
        System.out.println("Original Price = " + Espressoo.price);
        System.out.println("Discount 10% Price = " + Espressoo.discount(10));
        System.out.println();
        Croissant.changePrice(28000);
        System.out.println("New Croisant Price : Rp" + Croissant.price);
        System.out.println("Total Menu : "+ Menu.totalMenu);
    }
}
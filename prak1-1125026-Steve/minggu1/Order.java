package minggu1;

public class Order {
    public String orderId;
    public String customerName;
    public Menu menu;
    public int quantity;

    public Order(String orderId, String customerName, Menu menu, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.menu = menu;
        this.quantity = quantity;
    }   
    public double CalculateTotal () {
        return menu.price * quantity;
    }
    public void showOrder() {
        System.out.println("Nama Pelanggan : " + this.customerName);
        System.out.println("Menu           : " + this.menu.name);
        System.out.println("Jumlah         : " + this.quantity);
        System.out.println("Total Bayar    : Rp" + CalculateTotal());
    }
    public static void main(String[] args) {
        Menu espresso = new Menu("Espresso", 20000, "Beverage");

        Order Pesanan1 = new Order("ORD001", "Key", espresso, 2);

        Pesanan1.showOrder();
    }
}

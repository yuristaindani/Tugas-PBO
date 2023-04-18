import java.util.HashMap;

class Order {
    private Restaurant restaurant;
    private HashMap<Menu, Integer> menu;
    private int distance;

    public Order(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.menu = new HashMap<>();
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public HashMap<Menu, Integer> getMenu() {
        return this.menu;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Menu menu : this.menu.keySet()) {
            totalPrice += menu.getHargaMenu() * this.menu.get(menu);
        }
        totalPrice += this.distance * 5000; // assume delivery cost is 1000 per km
        return totalPrice;
    }

    public void addMenu(Menu menu, int quantity) {
        if (this.menu.containsKey(menu)) {
            int currentQuantity = this.menu.get(menu);
            this.menu.put(menu, currentQuantity + quantity);
        } else {
            this.menu.put(menu, quantity);
        }
    }
}


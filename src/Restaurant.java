import java.util.ArrayList;

public class Restaurant {
    private String idResto;
    private String namaResto;
    private String alamatResto;
    private String kontakResto;
    private ArrayList<Menu> menu;

    public Restaurant(String idResto, String namaResto, String alamatResto, String kontakResto) {
        this.idResto = idResto;
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
        this.kontakResto = kontakResto;
        this.menu = new ArrayList<Menu>();
    }

    public String getidResto() {
        return this.idResto;
    }

    public String getnamaResto() {
        return this.namaResto;
    }

    public String getalamatResto() {
        return this.alamatResto;
    }

    public String getkontakResto() {
        return this.kontakResto;
    }

    public void tambahMenuResto(Menu menu) {
        this.menu.add(menu);
    }

    public void addMenu(Menu menu) {
        this.menu.add(menu);
    }

    public ArrayList<Menu> getMenu() {
        return this.menu;
    }
}




import java.util.Scanner;

class RealMadrid {
    private String imya_igroka;
    private String Pozicia;
    private int Vozrast;
    private String Natia;

    public RealMadrid() {
    }

    public RealMadrid(String imya_igroka, String Pozicia, int Vozrast, String Natia) {
        this.imya_igroka = imya_igroka;
        this.Pozicia = Pozicia;
        this.Vozrast = Vozrast;
        this.Natia = Natia;

    }

    public String getImya_igroka() {
        return imya_igroka;
    }

    public void setImya_igroka(String imya_igroka) {
        this.imya_igroka= imya_igroka;
    }

    public String getPozicia() {
        return Pozicia;
    }

    public void setPozicia(String Pozicia) {
        this.Pozicia = Pozicia;
    }

    public int getVozrast() {
        return Vozrast;
    }

    public void setVozrast(int Vozrast) {
        this.Vozrast = Vozrast;
    }
    public String getNatia() {
        return Natia;
    }

    public void setNatia(String Natia) {
        this.Natia = Natia;
    }

    public static void main(String[] args) {
        RealMadrid[] massiv = new RealMadrid[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите имя для добавления " + (i + 1) + " игрока: ");
            String imya_igroka = scanner.nextLine();
            System.out.println("Введите позцию игрока " + (i + 1) + ": ");
            String Pozicia = scanner.nextLine();
            System.out.println("Введите возраст игра " + (i + 1) + ": ");
            int Vozrast = scanner.nextInt();
            System.out.println("Введите нацию игрока " + (i + 1) + ": ");
            String Natia = scanner.nextLine();
            scanner.nextLine();

            massiv[i] = new RealMadrid(imya_igroka, Pozicia, Vozrast, Natia);
        }

        scanner.close();
    }
}
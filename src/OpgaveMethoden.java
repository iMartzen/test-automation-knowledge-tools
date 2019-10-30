public class OpgaveMethoden {
    private int waardeAuto = 0;

    public static void main(String[] args) {
        int waardeAuto = 21428;
        int bijtellingsPercentage = 14;
        float bijtelling = berekenBijtelling(waardeAuto, bijtellingsPercentage);
        System.out.println("Bijtelling per maand: " + bijtelling);
        float netto = berekenNettoKosten(bijtelling);
        System.out.println("Netto kosten per maand: " + netto);
    }

    public static int berekenBijtelling(int waardeAuto, int bijtellingsPercentage) {
        return waardeAuto * bijtellingsPercentage / 100;
    }

    public static float berekenNettoKosten(float brutoKosten) {
        return brutoKosten * (float) 0.42;
    }
}
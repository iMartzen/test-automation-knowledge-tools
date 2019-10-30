public class Arrays {
    public static void main(String[] args) {
        int[] rijtje = new int[4]; //reserveer 3 vakjes
        rijtje[0] = 5;
        rijtje[1] = 7;
        rijtje[2] = 9;
        rijtje[3] = 11;

        //    Makkkelijkere notatie:
        int[] rijtje2 = new int[] {5,8,42};

        System.out.println(rijtje.length);
        // geeft 4
        System.out.println(rijtje2.length);
        // geeft 3
    }

}




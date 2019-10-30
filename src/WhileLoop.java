public class WhileLoop {

    public static void main(String[] args) {

        int[] getallen = {27, 42, 12, 1};
        int maximum = getallen[0];
        int index = 1;

        while( index < getallen.length)
        {
            if (getallen[index] > maximum) {
                maximum = getallen[index];
            } else {
                //Doe niks
            }
            index++;
        }
        System.out.println(maximum);
    }
}

package opdracht415;

public class CruiseControl {
    public static void main(String[] args) {
        Auto mijnAuto = new Auto();
        Auto andereAuto = new Auto(123,"BMW", 5);

        // SETTEN VAN DE ACTUELE SNELHEID
        mijnAuto.setActueleSnelheid(120);

        // SETTEN VAN DE GEWENSTE SNELHEID
        mijnAuto.setGewensteSnelheid(115);
        andereAuto.setGewensteSnelheid(115);

        //DE WAARDE WAARMEE JE VERLAAGT/VERHOOGT
        int parameterWaarde = 1;

        while (mijnAuto.getActueleSnelheid() > mijnAuto.getGewensteSnelheid()) {
            mijnAuto.verlaagSnelheid(parameterWaarde);
        }

        System.out.println("----------------------------------------------------");

        while (andereAuto.getActueleSnelheid() > andereAuto.getGewensteSnelheid()) {
            andereAuto.verlaagSnelheid(parameterWaarde);
        }
    }
}


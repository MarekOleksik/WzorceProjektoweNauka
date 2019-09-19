package co.devfoundry.adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Gra muzyka");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Gra angielska muzyka");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);
        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);

        TwoWayAdapter adapter1 = new TwoWayAdapter(ukRadio, radio);
        continentalSocket.plugIn(adapter1);
        ukSocket.plugIn(adapter1);
    }
}

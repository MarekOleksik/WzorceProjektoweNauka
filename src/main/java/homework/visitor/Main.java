package homework.visitor;

import homework.visitor.transport.Animal;
import homework.visitor.transport.Person;
import homework.visitor.transport.Shipment;
import homework.visitor.transport.Transportable;
import homework.visitor.visitor.NameTransportVisitor;
import homework.visitor.visitor.PriceTransportVisitor;
import homework.visitor.visitor.TransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();
        for (Transportable priceTransport: transportableList) {
            priceTransport.accept(priceTransportVisitor);
        }
        for (Transportable priceTransport: transportableList) {
            priceTransport.accept(nameTransportVisitor);
        }
    }
}

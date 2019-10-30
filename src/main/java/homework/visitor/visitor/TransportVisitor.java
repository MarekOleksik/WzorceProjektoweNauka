package homework.visitor.visitor;

import homework.visitor.transport.Animal;
import homework.visitor.transport.Person;
import homework.visitor.transport.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}

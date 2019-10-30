package homework.visitor.transport;

import homework.visitor.visitor.TransportVisitor;

public interface Transportable {
    void accept(TransportVisitor transportVisitor);
}

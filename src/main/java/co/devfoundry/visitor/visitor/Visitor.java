package co.devfoundry.visitor.visitor;

import co.devfoundry.visitor.activity.Squash;
import co.devfoundry.visitor.activity.Treadmill;
import co.devfoundry.visitor.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}

package co.devfoundry.visitor;

import co.devfoundry.visitor.activity.Squash;
import co.devfoundry.visitor.activity.Treadmill;
import co.devfoundry.visitor.activity.Weights;
import co.devfoundry.visitor.visitor.Visitor;
import co.devfoundry.visitor.visitor.VisitorImpl;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);
        VisitorImpl visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);
    }
}

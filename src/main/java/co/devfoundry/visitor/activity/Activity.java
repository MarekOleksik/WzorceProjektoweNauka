package co.devfoundry.visitor.activity;

import co.devfoundry.visitor.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}

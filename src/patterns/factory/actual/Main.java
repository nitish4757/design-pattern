package patterns.factory.actual;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        Factory factory = new Factory();
        var plan = factory.getPlanObject("COMMERCIAL");
        plan.getRate();


    }
}

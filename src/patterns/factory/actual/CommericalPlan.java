package patterns.factory.actual;

public class CommericalPlan implements Plan,CorporateDiscount {

    public void getRate()
    {
        System.out.println(" Commercial rate applied ");
    }

    @Override
    public void getDiscount() {
        System.out.println("discount applied");
    }
}

package patterns.factory.naive;

public class Main {

    public static final String PLAN_NAME= "DOMESTIC";

    public static void main(String[] args) {

        DomesticPlan domesticPlan = new DomesticPlan();
        CommericalPlan commericalPlan = new CommericalPlan();
        InstitutionalPlan institutionalPlan = new InstitutionalPlan();

        if ("DOMESTIC".equals(PLAN_NAME)) {
            domesticPlan.getRate();

        }else if ("COMMERCIAL".equals(PLAN_NAME))
            commericalPlan.getRate();
        else
        {
            institutionalPlan.getRate();
        }
    }
}

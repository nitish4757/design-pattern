package patterns.factory.actual;

public class Factory{
    public Plan  getPlanObject(String planName)
    {
        if ("DOMESTIC".equals(planName))
        {
            return new DomesticPlan();
        }
        if ("COMMERCIAL".equals(planName))
        {
            return  new CommericalPlan();
        }

        return null;
    }
}

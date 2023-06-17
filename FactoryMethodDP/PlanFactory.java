package LLD.FactoryMethodDP;

public class PlanFactory {
    public Plan getPlan(String planName){
        if(planName == null){
            return null;
        }
        if(planName.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }
        if (planName.equalsIgnoreCase("Commertial")){
            return new CommertialPlan();
        }

        if (planName.equalsIgnoreCase("Industrial")){
            return new IndustrialPlan();
        }

        return null;
    }
}

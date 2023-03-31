package Factory;

public class BudgetKnifeStore extends KnifeStore {
    
    Knife createKnife(String type){
        if(type.equals("steak")){
            return new BudgetSteakKnife("steak", 10.00);
        }else if(type.equals("chefs")){
            return new BudgetChefsKnife("chefs", 50.00);
        }else{
            return null;
        }
    }
}

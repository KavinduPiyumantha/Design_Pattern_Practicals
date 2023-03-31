package Factory;

public class BudgetSteakKnife extends Knife {
    public BudgetSteakKnife(String type, double price) {
        super(type, price);
    }

    
    
    // implement the abstract methods of Knife
    public void sharpen() {
        System.out.println("Sharpening " + getType() + " knife");
        // add code to sharpen the BudgetSteakKnife
    }
    
    public void polish() {
        System.out.println("Polishing " + getType() + " knife");
        // add code to polish the BudgetSteakKnife
    }
    
    public void packageKnife() {
        System.out.println("Packaging " + getType() + " knife");
        // add code to package the BudgetSteakKnife
    }
}

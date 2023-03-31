package Factory;

public abstract class KnifeStore {

    abstract Knife createKnife(String type);

    public Knife oderKnife(String type){

        Knife knife;

        knife = createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.packageKnife();


        return knife;
    }
    
}

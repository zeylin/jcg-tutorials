package jcgDefaultMethods.staticMethods;

public class InterfaceImpl implements InterfaceWithDefaultsAndStatics {

    @Override
    public void toImplement() {
        System.out.println("Implementing interface method.");
    }

    public void callQualityContent() {
        this.qualityContent();
    }

}

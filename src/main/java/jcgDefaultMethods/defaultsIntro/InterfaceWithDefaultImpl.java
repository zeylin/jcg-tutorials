package jcgDefaultMethods.defaultsIntro;

public class InterfaceWithDefaultImpl implements InterfaceWithDefault {

    public void callDefault()
    {
        this.defaultMethod();
    }

    @Override
    public void toImplementMethod() {
        System.out.println("toImplementMethod()");
    }


}

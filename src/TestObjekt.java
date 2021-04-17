public class TestObjekt {
    public int a, b;
    TestObjekt(){
        a=20;
        b=100;
    }

    @Override
    public String toString() {
        return "TestObjekt{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

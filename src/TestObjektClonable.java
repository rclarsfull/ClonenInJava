public class TestObjektClonable extends TestObjekt implements Cloneable {

TestObjektClonable(){
    super();
}

protected Object clone() throws CloneNotSupportedException{
    return super.clone();
}

}

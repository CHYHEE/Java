package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다. (최상위 부모는 Object이다.)
//ex. public class Parent extends Object
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

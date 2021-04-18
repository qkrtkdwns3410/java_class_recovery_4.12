package pkg1;

public class MyParentTest {
    private int prv; //같은 클래스
    int dft;         //같은 패키지
    protected int prt;//같은 패키지 + 다른 패키지 자손클래스
    public int pub;   //제한 x
    
    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
        
    }
    
}
    
    


class MyParent {
    public static void main(String[] args) {
        MyParentTest p = new MyParentTest();
//        System.out.println(p.prv);
        System.out.println(p.dft);
        System.out.println(p.prt);
    }
}

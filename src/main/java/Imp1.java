import java.util.List;

public class Imp1 implements I{
    @Override
    public void f1(int v1, int v2) {
        return ;
    }

    @Override
    public int f2() {
        return 0;
    }

    private void something(){
        return ;
    }

    public void some1(){
        return;
    }

    public void some2(){
        List.of(1,2,3,4,5).forEach(System.out::println);
        return ;
    }

    public void some3(){
        something();
        System.out.println("hello!");
    }

}

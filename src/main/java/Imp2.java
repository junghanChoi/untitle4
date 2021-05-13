public class Imp2 implements I{
    /**
     * function 1
     */
    @Override
    public void f1(int v1, int v2) {
        System.out.println("hello f1");
        return ;
    }

    /**
     * function 2
     *
     * @return
     */
    @Override
    public int f2() {
        return 1;
        //ㅁㅈ디럼지ㅏㄹ
    }
}

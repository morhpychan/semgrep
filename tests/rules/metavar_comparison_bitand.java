public class A{
    public static int test1() {
        int a = 1;
        //ruleid: MSTG-STORAGE-5.1
        return a;
    }
    public static int test2() {
        int a = 2;
        //ok: MSTG-STORAGE-5.1
        return a;
    }
}

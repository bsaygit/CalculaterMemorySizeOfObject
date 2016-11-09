/**
 * Created by bilalsay on 09.11.2016.
 */
public class Runner {

    public static void main(String args[]) {

        Object a = new Object();
        Object demoObject = new DemoClass(a);
        SizeCalculater sCalculater = new SizeCalculater(demoObject);

    }
}

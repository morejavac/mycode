package test;


public class Test {
	/**
	 * 枚举测试类
	 * @author <a href="mailto:hemingwang0902@126.com">何明旺</a>
	 */
	public enum EnumTest {
	    MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	
	public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.toString());
        }
         
        System.out.println("----------------我是分隔线------------------");
         
        EnumTest test = EnumTest.TUE;
        switch (test) {
        case MON:
            System.out.println("今天是星期一");
            break;
        case TUE:
            System.out.println("今天是星期二");
            break;
        // ... ...
        default:
            System.out.println(test);
            break;
        }
    }

}


package test;


public class Test {
	/**
	 * ö�ٲ�����
	 * @author <a href="mailto:hemingwang0902@126.com">������</a>
	 */
	public enum EnumTest {
	    MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	
	public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.toString());
        }
         
        System.out.println("----------------���Ƿָ���------------------");
         
        EnumTest test = EnumTest.TUE;
        switch (test) {
        case MON:
            System.out.println("����������һ");
            break;
        case TUE:
            System.out.println("���������ڶ�");
            break;
        // ... ...
        default:
            System.out.println(test);
            break;
        }
    }

}


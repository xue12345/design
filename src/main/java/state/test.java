package state;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/4
 * @功能：
 * @since JDK1.8
 */
public class Test {

    public static void main(String [] args){
        Switcher switcher = new Switcher();
        switcher.setState(new On());
        System.out.println(switcher.getState());
        switcher.switchOff();
    }
}

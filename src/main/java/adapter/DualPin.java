package adapter;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 两项插口（少了地线）,不是墙上的插口，而是电视机的两项插口
 * @since JDK1.8
 */
public interface DualPin {

    public void electrify(int l, int n);
}

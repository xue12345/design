package adapter;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 设计模式之--适配器
 *          适应当前的不同配置，解决兼容性问题
 *          实例为三项插口问题
 * @since JDK1.8
 */
public interface TriplePin {

    /**
     *参数分别为火线live，零线null，地线earth
     * */
    public void electrify(int l, int n,int e);

}

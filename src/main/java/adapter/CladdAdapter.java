package adapter;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 类适配器
 * @since JDK1.8
 */
public class CladdAdapter extends TV implements  TriplePin{

    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}

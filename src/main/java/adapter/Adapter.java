package adapter;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 由于墙上的接口是三插标准，电视实现的是两插标准，无法通电（对象适配）
 *          创建一个视频器解决矛盾
 * @since JDK1.8
 */
public class Adapter implements TriplePin {

    private DualPin dualPin;

    /**
     * 引入双插口设备
     * */
    public Adapter(DualPin dualPin){
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l,n);
    }
}

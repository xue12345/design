package state;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/4
 * @功能： 通用的状态类接口
 * @since JDK1.8
 */
public interface State {

    /**
     *  开接口
     *  @param switcher
     */
    public void switchOn(Switcher switcher);

    /**
     * 关接口
     *  @param switcher
     */
    public void switchOff(Switcher switcher);
}

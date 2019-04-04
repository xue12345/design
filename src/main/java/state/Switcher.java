package state;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/4
 * @功能： 设计模式之---状态
 * @since JDK1.8
 */
public class Switcher {
    //初始状态是关
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOn(){
        //这里调用的是当前状态的开方法
        state.switchOn(this);
    }

    public void switchOff(){
        //这里调用的是当前状态的开方法
        state.switchOff(this);
    }
}

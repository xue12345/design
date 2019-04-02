package single;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 设计模式之-单例
 *          上帝只能有一个，并且不能随意创造的理论来理解
 * @since JDK1.8
 */
public class God {
    /**
     * 痴汉模式(神是一直存在的，无论有没有人拜神)
     * */
    private static God god = new God();
    /**
     * 构造器私有化，任何人不能创造神
     * */
    private God(){};

    /**
     *提供信徒拜神的方法
     * */
    public static  God getGod(){
        return god;
    }
    /***************************懒汉模式(只有用的时候才会创建)**********************************/

     /**这里不进行实例化*/
    private static God lazyGod;

    public static God getInstance() {
        //判断神是否存在
        if(null == lazyGod){
            //需要排毒进入
            synchronized (God.class){
                //如果不存在，则创建
                if(null == lazyGod){
                    lazyGod = new God();
                }
            }
        }
        return lazyGod;
    }
}

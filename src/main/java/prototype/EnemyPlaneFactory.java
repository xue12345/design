package prototype;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能：  造飞机的工厂
 * @since JDK1.8
 */
public class EnemyPlaneFactory {

    /**造一个敌机原型（痴汉模式）*/
    private static EnemyPlane prptotype = new EnemyPlane();

    /**获取敌机克隆实例*/
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = prptotype.clone();
        clone.setX(x);
        return  clone;
    }
}

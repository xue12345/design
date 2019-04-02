package prototype;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 设计模式之原型
 *         原型模式:实际上是从原型实例复制克隆出新实例，而绝不是从类去实例化，这个过程的区别一定要搞清楚！
 *         比如一个打飞机的游戏，主角飞机只有一架，应为单例模式（暂不详解），那么敌机会有很多架。此类是一个敌机类
 * @since JDK1.8
 */

public class EnemyPlane implements Cloneable {

    private Bullet bullet = new Bullet();

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    /**敌机横坐标*/
    private int x;
    /**敌机纵坐标*/
    private int y = 0;

    public EnemyPlane() {
    }
    /**构造器*/
    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    /**敌机每飞行一次，纵坐标+1*/
    public void flay(){
        y++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    /**重写克隆方法 (浅拷贝)*/
//    @Override
//    public EnemyPlane clone() throws CloneNotSupportedException{
//        return (EnemyPlane)super.clone();
//    }
    /**重写克隆方法 (深拷贝)*/
    @Override
    public EnemyPlane clone() throws CloneNotSupportedException{
        //先克隆出敌机，其中子弹还未进行克隆。
        EnemyPlane clonePlane = (EnemyPlane) super.clone();
        //对子弹进行深拷贝
        clonePlane.setBullet(this.bullet.clone());
        return clonePlane;
    }

    @Override
    public String toString() {
        return "EnemyPlane{" +
                "bullet=" + bullet +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

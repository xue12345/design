package prototype;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能：
 * @since JDK1.8
 */
public class Bullet implements Cloneable{
    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet)super.clone();
    }
}

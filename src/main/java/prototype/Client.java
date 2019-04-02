package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 工程名 ：design
 *
 * @author wangx
 * @version 1.0
 * @createDate 2019/4/2
 * @功能： 开始绘制敌机动画了，先实例化出50架
 * @since JDK1.8
 */
public class Client {

    public static void main(String [] arr){
        List<EnemyPlane> enemyPlaneList = new ArrayList<EnemyPlane>();
        for (int i= 0;i < 50; i++){
            //敌机产生位置随机
            EnemyPlane enemyPlane = null;
            try {
                enemyPlane = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
                System.out.println(enemyPlane.toString());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            enemyPlaneList.add(enemyPlane);
        }
    }

}

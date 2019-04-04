package strategy;

/**
 * 加法计算
 * @author wangxue
 * */
public class AddCalculator implements Strategy{


    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

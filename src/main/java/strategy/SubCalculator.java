package strategy;

/**
 * 减法
 * @author wangxue
 * */
public class SubCalculator implements Strategy{

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

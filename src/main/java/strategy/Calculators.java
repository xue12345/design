package strategy;

/**
 * 计算器类
 * @author
 * */
public class Calculators {

    /**
     * 拥有某种算法
     * */
    private Strategy strategy;

    /**
     * 接入某种算法
     * */
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int getResult(int a, int b){
        return this.strategy.calculate(a, b);
    }
}

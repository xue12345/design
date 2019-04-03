package strategy;

/**
 * @author 计算器测试类
 * */
public class CalculatorTest {

    public static void main(String [] args){
        Calculators calculators = new Calculators();
        calculators.setStrategy(new AddCalculator());
        int result = calculators.getResult(1, 2);
        System.out.println(result);
    }
}

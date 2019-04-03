package strategy;

/**
 * 这是一个违反策略的代码
* @author  wangxue
* */
public class NoStrategy {

    public static void main(String [] args){
        Calculator calculator = new Calculator();
        int add = calculator.add(1,1);
        System.out.println(add);
        int subtraction = calculator.subtraction(5,2);
        System.out.println(subtraction);
    }

}

/**
 *这是一个计算器的类，有加法运算和减法运算
 * 弊端：如果要添加其他算法，需要频繁得更改计算器类，相当于对计算器拆开进行重新组装
 * */
class Calculator{

    /**
     *加法
     **/
    public int add(int a,int b){
        return a+b;
    }

    /**
     * 减法
     * */
    public int subtraction(int a,int b){
        return a-b;
    }


}

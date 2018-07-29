/**
 * 上下文类
 *
 * @author yisen
 */
public class Context {
    private CashSuper cashSuper;


    public Context(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getTotal(double  money) {
        double v = cashSuper.acceptCash(money);
        return v;
    }

}

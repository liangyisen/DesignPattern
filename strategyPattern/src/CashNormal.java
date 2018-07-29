/**
 * 正常结账类
 * @author  yisen
 */
public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

/**
 * 满减类
 *
 * @author yisen
 */
public class CashReturn implements CashSuper {
    public double fullValue;
    public double subValue;

    @Override
    public double acceptCash(double money) {
        if (money >= fullValue) {
            return money - subValue;
        } else {
            return money;
        }
    }

    public double getFullValue() {
        return fullValue;
    }

    public void setFullValue(double fullValue) {
        this.fullValue = fullValue;
    }

    public double getSubValue() {
        return subValue;
    }

    public void setSubValue(double subValue) {
        this.subValue = subValue;
    }
}


/**
 * 打折结账类
 * @author  yisen
 */
public class CashRebate  implements CashSuper{
    //折扣
    public double zhekou =1;
    @Override
    public double acceptCash(double money) {
        return money*zhekou;
    }

    public double getZhekou() {
        return zhekou;
    }

    public void setZhekou(double zhekou) {
        this.zhekou = zhekou;
    }
}

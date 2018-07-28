public class OperateDiv extends Operate {
    @Override
    public double getResult() {
        if (getNumB() != 0) {
            return getNumA() / getNumB();
        } else {
            throw new RuntimeException("被除数不能为0");
        }
    }
}

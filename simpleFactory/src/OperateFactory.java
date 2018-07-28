public class OperateFactory {
    public static Operate createOperate(String operate) {
        Operate operateClass = null;
        switch (operate) {
            case "+":
                return new OperateAdd();
            case "-":
                return new OperateSub();
            case "*":
                return new OperateMul();
            case "/":
                return new OperateDiv();
        }
        return operateClass;
    }
}

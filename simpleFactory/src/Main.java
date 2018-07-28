public class Main {

    public static void main(String[] args) {
        Operate operate = OperateFactory.createOperate("+");
        operate.setNumA(1L);
        operate.setNumB(2L);
        double result = operate.getResult();
        System.out.println(result);

        Operate operate1 = OperateFactory.createOperate("/");
        operate1.setNumA(3L);
        operate1.setNumB(0L);
        double result1 = operate1.getResult();
        System.out.println(result1);
    }
}

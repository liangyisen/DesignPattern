public class Main {
    public static void main(String[] args) {
        //正常
        CashSuper cashSuper= new CashNormal();
        Context context = new Context(cashSuper);
        double total = context.getTotal(100);
        System.out.println(total);
        //打折
        CashRebate cashRebate = new CashRebate();
        cashRebate.setZhekou(0.8);
        Context context1 = new Context(cashRebate);
        double total1 = context1.getTotal(100);
        System.out.println(total1);
        //满减
        CashReturn cashReturn = new CashReturn();
        cashReturn.setFullValue(100);
        cashReturn.setSubValue(20);
        Context context2 = new Context(cashReturn);
        System.out.println(context2.getTotal(110));

    }
}

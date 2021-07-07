package pattern.adapter.general.inter;

/**
 * @author crazy.you
 * @Title: Adapter
 * @Package pattern.adapter.general.inter
 * @Description: 适配器模式--接口适配器模式
 */
public class Adapter implements Target {

    protected Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 方法一
     *
     * @return
     */
    @Override
    public int request1() {
        int specificRequest = adaptee.specificRequest();
        int specificRequest1 = specificRequest / 1;
        return specificRequest1;
    }

    /**
     * 方法二
     *
     * @return
     */
    @Override
    public int request2() {
        int specificRequest = adaptee.specificRequest();
        int specificRequest2 = specificRequest / 2;
        return specificRequest2;
    }

    /**
     * 方法三
     *
     * @return
     */
    @Override
    public int request3() {
        int specificRequest = adaptee.specificRequest();
        int specificRequest3 = specificRequest / 3;
        return specificRequest3;
    }

    /**
     * 方法四
     *
     * @return
     */
    @Override
    public int request4() {
        int specificRequest = adaptee.specificRequest();
        int specificRequest4 = specificRequest / 4;
        return specificRequest4;
    }
}

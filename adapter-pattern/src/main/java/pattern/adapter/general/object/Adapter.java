package pattern.adapter.general.object;

/**
 * @author crazy.you
 * @Title: Adapter
 * @Package pattern.adapter.general.object
 * @Description: 类适配器模式-适配器，继承或者引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口格式访问适配者
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     *
     * @return
     */
    @Override
    public int request() {
        return adaptee.specificRequest() / 10;
    }
}

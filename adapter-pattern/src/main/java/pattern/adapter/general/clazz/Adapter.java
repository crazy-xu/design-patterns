package pattern.adapter.general.clazz;

/**
 * @author crazy.you
 * @Title: Adapter
 * @Package pattern.adapter.general.clazz
 * @Description: 类适配器模式-适配器，继承或者引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口格式访问适配者
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}

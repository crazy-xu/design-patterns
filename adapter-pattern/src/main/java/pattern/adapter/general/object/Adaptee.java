package pattern.adapter.general.object;

/**
 * @author crazy.you
 * @Title: Adaptee
 * @Package pattern.adapter.general.object
 * @Description: 类适配器模式-适配者现存组件接口
 */
public class Adaptee {

    /**
     * 现存业务结果
     *
     * @return
     */
    public int specificRequest() {
        return 220;
    }
}

package pattern.adapter.general.inter;

/**
 * @author crazy.you
 * @Title: Adaptee
 * @Package pattern.adapter.general.inter
 * @Description: 接口适配器模式-适配者现存组件接口
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

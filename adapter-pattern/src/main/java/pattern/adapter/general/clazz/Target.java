package pattern.adapter.general.clazz;

/**
 * @author crazy.you
 * @Title: Target
 * @Package pattern.adapter.general.clazz
 * @Description: 类适配器模式-目标接口
 */
public interface Target {

    /**
     * 当前业务所期待的接口，它可以是抽象类或接口。
     *
     * @return
     */
    int request();
}

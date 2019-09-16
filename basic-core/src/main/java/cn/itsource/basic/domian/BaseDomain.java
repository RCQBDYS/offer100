package cn.itsource.basic.domian;

/**
 * @author wangshen
 * @date 2019/9/16 21:20
 * 主要功能说明：作为各项目的公共抽取，添加mybatis-generator插件，依赖basic-util
 */
public class BaseDomain {
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

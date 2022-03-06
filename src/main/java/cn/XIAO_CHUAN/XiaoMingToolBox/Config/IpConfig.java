package cn.XIAO_CHUAN.XiaoMingToolBox.Config;

import cn.XIAO_CHUAN.XiaoMingToolBox.ToolBoxPlugIn;
import cn.chuanwise.xiaoming.preservable.SimplePreservable;
import lombok.Data;

/**
 * 示例配置文档类
 * 一个这样的类对应一个配置文件（通常是 Json）
 */
@Data
public class IpConfig
        extends SimplePreservable<ToolBoxPlugIn> {

    /** 设置ip选项 */
    String IpConfig = "IP暂未设置,可联系机器人管理设置呦！";
}

package cn.XIAO_CHUAN.XiaoMingToolBox;

import cn.XIAO_CHUAN.XiaoMingToolBox.Config.IpConfig;
import cn.XIAO_CHUAN.XiaoMingToolBox.Function.*;
import cn.chuanwise.xiaoming.plugin.JavaPlugin;

import java.io.File;

public class ToolBoxPlugIn
        extends JavaPlugin {
    @Override
    public void onEnable() {
        getXiaoMingBot().getInteractorManager().registerInteractors(new InterestingInteraction(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ChineseFunction(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new CallNames(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ip(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new Refresh(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ping(), this);
    }
    protected IpConfig XiaoMingToolBoxIpConfig;
    @Override
    public void onLoad() {
        getLogger().info(" __   ___             __  __ _                 _______          _        _               \n" +
                " \\ \\ / (_)           |  \\/  (_)               |__   __|        | |      | |              \n" +
                "  \\ V / _  __ _  ___ | \\  / |_ _ __   __ _ ______| | ___   ___ | |______| |__   _____  __\n" +
                "   > < | |/ _` |/ _ \\| |\\/| | | '_ \\ / _` |______| |/ _ \\ / _ \\| |______| '_ \\ / _ \\ \\/ /\n" +
                "  / . \\| | (_| | (_) | |  | | | | | | (_| |      | | (_) | (_) | |      | |_) | (_) >  < \n" +
                " /_/ \\_\\_|\\__,_|\\___/|_|  |_|_|_| |_|\\__, |      |_|\\___/ \\___/|_|      |_.__/ \\___/_/\\_\\\n" +
                "                                      __/ |                                              \n" +
                "                                     |___/                                              " +
                "                                                                                         @XIAO_CHUAN");
        getLogger().info("XiaoMingToolBox启动成功!");
        final File dataFolder = getDataFolder();
        dataFolder.mkdirs();

        XiaoMingToolBoxIpConfig = setupConfiguration(IpConfig.class, IpConfig::new);
    }
}
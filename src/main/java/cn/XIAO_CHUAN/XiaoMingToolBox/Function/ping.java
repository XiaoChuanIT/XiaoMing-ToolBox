package cn.XIAO_CHUAN.XiaoMingToolBox.Function;

import cn.XIAO_CHUAN.XiaoMingToolBox.ToolBoxPlugIn;
import cn.chuanwise.xiaoming.annotation.EventListener;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.configuration.Statistician;
import cn.chuanwise.xiaoming.event.Listeners;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.listener.ListenerPriority;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import net.mamoe.mirai.event.events.BotMuteEvent;
import net.mamoe.mirai.event.events.MessageEvent;
import net.mamoe.mirai.event.events.BotJoinGroupEvent;
import net.mamoe.mirai.event.events.BotMuteEvent;
import net.mamoe.mirai.event.events.MemberMuteEvent;
import net.mamoe.mirai.message.data.Message;
//import org.hyperic.sigar.CpuInfo;
//import org.hyperic.sigar.CpuPerc;
//import org.hyperic.sigar.FileSystem;
//import org.hyperic.sigar.FileSystemUsage;
//import org.hyperic.sigar.Mem;
//import org.hyperic.sigar.NetFlags;
//import org.hyperic.sigar.NetInterfaceConfig;
//import org.hyperic.sigar.NetInterfaceStat;
//import org.hyperic.sigar.OperatingSystem;
//import org.hyperic.sigar.Sigar;
//import org.hyperic.sigar.SigarException;
//import org.hyperic.sigar.Swap;
//import org.hyperic.sigar.Who;

import java.util.regex.*;


public class ping<T extends Plugin> extends ToolBoxPlugIn implements Interactors<T>, Listeners<T> {
    //系统信息查看大法
//    // System信息，从jvm获取
//    property();
//            System.out.println("----------------------------------");
//    // cpu信息
//    cpu();
//            System.out.println("----------------------------------");
//    // 内存信息
//    memory();
//            System.out.println("----------------------------------");
//    // 操作系统信息
//    os();
//            System.out.println("----------------------------------");
//    // 用户信息
//    who();
//            System.out.println("----------------------------------");
//    // 文件系统信息
//    file();
//            System.out.println("----------------------------------");
//    // 网络信息
//    net();
//            System.out.println("----------------------------------");
//    // 以太网信息
//    ethernet();
//            System.out.println("----------------------------------");
//    @Filter("ping")
//    @Required("core.account.user.administrator.grant")
//    public void XiaoMingChineseCall(XiaoMingUser user) {
//        user.sendMessage("系统情况如下：\n");
//    }
//
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }
}

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

import java.util.regex.*;


public class CallNames<T extends Plugin> extends ToolBoxPlugIn implements Interactors<T>, Listeners<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }


    @EventListener()
    public void CallNames(MessageEvent event, XiaoMingUser user) {
        final Message words = event.getMessage();
        boolean SHABI = Pattern.matches("傻逼", (CharSequence) words);
        boolean SB = Pattern.matches("SB", (CharSequence) words);
        boolean sb = Pattern.matches("sb", (CharSequence) words);
        if (SHABI == true || SB == true || sb == true) {
            user.sendMessage("ヾ(≧へ≦)〃 小明求你了,能不发脏话吗?");
        }
    }
}

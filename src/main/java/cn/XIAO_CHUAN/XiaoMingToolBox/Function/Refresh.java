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


public class Refresh<T extends Plugin> extends ToolBoxPlugIn implements Interactors<T>, Listeners<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }


    @EventListener()
    public void Refresh(MessageEvent event, XiaoMingUser user) {
        final Message words = event.getMessage();
        boolean WOYAOSHUAPING = Pattern.matches("我要刷屏", (CharSequence) words);
        if (WOYAOSHUAPING == true) {
            user.sendMessage("ヾ(≧へ≦)〃 小明求你了,能不刷屏吗?");
        }
    }
}

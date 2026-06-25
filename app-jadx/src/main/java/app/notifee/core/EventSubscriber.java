package app.notifee.core;

import android.content.Context;
import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.LogEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.EventListener;
import cg.f;
import cg.g;
import ci.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class EventSubscriber {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EventSubscriber f32966b = new EventSubscriber();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f32967a = new HashSet();

    private EventSubscriber() {
        g.c(this);
    }

    public static Context getContext() {
        return f.f33622a;
    }

    public static void register(EventListener eventListener) {
        f32966b.f32967a.add(eventListener);
    }

    public static void unregister(EventListener eventListener) {
        f32966b.f32967a.remove(eventListener);
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onBlockStateEvent(BlockStateEvent blockStateEvent) {
        Iterator it = this.f32967a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onBlockStateEvent(blockStateEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onForegroundServiceEvent(ForegroundServiceEvent foregroundServiceEvent) {
        Iterator it = this.f32967a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onForegroundServiceEvent(foregroundServiceEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onLogEvent(LogEvent logEvent) {
        Iterator it = this.f32967a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onLogEvent(logEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onNotificationEvent(NotificationEvent notificationEvent) {
        Iterator it = this.f32967a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onNotificationEvent(notificationEvent);
        }
    }
}

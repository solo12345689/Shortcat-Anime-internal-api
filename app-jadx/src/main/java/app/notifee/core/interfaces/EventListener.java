package app.notifee.core.interfaces;

import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.LogEvent;
import app.notifee.core.event.NotificationEvent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface EventListener {
    void onBlockStateEvent(BlockStateEvent blockStateEvent);

    void onForegroundServiceEvent(ForegroundServiceEvent foregroundServiceEvent);

    void onLogEvent(LogEvent logEvent);

    void onNotificationEvent(NotificationEvent notificationEvent);
}

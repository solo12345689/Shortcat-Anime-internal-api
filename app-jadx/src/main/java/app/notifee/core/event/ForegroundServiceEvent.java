package app.notifee.core.event;

import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ForegroundServiceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationModel f33001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodCallResult f33002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33003c = false;

    public ForegroundServiceEvent(NotificationModel notificationModel, MethodCallResult methodCallResult) {
        this.f33001a = notificationModel;
        this.f33002b = methodCallResult;
    }

    public NotificationModel getNotification() {
        return this.f33001a;
    }

    public void setCompletionResult() {
        if (this.f33003c) {
            return;
        }
        this.f33003c = true;
        this.f33002b.onComplete(null, null);
    }
}

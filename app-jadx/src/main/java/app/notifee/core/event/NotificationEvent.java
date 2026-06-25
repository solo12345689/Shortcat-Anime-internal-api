package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationEvent {
    public static final int TYPE_ACTION_PRESS = 2;
    public static final int TYPE_DELIVERED = 3;
    public static final int TYPE_DISMISSED = 0;
    public static final int TYPE_FG_ALREADY_EXIST = 8;
    public static final int TYPE_PRESS = 1;
    public static final int TYPE_TRIGGER_NOTIFICATION_CREATED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f33009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationModel f33010c;

    public NotificationEvent(int i10, NotificationModel notificationModel) {
        this.f33008a = i10;
        this.f33010c = notificationModel;
        this.f33009b = null;
    }

    public Bundle getExtras() {
        return this.f33009b;
    }

    public NotificationModel getNotification() {
        return this.f33010c;
    }

    public int getType() {
        return this.f33008a;
    }

    public NotificationEvent(int i10, NotificationModel notificationModel, Bundle bundle) {
        this.f33008a = i10;
        this.f33010c = notificationModel;
        this.f33009b = bundle;
    }
}

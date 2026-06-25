package io.invertase.notifee;

import app.notifee.core.InitProvider;
import app.notifee.core.Notifee;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class NotifeeInitProvider extends InitProvider {
    @Override // app.notifee.core.InitProvider, android.content.ContentProvider
    public boolean onCreate() {
        boolean zOnCreate = super.onCreate();
        Notifee.initialize(new NotifeeEventSubscriber());
        return zOnCreate;
    }
}

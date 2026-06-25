package E3;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: renamed from: E3.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1419n implements InterfaceC1319a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Service f5432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5433b = 0;

    public C1419n(Service service) {
        this.f5432a = service;
    }

    public static KeyEvent c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
    }

    public String a(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public Bundle b(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
        return obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
    }

    public boolean d(Intent intent) {
        return "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction());
    }

    public boolean e(Intent intent) {
        return "android.intent.action.MEDIA_BUTTON".equals(intent.getAction());
    }
}

package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.InterfaceC2962a;
import b.InterfaceC2963b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25556a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2963b f25557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2962a f25558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f25559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f25560e;

    f(InterfaceC2963b interfaceC2963b, InterfaceC2962a interfaceC2962a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f25557b = interfaceC2963b;
        this.f25558c = interfaceC2962a;
        this.f25559d = componentName;
        this.f25560e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f25560e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public boolean c(Uri uri, Bundle bundle, List list) {
        try {
            return this.f25557b.k2(this.f25558c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}

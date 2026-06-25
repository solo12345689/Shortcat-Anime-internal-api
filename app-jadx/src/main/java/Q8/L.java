package Q8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f14421b;

    public L(K k10) {
        this.f14421b = k10;
    }

    public final void a(Context context) {
        this.f14420a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f14420a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f14420a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f14421b.a();
            b();
        }
    }
}

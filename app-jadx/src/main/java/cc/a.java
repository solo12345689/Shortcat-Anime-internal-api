package Cc;

import Td.L;
import Zf.c;
import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3012a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f3013b;

    private a() {
    }

    private final void b(int i10) {
        synchronized (this) {
            f3013b = i10;
            L l10 = L.f17438a;
        }
    }

    public final int a() {
        int i10;
        synchronized (this) {
            i10 = f3013b;
        }
        return i10;
    }

    public final boolean c(Context context, int i10) {
        AbstractC5504s.h(context, "context");
        try {
            if (i10 == 0) {
                Object systemService = context.getSystemService("notification");
                AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancelAll();
            } else {
                c.a(context.getApplicationContext(), i10);
            }
            f3012a.b(i10);
            return true;
        } catch (Zf.b e10) {
            Log.d("expo-notifications", "Could not have set badge count: " + e10.getMessage(), e10);
            e10.printStackTrace();
            return false;
        }
    }
}

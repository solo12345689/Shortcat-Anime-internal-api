package Fa;

import android.util.Log;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6597a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f6598b = false;

    private a() {
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        aVar.a(str, str2, th2);
    }

    public static /* synthetic */ void d(a aVar, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        aVar.c(str, str2, th2);
    }

    public final void a(String str, String message, Throwable th2) {
        AbstractC5504s.h(message, "message");
        if (f6598b) {
            Log.i(str, message, th2);
        }
    }

    public final void c(String str, String message, Throwable th2) {
        AbstractC5504s.h(message, "message");
        if (f6598b) {
            Log.w(str, message, th2);
        }
    }
}

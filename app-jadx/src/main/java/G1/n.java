package G1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f6987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f6988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f6989e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f6985a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f6986b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f6987c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f6988d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f6989e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}

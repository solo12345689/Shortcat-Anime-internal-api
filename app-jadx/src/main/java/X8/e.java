package X8;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f21687b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f21688a = null;

    public static d a(Context context) {
        return f21687b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f21688a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f21688a = new d(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f21688a;
    }
}

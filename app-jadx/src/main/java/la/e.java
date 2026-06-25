package La;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public static final e f11369a = new e();

    /* JADX INFO: renamed from: b */
    private static WeakReference f11370b;

    private e() {
    }

    public final c a() {
        WeakReference weakReference = f11370b;
        if (weakReference != null) {
            return (c) weakReference.get();
        }
        return null;
    }

    public final void b(c view) {
        AbstractC5504s.h(view, "view");
        f11370b = new WeakReference(view);
    }
}

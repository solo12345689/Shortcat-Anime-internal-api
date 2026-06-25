package Ed;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5899a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f5900b;

    private a() {
    }

    public final WeakReference a() {
        return f5900b;
    }

    public final void b(WeakReference weakReference) {
        f5900b = weakReference;
    }
}

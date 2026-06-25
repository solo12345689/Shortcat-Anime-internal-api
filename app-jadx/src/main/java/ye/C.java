package ye;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f65058a = new G("InvalidModuleNotifier");

    public static final void a(H h10) {
        AbstractC5504s.h(h10, "<this>");
        android.support.v4.media.session.b.a(h10.a0(f65058a));
        throw new B("Accessing invalid module descriptor " + h10);
    }
}

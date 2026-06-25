package t;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6564n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6563m f60104a = new C6539E(0);

    public static final AbstractC6563m a(int... elements) {
        AbstractC5504s.h(elements, "elements");
        C6539E c6539e = new C6539E(elements.length);
        c6539e.i(c6539e.f60103b, elements);
        return c6539e;
    }

    public static final C6539E b(int i10) {
        C6539E c6539e = new C6539E(1);
        c6539e.h(i10);
        return c6539e;
    }
}

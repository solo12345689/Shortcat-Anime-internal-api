package Lf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C {
    public static final B b(Object obj) {
        if (obj == AbstractC1895b.f11564a) {
            throw new IllegalStateException("Does not contain segment");
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (B) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC1895b.f11564a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}

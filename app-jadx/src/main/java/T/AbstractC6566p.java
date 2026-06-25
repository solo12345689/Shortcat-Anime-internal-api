package t;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: t.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6566p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6540F f60110a = new C6540F(0);

    public static final AbstractC6565o a() {
        C6540F c6540f = f60110a;
        AbstractC5504s.f(c6540f, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return c6540f;
    }

    public static final AbstractC6565o b() {
        C6540F c6540f = f60110a;
        AbstractC5504s.f(c6540f, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return c6540f;
    }

    public static final C6540F c() {
        return new C6540F(0, 1, null);
    }

    public static final C6540F d(int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
        C6540F c6540f = new C6540F(0, 1, null);
        c6540f.s(i10, obj);
        c6540f.s(i11, obj2);
        c6540f.s(i12, obj3);
        return c6540f;
    }
}

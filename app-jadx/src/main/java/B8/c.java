package B8;

import t8.AbstractC6653d;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC6651b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f1580a = new c();
    }

    public static c a() {
        return a.f1580a;
    }

    public static B8.a b() {
        return (B8.a) AbstractC6653d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public B8.a get() {
        return b();
    }
}

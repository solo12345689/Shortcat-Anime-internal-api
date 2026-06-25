package z8;

import t8.InterfaceC6651b;

/* JADX INFO: renamed from: z8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7332i implements InterfaceC6651b {

    /* JADX INFO: renamed from: z8.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C7332i f65996a = new C7332i();
    }

    public static C7332i a() {
        return a.f65996a;
    }

    public static int c() {
        return AbstractC7329f.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}

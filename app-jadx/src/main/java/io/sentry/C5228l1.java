package io.sentry;

/* JADX INFO: renamed from: io.sentry.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5228l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f50806a;

    private C5228l1(Class cls) {
        this.f50806a = cls;
    }

    public static C5228l1 a(Class cls) {
        return new C5228l1(cls);
    }

    public Object b() {
        return this.f50806a.getDeclaredConstructor(null).newInstance(null);
    }
}

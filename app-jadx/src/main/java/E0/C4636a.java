package e0;

import f0.C4749c;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4636a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f45765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f45766b;

    public C4636a(Object obj, Object obj2) {
        this.f45765a = obj;
        this.f45766b = obj2;
    }

    public final boolean a() {
        return this.f45766b != C4749c.f46798a;
    }

    public final boolean b() {
        return this.f45765a != C4749c.f46798a;
    }

    public final Object c() {
        return this.f45766b;
    }

    public final Object d() {
        return this.f45765a;
    }

    public final C4636a e(Object obj) {
        return new C4636a(this.f45765a, obj);
    }

    public final C4636a f(Object obj) {
        return new C4636a(obj, this.f45766b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4636a() {
        C4749c c4749c = C4749c.f46798a;
        this(c4749c, c4749c);
    }

    public C4636a(Object obj) {
        this(obj, C4749c.f46798a);
    }
}

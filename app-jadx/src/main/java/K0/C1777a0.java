package K0;

import a0.C2507c;
import ie.InterfaceC5082a;

/* JADX INFO: renamed from: K0.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1777a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10655c = C2507c.f23495d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f10657b;

    public C1777a0(C2507c c2507c, InterfaceC5082a interfaceC5082a) {
        this.f10656a = c2507c;
        this.f10657b = interfaceC5082a;
    }

    public final void a(int i10, Object obj) {
        this.f10656a.b(i10, obj);
        this.f10657b.invoke();
    }

    public final void b() {
        this.f10656a.i();
        this.f10657b.invoke();
    }

    public final C2507c c() {
        return this.f10656a;
    }

    public final Object d(int i10) {
        Object objY = this.f10656a.y(i10);
        this.f10657b.invoke();
        return objY;
    }
}

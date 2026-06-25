package l1;

import i1.AbstractC5010c;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;

/* JADX INFO: renamed from: l1.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5515C extends q1.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC5011d f52411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f52412m = AbstractC5010c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private EnumC5027t f52413n = EnumC5027t.f48573a;

    public C5515C(InterfaceC5011d interfaceC5011d) {
        this.f52411l = interfaceC5011d;
        v(new q1.c() { // from class: l1.B
            @Override // q1.c
            public final float a(float f10) {
                return C5515C.E(this.f52410a, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float E(C5515C c5515c, float f10) {
        return c5515c.f52411l.getDensity() * f10;
    }

    public final long F() {
        return this.f52412m;
    }

    public final void G(long j10) {
        this.f52412m = j10;
    }

    @Override // q1.g
    public int e(Object obj) {
        return obj instanceof C5015h ? this.f52411l.s0(((C5015h) obj).t()) : super.e(obj);
    }
}

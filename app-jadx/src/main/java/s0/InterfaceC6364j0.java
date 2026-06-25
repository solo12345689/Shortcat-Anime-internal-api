package s0;

import r0.C6226h;

/* JADX INFO: renamed from: s0.j0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6364j0 {
    static /* synthetic */ void h(InterfaceC6364j0 interfaceC6364j0, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = AbstractC6384q0.f58976a.b();
        }
        interfaceC6364j0.c(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void n(InterfaceC6364j0 interfaceC6364j0, C6226h c6226h, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6384q0.f58976a.b();
        }
        interfaceC6364j0.j(c6226h, i10);
    }

    static /* synthetic */ void v(InterfaceC6364j0 interfaceC6364j0, InterfaceC6374m1 interfaceC6374m1, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6384q0.f58976a.b();
        }
        interfaceC6364j0.b(interfaceC6374m1, i10);
    }

    void b(InterfaceC6374m1 interfaceC6374m1, int i10);

    void c(float f10, float f11, float f12, float f13, int i10);

    void d(float f10, float f11);

    void e(float f10, float f11);

    void f(float f10, float f11, float f12, float f13, float f14, float f15, InterfaceC6368k1 interfaceC6368k1);

    void g(long j10, long j11, InterfaceC6368k1 interfaceC6368k1);

    void i(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, InterfaceC6368k1 interfaceC6368k1);

    default void j(C6226h c6226h, int i10) {
        c(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e(), i10);
    }

    void k();

    void l(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, long j12, long j13, InterfaceC6368k1 interfaceC6368k1);

    void m();

    void o(float f10);

    void p();

    void q();

    void r(float[] fArr);

    void s(C6226h c6226h, InterfaceC6368k1 interfaceC6368k1);

    void t(InterfaceC6374m1 interfaceC6374m1, InterfaceC6368k1 interfaceC6368k1);

    void u(long j10, float f10, InterfaceC6368k1 interfaceC6368k1);

    void w(float f10, float f11, float f12, float f13, InterfaceC6368k1 interfaceC6368k1);

    void x(InterfaceC6341b1 interfaceC6341b1, long j10, InterfaceC6368k1 interfaceC6368k1);
}

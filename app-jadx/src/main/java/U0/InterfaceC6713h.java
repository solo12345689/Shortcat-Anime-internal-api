package u0;

import s0.AbstractC6384q0;
import s0.InterfaceC6374m1;

/* JADX INFO: renamed from: u0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6713h {
    static /* synthetic */ void e(InterfaceC6713h interfaceC6713h, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        interfaceC6713h.d(f10, f11);
    }

    static /* synthetic */ void h(InterfaceC6713h interfaceC6713h, InterfaceC6374m1 interfaceC6374m1, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6384q0.f58976a.b();
        }
        interfaceC6713h.b(interfaceC6374m1, i10);
    }

    void a(float[] fArr);

    void b(InterfaceC6374m1 interfaceC6374m1, int i10);

    void c(float f10, float f11, float f12, float f13, int i10);

    void d(float f10, float f11);

    void f(float f10, float f11, long j10);

    void g(float f10, long j10);

    void i(float f10, float f11, float f12, float f13);
}

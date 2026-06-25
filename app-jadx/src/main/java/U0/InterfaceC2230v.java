package U0;

import g1.C4831k;
import g1.EnumC4829i;
import java.util.List;
import r0.C6226h;
import s0.AbstractC6358h0;
import s0.C1;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;
import u0.AbstractC6712g;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: U0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2230v {
    static /* synthetic */ void D(InterfaceC2230v interfaceC2230v, InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        interfaceC2230v.y(interfaceC6364j0, abstractC6358h0, f10, (i11 & 8) != 0 ? null : c12, (i11 & 16) != 0 ? null : c4831k, (i11 & 32) != 0 ? null : abstractC6712g, (i11 & 64) != 0 ? InterfaceC6711f.f61110j0.a() : i10);
    }

    static /* synthetic */ void q(InterfaceC2230v interfaceC2230v, InterfaceC6364j0 interfaceC6364j0, long j10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        interfaceC2230v.g(interfaceC6364j0, (i11 & 2) != 0 ? C6385r0.f58985b.j() : j10, (i11 & 4) != 0 ? null : c12, (i11 & 8) != 0 ? null : c4831k, (i11 & 16) == 0 ? abstractC6712g : null, (i11 & 32) != 0 ? InterfaceC6711f.f61110j0.a() : i10);
    }

    EnumC4829i A(int i10);

    C6226h B(int i10);

    List C();

    float a(int i10);

    int b(int i10);

    int c();

    float d();

    float e(int i10);

    float f();

    void g(InterfaceC6364j0 interfaceC6364j0, long j10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10);

    float getHeight();

    float getWidth();

    long h(C6226h c6226h, int i10, R0 r02);

    EnumC4829i i(int i10);

    C6226h j(int i10);

    long k(int i10);

    float l();

    int m(long j10);

    boolean n(int i10);

    int o(int i10, boolean z10);

    float p(int i10);

    boolean r();

    int s(float f10);

    InterfaceC6374m1 t(int i10, int i11);

    float u(int i10, boolean z10);

    float v(int i10);

    void w(long j10, float[] fArr, int i10);

    float x();

    void y(InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10);

    int z(int i10);
}

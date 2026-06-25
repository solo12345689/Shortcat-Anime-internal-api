package I0;

import K0.AbstractC1785e0;
import K0.U;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5025r;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC1690p {

    /* JADX INFO: renamed from: a */
    private final U f8732a;

    public y(U u10) {
        this.f8732a = u10;
    }

    private final long d() {
        U uA = z.a(this.f8732a);
        InterfaceC1690p interfaceC1690pX = uA.x();
        C6224f.a aVar = C6224f.f58329b;
        return C6224f.p(y0(interfaceC1690pX, aVar.c()), c().y0(uA.i2(), aVar.c()));
    }

    @Override // I0.InterfaceC1690p
    public long B(long j10) {
        return c().B(C6224f.q(j10, d()));
    }

    @Override // I0.InterfaceC1690p
    public long E0(long j10) {
        return c().E0(C6224f.q(j10, d()));
    }

    @Override // I0.InterfaceC1690p
    public long U(long j10) {
        return C6224f.q(c().U(j10), d());
    }

    @Override // I0.InterfaceC1690p
    public long a() {
        U u10 = this.f8732a;
        return C5025r.c((((long) u10.W0()) << 32) | (((long) u10.P0()) & 4294967295L));
    }

    @Override // I0.InterfaceC1690p
    public boolean b() {
        return c().b();
    }

    public final AbstractC1785e0 c() {
        return this.f8732a.i2();
    }

    @Override // I0.InterfaceC1690p
    public long c0(long j10) {
        return c().c0(C6224f.q(j10, d()));
    }

    @Override // I0.InterfaceC1690p
    public long h0(InterfaceC1690p interfaceC1690p, long j10, boolean z10) {
        if (!(interfaceC1690p instanceof y)) {
            U uA = z.a(this.f8732a);
            long jH0 = h0(uA.j2(), j10, z10);
            long jP1 = uA.P1();
            float fK = C5021n.k(jP1);
            long jP = C6224f.p(jH0, C6224f.e((4294967295L & ((long) Float.floatToRawIntBits(C5021n.l(jP1)))) | (Float.floatToRawIntBits(fK) << 32)));
            InterfaceC1690p interfaceC1690pK2 = uA.i2().K2();
            if (interfaceC1690pK2 == null) {
                interfaceC1690pK2 = uA.i2().x();
            }
            return C6224f.q(jP, interfaceC1690pK2.h0(interfaceC1690p, C6224f.f58329b.c(), z10));
        }
        U u10 = ((y) interfaceC1690p).f8732a;
        u10.i2().d3();
        U uI2 = c().y2(u10.i2()).I2();
        if (uI2 != null) {
            long jN = C5021n.n(C5021n.o(u10.n2(uI2, !z10), AbstractC5022o.d(j10)), this.f8732a.n2(uI2, !z10));
            return C6224f.e((((long) Float.floatToRawIntBits(C5021n.k(jN))) << 32) | (((long) Float.floatToRawIntBits(C5021n.l(jN))) & 4294967295L));
        }
        U uA2 = z.a(u10);
        long jO = C5021n.o(C5021n.o(u10.n2(uA2, !z10), uA2.P1()), AbstractC5022o.d(j10));
        U uA3 = z.a(this.f8732a);
        long jN2 = C5021n.n(jO, C5021n.o(this.f8732a.n2(uA3, !z10), uA3.P1()));
        float fK2 = C5021n.k(jN2);
        long jE = C6224f.e((((long) Float.floatToRawIntBits(C5021n.l(jN2))) & 4294967295L) | (Float.floatToRawIntBits(fK2) << 32));
        AbstractC1785e0 abstractC1785e0P2 = uA3.i2().P2();
        AbstractC5504s.e(abstractC1785e0P2);
        AbstractC1785e0 abstractC1785e0P22 = uA2.i2().P2();
        AbstractC5504s.e(abstractC1785e0P22);
        return abstractC1785e0P2.h0(abstractC1785e0P22, jE, z10);
    }

    @Override // I0.InterfaceC1690p
    public void j0(float[] fArr) {
        c().j0(fArr);
    }

    @Override // I0.InterfaceC1690p
    public void o0(InterfaceC1690p interfaceC1690p, float[] fArr) {
        c().o0(interfaceC1690p, fArr);
    }

    @Override // I0.InterfaceC1690p
    public long q(long j10) {
        return C6224f.q(c().q(j10), d());
    }

    @Override // I0.InterfaceC1690p
    public C6226h w0(InterfaceC1690p interfaceC1690p, boolean z10) {
        return c().w0(interfaceC1690p, z10);
    }

    @Override // I0.InterfaceC1690p
    public InterfaceC1690p x0() {
        U uI2;
        if (!b()) {
            H0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC1785e0 abstractC1785e0P2 = c().L1().w0().P2();
        if (abstractC1785e0P2 == null || (uI2 = abstractC1785e0P2.I2()) == null) {
            return null;
        }
        return uI2.x();
    }

    @Override // I0.InterfaceC1690p
    public long y0(InterfaceC1690p interfaceC1690p, long j10) {
        return h0(interfaceC1690p, j10, true);
    }
}

package K0;

import I0.AbstractC1675a;
import I0.InterfaceC1690p;
import Td.C2160k;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6545K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U extends T implements I0.A {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1785e0 f10543q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map f10545s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private I0.C f10547u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f10544r = C5021n.f48560b.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I0.y f10546t = new I0.y(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C6545K f10548v = t.U.b();

    public U(AbstractC1785e0 abstractC1785e0) {
        this.f10543q = abstractC1785e0;
    }

    private final void l2(long j10) {
        if (!C5021n.j(P1(), j10)) {
            o2(j10);
            V vU = L1().d0().u();
            if (vU != null) {
                vU.Y1();
            }
            R1(this.f10543q);
        }
        if (U1()) {
            return;
        }
        G1(M1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2(I0.C c10) {
        Map map;
        if (c10 != null) {
            b1(C5025r.c((((long) c10.getHeight()) & 4294967295L) | (((long) c10.getWidth()) << 32)));
        } else {
            b1(C5025r.f48570b.a());
        }
        if (!AbstractC5504s.c(this.f10547u, c10) && c10 != null && ((((map = this.f10545s) != null && !map.isEmpty()) || !c10.z().isEmpty()) && !AbstractC5504s.c(c10.z(), this.f10545s))) {
            e2().z().m();
            Map linkedHashMap = this.f10545s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f10545s = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(c10.z());
        }
        this.f10547u = c10;
    }

    public abstract int I(int i10);

    @Override // K0.T
    public T J1() {
        AbstractC1785e0 abstractC1785e0O2 = this.f10543q.O2();
        if (abstractC1785e0O2 != null) {
            return abstractC1785e0O2.I2();
        }
        return null;
    }

    @Override // K0.T
    public boolean K1() {
        return this.f10547u != null;
    }

    @Override // K0.T
    public J L1() {
        return this.f10543q.L1();
    }

    @Override // K0.T
    public I0.C M1() {
        I0.C c10 = this.f10547u;
        if (c10 != null) {
            return c10;
        }
        H0.a.c("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new C2160k();
    }

    @Override // K0.T
    public T N1() {
        AbstractC1785e0 abstractC1785e0P2 = this.f10543q.P2();
        if (abstractC1785e0P2 != null) {
            return abstractC1785e0P2.I2();
        }
        return null;
    }

    @Override // K0.T
    public long P1() {
        return this.f10544r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.s
    public final void Y0(long j10, float f10, Function1 function1) {
        l2(j10);
        if (V1()) {
            return;
        }
        k2();
    }

    @Override // K0.T
    public void Y1() {
        Y0(P1(), 0.0f, null);
    }

    public abstract int Z(int i10);

    public InterfaceC1778b e2() {
        InterfaceC1778b interfaceC1778bO = this.f10543q.L1().d0().o();
        AbstractC5504s.e(interfaceC1778bO);
        return interfaceC1778bO;
    }

    public final int f2(AbstractC1675a abstractC1675a) {
        return this.f10548v.e(abstractC1675a, Integer.MIN_VALUE);
    }

    protected final C6545K g2() {
        return this.f10548v;
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f10543q.getDensity();
    }

    @Override // I0.InterfaceC1687m
    public EnumC5027t getLayoutDirection() {
        return this.f10543q.getLayoutDirection();
    }

    public final long h2() {
        return T0();
    }

    public final AbstractC1785e0 i2() {
        return this.f10543q;
    }

    @Override // I0.D, I0.InterfaceC1686l
    public Object j() {
        return this.f10543q.j();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f10543q.j1();
    }

    public final I0.y j2() {
        return this.f10546t;
    }

    @Override // K0.T, I0.InterfaceC1687m
    public boolean k0() {
        return true;
    }

    protected void k2() {
        M1().A();
    }

    public abstract int l0(int i10);

    public final void m2(long j10) {
        l2(C5021n.o(j10, O0()));
    }

    public final long n2(U u10, boolean z10) {
        long jB = C5021n.f48560b.b();
        U uI2 = this;
        while (!AbstractC5504s.c(uI2, u10)) {
            if (!uI2.T1() || !z10) {
                jB = C5021n.o(jB, uI2.P1());
            }
            AbstractC1785e0 abstractC1785e0P2 = uI2.f10543q.P2();
            AbstractC5504s.e(abstractC1785e0P2);
            uI2 = abstractC1785e0P2.I2();
            AbstractC5504s.e(uI2);
        }
        return jB;
    }

    public void o2(long j10) {
        this.f10544r = j10;
    }

    public abstract int q0(int i10);

    @Override // K0.T
    public InterfaceC1690p x() {
        return this.f10546t;
    }
}

package K0;

import Td.C2160k;
import a0.C2507c;
import androidx.compose.ui.e;
import i1.AbstractC5026s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.InterfaceC6341b1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;
import s0.InterfaceC6377n1;
import u0.AbstractC6712g;
import u0.C6706a;
import u0.InterfaceC6708c;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC6711f, InterfaceC6708c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6706a f10494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1806t f10495b;

    public L(C6706a c6706a) {
        this.f10494a = c6706a;
    }

    @Override // i1.InterfaceC5011d
    public float A(int i10) {
        return this.f10494a.A(i10);
    }

    @Override // u0.InterfaceC6711f
    public void A1(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, long j12, long j13, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10, int i11) {
        this.f10494a.A1(interfaceC6341b1, j10, j11, j12, j13, f10, abstractC6712g, dVar, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // u0.InterfaceC6708c
    public void B1() {
        InterfaceC6364j0 interfaceC6364j0B = n1().b();
        InterfaceC1806t interfaceC1806t = this.f10495b;
        if (interfaceC1806t == null) {
            H0.a.c("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new C2160k();
        }
        ?? B10 = M.b(interfaceC1806t);
        if (B10 == 0) {
            AbstractC1785e0 abstractC1785e0I = AbstractC1796k.i(interfaceC1806t, AbstractC1789g0.a(4));
            if (abstractC1785e0I.N2() == interfaceC1806t.getNode()) {
                abstractC1785e0I = abstractC1785e0I.O2();
                AbstractC5504s.e(abstractC1785e0I);
            }
            abstractC1785e0I.m3(interfaceC6364j0B, n1().g());
            return;
        }
        int iA = AbstractC1789g0.a(4);
        ?? c2507c = 0;
        while (B10 != 0) {
            if (B10 instanceof InterfaceC1806t) {
                p((InterfaceC1806t) B10, interfaceC6364j0B, n1().g());
            } else if ((B10.getKindSet$ui_release() & iA) != 0 && (B10 instanceof AbstractC1800m)) {
                e.c cVarF1 = ((AbstractC1800m) B10).F1();
                int i10 = 0;
                B10 = B10;
                c2507c = c2507c;
                while (cVarF1 != null) {
                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                        i10++;
                        c2507c = c2507c;
                        if (i10 == 1) {
                            B10 = cVarF1;
                        } else {
                            if (c2507c == 0) {
                                c2507c = new C2507c(new e.c[16], 0);
                            }
                            if (B10 != 0) {
                                c2507c.c(B10);
                                B10 = 0;
                            }
                            c2507c.c(cVarF1);
                        }
                    }
                    cVarF1 = cVarF1.getChild$ui_release();
                    B10 = B10;
                    c2507c = c2507c;
                }
                if (i10 == 1) {
                }
            }
            B10 = AbstractC1796k.h(c2507c);
        }
    }

    @Override // u0.InterfaceC6711f
    public void C1(InterfaceC6374m1 interfaceC6374m1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.C1(interfaceC6374m1, j10, f10, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public void D0(InterfaceC6341b1 interfaceC6341b1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.D0(interfaceC6341b1, j10, f10, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public void N0(long j10, long j11, long j12, float f10, int i10, InterfaceC6377n1 interfaceC6377n1, float f11, androidx.compose.ui.graphics.d dVar, int i11) {
        this.f10494a.N0(j10, j11, j12, f10, i10, interfaceC6377n1, f11, dVar, i11);
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return this.f10494a.O(f10);
    }

    @Override // i1.InterfaceC5011d
    public long Q(long j10) {
        return this.f10494a.Q(j10);
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        return this.f10494a.T(j10);
    }

    @Override // u0.InterfaceC6711f
    public void U0(AbstractC6358h0 abstractC6358h0, long j10, long j11, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.U0(abstractC6358h0, j10, j11, f10, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public void V0(long j10, long j11, long j12, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.V0(j10, j11, j12, f10, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public void Z0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.Z0(j10, f10, f11, z10, j11, j12, f12, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public void a0(AbstractC6358h0 abstractC6358h0, long j10, long j11, float f10, int i10, InterfaceC6377n1 interfaceC6377n1, float f11, androidx.compose.ui.graphics.d dVar, int i11) {
        this.f10494a.a0(abstractC6358h0, j10, j11, f10, i10, interfaceC6377n1, f11, dVar, i11);
    }

    public final void b(InterfaceC6364j0 interfaceC6364j0, long j10, AbstractC1785e0 abstractC1785e0, e.c cVar, C6811c c6811c) {
        int iA = AbstractC1789g0.a(4);
        e.c cVarH = cVar;
        C2507c c2507c = null;
        while (cVarH != null) {
            if (cVarH instanceof InterfaceC1806t) {
                j(interfaceC6364j0, j10, abstractC1785e0, (InterfaceC1806t) cVarH, c6811c);
            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                int i10 = 0;
                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            cVarH = cVarF1;
                        } else {
                            if (c2507c == null) {
                                c2507c = new C2507c(new e.c[16], 0);
                            }
                            if (cVarH != null) {
                                c2507c.c(cVarH);
                                cVarH = null;
                            }
                            c2507c.c(cVarF1);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            cVarH = AbstractC1796k.h(c2507c);
        }
    }

    @Override // u0.InterfaceC6711f
    public void c1(long j10, float f10, long j11, float f11, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.c1(j10, f10, j11, f11, abstractC6712g, dVar, i10);
    }

    @Override // i1.InterfaceC5011d
    public long d0(float f10) {
        return this.f10494a.d0(f10);
    }

    @Override // i1.InterfaceC5011d
    public float e1(float f10) {
        return this.f10494a.e1(f10);
    }

    @Override // u0.InterfaceC6711f
    public long f() {
        return this.f10494a.f();
    }

    @Override // u0.InterfaceC6711f
    public void g1(long j10, long j11, long j12, long j13, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.g1(j10, j11, j12, j13, abstractC6712g, f10, dVar, i10);
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f10494a.getDensity();
    }

    @Override // u0.InterfaceC6711f
    public EnumC5027t getLayoutDirection() {
        return this.f10494a.getLayoutDirection();
    }

    public final void j(InterfaceC6364j0 interfaceC6364j0, long j10, AbstractC1785e0 abstractC1785e0, InterfaceC1806t interfaceC1806t, C6811c c6811c) {
        InterfaceC1806t interfaceC1806t2 = this.f10495b;
        this.f10495b = interfaceC1806t;
        C6706a c6706a = this.f10494a;
        EnumC5027t layoutDirection = abstractC1785e0.getLayoutDirection();
        InterfaceC5011d density = c6706a.n1().getDensity();
        EnumC5027t layoutDirection2 = c6706a.n1().getLayoutDirection();
        InterfaceC6364j0 interfaceC6364j0B = c6706a.n1().b();
        long jF = c6706a.n1().f();
        C6811c c6811cG = c6706a.n1().g();
        InterfaceC6709d interfaceC6709dN1 = c6706a.n1();
        interfaceC6709dN1.c(abstractC1785e0);
        interfaceC6709dN1.d(layoutDirection);
        interfaceC6709dN1.h(interfaceC6364j0);
        interfaceC6709dN1.e(j10);
        interfaceC6709dN1.i(c6811c);
        interfaceC6364j0.p();
        try {
            interfaceC1806t.draw(this);
            interfaceC6364j0.k();
            InterfaceC6709d interfaceC6709dN12 = c6706a.n1();
            interfaceC6709dN12.c(density);
            interfaceC6709dN12.d(layoutDirection2);
            interfaceC6709dN12.h(interfaceC6364j0B);
            interfaceC6709dN12.e(jF);
            interfaceC6709dN12.i(c6811cG);
            this.f10495b = interfaceC1806t2;
        } catch (Throwable th2) {
            interfaceC6364j0.k();
            InterfaceC6709d interfaceC6709dN13 = c6706a.n1();
            interfaceC6709dN13.c(density);
            interfaceC6709dN13.d(layoutDirection2);
            interfaceC6709dN13.h(interfaceC6364j0B);
            interfaceC6709dN13.e(jF);
            interfaceC6709dN13.i(c6811cG);
            throw th2;
        }
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f10494a.j1();
    }

    @Override // i1.InterfaceC5011d
    public float l1(float f10) {
        return this.f10494a.l1(f10);
    }

    @Override // u0.InterfaceC6711f
    public void m1(AbstractC6358h0 abstractC6358h0, long j10, long j11, long j12, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.m1(abstractC6358h0, j10, j11, j12, f10, abstractC6712g, dVar, i10);
    }

    @Override // u0.InterfaceC6711f
    public InterfaceC6709d n1() {
        return this.f10494a.n1();
    }

    public final void p(InterfaceC1806t interfaceC1806t, InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) {
        AbstractC1785e0 abstractC1785e0I = AbstractC1796k.i(interfaceC1806t, AbstractC1789g0.a(4));
        abstractC1785e0I.L1().k0().j(interfaceC6364j0, AbstractC5026s.d(abstractC1785e0I.a()), abstractC1785e0I, interfaceC1806t, c6811c);
    }

    @Override // u0.InterfaceC6711f
    public void p1(InterfaceC6374m1 interfaceC6374m1, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f10494a.p1(interfaceC6374m1, abstractC6358h0, f10, abstractC6712g, dVar, i10);
    }

    @Override // i1.InterfaceC5011d
    public int s0(float f10) {
        return this.f10494a.s0(f10);
    }

    @Override // u0.InterfaceC6711f
    public long t1() {
        return this.f10494a.t1();
    }

    @Override // i1.InterfaceC5011d
    public long w1(long j10) {
        return this.f10494a.w1(j10);
    }

    @Override // i1.InterfaceC5011d
    public float z0(long j10) {
        return this.f10494a.z0(j10);
    }

    public /* synthetic */ L(C6706a c6706a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C6706a() : c6706a);
    }
}

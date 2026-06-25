package androidx.compose.ui.layout;

import K0.Z;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import oe.AbstractC5874j;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s implements I0.D {

    /* JADX INFO: renamed from: a */
    private int f27003a;

    /* JADX INFO: renamed from: b */
    private int f27004b;

    /* JADX INFO: renamed from: c */
    private long f27005c;

    /* JADX INFO: renamed from: d */
    private long f27006d = t.f27010b;

    /* JADX INFO: renamed from: e */
    private long f27007e = C5021n.f48560b.b();

    public s() {
        long j10 = 0;
        this.f27005c = C5025r.c((j10 & 4294967295L) | (j10 << 32));
    }

    private final void X0() {
        this.f27003a = AbstractC5874j.m((int) (this.f27005c >> 32), C5009b.n(this.f27006d), C5009b.l(this.f27006d));
        int iM = AbstractC5874j.m((int) (this.f27005c & 4294967295L), C5009b.m(this.f27006d), C5009b.k(this.f27006d));
        this.f27004b = iM;
        int i10 = this.f27003a;
        long j10 = this.f27005c;
        this.f27007e = C5021n.f((((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM - ((int) (j10 & 4294967295L))) / 2))));
    }

    protected final long O0() {
        return this.f27007e;
    }

    public final int P0() {
        return this.f27004b;
    }

    public int Q0() {
        return (int) (this.f27005c & 4294967295L);
    }

    protected final long R0() {
        return this.f27005c;
    }

    public int S0() {
        return (int) (this.f27005c >> 32);
    }

    protected final long T0() {
        return this.f27006d;
    }

    public final int W0() {
        return this.f27003a;
    }

    public abstract void Y0(long j10, float f10, Function1 function1);

    public void a1(long j10, float f10, C6811c c6811c) {
        Y0(j10, f10, null);
    }

    protected final void b1(long j10) {
        if (C5025r.e(this.f27005c, j10)) {
            return;
        }
        this.f27005c = j10;
        X0();
    }

    public final void i1(long j10) {
        if (C5009b.f(this.f27006d, j10)) {
            return;
        }
        this.f27006d = j10;
        X0();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a implements InterfaceC5011d {

        /* JADX INFO: renamed from: a */
        private boolean f27008a;

        public static /* synthetic */ void C0(a aVar, s sVar, long j10, C6811c c6811c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.x0(sVar, j10, c6811c, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void I(s sVar) {
            if (sVar instanceof Z) {
                ((Z) sVar).W(this.f27008a);
            }
        }

        public static /* synthetic */ void N(a aVar, s sVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.L(sVar, i10, i11, f10);
        }

        public static /* synthetic */ void U(a aVar, s sVar, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.S(sVar, j10, f10);
        }

        public static /* synthetic */ void W(a aVar, s sVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.V(sVar, i10, i11, f10);
        }

        public static /* synthetic */ void Z(a aVar, s sVar, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.Y(sVar, j10, f10);
        }

        public static /* synthetic */ void f0(a aVar, s sVar, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = t.f27009a;
            }
            aVar.c0(sVar, i10, i11, f11, function1);
        }

        public static /* synthetic */ void l0(a aVar, s sVar, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = t.f27009a;
            }
            aVar.h0(sVar, j10, f11, function1);
        }

        public static /* synthetic */ void o0(a aVar, s sVar, long j10, C6811c c6811c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.j0(sVar, j10, c6811c, f10);
        }

        public static /* synthetic */ void v0(a aVar, s sVar, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = t.f27009a;
            }
            aVar.q0(sVar, i10, i11, f11, function1);
        }

        public static /* synthetic */ void y0(a aVar, s sVar, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = t.f27009a;
            }
            aVar.w0(sVar, j10, f11, function1);
        }

        public abstract int B();

        public final void E0(Function1 function1) {
            this.f27008a = true;
            function1.invoke(this);
            this.f27008a = false;
        }

        public final void L(s sVar, int i10, int i11, float f10) {
            long jF = C5021n.f((((long) i11) & 4294967295L) | (((long) i10) << 32));
            I(sVar);
            sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, null);
        }

        public final void S(s sVar, long j10, float f10) {
            I(sVar);
            sVar.Y0(C5021n.o(j10, sVar.f27007e), f10, null);
        }

        public final void V(s sVar, int i10, int i11, float f10) {
            long jF = C5021n.f((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (z() == EnumC5027t.f48573a || B() == 0) {
                I(sVar);
                sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, null);
            } else {
                long jF2 = C5021n.f((((long) ((B() - sVar.W0()) - C5021n.k(jF))) << 32) | (((long) C5021n.l(jF)) & 4294967295L));
                I(sVar);
                sVar.Y0(C5021n.o(jF2, sVar.f27007e), f10, null);
            }
        }

        public final void Y(s sVar, long j10, float f10) {
            if (z() == EnumC5027t.f48573a || B() == 0) {
                I(sVar);
                sVar.Y0(C5021n.o(j10, sVar.f27007e), f10, null);
                return;
            }
            int iB = (B() - sVar.W0()) - C5021n.k(j10);
            long jF = C5021n.f((((long) C5021n.l(j10)) & 4294967295L) | (((long) iB) << 32));
            I(sVar);
            sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, null);
        }

        public final void c0(s sVar, int i10, int i11, float f10, Function1 function1) {
            long jF = C5021n.f((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (z() == EnumC5027t.f48573a || B() == 0) {
                I(sVar);
                sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, function1);
            } else {
                long jF2 = C5021n.f((((long) ((B() - sVar.W0()) - C5021n.k(jF))) << 32) | (((long) C5021n.l(jF)) & 4294967295L));
                I(sVar);
                sVar.Y0(C5021n.o(jF2, sVar.f27007e), f10, function1);
            }
        }

        public final void h0(s sVar, long j10, float f10, Function1 function1) {
            if (z() == EnumC5027t.f48573a || B() == 0) {
                I(sVar);
                sVar.Y0(C5021n.o(j10, sVar.f27007e), f10, function1);
                return;
            }
            int iB = (B() - sVar.W0()) - C5021n.k(j10);
            long jF = C5021n.f((((long) C5021n.l(j10)) & 4294967295L) | (((long) iB) << 32));
            I(sVar);
            sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, function1);
        }

        public final void j0(s sVar, long j10, C6811c c6811c, float f10) {
            if (z() == EnumC5027t.f48573a || B() == 0) {
                I(sVar);
                sVar.a1(C5021n.o(j10, sVar.f27007e), f10, c6811c);
                return;
            }
            int iB = (B() - sVar.W0()) - C5021n.k(j10);
            long jF = C5021n.f((((long) C5021n.l(j10)) & 4294967295L) | (((long) iB) << 32));
            I(sVar);
            sVar.a1(C5021n.o(jF, sVar.f27007e), f10, c6811c);
        }

        public final void q0(s sVar, int i10, int i11, float f10, Function1 function1) {
            long jF = C5021n.f((((long) i11) & 4294967295L) | (((long) i10) << 32));
            I(sVar);
            sVar.Y0(C5021n.o(jF, sVar.f27007e), f10, function1);
        }

        public final void w0(s sVar, long j10, float f10, Function1 function1) {
            I(sVar);
            sVar.Y0(C5021n.o(j10, sVar.f27007e), f10, function1);
        }

        public final void x0(s sVar, long j10, C6811c c6811c, float f10) {
            I(sVar);
            sVar.a1(C5021n.o(j10, sVar.f27007e), f10, c6811c);
        }

        public abstract EnumC5027t z();

        public float q(y yVar, float f10) {
            return f10;
        }
    }
}

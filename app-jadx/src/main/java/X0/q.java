package x0;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.InterfaceC5011d;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final VectorPainter a(VectorPainter vectorPainter, long j10, long j11, String str, androidx.compose.ui.graphics.d dVar, boolean z10) {
        vectorPainter.x(j10);
        vectorPainter.t(z10);
        vectorPainter.u(dVar);
        vectorPainter.y(j11);
        vectorPainter.w(str);
        return vectorPainter;
    }

    private static final androidx.compose.ui.graphics.d b(long j10, int i10) {
        if (j10 != 16) {
            return androidx.compose.ui.graphics.d.f26763b.a(j10, i10);
        }
        return null;
    }

    public static final C7031c c(C7031c c7031c, C7042n c7042n) {
        int iT = c7042n.t();
        for (int i10 = 0; i10 < iT; i10++) {
            p pVarD = c7042n.d(i10);
            if (pVarD instanceof r) {
                C7035g c7035g = new C7035g();
                r rVar = (r) pVarD;
                c7035g.k(rVar.f());
                c7035g.l(rVar.i());
                c7035g.j(rVar.e());
                c7035g.h(rVar.b());
                c7035g.i(rVar.d());
                c7035g.m(rVar.l());
                c7035g.n(rVar.n());
                c7035g.r(rVar.u());
                c7035g.o(rVar.p());
                c7035g.p(rVar.r());
                c7035g.q(rVar.t());
                c7035g.u(rVar.y());
                c7035g.s(rVar.v());
                c7035g.t(rVar.w());
                c7031c.i(i10, c7035g);
            } else if (pVarD instanceof C7042n) {
                C7031c c7031c2 = new C7031c();
                C7042n c7042n2 = (C7042n) pVarD;
                c7031c2.p(c7042n2.f());
                c7031c2.s(c7042n2.n());
                c7031c2.t(c7042n2.p());
                c7031c2.u(c7042n2.r());
                c7031c2.v(c7042n2.u());
                c7031c2.w(c7042n2.v());
                c7031c2.q(c7042n2.i());
                c7031c2.r(c7042n2.l());
                c7031c2.o(c7042n2.e());
                c(c7031c2, c7042n2);
                c7031c.i(i10, c7031c2);
            }
        }
        return c7031c;
    }

    public static final VectorPainter d(InterfaceC5011d interfaceC5011d, C7032d c7032d, C7031c c7031c) {
        long jE = e(interfaceC5011d, c7032d.f(), c7032d.e());
        return a(new VectorPainter(c7031c), jE, f(jE, c7032d.m(), c7032d.l()), c7032d.h(), b(c7032d.k(), c7032d.j()), c7032d.d());
    }

    private static final long e(InterfaceC5011d interfaceC5011d, float f10, float f11) {
        float fL1 = interfaceC5011d.l1(f10);
        float fL12 = interfaceC5011d.l1(f11);
        return C6230l.d((((long) Float.floatToRawIntBits(fL1)) << 32) | (((long) Float.floatToRawIntBits(fL12)) & 4294967295L));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if (Float.isNaN(f11)) {
            f11 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return C6230l.d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static final VectorPainter g(C7032d c7032d, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
        float fG = c7032d.g();
        boolean zD = interfaceC2425m.d((((long) Float.floatToRawIntBits(interfaceC5011d.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
        Object objD = interfaceC2425m.D();
        if (zD || objD == InterfaceC2425m.f22370a.a()) {
            C7031c c7031c = new C7031c();
            c(c7031c, c7032d.i());
            L l10 = L.f17438a;
            objD = d(interfaceC5011d, c7032d, c7031c);
            interfaceC2425m.u(objD);
        }
        VectorPainter vectorPainter = (VectorPainter) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return vectorPainter;
    }
}

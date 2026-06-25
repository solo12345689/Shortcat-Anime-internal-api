package s0;

import r0.AbstractC6219a;
import r0.C6224f;
import r0.C6226h;
import r0.C6228j;
import r0.C6230l;
import s0.AbstractC6362i1;
import u0.AbstractC6712g;
import u0.C6715j;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: s0.j1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6365j1 {
    public static final void a(InterfaceC6374m1 interfaceC6374m1, AbstractC6362i1 abstractC6362i1) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            InterfaceC6374m1.t(interfaceC6374m1, ((AbstractC6362i1.b) abstractC6362i1).b(), null, 2, null);
        } else if (abstractC6362i1 instanceof AbstractC6362i1.c) {
            InterfaceC6374m1.s(interfaceC6374m1, ((AbstractC6362i1.c) abstractC6362i1).b(), null, 2, null);
        } else {
            if (!(abstractC6362i1 instanceof AbstractC6362i1.a)) {
                throw new Td.r();
            }
            InterfaceC6374m1.n(interfaceC6374m1, ((AbstractC6362i1.a) abstractC6362i1).b(), 0L, 2, null);
        }
    }

    public static final void b(InterfaceC6711f interfaceC6711f, AbstractC6362i1 abstractC6362i1, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            C6226h c6226hB = ((AbstractC6362i1.b) abstractC6362i1).b();
            interfaceC6711f.U0(abstractC6358h0, h(c6226hB), f(c6226hB), f10, abstractC6712g, dVar, i10);
            return;
        }
        if (!(abstractC6362i1 instanceof AbstractC6362i1.c)) {
            if (!(abstractC6362i1 instanceof AbstractC6362i1.a)) {
                throw new Td.r();
            }
            interfaceC6711f.p1(((AbstractC6362i1.a) abstractC6362i1).b(), abstractC6358h0, f10, abstractC6712g, dVar, i10);
            return;
        }
        AbstractC6362i1.c cVar = (AbstractC6362i1.c) abstractC6362i1;
        InterfaceC6374m1 interfaceC6374m1C = cVar.c();
        if (interfaceC6374m1C != null) {
            interfaceC6711f.p1(interfaceC6374m1C, abstractC6358h0, f10, abstractC6712g, dVar, i10);
            return;
        }
        C6228j c6228jB = cVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c6228jB.b() >> 32));
        interfaceC6711f.m1(abstractC6358h0, i(c6228jB), g(c6228jB), AbstractC6219a.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f10, abstractC6712g, dVar, i10);
    }

    public static /* synthetic */ void c(InterfaceC6711f interfaceC6711f, AbstractC6362i1 abstractC6362i1, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC6712g = C6715j.f61115a;
        }
        AbstractC6712g abstractC6712g2 = abstractC6712g;
        if ((i11 & 16) != 0) {
            dVar = null;
        }
        androidx.compose.ui.graphics.d dVar2 = dVar;
        if ((i11 & 32) != 0) {
            i10 = InterfaceC6711f.f61110j0.a();
        }
        b(interfaceC6711f, abstractC6362i1, abstractC6358h0, f11, abstractC6712g2, dVar2, i10);
    }

    public static final void d(InterfaceC6711f interfaceC6711f, AbstractC6362i1 abstractC6362i1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            C6226h c6226hB = ((AbstractC6362i1.b) abstractC6362i1).b();
            interfaceC6711f.V0(j10, h(c6226hB), f(c6226hB), f10, abstractC6712g, dVar, i10);
            return;
        }
        if (!(abstractC6362i1 instanceof AbstractC6362i1.c)) {
            if (!(abstractC6362i1 instanceof AbstractC6362i1.a)) {
                throw new Td.r();
            }
            interfaceC6711f.C1(((AbstractC6362i1.a) abstractC6362i1).b(), j10, f10, abstractC6712g, dVar, i10);
            return;
        }
        AbstractC6362i1.c cVar = (AbstractC6362i1.c) abstractC6362i1;
        InterfaceC6374m1 interfaceC6374m1C = cVar.c();
        if (interfaceC6374m1C != null) {
            interfaceC6711f.C1(interfaceC6374m1C, j10, f10, abstractC6712g, dVar, i10);
            return;
        }
        C6228j c6228jB = cVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c6228jB.b() >> 32));
        interfaceC6711f.g1(j10, i(c6228jB), g(c6228jB), AbstractC6219a.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), abstractC6712g, f10, dVar, i10);
    }

    public static /* synthetic */ void e(InterfaceC6711f interfaceC6711f, AbstractC6362i1 abstractC6362i1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC6712g = C6715j.f61115a;
        }
        AbstractC6712g abstractC6712g2 = abstractC6712g;
        if ((i11 & 16) != 0) {
            dVar = null;
        }
        d(interfaceC6711f, abstractC6362i1, j10, f11, abstractC6712g2, dVar, (i11 & 32) != 0 ? InterfaceC6711f.f61110j0.a() : i10);
    }

    private static final long f(C6226h c6226h) {
        float fJ = c6226h.j() - c6226h.i();
        return C6230l.d((((long) Float.floatToRawIntBits(c6226h.e() - c6226h.l())) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
    }

    private static final long g(C6228j c6228j) {
        float fJ = c6228j.j();
        float fD = c6228j.d();
        return C6230l.d((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
    }

    private static final long h(C6226h c6226h) {
        float fI = c6226h.i();
        float fL = c6226h.l();
        return C6224f.e((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fL)) & 4294967295L));
    }

    private static final long i(C6228j c6228j) {
        float fE = c6228j.e();
        float fG = c6228j.g();
        return C6224f.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L));
    }
}

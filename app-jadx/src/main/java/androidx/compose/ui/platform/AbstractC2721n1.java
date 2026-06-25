package androidx.compose.ui.platform;

import r0.C6226h;
import r0.C6228j;
import s0.AbstractC6362i1;
import s0.InterfaceC6374m1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2721n1 {
    private static final boolean a(C6228j c6228j) {
        return Float.intBitsToFloat((int) (c6228j.h() >> 32)) + Float.intBitsToFloat((int) (c6228j.i() >> 32)) <= c6228j.j() && Float.intBitsToFloat((int) (c6228j.b() >> 32)) + Float.intBitsToFloat((int) (c6228j.c() >> 32)) <= c6228j.j() && Float.intBitsToFloat((int) (c6228j.h() & 4294967295L)) + Float.intBitsToFloat((int) (c6228j.b() & 4294967295L)) <= c6228j.d() && Float.intBitsToFloat((int) (c6228j.i() & 4294967295L)) + Float.intBitsToFloat((int) (c6228j.c() & 4294967295L)) <= c6228j.d();
    }

    public static final boolean b(AbstractC6362i1 abstractC6362i1, float f10, float f11, InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            return e(((AbstractC6362i1.b) abstractC6362i1).b(), f10, f11);
        }
        if (abstractC6362i1 instanceof AbstractC6362i1.c) {
            return f((AbstractC6362i1.c) abstractC6362i1, f10, f11, interfaceC6374m1, interfaceC6374m12);
        }
        if (abstractC6362i1 instanceof AbstractC6362i1.a) {
            return d(((AbstractC6362i1.a) abstractC6362i1).b(), f10, f11, interfaceC6374m1, interfaceC6374m12);
        }
        throw new Td.r();
    }

    public static /* synthetic */ boolean c(AbstractC6362i1 abstractC6362i1, float f10, float f11, InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC6374m1 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC6374m12 = null;
        }
        return b(abstractC6362i1, f10, f11, interfaceC6374m1, interfaceC6374m12);
    }

    private static final boolean d(InterfaceC6374m1 interfaceC6374m1, float f10, float f11, InterfaceC6374m1 interfaceC6374m12, InterfaceC6374m1 interfaceC6374m13) {
        C6226h c6226h = new C6226h(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (interfaceC6374m12 == null) {
            interfaceC6374m12 = s0.V.a();
        }
        InterfaceC6374m1.t(interfaceC6374m12, c6226h, null, 2, null);
        if (interfaceC6374m13 == null) {
            interfaceC6374m13 = s0.V.a();
        }
        interfaceC6374m13.m(interfaceC6374m1, interfaceC6374m12, s0.q1.f58979a.b());
        boolean zIsEmpty = interfaceC6374m13.isEmpty();
        interfaceC6374m13.reset();
        interfaceC6374m12.reset();
        return !zIsEmpty;
    }

    private static final boolean e(C6226h c6226h, float f10, float f11) {
        return c6226h.i() <= f10 && f10 < c6226h.j() && c6226h.l() <= f11 && f11 < c6226h.e();
    }

    private static final boolean f(AbstractC6362i1.c cVar, float f10, float f11, InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12) {
        C6228j c6228jB = cVar.b();
        if (f10 < c6228jB.e() || f10 >= c6228jB.f() || f11 < c6228jB.g() || f11 >= c6228jB.a()) {
            return false;
        }
        if (!a(c6228jB)) {
            InterfaceC6374m1 interfaceC6374m1A = interfaceC6374m12 == null ? s0.V.a() : interfaceC6374m12;
            InterfaceC6374m1.s(interfaceC6374m1A, c6228jB, null, 2, null);
            return d(interfaceC6374m1A, f10, f11, interfaceC6374m1, interfaceC6374m12);
        }
        float fE = c6228jB.e() + Float.intBitsToFloat((int) (c6228jB.h() >> 32));
        float fG = c6228jB.g() + Float.intBitsToFloat((int) (c6228jB.h() & 4294967295L));
        float f12 = c6228jB.f() - Float.intBitsToFloat((int) (c6228jB.i() >> 32));
        float fG2 = c6228jB.g() + Float.intBitsToFloat((int) (c6228jB.i() & 4294967295L));
        float f13 = c6228jB.f() - Float.intBitsToFloat((int) (c6228jB.c() >> 32));
        float fA = c6228jB.a() - Float.intBitsToFloat((int) (c6228jB.c() & 4294967295L));
        float fA2 = c6228jB.a() - Float.intBitsToFloat((int) (4294967295L & c6228jB.b()));
        float fE2 = c6228jB.e() + Float.intBitsToFloat((int) (c6228jB.b() >> 32));
        if (f10 < fE && f11 < fG) {
            return g(f10, f11, c6228jB.h(), fE, fG);
        }
        if (f10 < fE2 && f11 > fA2) {
            return g(f10, f11, c6228jB.b(), fE2, fA2);
        }
        if (f10 > f12 && f11 < fG2) {
            return g(f10, f11, c6228jB.i(), f12, fG2);
        }
        if (f10 <= f13 || f11 <= fA) {
            return true;
        }
        return g(f10, f11, c6228jB.c(), f13, fA);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}

package U0;

import g1.C4825e;
import g1.C4826f;
import g1.C4828h;
import g1.C4830j;
import g1.C4832l;
import i1.C5029v;
import i1.EnumC5027t;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f18720a = C5029v.f48578b.a();

    public static final B a(B b10, int i10, int i11, long j10, g1.s sVar, E e10, C4828h c4828h, int i12, int i13, g1.u uVar) {
        long j11;
        long j12;
        int iH = i10;
        g1.s sVarJ = sVar;
        C4830j.a aVar = C4830j.f47278b;
        if (C4830j.k(iH, aVar.g()) || C4830j.k(iH, b10.h())) {
            if (C5029v.f(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (C5029v.e(j12, b10.e())) {
                }
            }
            if ((sVarJ == null || AbstractC5504s.c(sVarJ, b10.j())) && ((C4832l.j(i11, C4832l.f47292b.f()) || C4832l.j(i11, b10.i())) && ((e10 == null || AbstractC5504s.c(e10, b10.g())) && ((c4828h == null || AbstractC5504s.c(c4828h, b10.f())) && ((C4826f.f(i12, C4826f.f47232b.b()) || C4826f.f(i12, b10.d())) && ((C4825e.g(i13, C4825e.f47227b.c()) || C4825e.g(i13, b10.c())) && (uVar == null || AbstractC5504s.c(uVar, b10.k())))))))) {
                return b10;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long jE = C5029v.f(j12) == j11 ? b10.e() : j12;
        if (sVarJ == null) {
            sVarJ = b10.j();
        }
        g1.s sVar2 = sVarJ;
        if (C4830j.k(iH, aVar.g())) {
            iH = b10.h();
        }
        return new B(iH, !C4832l.j(i11, C4832l.f47292b.f()) ? i11 : b10.i(), jE, sVar2, d(b10, e10), c4828h == null ? b10.f() : c4828h, !C4826f.f(i12, C4826f.f47232b.b()) ? i12 : b10.d(), !C4825e.g(i13, C4825e.f47227b.c()) ? i13 : b10.c(), uVar == null ? b10.k() : uVar, null);
    }

    public static final B b(B b10, B b11, float f10) {
        int iN = ((C4830j) K0.d(C4830j.h(b10.h()), C4830j.h(b11.h()), f10)).n();
        int iM = ((C4832l) K0.d(C4832l.g(b10.i()), C4832l.g(b11.i()), f10)).m();
        long jF = K0.f(b10.e(), b11.e(), f10);
        g1.s sVarJ = b10.j();
        if (sVarJ == null) {
            sVarJ = g1.s.f47309c.a();
        }
        g1.s sVarJ2 = b11.j();
        if (sVarJ2 == null) {
            sVarJ2 = g1.s.f47309c.a();
        }
        return new B(iN, iM, jF, g1.t.a(sVarJ, sVarJ2, f10), c(b10.g(), b11.g(), f10), (C4828h) K0.d(b10.f(), b11.f(), f10), ((C4826f) K0.d(C4826f.c(b10.d()), C4826f.c(b11.d()), f10)).l(), ((C4825e) K0.d(C4825e.d(b10.c()), C4825e.d(b11.c()), f10)).j(), (g1.u) K0.d(b10.k(), b11.k(), f10), null);
    }

    private static final E c(E e10, E e11, float f10) {
        if (e10 == null && e11 == null) {
            return null;
        }
        if (e10 == null) {
            e10 = E.f18721c.a();
        }
        if (e11 == null) {
            e11 = E.f18721c.a();
        }
        return AbstractC2195d.b(e10, e11, f10);
    }

    private static final E d(B b10, E e10) {
        return b10.g() == null ? e10 : e10 == null ? b10.g() : b10.g().d(e10);
    }

    public static final B e(B b10, EnumC5027t enumC5027t) {
        int iH = b10.h();
        C4830j.a aVar = C4830j.f47278b;
        int iF = C4830j.k(iH, aVar.g()) ? aVar.f() : b10.h();
        int iE = Z0.e(enumC5027t, b10.i());
        long jE = C5029v.f(b10.e()) == 0 ? f18720a : b10.e();
        g1.s sVarJ = b10.j();
        if (sVarJ == null) {
            sVarJ = g1.s.f47309c.a();
        }
        g1.s sVar = sVarJ;
        E eG = b10.g();
        C4828h c4828hF = b10.f();
        int iD = b10.d();
        C4826f.a aVar2 = C4826f.f47232b;
        int iA = C4826f.f(iD, aVar2.b()) ? aVar2.a() : b10.d();
        int iC = b10.c();
        C4825e.a aVar3 = C4825e.f47227b;
        int iB = C4825e.g(iC, aVar3.c()) ? aVar3.b() : b10.c();
        g1.u uVarK = b10.k();
        if (uVarK == null) {
            uVarK = g1.u.f47313c.a();
        }
        return new B(iF, iE, jE, sVar, eG, c4828hF, iA, iB, uVarK, null);
    }
}

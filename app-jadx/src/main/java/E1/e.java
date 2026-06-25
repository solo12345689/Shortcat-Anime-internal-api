package e1;

import U0.F;
import U0.I0;
import Y0.AbstractC2485u;
import Y0.H;
import Y0.I;
import Y0.L;
import android.graphics.Typeface;
import d1.i;
import g1.C4821a;
import g1.C4831k;
import g1.q;
import g1.u;
import i1.C5029v;
import i1.C5031x;
import i1.InterfaceC5011d;
import ie.p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;
import s0.C1;
import s0.C6385r0;
import u0.AbstractC6712g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final I0 a(i iVar, I0 i02, p pVar, InterfaceC5011d interfaceC5011d, boolean z10) {
        long jG = C5029v.g(i02.k());
        C5031x.a aVar = C5031x.f48582b;
        if (C5031x.g(jG, aVar.b())) {
            iVar.setTextSize(interfaceC5011d.z0(i02.k()));
        } else if (C5031x.g(jG, aVar.a())) {
            iVar.setTextSize(iVar.getTextSize() * C5029v.h(i02.k()));
        }
        if (d(i02)) {
            AbstractC2485u abstractC2485uI = i02.i();
            L lN = i02.n();
            if (lN == null) {
                lN = L.f22613b.g();
            }
            H hL = i02.l();
            H hC = H.c(hL != null ? hL.i() : H.f22594b.b());
            I iM = i02.m();
            iVar.setTypeface((Typeface) pVar.invoke(abstractC2485uI, lN, hC, I.e(iM != null ? iM.m() : I.f22598b.a())));
        }
        if (i02.p() != null && !AbstractC5504s.c(i02.p(), c1.e.f33423c.a())) {
            C4639a.f45776a.b(iVar, i02.p());
        }
        if (i02.j() != null && !AbstractC5504s.c(i02.j(), "")) {
            iVar.setFontFeatureSettings(i02.j());
        }
        if (i02.u() != null && !AbstractC5504s.c(i02.u(), q.f47305c.a())) {
            iVar.setTextScaleX(iVar.getTextScaleX() * i02.u().b());
            iVar.setTextSkewX(iVar.getTextSkewX() + i02.u().c());
        }
        iVar.h(i02.g());
        iVar.f(i02.f(), C6230l.f58350b.a(), i02.c());
        iVar.j(i02.r());
        iVar.k(i02.s());
        iVar.i(i02.h());
        if (C5031x.g(C5029v.g(i02.o()), aVar.b()) && C5029v.h(i02.o()) != 0.0f) {
            float textSize = iVar.getTextSize() * iVar.getTextScaleX();
            float fZ0 = interfaceC5011d.z0(i02.o());
            if (textSize != 0.0f) {
                iVar.setLetterSpacing(fZ0 / textSize);
            }
        } else if (C5031x.g(C5029v.g(i02.o()), aVar.a())) {
            iVar.setLetterSpacing(C5029v.h(i02.o()));
        }
        return c(i02.o(), z10, i02.d(), i02.e());
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final I0 c(long j10, boolean z10, long j11, C4821a c4821a) {
        long j12 = j11;
        boolean z11 = false;
        boolean z12 = z10 && C5031x.g(C5029v.g(j10), C5031x.f48582b.b()) && C5029v.h(j10) != 0.0f;
        C6385r0.a aVar = C6385r0.f58985b;
        boolean z13 = (C6385r0.s(j12, aVar.j()) || C6385r0.s(j12, aVar.i())) ? false : true;
        if (c4821a != null) {
            if (!C4821a.e(c4821a.h(), C4821a.f47219b.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jA = z12 ? j10 : C5029v.f48578b.a();
        if (!z13) {
            j12 = aVar.j();
        }
        return new I0(0L, 0L, (L) null, (H) null, (I) null, (AbstractC2485u) null, (String) null, jA, z11 ? c4821a : null, (q) null, (c1.e) null, j12, (C4831k) null, (C1) null, (F) null, (AbstractC6712g) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean d(I0 i02) {
        return (i02.i() == null && i02.l() == null && i02.n() == null) ? false : true;
    }

    public static final void e(i iVar, u uVar) {
        if (uVar == null) {
            uVar = u.f47313c.a();
        }
        iVar.setFlags(uVar.c() ? iVar.getFlags() | 128 : iVar.getFlags() & (-129));
        int iB = uVar.b();
        u.b.a aVar = u.b.f47318b;
        if (u.b.g(iB, aVar.b())) {
            iVar.setFlags(iVar.getFlags() | 64);
            iVar.setHinting(0);
        } else if (u.b.g(iB, aVar.a())) {
            iVar.getFlags();
            iVar.setHinting(1);
        } else if (!u.b.g(iB, aVar.c())) {
            iVar.getFlags();
        } else {
            iVar.getFlags();
            iVar.setHinting(0);
        }
    }
}

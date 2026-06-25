package kg;

import Df.r;
import Td.AbstractC2156g;
import dg.C;
import dg.D;
import dg.E;
import dg.F;
import dg.v;
import fg.AbstractC4807e;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC5504s;
import mg.C5695a;
import tg.InterfaceC6684i;
import tg.K;

/* JADX INFO: renamed from: kg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5479b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52200a;

    public C5479b(boolean z10) {
        this.f52200a = z10;
    }

    private final boolean b(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [dg.E$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [dg.E$a] */
    @Override // dg.v
    public E a(v.a chain) throws IOException {
        boolean z10;
        ?? r92;
        ?? R10;
        E.a aVar;
        AbstractC5504s.h(chain, "chain");
        g gVar = (g) chain;
        jg.c cVarF = gVar.f();
        AbstractC5504s.e(cVarF);
        C cH = gVar.h();
        D dE = cH.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cVarF.w(cH);
            ?? B10 = C5483f.b(cH.l());
            try {
                if (B10 == 0 || dE == null) {
                    cVarF.p();
                    z10 = true;
                    B10 = 0;
                } else {
                    if (r.B("100-continue", cH.h("Expect"), true)) {
                        cVarF.f();
                        E.a aVarR = cVarF.r(true);
                        try {
                            cVarF.t();
                            z10 = false;
                            aVar = aVarR;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r92 = aVarR;
                            if (e instanceof C5695a) {
                                throw e;
                            }
                            R10 = r92;
                            if (!cVarF.k()) {
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        cVarF.p();
                        B10 = aVar;
                        if (!cVarF.h().v()) {
                            cVarF.o();
                            B10 = aVar;
                        }
                    } else if (dE.d()) {
                        cVarF.f();
                        dE.f(K.c(cVarF.c(cH, true)));
                        B10 = aVar;
                    } else {
                        InterfaceC6684i interfaceC6684iC = K.c(cVarF.c(cH, false));
                        dE.f(interfaceC6684iC);
                        interfaceC6684iC.close();
                        B10 = aVar;
                    }
                }
                if (dE == null || !dE.d()) {
                    cVarF.e();
                }
                e = null;
                R10 = B10;
            } catch (IOException e11) {
                e = e11;
                r92 = B10;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r92 = 0;
        }
        if (R10 == 0) {
            try {
                R10 = cVarF.r(false);
                AbstractC5504s.e(R10);
                if (z10) {
                    cVarF.t();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                AbstractC2156g.a(e, e13);
                throw e;
            }
        }
        E eC = R10.s(cH).i(cVarF.h().r()).t(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iO = eC.o();
        if (b(iO)) {
            E.a aVarR2 = cVarF.r(false);
            AbstractC5504s.e(aVarR2);
            if (z10) {
                cVarF.t();
            }
            eC = aVarR2.s(cH).i(cVarF.h().r()).t(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iO = eC.o();
        }
        cVarF.s(eC);
        E eC2 = (this.f52200a && iO == 101) ? eC.Y().b(AbstractC4807e.f47064c).c() : eC.Y().b(cVarF.q(eC)).c();
        if (r.B("close", eC2.F0().h("Connection"), true) || r.B("close", E.D(eC2, "Connection", null, 2, null), true)) {
            cVarF.o();
        }
        if (iO == 204 || iO == 205) {
            F fJ = eC2.j();
            if ((fJ != null ? fJ.h() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iO);
                sb2.append(" had non-zero Content-Length: ");
                F fJ2 = eC2.j();
                sb2.append(fJ2 != null ? Long.valueOf(fJ2.h()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return eC2;
    }
}

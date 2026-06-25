package kg;

import Df.r;
import Ud.AbstractC2279u;
import dg.C;
import dg.D;
import dg.E;
import dg.F;
import dg.m;
import dg.n;
import dg.v;
import dg.x;
import fg.AbstractC4807e;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6694t;
import tg.K;

/* JADX INFO: renamed from: kg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5478a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f52199a;

    public C5478a(n cookieJar) {
        AbstractC5504s.h(cookieJar, "cookieJar");
        this.f52199a = cookieJar;
    }

    private final String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.g());
            sb2.append('=');
            sb2.append(mVar.i());
            i10 = i11;
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // dg.v
    public E a(v.a chain) {
        F fJ;
        AbstractC5504s.h(chain, "chain");
        C cZ = chain.z();
        C.a aVarM = cZ.m();
        D dE = cZ.e();
        if (dE != null) {
            x xVarB = dE.b();
            if (xVarB != null) {
                aVarM.e("Content-Type", xVarB.toString());
            }
            long jA = dE.a();
            if (jA != -1) {
                aVarM.e("Content-Length", String.valueOf(jA));
                aVarM.i("Transfer-Encoding");
            } else {
                aVarM.e("Transfer-Encoding", "chunked");
                aVarM.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (cZ.h("Host") == null) {
            aVarM.e("Host", AbstractC4807e.U(cZ.p(), false, 1, null));
        }
        if (cZ.h("Connection") == null) {
            aVarM.e("Connection", "Keep-Alive");
        }
        if (cZ.h("Accept-Encoding") == null && cZ.h("Range") == null) {
            aVarM.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listB = this.f52199a.b(cZ.p());
        if (!listB.isEmpty()) {
            aVarM.e("Cookie", b(listB));
        }
        if (cZ.h("User-Agent") == null) {
            aVarM.e("User-Agent", "okhttp/4.12.0");
        }
        E eA = chain.a(aVarM.b());
        AbstractC5482e.f(this.f52199a, cZ.p(), eA.E());
        E.a aVarS = eA.Y().s(cZ);
        if (z10 && r.B("gzip", E.D(eA, "Content-Encoding", null, 2, null), true) && AbstractC5482e.b(eA) && (fJ = eA.j()) != null) {
            C6694t c6694t = new C6694t(fJ.k());
            aVarS.k(eA.E().l().h("Content-Encoding").h("Content-Length").e());
            aVarS.b(new h(E.D(eA, "Content-Type", null, 2, null), -1L, K.d(c6694t)));
        }
        return aVarS.c();
    }
}

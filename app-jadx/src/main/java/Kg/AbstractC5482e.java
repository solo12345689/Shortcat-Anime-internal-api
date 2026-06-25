package kg;

import Df.r;
import dg.E;
import dg.m;
import dg.n;
import dg.t;
import dg.u;
import fg.AbstractC4807e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;

/* JADX INFO: renamed from: kg.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5482e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6686k f52204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6686k f52205b;

    static {
        C6686k.a aVar = C6686k.f61044d;
        f52204a = aVar.g("\"\\");
        f52205b = aVar.g("\t ,=");
    }

    public static final List a(t tVar, String headerName) {
        AbstractC5504s.h(tVar, "<this>");
        AbstractC5504s.h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (r.B(headerName, tVar.f(i10), true)) {
                try {
                    c(new C6683h().s0(tVar.p(i10)), arrayList);
                } catch (EOFException e10) {
                    og.j.f55583a.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(E e10) {
        AbstractC5504s.h(e10, "<this>");
        if (AbstractC5504s.c(e10.F0().l(), "HEAD")) {
            return false;
        }
        int iO = e10.o();
        return (((iO >= 100 && iO < 200) || iO == 204 || iO == 304) && AbstractC4807e.v(e10) == -1 && !r.B("chunked", E.D(e10, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(tg.C6683h r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.f1()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            dg.h r7 = new dg.h
            java.util.Map r0 = Ud.S.i()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = fg.AbstractC4807e.L(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.f1()
            if (r2 == 0) goto L69
        L42:
            dg.h r2 = new dg.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = Df.r.G(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.AbstractC5504s.g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = fg.AbstractC4807e.L(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lbc
            int r5 = fg.AbstractC4807e.L(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = d(r7)
            goto La1
        L9d:
            java.lang.String r6 = e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.f1()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            dg.h r4 = new dg.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.AbstractC5482e.c(tg.h, java.util.List):void");
    }

    private static final String d(C6683h c6683h) throws EOFException {
        if (c6683h.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C6683h c6683h2 = new C6683h();
        while (true) {
            long jO = c6683h.O(f52204a);
            if (jO == -1) {
                return null;
            }
            if (c6683h.D(jO) == 34) {
                c6683h2.t0(c6683h, jO);
                c6683h.readByte();
                return c6683h2.M1();
            }
            if (c6683h.size() == jO + 1) {
                return null;
            }
            c6683h2.t0(c6683h, jO);
            c6683h.readByte();
            c6683h2.t0(c6683h, 1L);
        }
    }

    private static final String e(C6683h c6683h) {
        long jO = c6683h.O(f52205b);
        if (jO == -1) {
            jO = c6683h.size();
        }
        if (jO != 0) {
            return c6683h.V0(jO);
        }
        return null;
    }

    public static final void f(n nVar, u url, t headers) {
        AbstractC5504s.h(nVar, "<this>");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(headers, "headers");
        if (nVar == n.f45557b) {
            return;
        }
        List listE = m.f45533j.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        nVar.d(url, listE);
    }

    private static final boolean g(C6683h c6683h) throws EOFException {
        boolean z10 = false;
        while (!c6683h.f1()) {
            byte bD = c6683h.D(0L);
            if (bD == 44) {
                c6683h.readByte();
                z10 = true;
            } else {
                if (bD != 32 && bD != 9) {
                    break;
                }
                c6683h.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C6683h c6683h, byte b10) {
        return !c6683h.f1() && c6683h.D(0L) == b10;
    }
}

package Lf;

import Gf.AbstractC1620l0;
import Gf.C1598a0;
import Gf.Z0;

/* JADX INFO: renamed from: Lf.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1903j {

    /* JADX INFO: renamed from: a */
    private static final E f11575a = new E("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final E f11576b = new E("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:82:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:66:0x003e, B:68:0x004c, B:70:0x0052, B:83:0x0091, B:73:0x0069, B:75:0x0079, B:80:0x0088, B:82:0x008e, B:88:0x009e, B:91:0x00a7, B:90:0x00a4, B:78:0x007f), top: B:100:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Zd.e r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof Lf.C1902i
            if (r0 == 0) goto Lb2
            Lf.i r6 = (Lf.C1902i) r6
            java.lang.Object r0 = Gf.E.b(r7)
            Gf.K r1 = r6.f11571d
            Zd.i r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f11573f = r0
            r6.f7553c = r2
            Gf.K r7 = r6.f11571d
            Zd.i r0 = r6.getContext()
            c(r7, r0, r6)
            goto Lac
        L26:
            Gf.Z0 r1 = Gf.Z0.f7544a
            Gf.l0 r1 = r1.b()
            boolean r3 = r1.i2()
            if (r3 == 0) goto L3b
            r6.f11573f = r0
            r6.f7553c = r2
            r1.e2(r6)
            goto Lac
        L3b:
            r1.g2(r2)
            Zd.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            Gf.C0$b r4 = Gf.C0.f7490K     // Catch: java.lang.Throwable -> L67
            Zd.i$b r3 = r3.l(r4)     // Catch: java.lang.Throwable -> L67
            Gf.C0 r3 = (Gf.C0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.b()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.D()     // Catch: java.lang.Throwable -> L67
            r6.a(r0, r7)     // Catch: java.lang.Throwable -> L67
            Td.u$a r0 = Td.u.f17466b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Td.v.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Td.u.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            Zd.e r0 = r6.f11572e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f11574g     // Catch: java.lang.Throwable -> L67
            Zd.i r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = Lf.L.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            Lf.E r5 = Lf.L.f11553a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            Gf.f1 r0 = Gf.I.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            Zd.e r5 = r6.f11572e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            Td.L r7 = Td.L.f17438a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.V0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            Lf.L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.l2()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.b2(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.V0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            Lf.L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.g(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.b2(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.AbstractC1903j.b(Zd.e, java.lang.Object):void");
    }

    public static final void c(Gf.K k10, Zd.i iVar, Runnable runnable) {
        try {
            k10.D1(iVar, runnable);
        } catch (Throwable th2) {
            throw new C1598a0(th2, k10, iVar);
        }
    }

    public static final boolean d(Gf.K k10, Zd.i iVar) throws C1598a0 {
        try {
            return k10.S1(iVar);
        } catch (Throwable th2) {
            throw new C1598a0(th2, k10, iVar);
        }
    }

    public static final boolean e(C1902i c1902i) {
        Td.L l10 = Td.L.f17438a;
        AbstractC1620l0 abstractC1620l0B = Z0.f7544a.b();
        if (abstractC1620l0B.j2()) {
            return false;
        }
        if (abstractC1620l0B.i2()) {
            c1902i.f11573f = l10;
            c1902i.f7553c = 1;
            abstractC1620l0B.e2(c1902i);
            return true;
        }
        abstractC1620l0B.g2(true);
        try {
            c1902i.run();
            do {
            } while (abstractC1620l0B.l2());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}

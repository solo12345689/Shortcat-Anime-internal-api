package Gf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d1 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        long f7556a;

        /* JADX INFO: renamed from: b */
        Object f7557b;

        /* JADX INFO: renamed from: c */
        Object f7558c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f7559d;

        /* JADX INFO: renamed from: e */
        int f7560e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7559d = obj;
            this.f7560e |= Integer.MIN_VALUE;
            return d1.d(0L, null, this);
        }
    }

    public static final b1 a(long j10, Y y10, C0 c02) {
        return new b1("Timed out waiting for " + j10 + " ms", c02);
    }

    private static final Object b(c1 c1Var, Function2 function2) {
        F0.h(c1Var, Z.c(c1Var.f11545d.getContext()).B0(c1Var.f7554e, c1Var, c1Var.getContext()));
        return Mf.b.e(c1Var, c1Var, function2);
    }

    public static final Object c(long j10, Function2 function2, Zd.e eVar) {
        if (j10 <= 0) {
            throw new b1("Timed out immediately");
        }
        Object objB = b(new c1(j10, eVar), function2);
        if (objB == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r7, kotlin.jvm.functions.Function2 r9, Zd.e r10) {
        /*
            boolean r0 = r10 instanceof Gf.d1.a
            if (r0 == 0) goto L13
            r0 = r10
            Gf.d1$a r0 = (Gf.d1.a) r0
            int r1 = r0.f7560e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7560e = r1
            goto L18
        L13:
            Gf.d1$a r0 = new Gf.d1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7559d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f7560e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f7558c
            kotlin.jvm.internal.N r7 = (kotlin.jvm.internal.N) r7
            java.lang.Object r8 = r0.f7557b
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            Td.v.b(r10)     // Catch: Gf.b1 -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            Td.v.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.N r10 = new kotlin.jvm.internal.N
            r10.<init>()
            r0.f7557b = r9     // Catch: Gf.b1 -> L68
            r0.f7558c = r10     // Catch: Gf.b1 -> L68
            r0.f7556a = r7     // Catch: Gf.b1 -> L68
            r0.f7560e = r4     // Catch: Gf.b1 -> L68
            Gf.c1 r2 = new Gf.c1     // Catch: Gf.b1 -> L68
            r2.<init>(r7, r0)     // Catch: Gf.b1 -> L68
            r10.f52259a = r2     // Catch: Gf.b1 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: Gf.b1 -> L68
            java.lang.Object r8 = ae.AbstractC2605b.f()     // Catch: Gf.b1 -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: Gf.b1 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            Gf.C0 r9 = r8.f7552a
            java.lang.Object r7 = r7.f52259a
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.d1.d(long, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }
}

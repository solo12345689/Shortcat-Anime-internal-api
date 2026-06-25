package If;

import Gf.I;
import Gf.InterfaceC1623n;
import Gf.O;
import Gf.Q;
import Td.L;
import Td.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9171a;

        /* JADX INFO: renamed from: b */
        Object f9172b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f9173c;

        /* JADX INFO: renamed from: d */
        int f9174d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9173c = obj;
            this.f9174d |= Integer.MIN_VALUE;
            return s.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f9175a;

        b(InterfaceC1623n interfaceC1623n) {
            this.f9175a = interfaceC1623n;
        }

        public final void a(Throwable th2) {
            InterfaceC1623n interfaceC1623n = this.f9175a;
            u.a aVar = Td.u.f17466b;
            interfaceC1623n.resumeWith(Td.u.b(L.f17438a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L.f17438a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(If.u r4, ie.InterfaceC5082a r5, Zd.e r6) {
        /*
            boolean r0 = r6 instanceof If.s.a
            if (r0 == 0) goto L13
            r0 = r6
            If.s$a r0 = (If.s.a) r0
            int r1 = r0.f9174d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9174d = r1
            goto L18
        L13:
            If.s$a r0 = new If.s$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9173c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9174d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f9172b
            r5 = r4
            ie.a r5 = (ie.InterfaceC5082a) r5
            java.lang.Object r4 = r0.f9171a
            If.u r4 = (If.u) r4
            Td.v.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            Td.v.b(r6)
            Zd.i r6 = r0.getContext()
            Gf.C0$b r2 = Gf.C0.f7490K
            Zd.i$b r6 = r6.l(r2)
            if (r6 != r4) goto L7f
            r0.f9171a = r4     // Catch: java.lang.Throwable -> L32
            r0.f9172b = r5     // Catch: java.lang.Throwable -> L32
            r0.f9174d = r3     // Catch: java.lang.Throwable -> L32
            Gf.p r6 = new Gf.p     // Catch: java.lang.Throwable -> L32
            Zd.e r2 = ae.AbstractC2605b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.C()     // Catch: java.lang.Throwable -> L32
            If.s$b r2 = new If.s$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.c(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.v()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = ae.AbstractC2605b.f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            Td.L r4 = Td.L.f17438a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: If.s.a(If.u, ie.a, Zd.e):java.lang.Object");
    }

    public static final v b(O o10, Zd.i iVar, int i10, If.a aVar, Q q10, Function1 function1, Function2 function2) {
        t tVar = new t(I.j(o10, iVar), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            tVar.H(function1);
        }
        tVar.T0(q10, tVar, function2);
        return tVar;
    }

    public static /* synthetic */ v c(O o10, Zd.i iVar, int i10, If.a aVar, Q q10, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = Zd.j.f23275a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = If.a.f9114a;
        }
        if ((i11 & 8) != 0) {
            q10 = Q.f7529a;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return b(o10, iVar, i10, aVar, q10, function12, function2);
    }
}

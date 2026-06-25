package T1;

import Gf.AbstractC1646z;
import Gf.InterfaceC1642x;
import Td.L;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pf.a f17015a = Pf.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1642x f17016b = AbstractC1646z.b(null, 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17019c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17021e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17019c = obj;
            this.f17021e |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(Zd.e eVar) {
        Object objM0 = this.f17016b.M0(eVar);
        return objM0 == AbstractC2605b.f() ? objM0 : L.f17438a;
    }

    protected abstract Object b(Zd.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(Zd.e r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T1.z.a
            if (r0 == 0) goto L13
            r0 = r7
            T1.z$a r0 = (T1.z.a) r0
            int r1 = r0.f17021e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17021e = r1
            goto L18
        L13:
            T1.z$a r0 = new T1.z$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17019c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f17021e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f17018b
            Pf.a r1 = (Pf.a) r1
            java.lang.Object r0 = r0.f17017a
            T1.z r0 = (T1.z) r0
            Td.v.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f17018b
            Pf.a r2 = (Pf.a) r2
            java.lang.Object r4 = r0.f17017a
            T1.z r4 = (T1.z) r4
            Td.v.b(r7)
            r7 = r2
            goto L6a
        L4c:
            Td.v.b(r7)
            Gf.x r7 = r6.f17016b
            boolean r7 = r7.j()
            if (r7 == 0) goto L5a
            Td.L r7 = Td.L.f17438a
            return r7
        L5a:
            Pf.a r7 = r6.f17015a
            r0.f17017a = r6
            r0.f17018b = r7
            r0.f17021e = r4
            java.lang.Object r2 = r7.c(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            Gf.x r2 = r4.f17016b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.j()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            Td.L r0 = Td.L.f17438a     // Catch: java.lang.Throwable -> L78
            r7.e(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f17017a = r4     // Catch: java.lang.Throwable -> L78
            r0.f17018b = r7     // Catch: java.lang.Throwable -> L78
            r0.f17021e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            Gf.x r7 = r0.f17016b     // Catch: java.lang.Throwable -> L35
            Td.L r0 = Td.L.f17438a     // Catch: java.lang.Throwable -> L35
            r7.O(r0)     // Catch: java.lang.Throwable -> L35
            r1.e(r5)
            return r0
        L96:
            r1.e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.z.c(Zd.e):java.lang.Object");
    }
}

package T1;

import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C implements t {

    /* JADX INFO: renamed from: a */
    private final String f16770a;

    /* JADX INFO: renamed from: b */
    private final Pf.a f16771b;

    /* JADX INFO: renamed from: c */
    private final C2138b f16772c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1742e f16773d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f16774a;

        /* JADX INFO: renamed from: b */
        Object f16775b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f16776c;

        /* JADX INFO: renamed from: e */
        int f16778e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16776c = obj;
            this.f16778e |= Integer.MIN_VALUE;
            return C.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f16779a;

        /* JADX INFO: renamed from: b */
        boolean f16780b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f16781c;

        /* JADX INFO: renamed from: e */
        int f16783e;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16781c = obj;
            this.f16783e |= Integer.MIN_VALUE;
            return C.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f16784a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            return ((c) create(interfaceC1743f, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f16784a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return L.f17438a;
        }
    }

    public C(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        this.f16770a = filePath;
        this.f16771b = Pf.g.b(false, 1, null);
        this.f16772c = new C2138b(0);
        this.f16773d = AbstractC1744g.q(new c(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    @Override // T1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.jvm.functions.Function2 r7, Zd.e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof T1.C.b
            if (r0 == 0) goto L13
            r0 = r8
            T1.C$b r0 = (T1.C.b) r0
            int r1 = r0.f16783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16783e = r1
            goto L18
        L13:
            T1.C$b r0 = new T1.C$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16781c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f16783e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f16780b
            java.lang.Object r0 = r0.f16779a
            Pf.a r0 = (Pf.a) r0
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            Td.v.b(r8)
            Pf.a r8 = r6.f16771b
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f16779a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f16780b = r2     // Catch: java.lang.Throwable -> L5d
            r0.f16783e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.e(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.e(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C.a(kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    @Override // T1.t
    public Object b(Zd.e eVar) {
        return kotlin.coroutines.jvm.internal.b.d(this.f16772c.d());
    }

    @Override // T1.t
    public Object c(Zd.e eVar) {
        return kotlin.coroutines.jvm.internal.b.d(this.f16772c.b());
    }

    @Override // T1.t
    public InterfaceC1742e d() {
        return this.f16773d;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    @Override // T1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(kotlin.jvm.functions.Function1 r8, Zd.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof T1.C.a
            if (r0 == 0) goto L13
            r0 = r9
            T1.C$a r0 = (T1.C.a) r0
            int r1 = r0.f16778e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16778e = r1
            goto L18
        L13:
            T1.C$a r0 = new T1.C$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16776c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f16778e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f16774a
            Pf.a r8 = (Pf.a) r8
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f16775b
            Pf.a r8 = (Pf.a) r8
            java.lang.Object r2 = r0.f16774a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            Td.v.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            Td.v.b(r9)
            Pf.a r9 = r7.f16771b
            r0.f16774a = r8
            r0.f16775b = r9
            r0.f16778e = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.f16774a = r9     // Catch: java.lang.Throwable -> L6f
            r0.f16775b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f16778e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.e(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C.e(kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }
}

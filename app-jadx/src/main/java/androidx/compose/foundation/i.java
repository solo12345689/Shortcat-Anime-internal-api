package androidx.compose.foundation;

import E0.AbstractC1310u;
import E0.C1307q;
import E0.EnumC1308s;
import Gf.AbstractC1617k;
import Gf.O;
import K0.v0;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i extends e.c implements v0 {

    /* JADX INFO: renamed from: a */
    private B.m f26042a;

    /* JADX INFO: renamed from: b */
    private B.g f26043b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f26044a;

        /* JADX INFO: renamed from: b */
        Object f26045b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f26046c;

        /* JADX INFO: renamed from: e */
        int f26048e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26046c = obj;
            this.f26048e |= Integer.MIN_VALUE;
            return i.this.G1(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f26049a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f26050b;

        /* JADX INFO: renamed from: d */
        int f26052d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26050b = obj;
            this.f26052d |= Integer.MIN_VALUE;
            return i.this.H1(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f26053a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return i.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26053a;
            if (i10 == 0) {
                v.b(obj);
                i iVar = i.this;
                this.f26053a = 1;
                if (iVar.G1(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f26055a;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return i.this.new d(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26055a;
            if (i10 == 0) {
                v.b(obj);
                i iVar = i.this;
                this.f26055a = 1;
                if (iVar.H1(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public i(B.m mVar) {
        this.f26042a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G1(Zd.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f26048e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26048e = r1
            goto L18
        L13:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26046c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f26048e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f26045b
            B.g r1 = (B.g) r1
            java.lang.Object r0 = r0.f26044a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            Td.v.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            Td.v.b(r5)
            B.g r5 = r4.f26043b
            if (r5 != 0) goto L58
            B.g r5 = new B.g
            r5.<init>()
            B.m r2 = r4.f26042a
            r0.f26044a = r4
            r0.f26045b = r5
            r0.f26048e = r3
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.f26043b = r1
        L58:
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.G1(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H1(Zd.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f26052d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26052d = r1
            goto L18
        L13:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26050b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f26052d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f26049a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            Td.v.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Td.v.b(r5)
            B.g r5 = r4.f26043b
            if (r5 == 0) goto L52
            B.h r2 = new B.h
            r2.<init>(r5)
            B.m r5 = r4.f26042a
            r0.f26049a = r4
            r0.f26052d = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.f26043b = r5
        L52:
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.H1(Zd.e):java.lang.Object");
    }

    private final void I1() {
        B.g gVar = this.f26043b;
        if (gVar != null) {
            this.f26042a.a(new B.h(gVar));
            this.f26043b = null;
        }
    }

    public final void J1(B.m mVar) {
        if (AbstractC5504s.c(this.f26042a, mVar)) {
            return;
        }
        I1();
        this.f26042a = mVar;
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        if (enumC1308s == EnumC1308s.f4179b) {
            int iF = c1307q.f();
            AbstractC1310u.a aVar = AbstractC1310u.f4183a;
            if (AbstractC1310u.i(iF, aVar.a())) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new c(null), 3, null);
            } else if (AbstractC1310u.i(iF, aVar.b())) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // K0.v0
    public void a1() {
        I1();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        I1();
    }
}

package pd;

import Gf.AbstractC1615j;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import expo.modules.updates.db.UpdatesDatabase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5998c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55988d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f55989e = C5998c.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UpdatesDatabase f55990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pf.a f55991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdatesDatabase f55992c;

    /* JADX INFO: renamed from: pd.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pd.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f55993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f55994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f55995c;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5998c.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pf.a aVar;
            C5998c c5998c;
            Object objF = AbstractC2605b.f();
            int i10 = this.f55995c;
            if (i10 == 0) {
                v.b(obj);
                aVar = C5998c.this.f55991b;
                C5998c c5998c2 = C5998c.this;
                this.f55993a = aVar;
                this.f55994b = c5998c2;
                this.f55995c = 1;
                if (aVar.c(null, this) == objF) {
                    return objF;
                }
                c5998c = c5998c2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5998c = (C5998c) this.f55994b;
                aVar = (Pf.a) this.f55993a;
                v.b(obj);
            }
            try {
                return c5998c.f55990a;
            } finally {
                aVar.e(null);
            }
        }
    }

    /* JADX INFO: renamed from: pd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0860c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f55997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f55998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f55999c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56001e;

        C0860c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55999c = obj;
            this.f56001e |= Integer.MIN_VALUE;
            return C5998c.this.d(null, this);
        }
    }

    public C5998c(UpdatesDatabase mDatabase) {
        AbstractC5504s.h(mDatabase, "mDatabase");
        this.f55990a = mDatabase;
        this.f55991b = Pf.g.b(false, 1, null);
        this.f55992c = (UpdatesDatabase) AbstractC1615j.b(null, new b(null), 1, null);
    }

    public final UpdatesDatabase c() {
        return this.f55992c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function2 r8, Zd.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pd.C5998c.C0860c
            if (r0 == 0) goto L13
            r0 = r9
            pd.c$c r0 = (pd.C5998c.C0860c) r0
            int r1 = r0.f56001e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56001e = r1
            goto L18
        L13:
            pd.c$c r0 = new pd.c$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f55999c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f56001e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f55997a
            Pf.a r8 = (Pf.a) r8
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6d
        L31:
            r9 = move-exception
            goto L75
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f55998b
            Pf.a r8 = (Pf.a) r8
            java.lang.Object r2 = r0.f55997a
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            Td.v.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            Td.v.b(r9)
            Pf.a r9 = r7.f55991b
            r0.f55997a = r8
            r0.f55998b = r9
            r0.f56001e = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L5b
            goto L69
        L5b:
            expo.modules.updates.db.UpdatesDatabase r2 = r7.f55990a     // Catch: java.lang.Throwable -> L71
            r0.f55997a = r9     // Catch: java.lang.Throwable -> L71
            r0.f55998b = r5     // Catch: java.lang.Throwable -> L71
            r0.f56001e = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L71
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            r6 = r9
            r9 = r8
            r8 = r6
        L6d:
            r8.e(r5)
            return r9
        L71:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.C5998c.d(kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }
}

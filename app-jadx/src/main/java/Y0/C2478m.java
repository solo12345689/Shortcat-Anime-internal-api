package Y0;

import Y.C0;
import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y0.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2478m implements h2 {

    /* JADX INFO: renamed from: a */
    private final List f22671a;

    /* JADX INFO: renamed from: b */
    private final q0 f22672b;

    /* JADX INFO: renamed from: c */
    private final C2479n f22673c;

    /* JADX INFO: renamed from: d */
    private final Function1 f22674d;

    /* JADX INFO: renamed from: e */
    private final U f22675e;

    /* JADX INFO: renamed from: f */
    private final C0 f22676f;

    /* JADX INFO: renamed from: g */
    private boolean f22677g = true;

    /* JADX INFO: renamed from: Y0.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f22678a;

        /* JADX INFO: renamed from: b */
        Object f22679b;

        /* JADX INFO: renamed from: c */
        int f22680c;

        /* JADX INFO: renamed from: d */
        int f22681d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f22682e;

        /* JADX INFO: renamed from: g */
        int f22684g;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22682e = obj;
            this.f22684g |= Integer.MIN_VALUE;
            return C2478m.this.n(this);
        }
    }

    /* JADX INFO: renamed from: Y0.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: a */
        int f22685a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC2484t f22687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2484t interfaceC2484t, Zd.e eVar) {
            super(1, eVar);
            this.f22687c = interfaceC2484t;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Zd.e eVar) {
            return ((b) create(eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Zd.e eVar) {
            return C2478m.this.new b(this.f22687c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22685a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            C2478m c2478m = C2478m.this;
            InterfaceC2484t interfaceC2484t = this.f22687c;
            this.f22685a = 1;
            Object objP = c2478m.p(interfaceC2484t, this);
            return objP == objF ? objF : objP;
        }
    }

    /* JADX INFO: renamed from: Y0.m$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f22688a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f22689b;

        /* JADX INFO: renamed from: d */
        int f22691d;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22689b = obj;
            this.f22691d |= Integer.MIN_VALUE;
            return C2478m.this.p(null, this);
        }
    }

    /* JADX INFO: renamed from: Y0.m$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f22692a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC2484t f22694c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2484t interfaceC2484t, Zd.e eVar) {
            super(2, eVar);
            this.f22694c = interfaceC2484t;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C2478m.this.new d(this.f22694c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22692a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            U u10 = C2478m.this.f22675e;
            InterfaceC2484t interfaceC2484t = this.f22694c;
            this.f22692a = 1;
            Object objC = u10.c(interfaceC2484t, this);
            return objC == objF ? objF : objC;
        }
    }

    public C2478m(List list, Object obj, q0 q0Var, C2479n c2479n, Function1 function1, U u10) {
        this.f22671a = list;
        this.f22672b = q0Var;
        this.f22673c = c2479n;
        this.f22674d = function1;
        this.f22675e = u10;
        this.f22676f = b2.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f22676f.setValue(obj);
    }

    @Override // Y.h2
    public Object getValue() {
        return this.f22676f.getValue();
    }

    public final boolean l() {
        return this.f22677g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00df, code lost:
    
        if (Gf.j1.a(r15) == r1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009d A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:66:0x0034, B:86:0x009d, B:89:0x00d1, B:73:0x0050, B:76:0x005a), top: B:102:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d1 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:66:0x0034, B:86:0x009d, B:89:0x00d1, B:73:0x0050, B:76:0x005a), top: B:102:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0079 -> B:95:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00df -> B:92:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(Zd.e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.C2478m.n(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Y0.InterfaceC2484t r7, Zd.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Y0.C2478m.c
            if (r0 == 0) goto L13
            r0 = r8
            Y0.m$c r0 = (Y0.C2478m.c) r0
            int r1 = r0.f22691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22691d = r1
            goto L18
        L13:
            Y0.m$c r0 = new Y0.m$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f22689b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f22691d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f22688a
            Y0.t r7 = (Y0.InterfaceC2484t) r7
            Td.v.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            Td.v.b(r8)
            Y0.m$d r8 = new Y0.m$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f22688a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f22691d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = Gf.d1.d(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            Zd.i r1 = r0.getContext()
            Gf.L$b r2 = Gf.L.f7522J
            Zd.i$b r1 = r1.l(r2)
            Gf.L r1 = (Gf.L) r1
            if (r1 == 0) goto L86
            Zd.i r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.z(r0, r2)
            goto L86
        L7c:
            Zd.i r8 = r0.getContext()
            boolean r8 = Gf.F0.n(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.C2478m.p(Y0.t, Zd.e):java.lang.Object");
    }
}

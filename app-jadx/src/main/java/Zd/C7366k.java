package zd;

import Gf.AbstractC1617k;
import Gf.AbstractC1646z;
import Gf.C0;
import Gf.InterfaceC1642x;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import ub.InterfaceC6753e;
import xd.InterfaceC7130a;
import zd.AbstractC7365j;

/* JADX INFO: renamed from: zd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7366k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7130a f66175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC7365j.b f66176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f66177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final If.g f66178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pf.a f66179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0 f66180f;

    /* JADX INFO: renamed from: zd.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66182b;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7366k.this.new a(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r4.e(r7, r6) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r6.f66182b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f66181a
                If.i r1 = (If.i) r1
                Td.v.b(r7)
            L15:
                r7 = r1
                goto L34
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f66181a
                If.i r1 = (If.i) r1
                Td.v.b(r7)
                goto L42
            L27:
                Td.v.b(r7)
                zd.k r7 = zd.C7366k.this
                If.g r7 = zd.C7366k.c(r7)
                If.i r7 = r7.iterator()
            L34:
                r6.f66181a = r7
                r6.f66182b = r3
                java.lang.Object r1 = r7.a(r6)
                if (r1 != r0) goto L3f
                goto L5c
            L3f:
                r5 = r1
                r1 = r7
                r7 = r5
            L42:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L5d
                java.lang.Object r7 = r1.next()
                zd.k$b r7 = (zd.C7366k.b) r7
                zd.k r4 = zd.C7366k.this
                r6.f66181a = r1
                r6.f66182b = r2
                java.lang.Object r7 = zd.C7366k.a(r4, r7, r6)
                if (r7 != r0) goto L15
            L5c:
                return r0
            L5d:
                Td.L r7 = Td.L.f17438a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zd.C7366k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zd.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC7365j f66184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1642x f66185b;

        public b(AbstractC7365j procedure, InterfaceC1642x onComplete) {
            AbstractC5504s.h(procedure, "procedure");
            AbstractC5504s.h(onComplete, "onComplete");
            this.f66184a = procedure;
            this.f66185b = onComplete;
        }

        public final InterfaceC1642x a() {
            return this.f66185b;
        }

        public final AbstractC7365j b() {
            return this.f66184a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f66184a, bVar.f66184a) && AbstractC5504s.c(this.f66185b, bVar.f66185b);
        }

        public int hashCode() {
            return (this.f66184a.hashCode() * 31) + this.f66185b.hashCode();
        }

        public String toString() {
            return "ProcedureHolder(procedure=" + this.f66184a + ", onComplete=" + this.f66185b + ")";
        }
    }

    /* JADX INFO: renamed from: zd.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f66187b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f66189d;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66187b = obj;
            this.f66189d |= Integer.MIN_VALUE;
            return C7366k.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: zd.k$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements AbstractC7365j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f66190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6753e f66191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f66192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7366k f66193d;

        d(InterfaceC6753e interfaceC6753e, b bVar, C7366k c7366k) {
            this.f66191b = interfaceC6753e;
            this.f66192c = bVar;
            this.f66193d = c7366k;
        }

        @Override // zd.AbstractC7365j.b
        public void a(Cd.e event) throws Exception {
            AbstractC5504s.h(event, "event");
            if (this.f66190a) {
                throw new Exception("Cannot set state after procedure completion");
            }
            this.f66193d.f66176b.a(event);
        }

        @Override // zd.AbstractC7365j.b
        public void b() throws Exception {
            if (this.f66190a) {
                throw new Exception("Cannot reset state after procedure completion");
            }
            this.f66193d.f66176b.b();
        }

        @Override // zd.AbstractC7365j.a
        public void c() {
            this.f66190a = true;
            this.f66191b.a();
            this.f66192c.a().O(L.f17438a);
        }

        @Override // zd.AbstractC7365j.b
        public Cd.h d() throws Exception {
            if (this.f66190a) {
                throw new Exception("Cannot get state after procedure completion");
            }
            return this.f66193d.f66176b.d();
        }
    }

    /* JADX INFO: renamed from: zd.k$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f66195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f66196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f66197d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC7365j f66199f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC7365j abstractC7365j, Zd.e eVar) {
            super(2, eVar);
            this.f66199f = abstractC7365j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7366k.this.new e(this.f66199f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pf.a aVar;
            C7366k c7366k;
            AbstractC7365j abstractC7365j;
            Pf.a aVar2;
            Throwable th2;
            Object objF = AbstractC2605b.f();
            int i10 = this.f66197d;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    aVar = C7366k.this.f66179e;
                    c7366k = C7366k.this;
                    abstractC7365j = this.f66199f;
                    this.f66194a = aVar;
                    this.f66195b = c7366k;
                    this.f66196c = abstractC7365j;
                    this.f66197d = 1;
                    if (aVar.c(null, this) != objF) {
                    }
                    return objF;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (Pf.a) this.f66194a;
                    try {
                        v.b(obj);
                        L l10 = L.f17438a;
                        aVar2.e(null);
                        return L.f17438a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.e(null);
                        throw th2;
                    }
                }
                abstractC7365j = (AbstractC7365j) this.f66196c;
                c7366k = (C7366k) this.f66195b;
                Pf.a aVar3 = (Pf.a) this.f66194a;
                v.b(obj);
                aVar = aVar3;
                InterfaceC1642x interfaceC1642xB = AbstractC1646z.b(null, 1, null);
                If.g gVar = c7366k.f66178d;
                b bVar = new b(abstractC7365j, interfaceC1642xB);
                this.f66194a = aVar;
                this.f66195b = null;
                this.f66196c = null;
                this.f66197d = 2;
                if (gVar.e(bVar, this) != objF) {
                    aVar2 = aVar;
                    L l102 = L.f17438a;
                    aVar2.e(null);
                    return L.f17438a;
                }
                return objF;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.e(null);
                throw th2;
            }
        }
    }

    public C7366k(InterfaceC7130a updatesLogger, AbstractC7365j.b stateMachineProcedureContext, O scope) {
        AbstractC5504s.h(updatesLogger, "updatesLogger");
        AbstractC5504s.h(stateMachineProcedureContext, "stateMachineProcedureContext");
        AbstractC5504s.h(scope, "scope");
        this.f66175a = updatesLogger;
        this.f66176b = stateMachineProcedureContext;
        this.f66177c = scope;
        this.f66178d = If.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f66179e = Pf.g.b(false, 1, null);
        this.f66180f = AbstractC1617k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7.M0(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(zd.C7366k.b r7, Zd.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zd.C7366k.c
            if (r0 == 0) goto L13
            r0 = r8
            zd.k$c r0 = (zd.C7366k.c) r0
            int r1 = r0.f66189d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66189d = r1
            goto L18
        L13:
            zd.k$c r0 = new zd.k$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f66187b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f66189d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Td.v.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f66186a
            zd.k$b r7 = (zd.C7366k.b) r7
            Td.v.b(r8)
            goto L61
        L3c:
            Td.v.b(r8)
            xd.a r8 = r6.f66175a
            zd.j r2 = r7.b()
            java.lang.String r2 = r2.a()
            ub.e r8 = r8.a(r2)
            zd.j r2 = r7.b()
            zd.k$d r5 = new zd.k$d
            r5.<init>(r8, r7, r6)
            r0.f66186a = r7
            r0.f66189d = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L61
            goto L70
        L61:
            Gf.x r7 = r7.a()
            r8 = 0
            r0.f66186a = r8
            r0.f66189d = r3
            java.lang.Object r7 = r7.M0(r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            Td.L r7 = Td.L.f17438a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7366k.e(zd.k$b, Zd.e):java.lang.Object");
    }

    public final void f(AbstractC7365j stateMachineProcedure) {
        AbstractC5504s.h(stateMachineProcedure, "stateMachineProcedure");
        AbstractC1617k.d(this.f66177c, null, null, new e(stateMachineProcedure, null), 3, null);
    }
}

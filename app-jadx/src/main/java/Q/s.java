package Q;

import E0.C1307q;
import E0.InterfaceC1292b;
import E0.Q;
import E0.V;
import ae.AbstractC2605b;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.A1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import z.AbstractC7268j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14160c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14159b = obj;
            this.f14160c |= Integer.MIN_VALUE;
            return s.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14164d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14163c = obj;
            this.f14164d |= Integer.MIN_VALUE;
            return s.h(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2048h f14165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2048h interfaceC2048h) {
            super(1);
            this.f14165a = interfaceC2048h;
        }

        public final void a(E0.C c10) {
            if (this.f14165a.b(c10.h())) {
                c10.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E0.C) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2048h f14166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f14167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2048h interfaceC2048h, q qVar) {
            super(1);
            this.f14166a = interfaceC2048h;
            this.f14167b = qVar;
        }

        public final void a(E0.C c10) {
            if (this.f14166a.c(c10.h(), this.f14167b)) {
                c10.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E0.C) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2048h f14170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.J f14171d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2048h f14174c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C2044d f14175d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ K.J f14176e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC2048h interfaceC2048h, C2044d c2044d, K.J j10, Zd.e eVar) {
                super(2, eVar);
                this.f14174c = interfaceC2048h;
                this.f14175d = c2044d;
                this.f14176e = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f14174c, this.f14175d, this.f14176e, eVar);
                aVar.f14173b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
                return ((a) create(interfaceC1292b, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
            
                if (Q.s.h(r1, r2, r4, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
            
                if (Q.s.j(r1, r3, r10, r9) == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r9.f14172a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    Td.v.b(r10)
                    goto L8a
                L1f:
                    java.lang.Object r1 = r9.f14173b
                    E0.b r1 = (E0.InterfaceC1292b) r1
                    Td.v.b(r10)
                    goto L3a
                L27:
                    Td.v.b(r10)
                    java.lang.Object r10 = r9.f14173b
                    r1 = r10
                    E0.b r1 = (E0.InterfaceC1292b) r1
                    r9.f14173b = r1
                    r9.f14172a = r4
                    java.lang.Object r10 = Q.s.a(r1, r9)
                    if (r10 != r0) goto L3a
                    goto L89
                L3a:
                    E0.q r10 = (E0.C1307q) r10
                    boolean r4 = Q.s.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L77
                    int r4 = r10.b()
                    boolean r4 = E0.AbstractC1311v.b(r4)
                    if (r4 == 0) goto L77
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L56:
                    if (r7 >= r6) goto L68
                    java.lang.Object r8 = r4.get(r7)
                    E0.C r8 = (E0.C) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L65
                    goto L77
                L65:
                    int r7 = r7 + 1
                    goto L56
                L68:
                    Q.h r2 = r9.f14174c
                    Q.d r4 = r9.f14175d
                    r9.f14173b = r5
                    r9.f14172a = r3
                    java.lang.Object r10 = Q.s.c(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L8a
                    goto L89
                L77:
                    boolean r3 = Q.s.g(r10)
                    if (r3 != 0) goto L8a
                    K.J r3 = r9.f14176e
                    r9.f14173b = r5
                    r9.f14172a = r2
                    java.lang.Object r10 = Q.s.d(r1, r3, r10, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    Td.L r10 = Td.L.f17438a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: Q.s.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC2048h interfaceC2048h, K.J j10, Zd.e eVar) {
            super(2, eVar);
            this.f14170c = interfaceC2048h;
            this.f14171d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            e eVar2 = new e(this.f14170c, this.f14171d, eVar);
            eVar2.f14169b = obj;
            return eVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((e) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14168a;
            if (i10 == 0) {
                Td.v.b(obj);
                E0.L l10 = (E0.L) this.f14169b;
                a aVar = new a(this.f14170c, new C2044d(l10.getViewConfiguration()), this.f14171d, null);
                this.f14168a = 1;
                if (z.o.c(l10, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f14179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14181e;

        f(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14180d = obj;
            this.f14181e |= Integer.MIN_VALUE;
            return s.j(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K.J f14182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(K.J j10) {
            super(1);
            this.f14182a = j10;
        }

        public final void a(E0.C c10) {
            this.f14182a.e(E0.r.g(c10));
            c10.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E0.C) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f14185c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f14188c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1, Zd.e eVar) {
                super(2, eVar);
                this.f14188c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f14188c, eVar);
                aVar.f14187b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
                return ((a) create(interfaceC1292b, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r4.f14186a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f14187b
                    E0.b r1 = (E0.InterfaceC1292b) r1
                    Td.v.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    Td.v.b(r5)
                    java.lang.Object r5 = r4.f14187b
                    E0.b r5 = (E0.InterfaceC1292b) r5
                    r1 = r5
                L23:
                    E0.s r5 = E0.EnumC1308s.f4178a
                    r4.f14187b = r1
                    r4.f14186a = r2
                    java.lang.Object r5 = r1.p0(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    E0.q r5 = (E0.C1307q) r5
                    kotlin.jvm.functions.Function1 r3 = r4.f14188c
                    boolean r5 = Q.s.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: Q.s.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1, Zd.e eVar) {
            super(2, eVar);
            this.f14185c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            h hVar = new h(this.f14185c, eVar);
            hVar.f14184b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((h) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14183a;
            if (i10 == 0) {
                Td.v.b(obj);
                E0.L l10 = (E0.L) this.f14184b;
                a aVar = new a(this.f14185c, null);
                this.f14183a = 1;
                if (l10.k1(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(E0.InterfaceC1292b r7, Zd.e r8) {
        /*
            boolean r0 = r8 instanceof Q.s.a
            if (r0 == 0) goto L13
            r0 = r8
            Q.s$a r0 = (Q.s.a) r0
            int r1 = r0.f14160c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14160c = r1
            goto L18
        L13:
            Q.s$a r0 = new Q.s$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14159b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f14160c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f14158a
            E0.b r7 = (E0.InterfaceC1292b) r7
            Td.v.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Td.v.b(r8)
        L38:
            E0.s r8 = E0.EnumC1308s.f4179b
            r0.f14158a = r7
            r0.f14160c = r3
            java.lang.Object r8 = r7.p0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            E0.q r8 = (E0.C1307q) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            E0.C r6 = (E0.C) r6
            boolean r6 = E0.r.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.s.e(E0.b, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(A1 a12, E0.C c10, E0.C c11) {
        return C6224f.k(C6224f.p(c10.h(), c11.h())) < AbstractC7268j.h(a12, c10.n());
    }

    public static final boolean g(C1307q c1307q) {
        List listC = c1307q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!Q.g(((E0.C) listC.get(i10)).n(), Q.f4086a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(E0.InterfaceC1292b r7, Q.InterfaceC2048h r8, Q.C2044d r9, E0.C1307q r10, Zd.e r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.s.h(E0.b, Q.h, Q.d, E0.q, Zd.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, InterfaceC2048h interfaceC2048h, K.J j10) {
        return eVar.then(new SuspendPointerInputElement(interfaceC2048h, j10, null, new V.a(new e(interfaceC2048h, j10, null)), 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(E0.InterfaceC1292b r8, K.J r9, E0.C1307q r10, Zd.e r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.s.j(E0.b, K.J, E0.q, Zd.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e k(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new SuspendPointerInputElement(8675309, null, null, new V.a(new h(function1, null)), 6, null));
    }
}

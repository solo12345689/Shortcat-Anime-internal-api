package androidx.compose.foundation.gestures;

import B.m;
import E0.C;
import E0.C1307q;
import E0.EnumC1308s;
import E0.L;
import E0.V;
import E0.X;
import Gf.AbstractC1617k;
import Gf.O;
import Gf.P;
import If.g;
import If.j;
import If.k;
import K0.AbstractC1792i;
import K0.AbstractC1800m;
import K0.InterfaceC1790h;
import K0.v0;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.z;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.N;
import r0.C6224f;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractC1800m implements v0, InterfaceC1790h {

    /* JADX INFO: renamed from: c */
    private q f25901c;

    /* JADX INFO: renamed from: d */
    private Function1 f25902d;

    /* JADX INFO: renamed from: e */
    private boolean f25903e;

    /* JADX INFO: renamed from: f */
    private m f25904f;

    /* JADX INFO: renamed from: g */
    private final Function1 f25905g = new a();

    /* JADX INFO: renamed from: h */
    private g f25906h;

    /* JADX INFO: renamed from: i */
    private B.b f25907i;

    /* JADX INFO: renamed from: j */
    private boolean f25908j;

    /* JADX INFO: renamed from: k */
    private X f25909k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(C c10) {
            return (Boolean) b.this.U1().invoke(c10);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0446b extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25911a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f25912b;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f25914a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f25915b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ b f25916c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ L f25917d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ InterfaceC5096o f25918e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Function1 f25919f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ InterfaceC5082a f25920g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ InterfaceC5082a f25921h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ Function2 f25922i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, L l10, InterfaceC5096o interfaceC5096o, Function1 function1, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, Function2 function2, Zd.e eVar) {
                super(2, eVar);
                this.f25916c = bVar;
                this.f25917d = l10;
                this.f25918e = interfaceC5096o;
                this.f25919f = function1;
                this.f25920g = interfaceC5082a;
                this.f25921h = interfaceC5082a2;
                this.f25922i = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f25916c, this.f25917d, this.f25918e, this.f25919f, this.f25920g, this.f25921h, this.f25922i, eVar);
                aVar.f25915b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0067  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r11.f25914a
                    r2 = 1
                    if (r1 == 0) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r0 = r11.f25915b
                    r1 = r0
                    Gf.O r1 = (Gf.O) r1
                    Td.v.b(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                    r10 = r11
                    goto L64
                L15:
                    r0 = move-exception
                    r12 = r0
                    r10 = r11
                    goto L4d
                L19:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L21:
                    Td.v.b(r12)
                    java.lang.Object r12 = r11.f25915b
                    r1 = r12
                    Gf.O r1 = (Gf.O) r1
                    androidx.compose.foundation.gestures.b r12 = r11.f25916c     // Catch: java.util.concurrent.CancellationException -> L4a
                    z.q r8 = androidx.compose.foundation.gestures.b.L1(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
                    E0.L r3 = r11.f25917d     // Catch: java.util.concurrent.CancellationException -> L4a
                    ie.o r4 = r11.f25918e     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function1 r5 = r11.f25919f     // Catch: java.util.concurrent.CancellationException -> L4a
                    ie.a r6 = r11.f25920g     // Catch: java.util.concurrent.CancellationException -> L4a
                    ie.a r7 = r11.f25921h     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function2 r9 = r11.f25922i     // Catch: java.util.concurrent.CancellationException -> L4a
                    r11.f25915b = r1     // Catch: java.util.concurrent.CancellationException -> L4a
                    r11.f25914a = r2     // Catch: java.util.concurrent.CancellationException -> L4a
                    r10 = r11
                    java.lang.Object r12 = z.AbstractC7268j.d(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L47
                    if (r12 != r0) goto L64
                    return r0
                L47:
                    r0 = move-exception
                L48:
                    r12 = r0
                    goto L4d
                L4a:
                    r0 = move-exception
                    r10 = r11
                    goto L48
                L4d:
                    androidx.compose.foundation.gestures.b r0 = r10.f25916c
                    If.g r0 = androidx.compose.foundation.gestures.b.K1(r0)
                    if (r0 == 0) goto L5e
                    androidx.compose.foundation.gestures.a$a r2 = androidx.compose.foundation.gestures.a.C0445a.f25897a
                    java.lang.Object r0 = r0.d(r2)
                    If.k.b(r0)
                L5e:
                    boolean r0 = Gf.P.g(r1)
                    if (r0 == 0) goto L67
                L64:
                    Td.L r12 = Td.L.f17438a
                    return r12
                L67:
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.C0446b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0447b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ F0.d f25923a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ b f25924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0447b(F0.d dVar, b bVar) {
                super(2);
                this.f25923a = dVar;
                this.f25924b = bVar;
            }

            public final void a(C c10, long j10) {
                F0.e.c(this.f25923a, c10);
                g gVar = this.f25924b.f25906h;
                if (gVar != null) {
                    k.b(gVar.d(new a.b(j10, null)));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C) obj, ((C6224f) obj2).u());
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ b f25925a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f25925a = bVar;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m65invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m65invoke() {
                g gVar = this.f25925a.f25906h;
                if (gVar != null) {
                    k.b(gVar.d(a.C0445a.f25897a));
                }
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ F0.d f25926a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ b f25927b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(F0.d dVar, b bVar) {
                super(1);
                this.f25926a = dVar;
                this.f25927b = bVar;
            }

            public final void a(C c10) {
                F0.e.c(this.f25926a, c10);
                float f10 = ((A1) AbstractC1792i.a(this.f25927b, AbstractC2739w0.r())).f();
                long jB = this.f25926a.b(z.a(f10, f10));
                this.f25926a.e();
                g gVar = this.f25927b.f25906h;
                if (gVar != null) {
                    k.b(gVar.d(new a.d(z.l.l(jB), null)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$e */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class e extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ b f25928a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ F0.d f25929b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, F0.d dVar) {
                super(3);
                this.f25928a = bVar;
                this.f25929b = dVar;
            }

            public final void a(C c10, C c11, long j10) {
                if (((Boolean) this.f25928a.U1().invoke(c10)).booleanValue()) {
                    if (!this.f25928a.f25908j) {
                        if (this.f25928a.f25906h == null) {
                            this.f25928a.f25906h = j.b(Integer.MAX_VALUE, null, null, 6, null);
                        }
                        this.f25928a.d2();
                    }
                    F0.e.c(this.f25929b, c10);
                    long jP = C6224f.p(c11.h(), j10);
                    g gVar = this.f25928a.f25906h;
                    if (gVar != null) {
                        k.b(gVar.d(new a.c(jP, null)));
                    }
                }
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C) obj, (C) obj2, ((C6224f) obj3).u());
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$f */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class f extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ b f25930a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar) {
                super(0);
                this.f25930a = bVar;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f25930a.c2());
            }
        }

        C0446b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C0446b c0446b = b.this.new C0446b(eVar);
            c0446b.f25912b = obj;
            return c0446b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(L l10, Zd.e eVar) {
            return ((C0446b) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25911a;
            if (i10 == 0) {
                v.b(obj);
                L l10 = (L) this.f25912b;
                F0.d dVar = new F0.d();
                a aVar = new a(b.this, l10, new e(b.this, dVar), new d(dVar, b.this), new c(b.this), new f(b.this), new C0447b(dVar, b.this), null);
                this.f25911a = 1;
                if (P.e(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f25931a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f25932b;

        /* JADX INFO: renamed from: d */
        int f25934d;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25932b = obj;
            this.f25934d |= Integer.MIN_VALUE;
            return b.this.Z1(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f25935a;

        /* JADX INFO: renamed from: b */
        Object f25936b;

        /* JADX INFO: renamed from: c */
        Object f25937c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f25938d;

        /* JADX INFO: renamed from: f */
        int f25940f;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25938d = obj;
            this.f25940f |= Integer.MIN_VALUE;
            return b.this.a2(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f25941a;

        /* JADX INFO: renamed from: b */
        Object f25942b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f25943c;

        /* JADX INFO: renamed from: e */
        int f25945e;

        e(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25943c = obj;
            this.f25945e |= Integer.MIN_VALUE;
            return b.this.b2(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f25946a;

        /* JADX INFO: renamed from: b */
        Object f25947b;

        /* JADX INFO: renamed from: c */
        int f25948c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Object f25949d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a */
            Object f25951a;

            /* JADX INFO: renamed from: b */
            int f25952b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f25953c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ N f25954d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ b f25955e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N n10, b bVar, Zd.e eVar) {
                super(2, eVar);
                this.f25954d = n10;
                this.f25955e = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a */
            public final Object invoke(Function1 function1, Zd.e eVar) {
                return ((a) create(function1, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f25954d, this.f25955e, eVar);
                aVar.f25953c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0049 -> B:53:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0055 -> B:52:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r5.f25952b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.f25951a
                    kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                    java.lang.Object r3 = r5.f25953c
                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                    Td.v.b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    Td.v.b(r6)
                    java.lang.Object r6 = r5.f25953c
                    kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.N r6 = r5.f25954d
                    java.lang.Object r6 = r6.f52259a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.d
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.C0445a
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.b
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.a$b r6 = (androidx.compose.foundation.gestures.a.b) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.N r1 = r5.f25954d
                    androidx.compose.foundation.gestures.b r6 = r5.f25955e
                    If.g r6 = androidx.compose.foundation.gestures.b.K1(r6)
                    if (r6 == 0) goto L5b
                    r5.f25953c = r3
                    r5.f25951a = r1
                    r5.f25952b = r2
                    java.lang.Object r6 = r6.a(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                L5b:
                    r1.f52259a = r4
                    goto L27
                L5e:
                    Td.L r6 = Td.L.f17438a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        f(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = b.this.new f(eVar);
            fVar.f25949d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x00fb, code lost:
        
            if (r7.Z1(r6) != r0) goto L72;
         */
        /* JADX WARN: Path cross not found for [B:105:0x00da, B:101:0x00c1], limit reached: 56 */
        /* JADX WARN: Path cross not found for [B:107:0x00de, B:80:0x005e], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:101:0x00c1 A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:99:0x00bb, B:101:0x00c1, B:105:0x00da, B:107:0x00de), top: B:120:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:99:0x00bb, B:101:0x00c1, B:105:0x00da, B:107:0x00de), top: B:120:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0034 A[PHI: r1 r3
  0x0034: PHI (r1v14 kotlin.jvm.internal.N) = (r1v6 kotlin.jvm.internal.N), (r1v19 kotlin.jvm.internal.N) binds: [B:74:0x0031, B:97:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r3v8 Gf.O) = (r3v5 Gf.O), (r3v11 Gf.O) binds: [B:74:0x0031, B:97:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x005e A[PHI: r4
  0x005e: PHI (r4v7 Gf.O) = (r4v0 Gf.O), (r4v3 Gf.O), (r4v3 Gf.O), (r4v3 Gf.O), (r4v5 Gf.O), (r4v8 Gf.O) binds: [B:79:0x0056, B:106:0x00dc, B:108:0x00eb, B:102:0x00d5, B:91:0x008e, B:72:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0090  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00d5 -> B:80:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x00dc -> B:80:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00eb -> B:80:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x00fb -> B:72:0x0027). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x008e -> B:80:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Function1 function1, boolean z10, m mVar, q qVar) {
        this.f25901c = qVar;
        this.f25902d = function1;
        this.f25903e = z10;
        this.f25904f = mVar;
    }

    private final X W1() {
        return V.a(new C0446b(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z1(Zd.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.b.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.b$c r0 = (androidx.compose.foundation.gestures.b.c) r0
            int r1 = r0.f25934d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25934d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$c r0 = new androidx.compose.foundation.gestures.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25932b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f25934d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f25931a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Td.v.b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            Td.v.b(r6)
            B.b r6 = r5.f25907i
            if (r6 == 0) goto L55
            B.m r2 = r5.f25904f
            if (r2 == 0) goto L50
            B.a r4 = new B.a
            r4.<init>(r6)
            r0.f25931a = r5
            r0.f25934d = r3
            java.lang.Object r6 = r2.c(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.f25907i = r6
            goto L56
        L55:
            r0 = r5
        L56:
            i1.y$a r6 = i1.y.f48587b
            long r1 = r6.a()
            r0.Y1(r1)
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.Z1(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0066, code lost:
    
        if (r2.c(r5, r0) == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a2(androidx.compose.foundation.gestures.a.c r7, Zd.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f25940f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25940f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25938d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f25940f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f25937c
            B.b r7 = (B.b) r7
            java.lang.Object r1 = r0.f25936b
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.f25935a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Td.v.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f25936b
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.f25935a
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            Td.v.b(r8)
            goto L6a
        L4c:
            Td.v.b(r8)
            B.b r8 = r6.f25907i
            if (r8 == 0) goto L69
            B.m r2 = r6.f25904f
            if (r2 == 0) goto L69
            B.a r5 = new B.a
            r5.<init>(r8)
            r0.f25935a = r6
            r0.f25936b = r7
            r0.f25940f = r4
            java.lang.Object r8 = r2.c(r5, r0)
            if (r8 != r1) goto L69
            goto L81
        L69:
            r2 = r6
        L6a:
            B.b r8 = new B.b
            r8.<init>()
            B.m r4 = r2.f25904f
            if (r4 == 0) goto L88
            r0.f25935a = r2
            r0.f25936b = r7
            r0.f25937c = r8
            r0.f25940f = r3
            java.lang.Object r0 = r4.c(r8, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.f25907i = r8
            long r7 = r7.a()
            r2.X1(r7)
            Td.L r7 = Td.L.f17438a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.a2(androidx.compose.foundation.gestures.a$c, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b2(androidx.compose.foundation.gestures.a.d r6, Zd.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.f25945e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25945e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25943c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f25945e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f25942b
            androidx.compose.foundation.gestures.a$d r6 = (androidx.compose.foundation.gestures.a.d) r6
            java.lang.Object r0 = r0.f25941a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Td.v.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            Td.v.b(r7)
            B.b r7 = r5.f25907i
            if (r7 == 0) goto L5b
            B.m r2 = r5.f25904f
            if (r2 == 0) goto L56
            B.c r4 = new B.c
            r4.<init>(r7)
            r0.f25941a = r5
            r0.f25942b = r6
            r0.f25945e = r3
            java.lang.Object r7 = r2.c(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.f25907i = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.a()
            r0.Y1(r6)
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.b2(androidx.compose.foundation.gestures.a$d, Zd.e):java.lang.Object");
    }

    public final void d2() {
        this.f25908j = true;
        AbstractC1617k.d(getCoroutineScope(), null, null, new f(null), 3, null);
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        if (this.f25903e && this.f25909k == null) {
            this.f25909k = (X) E1(W1());
        }
        X x10 = this.f25909k;
        if (x10 != null) {
            x10.S(c1307q, enumC1308s, j10);
        }
    }

    public final void S1() {
        B.b bVar = this.f25907i;
        if (bVar != null) {
            m mVar = this.f25904f;
            if (mVar != null) {
                mVar.a(new B.a(bVar));
            }
            this.f25907i = null;
        }
    }

    public abstract Object T1(Function2 function2, Zd.e eVar);

    protected final Function1 U1() {
        return this.f25902d;
    }

    protected final boolean V1() {
        return this.f25903e;
    }

    public abstract void X1(long j10);

    public abstract void Y1(long j10);

    @Override // K0.v0
    public void a1() {
        X x10 = this.f25909k;
        if (x10 != null) {
            x10.a1();
        }
    }

    public abstract boolean c2();

    public final void e2(Function1 function1, boolean z10, m mVar, q qVar, boolean z11) {
        X x10;
        this.f25902d = function1;
        boolean z12 = true;
        if (this.f25903e != z10) {
            this.f25903e = z10;
            if (!z10) {
                S1();
                X x11 = this.f25909k;
                if (x11 != null) {
                    H1(x11);
                }
                this.f25909k = null;
            }
            z11 = true;
        }
        if (!AbstractC5504s.c(this.f25904f, mVar)) {
            S1();
            this.f25904f = mVar;
        }
        if (this.f25901c != qVar) {
            this.f25901c = qVar;
        } else {
            z12 = z11;
        }
        if (!z12 || (x10 = this.f25909k) == null) {
            return;
        }
        x10.C0();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f25908j = false;
        S1();
    }
}

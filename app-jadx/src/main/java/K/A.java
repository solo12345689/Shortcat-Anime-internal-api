package K;

import E0.InterfaceC1292b;
import Gf.AbstractC1617k;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import z.AbstractC7268j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ E0.L f9710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ J f9711d;

        /* JADX INFO: renamed from: K.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0135a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ E0.L f9713b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f9714c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0135a(E0.L l10, J j10, Zd.e eVar) {
                super(2, eVar);
                this.f9713b = l10;
                this.f9714c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0135a(this.f9713b, this.f9714c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0135a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9712a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    E0.L l10 = this.f9713b;
                    J j10 = this.f9714c;
                    this.f9712a = 1;
                    if (A.e(l10, j10, this) == objF) {
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
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ E0.L f9716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f9717c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(E0.L l10, J j10, Zd.e eVar) {
                super(2, eVar);
                this.f9716b = l10;
                this.f9717c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new b(this.f9716b, this.f9717c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9715a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    E0.L l10 = this.f9716b;
                    J j10 = this.f9717c;
                    this.f9715a = 1;
                    if (A.d(l10, j10, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0.L l10, J j10, Zd.e eVar) {
            super(2, eVar);
            this.f9710c = l10;
            this.f9711d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f9710c, this.f9711d, eVar);
            aVar.f9709b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9708a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            Gf.O o10 = (Gf.O) this.f9709b;
            Gf.Q q10 = Gf.Q.f7532d;
            AbstractC1617k.d(o10, null, q10, new C0135a(this.f9710c, this.f9711d, null), 1, null);
            return AbstractC1617k.d(o10, null, q10, new b(this.f9710c, this.f9711d, null), 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f9718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j10) {
            super(1);
            this.f9718a = j10;
        }

        public final void a(long j10) {
            this.f9718a.c(j10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f9719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(J j10) {
            super(0);
            this.f9719a = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            this.f9719a.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f9720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J j10) {
            super(0);
            this.f9720a = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            this.f9720a.onCancel();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f9721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J j10) {
            super(2);
            this.f9721a = j10;
        }

        public final void a(E0.C c10, long j10) {
            this.f9721a.e(j10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((E0.C) obj, ((C6224f) obj2).u());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ J f9725d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(J j10, Zd.e eVar) {
            super(2, eVar);
            this.f9725d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = new f(this.f9725d, eVar);
            fVar.f9724c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
            return ((f) create(interfaceC1292b, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r13.f9723b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.f9722a
                E0.C r1 = (E0.C) r1
                java.lang.Object r4 = r13.f9724c
                E0.b r4 = (E0.InterfaceC1292b) r4
                Td.v.b(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f9724c
                E0.b r1 = (E0.InterfaceC1292b) r1
                Td.v.b(r14)
                r7 = r13
                goto L45
            L2c:
                Td.v.b(r14)
                java.lang.Object r14 = r13.f9724c
                r4 = r14
                E0.b r4 = (E0.InterfaceC1292b) r4
                r13.f9724c = r4
                r13.f9723b = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = z.AbstractC7254A.e(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                E0.C r14 = (E0.C) r14
                K.J r4 = r7.f9725d
                long r5 = r14.h()
                r4.b(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.f9724c = r4
                r7.f9722a = r1
                r7.f9723b = r2
                r14 = 0
                java.lang.Object r14 = E0.InterfaceC1292b.D1(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                E0.q r14 = (E0.C1307q) r14
                java.util.List r14 = r14.c()
                int r5 = r14.size()
                r6 = 0
            L6b:
                if (r6 >= r5) goto L8b
                java.lang.Object r8 = r14.get(r6)
                E0.C r8 = (E0.C) r8
                long r9 = r8.f()
                long r11 = r1.f()
                boolean r9 = E0.B.d(r9, r11)
                if (r9 == 0) goto L88
                boolean r8 = r8.i()
                if (r8 == 0) goto L88
                goto L52
            L88:
                int r6 = r6 + 1
                goto L6b
            L8b:
                K.J r14 = r7.f9725d
                r14.d()
                Td.L r14 = Td.L.f17438a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: K.A.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(E0.L l10, J j10, Zd.e eVar) {
        Object objE = Gf.P.e(new a(l10, j10, null), eVar);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(E0.L l10, J j10, Zd.e eVar) {
        Object objE = AbstractC7268j.e(l10, new b(j10), new c(j10), new d(j10), new e(j10), eVar);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(E0.L l10, J j10, Zd.e eVar) {
        Object objC = z.o.c(l10, new f(j10, null), eVar);
        return objC == AbstractC2605b.f() ? objC : Td.L.f17438a;
    }
}

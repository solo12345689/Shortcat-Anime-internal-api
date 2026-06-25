package Jf;

import Gf.AbstractC1613i;
import Gf.C0;
import Gf.O;
import Gf.Q;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f9654a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E f9655b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC1742e f9656c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ t f9657d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f9658e;

        /* JADX INFO: renamed from: Jf.s$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0133a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f9659a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ int f9660b;

            C0133a(Zd.e eVar) {
                super(2, eVar);
            }

            public final Object a(int i10, Zd.e eVar) {
                return ((C0133a) create(Integer.valueOf(i10), eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0133a c0133a = new C0133a(eVar);
                c0133a.f9660b = ((Number) obj).intValue();
                return c0133a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (Zd.e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f9659a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f9660b > 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f9661a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f9662b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC1742e f9663c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ t f9664d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ Object f9665e;

            /* JADX INFO: renamed from: Jf.s$a$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public /* synthetic */ class C0134a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f9666a;

                static {
                    int[] iArr = new int[C.values().length];
                    try {
                        iArr[C.f9516a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C.f9517b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C.f9518c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f9666a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC1742e interfaceC1742e, t tVar, Object obj, Zd.e eVar) {
                super(2, eVar);
                this.f9663c = interfaceC1742e;
                this.f9664d = tVar;
                this.f9665e = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a */
            public final Object invoke(C c10, Zd.e eVar) {
                return ((b) create(c10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                b bVar = new b(this.f9663c, this.f9664d, this.f9665e, eVar);
                bVar.f9662b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9661a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    int i11 = C0134a.f9666a[((C) this.f9662b).ordinal()];
                    if (i11 == 1) {
                        InterfaceC1742e interfaceC1742e = this.f9663c;
                        t tVar = this.f9664d;
                        this.f9661a = 1;
                        if (interfaceC1742e.collect(tVar, this) == objF) {
                            return objF;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new Td.r();
                        }
                        Object obj2 = this.f9665e;
                        if (obj2 == A.f9513a) {
                            this.f9664d.h();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f9664d.c(obj2));
                        }
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
        a(E e10, InterfaceC1742e interfaceC1742e, t tVar, Object obj, Zd.e eVar) {
            super(2, eVar);
            this.f9655b = e10;
            this.f9656c = interfaceC1742e;
            this.f9657d = tVar;
            this.f9658e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f9655b, this.f9656c, this.f9657d, this.f9658e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
        
            if (r8.collect(r1, r7) != r0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
        
            if (Jf.AbstractC1744g.g(r8, r1, r7) == r0) goto L59;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r7.f9654a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                Td.v.b(r8)
                goto L5c
            L21:
                Td.v.b(r8)
                goto L8d
            L25:
                Td.v.b(r8)
                Jf.E r8 = r7.f9655b
                Jf.E$a r1 = Jf.E.f9525a
                Jf.E r6 = r1.c()
                if (r8 != r6) goto L3f
                Jf.e r8 = r7.f9656c
                Jf.t r1 = r7.f9657d
                r7.f9654a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                Jf.E r8 = r7.f9655b
                Jf.E r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                Jf.t r8 = r7.f9657d
                Jf.I r8 = r8.e()
                Jf.s$a$a r1 = new Jf.s$a$a
                r1.<init>(r5)
                r7.f9654a = r4
                java.lang.Object r8 = Jf.AbstractC1744g.o(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                Jf.e r8 = r7.f9656c
                Jf.t r1 = r7.f9657d
                r7.f9654a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                Jf.E r8 = r7.f9655b
                Jf.t r1 = r7.f9657d
                Jf.I r1 = r1.e()
                Jf.e r8 = r8.a(r1)
                Jf.e r8 = Jf.AbstractC1744g.i(r8)
                Jf.s$a$b r1 = new Jf.s$a$b
                Jf.e r3 = r7.f9656c
                Jf.t r4 = r7.f9657d
                java.lang.Object r6 = r7.f9658e
                r1.<init>(r3, r4, r6, r5)
                r7.f9654a = r2
                java.lang.Object r8 = Jf.AbstractC1744g.g(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                Td.L r8 = Td.L.f17438a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final y a(t tVar) {
        return new v(tVar, null);
    }

    public static final I b(u uVar) {
        return new w(uVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final Jf.D c(Jf.InterfaceC1742e r7, int r8) {
        /*
            If.g$a r0 = If.g.f9159L
            int r0 = r0.a()
            int r0 = oe.AbstractC5874j.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof Kf.e
            if (r1 == 0) goto L3c
            r1 = r7
            Kf.e r1 = (Kf.e) r1
            Jf.e r2 = r1.j()
            if (r2 == 0) goto L3c
            Jf.D r7 = new Jf.D
            int r3 = r1.f11085b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            If.a r4 = r1.f11086c
            If.a r5 = If.a.f9114a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            If.a r8 = r1.f11086c
            Zd.i r1 = r1.f11084a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            Jf.D r8 = new Jf.D
            If.a r1 = If.a.f9114a
            Zd.j r2 = Zd.j.f23275a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.s.c(Jf.e, int):Jf.D");
    }

    private static final C0 d(O o10, Zd.i iVar, InterfaceC1742e interfaceC1742e, t tVar, E e10, Object obj) {
        return AbstractC1613i.c(o10, iVar, AbstractC5504s.c(e10, E.f9525a.c()) ? Q.f7529a : Q.f7532d, new a(e10, interfaceC1742e, tVar, obj, null));
    }

    public static final I e(InterfaceC1742e interfaceC1742e, O o10, E e10, Object obj) {
        D dC = c(interfaceC1742e, 1);
        u uVarA = K.a(obj);
        return new w(uVarA, d(o10, dC.f9524d, dC.f9521a, uVarA, e10, obj));
    }
}

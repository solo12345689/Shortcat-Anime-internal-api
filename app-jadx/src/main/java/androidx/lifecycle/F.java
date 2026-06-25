package androidx.lifecycle;

import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.C0;
import Gf.C1608f0;
import Gf.InterfaceC1623n;
import Gf.M0;
import Td.u;
import ae.AbstractC2605b;
import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k f30134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k.b f30135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f30136e;

        /* JADX INFO: renamed from: androidx.lifecycle.F$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0512a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f30137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f30138b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f30139c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f30140d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f30141e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f30142f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f30143g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC2857k f30144h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ AbstractC2857k.b f30145i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Gf.O f30146j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function2 f30147k;

            /* JADX INFO: renamed from: androidx.lifecycle.F$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0513a implements InterfaceC2861o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC2857k.a f30148a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.N f30149b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Gf.O f30150c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC2857k.a f30151d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC1623n f30152e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Pf.a f30153f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2 f30154g;

                /* JADX INFO: renamed from: androidx.lifecycle.F$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0514a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f30155a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f30156b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f30157c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ Pf.a f30158d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function2 f30159e;

                    /* JADX INFO: renamed from: androidx.lifecycle.F$a$a$a$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                    static final class C0515a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        int f30160a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f30161b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function2 f30162c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0515a(Function2 function2, Zd.e eVar) {
                            super(2, eVar);
                            this.f30162c = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Zd.e create(Object obj, Zd.e eVar) {
                            C0515a c0515a = new C0515a(this.f30162c, eVar);
                            c0515a.f30161b = obj;
                            return c0515a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Gf.O o10, Zd.e eVar) {
                            return ((C0515a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objF = AbstractC2605b.f();
                            int i10 = this.f30160a;
                            if (i10 == 0) {
                                Td.v.b(obj);
                                Gf.O o10 = (Gf.O) this.f30161b;
                                Function2 function2 = this.f30162c;
                                this.f30160a = 1;
                                if (function2.invoke(o10, this) == objF) {
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
                    C0514a(Pf.a aVar, Function2 function2, Zd.e eVar) {
                        super(2, eVar);
                        this.f30158d = aVar;
                        this.f30159e = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Zd.e create(Object obj, Zd.e eVar) {
                        return new C0514a(this.f30158d, this.f30159e, eVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Gf.O o10, Zd.e eVar) {
                        return ((C0514a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Pf.a aVar;
                        Function2 function2;
                        Pf.a aVar2;
                        Throwable th2;
                        Object objF = AbstractC2605b.f();
                        int i10 = this.f30157c;
                        try {
                            if (i10 == 0) {
                                Td.v.b(obj);
                                aVar = this.f30158d;
                                function2 = this.f30159e;
                                this.f30155a = aVar;
                                this.f30156b = function2;
                                this.f30157c = 1;
                                if (aVar.c(null, this) != objF) {
                                }
                                return objF;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (Pf.a) this.f30155a;
                                try {
                                    Td.v.b(obj);
                                    Td.L l10 = Td.L.f17438a;
                                    aVar2.e(null);
                                    return Td.L.f17438a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    aVar2.e(null);
                                    throw th2;
                                }
                            }
                            function2 = (Function2) this.f30156b;
                            Pf.a aVar3 = (Pf.a) this.f30155a;
                            Td.v.b(obj);
                            aVar = aVar3;
                            C0515a c0515a = new C0515a(function2, null);
                            this.f30155a = aVar;
                            this.f30156b = null;
                            this.f30157c = 2;
                            if (Gf.P.e(c0515a, this) != objF) {
                                aVar2 = aVar;
                                Td.L l102 = Td.L.f17438a;
                                aVar2.e(null);
                                return Td.L.f17438a;
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

                C0513a(AbstractC2857k.a aVar, kotlin.jvm.internal.N n10, Gf.O o10, AbstractC2857k.a aVar2, InterfaceC1623n interfaceC1623n, Pf.a aVar3, Function2 function2) {
                    this.f30148a = aVar;
                    this.f30149b = n10;
                    this.f30150c = o10;
                    this.f30151d = aVar2;
                    this.f30152e = interfaceC1623n;
                    this.f30153f = aVar3;
                    this.f30154g = function2;
                }

                @Override // androidx.lifecycle.InterfaceC2861o
                public final void g(r rVar, AbstractC2857k.a event) {
                    AbstractC5504s.h(rVar, "<unused var>");
                    AbstractC5504s.h(event, "event");
                    if (event == this.f30148a) {
                        this.f30149b.f52259a = AbstractC1617k.d(this.f30150c, null, null, new C0514a(this.f30153f, this.f30154g, null), 3, null);
                        return;
                    }
                    if (event == this.f30151d) {
                        C0 c02 = (C0) this.f30149b.f52259a;
                        if (c02 != null) {
                            C0.a.a(c02, null, 1, null);
                        }
                        this.f30149b.f52259a = null;
                    }
                    if (event == AbstractC2857k.a.ON_DESTROY) {
                        InterfaceC1623n interfaceC1623n = this.f30152e;
                        u.a aVar = Td.u.f17466b;
                        interfaceC1623n.resumeWith(Td.u.b(Td.L.f17438a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0512a(AbstractC2857k abstractC2857k, AbstractC2857k.b bVar, Gf.O o10, Function2 function2, Zd.e eVar) {
                super(2, eVar);
                this.f30144h = abstractC2857k;
                this.f30145i = bVar;
                this.f30146j = o10;
                this.f30147k = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0512a(this.f30144h, this.f30145i, this.f30146j, this.f30147k, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0512a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 213
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.F.a.C0512a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2857k abstractC2857k, AbstractC2857k.b bVar, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f30134c = abstractC2857k;
            this.f30135d = bVar;
            this.f30136e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f30134c, this.f30135d, this.f30136e, eVar);
            aVar.f30133b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f30132a;
            if (i10 == 0) {
                Td.v.b(obj);
                Gf.O o10 = (Gf.O) this.f30133b;
                M0 m0D2 = C1608f0.c().d2();
                C0512a c0512a = new C0512a(this.f30134c, this.f30135d, o10, this.f30136e, null);
                this.f30132a = 1;
                if (AbstractC1613i.g(m0D2, c0512a, this) == objF) {
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

    public static final Object a(AbstractC2857k abstractC2857k, AbstractC2857k.b bVar, Function2 function2, Zd.e eVar) {
        if (bVar == AbstractC2857k.b.f30236b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC2857k.getCurrentState() == AbstractC2857k.b.f30235a) {
            return Td.L.f17438a;
        }
        Object objE = Gf.P.e(new a(abstractC2857k, bVar, function2, null), eVar);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }
}

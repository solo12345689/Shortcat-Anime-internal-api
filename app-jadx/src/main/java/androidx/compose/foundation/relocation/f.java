package androidx.compose.foundation.relocation;

import Gf.AbstractC1617k;
import Gf.O;
import Gf.P;
import I0.InterfaceC1690p;
import K0.AbstractC1796k;
import K0.D;
import K0.I0;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e.c implements H.a, D, I0 {

    /* JADX INFO: renamed from: d */
    public static final a f26374d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f26375e = 8;

    /* JADX INFO: renamed from: a */
    private H.c f26376a;

    /* JADX INFO: renamed from: b */
    private final boolean f26377b;

    /* JADX INFO: renamed from: c */
    private boolean f26378c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f26379a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f26380b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC1690p f26382d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5082a f26383e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC5082a f26384f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f26385a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ f f26386b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC1690p f26387c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC5082a f26388d;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            /* synthetic */ class C0456a extends AbstractC5502p implements InterfaceC5082a {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ f f26389a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ InterfaceC1690p f26390b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ InterfaceC5082a f26391c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0456a(f fVar, InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a) {
                    super(0, AbstractC5504s.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f26389a = fVar;
                    this.f26390b = interfaceC1690p;
                    this.f26391c = interfaceC5082a;
                }

                @Override // ie.InterfaceC5082a
                /* JADX INFO: renamed from: j */
                public final C6226h invoke() {
                    return f.F1(this.f26389a, this.f26390b, this.f26391c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
                super(2, eVar);
                this.f26386b = fVar;
                this.f26387c = interfaceC1690p;
                this.f26388d = interfaceC5082a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f26386b, this.f26387c, this.f26388d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f26385a;
                if (i10 == 0) {
                    v.b(obj);
                    H.c cVarG1 = this.f26386b.G1();
                    C0456a c0456a = new C0456a(this.f26386b, this.f26387c, this.f26388d);
                    this.f26385a = 1;
                    if (cVarG1.W(c0456a, this) == objF) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0457b extends l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f26392a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ f f26393b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC5082a f26394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0457b(f fVar, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
                super(2, eVar);
                this.f26393b = fVar;
                this.f26394c = interfaceC5082a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0457b(this.f26393b, this.f26394c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0457b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                H.a aVarC;
                Object objF = AbstractC2605b.f();
                int i10 = this.f26392a;
                if (i10 == 0) {
                    v.b(obj);
                    if (this.f26393b.isAttached() && (aVarC = androidx.compose.foundation.relocation.b.c(this.f26393b)) != null) {
                        InterfaceC1690p interfaceC1690pL = AbstractC1796k.l(this.f26393b);
                        InterfaceC5082a interfaceC5082a = this.f26394c;
                        this.f26392a = 1;
                        if (aVarC.o1(interfaceC1690pL, interfaceC5082a, this) == objF) {
                            return objF;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, Zd.e eVar) {
            super(2, eVar);
            this.f26382d = interfaceC1690p;
            this.f26383e = interfaceC5082a;
            this.f26384f = interfaceC5082a2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = f.this.new b(this.f26382d, this.f26383e, this.f26384f, eVar);
            bVar.f26380b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f26379a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            O o10 = (O) this.f26380b;
            AbstractC1617k.d(o10, null, null, new a(f.this, this.f26382d, this.f26383e, null), 3, null);
            return AbstractC1617k.d(o10, null, null, new C0457b(f.this, this.f26384f, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1690p f26396b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5082a f26397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a) {
            super(0);
            this.f26396b = interfaceC1690p;
            this.f26397c = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final C6226h invoke() {
            C6226h c6226hF1 = f.F1(f.this, this.f26396b, this.f26397c);
            if (c6226hF1 != null) {
                return f.this.G1().N(c6226hF1);
            }
            return null;
        }
    }

    public f(H.c cVar) {
        this.f26376a = cVar;
    }

    public static final C6226h F1(f fVar, InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a) {
        C6226h c6226h;
        if (!fVar.isAttached() || !fVar.f26378c) {
            return null;
        }
        InterfaceC1690p interfaceC1690pL = AbstractC1796k.l(fVar);
        if (!interfaceC1690p.b()) {
            interfaceC1690p = null;
        }
        if (interfaceC1690p == null || (c6226h = (C6226h) interfaceC5082a.invoke()) == null) {
            return null;
        }
        return d.c(interfaceC1690pL, interfaceC1690p, c6226h);
    }

    @Override // K0.I0
    public Object B() {
        return f26374d;
    }

    public final H.c G1() {
        return this.f26376a;
    }

    @Override // K0.D
    public void L(InterfaceC1690p interfaceC1690p) {
        this.f26378c = true;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f26377b;
    }

    @Override // H.a
    public Object o1(InterfaceC1690p interfaceC1690p, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
        Object objE = P.e(new b(interfaceC1690p, interfaceC5082a, new c(interfaceC1690p, interfaceC5082a), null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }
}

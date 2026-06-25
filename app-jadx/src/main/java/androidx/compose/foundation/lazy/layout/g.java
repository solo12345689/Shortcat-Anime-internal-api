package androidx.compose.foundation.lazy.layout;

import F.C;
import Gf.AbstractC1617k;
import Gf.O;
import K0.A0;
import K0.B0;
import R0.A;
import R0.C2093b;
import R0.j;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g extends e.c implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5082a f26293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C f26294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f26295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f26298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f26299g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Function1 f26300h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Float invoke() {
            return Float.valueOf(g.this.f26294b.d() - g.this.f26294b.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            F.q qVar = (F.q) g.this.f26293a.invoke();
            int iA = qVar.a();
            int i10 = 0;
            while (true) {
                if (i10 >= iA) {
                    i10 = -1;
                    break;
                }
                if (AbstractC5504s.c(qVar.d(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Float invoke() {
            return Float.valueOf(g.this.f26294b.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Float invoke() {
            return Float.valueOf(g.this.f26294b.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f26307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f26308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, Zd.e eVar) {
                super(2, eVar);
                this.f26307b = gVar;
                this.f26308c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f26307b, this.f26308c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f26306a;
                if (i10 == 0) {
                    v.b(obj);
                    C c10 = this.f26307b.f26294b;
                    int i11 = this.f26308c;
                    this.f26306a = 1;
                    if (c10.f(i11, this) == objF) {
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

        e() {
            super(1);
        }

        public final Boolean a(int i10) {
            F.q qVar = (F.q) g.this.f26293a.invoke();
            if (i10 >= 0 && i10 < qVar.a()) {
                AbstractC1617k.d(g.this.getCoroutineScope(), null, null, new a(g.this, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + qVar.a() + ')').toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(InterfaceC5082a interfaceC5082a, C c10, q qVar, boolean z10, boolean z11) {
        this.f26293a = interfaceC5082a;
        this.f26294b = c10;
        this.f26295c = qVar;
        this.f26296d = z10;
        this.f26297e = z11;
        J1();
    }

    private final C2093b G1() {
        return this.f26294b.c();
    }

    private final boolean H1() {
        return this.f26295c == q.Vertical;
    }

    private final void J1() {
        this.f26298f = new j(new c(), new d(), this.f26297e);
        this.f26300h = this.f26296d ? new e() : null;
    }

    public final void I1(InterfaceC5082a interfaceC5082a, C c10, q qVar, boolean z10, boolean z11) {
        this.f26293a = interfaceC5082a;
        this.f26294b = c10;
        if (this.f26295c != qVar) {
            this.f26295c = qVar;
            B0.b(this);
        }
        if (this.f26296d == z10 && this.f26297e == z11) {
            return;
        }
        this.f26296d = z10;
        this.f26297e = z11;
        J1();
        B0.b(this);
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
        A.q0(c10, true);
        A.p(c10, this.f26299g);
        if (H1()) {
            j jVar = this.f26298f;
            if (jVar == null) {
                AbstractC5504s.u("scrollAxisRange");
                jVar = null;
            }
            A.r0(c10, jVar);
        } else {
            j jVar2 = this.f26298f;
            if (jVar2 == null) {
                AbstractC5504s.u("scrollAxisRange");
                jVar2 = null;
            }
            A.Y(c10, jVar2);
        }
        Function1 function1 = this.f26300h;
        if (function1 != null) {
            A.Q(c10, null, function1, 1, null);
        }
        A.m(c10, null, new a(), 1, null);
        A.S(c10, G1());
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return false;
    }
}

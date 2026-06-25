package androidx.compose.foundation;

import B.o;
import Gf.AbstractC1617k;
import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import K0.AbstractC1807u;
import K0.InterfaceC1794j;
import K0.InterfaceC1806t;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.L;
import s0.C6385r0;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g implements InterfaceC6989I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25867a = new g();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends e.c implements InterfaceC1806t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final B.k f25868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25871d;

        /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0443a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25872a;

            /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0444a implements InterfaceC1743f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ L f25874a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ L f25875b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ L f25876c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f25877d;

                C0444a(L l10, L l11, L l12, a aVar) {
                    this.f25874a = l10;
                    this.f25875b = l11;
                    this.f25876c = l12;
                    this.f25877d = aVar;
                }

                @Override // Jf.InterfaceC1743f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(B.j jVar, Zd.e eVar) {
                    boolean z10 = true;
                    if (jVar instanceof o.b) {
                        this.f25874a.f52257a++;
                    } else if (jVar instanceof o.c) {
                        L l10 = this.f25874a;
                        l10.f52257a--;
                    } else if (jVar instanceof o.a) {
                        L l11 = this.f25874a;
                        l11.f52257a--;
                    } else if (jVar instanceof B.g) {
                        this.f25875b.f52257a++;
                    } else if (jVar instanceof B.h) {
                        L l12 = this.f25875b;
                        l12.f52257a--;
                    } else if (jVar instanceof B.d) {
                        this.f25876c.f52257a++;
                    } else if (jVar instanceof B.e) {
                        L l13 = this.f25876c;
                        l13.f52257a--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f25874a.f52257a > 0;
                    boolean z13 = this.f25875b.f52257a > 0;
                    boolean z14 = this.f25876c.f52257a > 0;
                    if (this.f25877d.f25869b != z12) {
                        this.f25877d.f25869b = z12;
                        z11 = true;
                    }
                    if (this.f25877d.f25870c != z13) {
                        this.f25877d.f25870c = z13;
                        z11 = true;
                    }
                    if (this.f25877d.f25871d != z14) {
                        this.f25877d.f25871d = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        AbstractC1807u.a(this.f25877d);
                    }
                    return Td.L.f17438a;
                }
            }

            C0443a(Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return a.this.new C0443a(eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0443a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f25872a;
                if (i10 == 0) {
                    v.b(obj);
                    L l10 = new L();
                    L l11 = new L();
                    L l12 = new L();
                    InterfaceC1742e interfaceC1742eB = a.this.f25868a.b();
                    C0444a c0444a = new C0444a(l10, l11, l12, a.this);
                    this.f25872a = 1;
                    if (interfaceC1742eB.collect(c0444a, this) == objF) {
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

        public a(B.k kVar) {
            this.f25868a = kVar;
        }

        @Override // K0.InterfaceC1806t
        public void draw(InterfaceC6708c interfaceC6708c) {
            interfaceC6708c.B1();
            if (this.f25869b) {
                InterfaceC6711f.B0(interfaceC6708c, C6385r0.q(C6385r0.f58985b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC6708c.f(), 0.0f, null, null, 0, 122, null);
            } else if (this.f25870c || this.f25871d) {
                InterfaceC6711f.B0(interfaceC6708c, C6385r0.q(C6385r0.f58985b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC6708c.f(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.e.c
        public void onAttach() {
            AbstractC1617k.d(getCoroutineScope(), null, null, new C0443a(null), 3, null);
        }
    }

    private g() {
    }

    @Override // x.InterfaceC6989I
    public InterfaceC1794j a(B.k kVar) {
        return new a(kVar);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}

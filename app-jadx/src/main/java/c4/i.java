package c4;

import Gf.C1608f0;
import If.s;
import If.u;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.content.Context;
import c4.i;
import d4.InterfaceC4566a;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b */
    private final l f33495b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4566a f33496c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f33497a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f33498b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Context f33500d;

        /* JADX INFO: renamed from: c4.i$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0566a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f33501a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ K1.a f33502b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0566a(i iVar, K1.a aVar) {
                super(0);
                this.f33501a = iVar;
                this.f33502b = aVar;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m104invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m104invoke() {
                this.f33501a.f33496c.a(this.f33502b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Zd.e eVar) {
            super(2, eVar);
            this.f33500d = context;
        }

        public static final void k(u uVar, j jVar) {
            uVar.d(jVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = i.this.new a(this.f33500d, eVar);
            aVar.f33498b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i */
        public final Object invoke(u uVar, Zd.e eVar) {
            return ((a) create(uVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f33497a;
            if (i10 == 0) {
                v.b(obj);
                final u uVar = (u) this.f33498b;
                K1.a aVar = new K1.a() { // from class: c4.h
                    @Override // K1.a
                    public final void accept(Object obj2) {
                        i.a.k(uVar, (j) obj2);
                    }
                };
                i.this.f33496c.b(this.f33500d, new androidx.privacysandbox.ads.adservices.measurement.k(), aVar);
                C0566a c0566a = new C0566a(i.this, aVar);
                this.f33497a = 1;
                if (s.a(uVar, c0566a, this) == objF) {
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

    public i(l windowMetricsCalculator, InterfaceC4566a windowBackend) {
        AbstractC5504s.h(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC5504s.h(windowBackend, "windowBackend");
        this.f33495b = windowMetricsCalculator;
        this.f33496c = windowBackend;
    }

    @Override // c4.f
    public InterfaceC1742e a(Context context) {
        AbstractC5504s.h(context, "context");
        return AbstractC1744g.s(AbstractC1744g.e(new a(context, null)), C1608f0.c());
    }
}

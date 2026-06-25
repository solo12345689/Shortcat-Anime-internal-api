package G;

import F.AbstractC1542m;
import F.InterfaceC1533d;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements F.q {

    /* JADX INFO: renamed from: a */
    private final C f6895a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1542m f6896b;

    /* JADX INFO: renamed from: c */
    private final androidx.compose.foundation.lazy.layout.c f6897c;

    /* JADX INFO: renamed from: d */
    private final w f6898d = w.f6963a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f6900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f6900b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1142237095, i10, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
            }
            AbstractC1542m abstractC1542m = r.this.f6896b;
            int i11 = this.f6900b;
            r rVar = r.this;
            InterfaceC1533d.a aVar = abstractC1542m.g().get(i11);
            ((l) aVar.c()).a().invoke(rVar.f6898d, Integer.valueOf(i11 - aVar.b()), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f6902b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f6903c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f6904d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f6902b = i10;
            this.f6903c = obj;
            this.f6904d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            r.this.e(this.f6902b, this.f6903c, interfaceC2425m, AbstractC2409g1.a(this.f6904d | 1));
        }
    }

    public r(C c10, AbstractC1542m abstractC1542m, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f6895a = c10;
        this.f6896b = abstractC1542m;
        this.f6897c = cVar;
    }

    @Override // F.q
    public int a() {
        return this.f6896b.h();
    }

    @Override // F.q
    public int c(Object obj) {
        return this.f6897c.c(obj);
    }

    @Override // F.q
    public Object d(int i10) {
        Object objD = this.f6897c.d(i10);
        return objD == null ? this.f6896b.i(i10) : objD;
    }

    @Override // F.q
    public void e(int i10, Object obj, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        int i13;
        Object obj2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1201380429);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.c(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.F(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.U(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            i13 = i10;
            obj2 = obj;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1201380429, i12, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            i13 = i10;
            obj2 = obj;
            F.A.a(obj2, i13, this.f6895a.J(), g0.i.d(1142237095, true, new a(i10), interfaceC2425mG, 54), interfaceC2425mG, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(i13, obj2, i11));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return AbstractC5504s.c(this.f6896b, ((r) obj).f6896b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6896b.hashCode();
    }
}

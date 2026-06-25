package D;

import F.InterfaceC1533d;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f3391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f3392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f3393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f3394d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f3396b = i10;
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
                AbstractC2454w.U(-824725566, i10, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            k kVar = n.this.f3392b;
            int i11 = this.f3396b;
            n nVar = n.this;
            InterfaceC1533d.a aVar = kVar.g().get(i11);
            ((j) aVar.c()).a().invoke(nVar.g(), Integer.valueOf(i11 - aVar.b()), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f3398b = i10;
            this.f3399c = obj;
            this.f3400d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            n.this.e(this.f3398b, this.f3399c, interfaceC2425m, AbstractC2409g1.a(this.f3400d | 1));
        }
    }

    public n(B b10, k kVar, d dVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f3391a = b10;
        this.f3392b = kVar;
        this.f3393c = dVar;
        this.f3394d = cVar;
    }

    @Override // F.q
    public int a() {
        return this.f3392b.h();
    }

    @Override // D.m
    public androidx.compose.foundation.lazy.layout.c b() {
        return this.f3394d;
    }

    @Override // F.q
    public int c(Object obj) {
        return b().c(obj);
    }

    @Override // F.q
    public Object d(int i10) {
        Object objD = b().d(i10);
        return objD == null ? this.f3392b.i(i10) : objD;
    }

    @Override // F.q
    public void e(int i10, Object obj, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        int i13;
        Object obj2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-462424778);
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
                AbstractC2454w.U(-462424778, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            i13 = i10;
            obj2 = obj;
            F.A.a(obj2, i13, this.f3391a.x(), g0.i.d(-824725566, true, new a(i10), interfaceC2425mG, 54), interfaceC2425mG, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
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
        if (obj instanceof n) {
            return AbstractC5504s.c(this.f3392b, ((n) obj).f3392b);
        }
        return false;
    }

    @Override // F.q
    public Object f(int i10) {
        return this.f3392b.f(i10);
    }

    @Override // D.m
    public d g() {
        return this.f3393c;
    }

    @Override // D.m
    public List h() {
        return this.f3392b.j();
    }

    public int hashCode() {
        return this.f3392b.hashCode();
    }
}

package E;

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
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f3909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1289j f3910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f3911c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f3913b = i10;
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
                AbstractC2454w.U(726189336, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            C1289j c1289j = m.this.f3910b;
            int i11 = this.f3913b;
            InterfaceC1533d.a aVar = c1289j.g().get(i11);
            ((C1288i) aVar.c()).a().invoke(p.f3921a, Integer.valueOf(i11 - aVar.b()), interfaceC2425m, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f3915b = i10;
            this.f3916c = obj;
            this.f3917d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            m.this.e(this.f3915b, this.f3916c, interfaceC2425m, AbstractC2409g1.a(this.f3917d | 1));
        }
    }

    public m(I i10, C1289j c1289j, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f3909a = i10;
        this.f3910b = c1289j;
        this.f3911c = cVar;
    }

    @Override // F.q
    public int a() {
        return this.f3910b.h();
    }

    @Override // E.l
    public androidx.compose.foundation.lazy.layout.c b() {
        return this.f3911c;
    }

    @Override // F.q
    public int c(Object obj) {
        return b().c(obj);
    }

    @Override // F.q
    public Object d(int i10) {
        Object objD = b().d(i10);
        return objD == null ? this.f3910b.i(i10) : objD;
    }

    @Override // F.q
    public void e(int i10, Object obj, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        int i13;
        Object obj2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1493551140);
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
                AbstractC2454w.U(1493551140, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            i13 = i10;
            obj2 = obj;
            F.A.a(obj2, i13, this.f3909a.v(), g0.i.d(726189336, true, new a(i10), interfaceC2425mG, 54), interfaceC2425mG, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
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
        if (obj instanceof m) {
            return AbstractC5504s.c(this.f3910b, ((m) obj).f3910b);
        }
        return false;
    }

    @Override // F.q
    public Object f(int i10) {
        return this.f3910b.f(i10);
    }

    public int hashCode() {
        return this.f3910b.hashCode();
    }

    @Override // E.l
    public H i() {
        return this.f3910b.l();
    }
}

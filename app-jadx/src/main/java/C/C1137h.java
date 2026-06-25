package C;

import C.C1131b;
import I0.InterfaceC1687m;
import androidx.compose.ui.layout.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5009b;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: renamed from: C.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1137h implements I0.B, D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1131b.m f2134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.b f2135b;

    /* JADX INFO: renamed from: C.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s[] f2136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1137h f2137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f2140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int[] f2141f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s[] sVarArr, C1137h c1137h, int i10, int i11, androidx.compose.ui.layout.l lVar, int[] iArr) {
            super(1);
            this.f2136a = sVarArr;
            this.f2137b = c1137h;
            this.f2138c = i10;
            this.f2139d = i11;
            this.f2140e = lVar;
            this.f2141f = iArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.s[] sVarArr = this.f2136a;
            C1137h c1137h = this.f2137b;
            int i10 = this.f2138c;
            int i11 = this.f2139d;
            androidx.compose.ui.layout.l lVar = this.f2140e;
            int[] iArr = this.f2141f;
            int length = sVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                androidx.compose.ui.layout.s sVar = sVarArr[i12];
                AbstractC5504s.e(sVar);
                s.a.N(aVar, sVar, c1137h.h(sVar, C.d(sVar), i10, i11, lVar.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
                i12++;
                i13++;
            }
        }
    }

    public C1137h(C1131b.m mVar, e.b bVar) {
        this.f2134a = mVar;
        this.f2135b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(androidx.compose.ui.layout.s sVar, F f10, int i10, int i11, EnumC5027t enumC5027t) {
        AbstractC1141l abstractC1141lA = f10 != null ? f10.a() : null;
        return abstractC1141lA != null ? abstractC1141lA.a(i10 - sVar.W0(), enumC5027t, sVar, i11) : this.f2135b.a(0, i10 - sVar.W0(), enumC5027t);
    }

    @Override // C.D
    public long a(int i10, int i11, int i12, int i13, boolean z10) {
        return AbstractC1136g.b(z10, i10, i11, i12, i13);
    }

    @Override // C.D
    public void b(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.l lVar) {
        this.f2134a.c(lVar, i10, iArr, iArr2);
    }

    @Override // C.D
    public I0.C c(androidx.compose.ui.layout.s[] sVarArr, androidx.compose.ui.layout.l lVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.l.u0(lVar, i12, i11, null, new a(sVarArr, this, i12, i10, lVar, iArr), 4, null);
    }

    @Override // C.D
    public int d(androidx.compose.ui.layout.s sVar) {
        return sVar.P0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1137h)) {
            return false;
        }
        C1137h c1137h = (C1137h) obj;
        return AbstractC5504s.c(this.f2134a, c1137h.f2134a) && AbstractC5504s.c(this.f2135b, c1137h.f2135b);
    }

    @Override // C.D
    public int f(androidx.compose.ui.layout.s sVar) {
        return sVar.W0();
    }

    public int hashCode() {
        return (this.f2134a.hashCode() * 31) + this.f2135b.hashCode();
    }

    @Override // I0.B
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.e(list, i10, interfaceC1687m.s0(this.f2134a.a()));
    }

    @Override // I0.B
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.f(list, i10, interfaceC1687m.s0(this.f2134a.a()));
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        return E.a(this, C5009b.m(j10), C5009b.n(j10), C5009b.k(j10), C5009b.l(j10), lVar.s0(this.f2134a.a()), lVar, list, new androidx.compose.ui.layout.s[list.size()], 0, list.size(), (3072 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // I0.B
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.g(list, i10, interfaceC1687m.s0(this.f2134a.a()));
    }

    @Override // I0.B
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.h(list, i10, interfaceC1687m.s0(this.f2134a.a()));
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f2134a + ", horizontalAlignment=" + this.f2135b + ')';
    }
}

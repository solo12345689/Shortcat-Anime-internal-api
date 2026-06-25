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

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H implements I0.B, D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1131b.e f2018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.c f2019b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s[] f2020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f2021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int[] f2024e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s[] sVarArr, H h10, int i10, int i11, int[] iArr) {
            super(1);
            this.f2020a = sVarArr;
            this.f2021b = h10;
            this.f2022c = i10;
            this.f2023d = i11;
            this.f2024e = iArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.s[] sVarArr = this.f2020a;
            H h10 = this.f2021b;
            int i10 = this.f2022c;
            int i11 = this.f2023d;
            int[] iArr = this.f2024e;
            int length = sVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                androidx.compose.ui.layout.s sVar = sVarArr[i12];
                AbstractC5504s.e(sVar);
                s.a.N(aVar, sVar, iArr[i13], h10.h(sVar, C.d(sVar), i10, i11), 0.0f, 4, null);
                i12++;
                i13++;
            }
        }
    }

    public H(C1131b.e eVar, e.c cVar) {
        this.f2018a = eVar;
        this.f2019b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(androidx.compose.ui.layout.s sVar, F f10, int i10, int i11) {
        AbstractC1141l abstractC1141lA = f10 != null ? f10.a() : null;
        return abstractC1141lA != null ? abstractC1141lA.a(i10 - sVar.P0(), EnumC5027t.f48573a, sVar, i11) : this.f2019b.a(0, i10 - sVar.P0());
    }

    @Override // C.D
    public long a(int i10, int i11, int i12, int i13, boolean z10) {
        return G.a(z10, i10, i11, i12, i13);
    }

    @Override // C.D
    public void b(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.l lVar) {
        this.f2018a.b(lVar, i10, iArr, lVar.getLayoutDirection(), iArr2);
    }

    @Override // C.D
    public I0.C c(androidx.compose.ui.layout.s[] sVarArr, androidx.compose.ui.layout.l lVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.l.u0(lVar, i11, i12, null, new a(sVarArr, this, i12, i10, iArr), 4, null);
    }

    @Override // C.D
    public int d(androidx.compose.ui.layout.s sVar) {
        return sVar.W0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return AbstractC5504s.c(this.f2018a, h10.f2018a) && AbstractC5504s.c(this.f2019b, h10.f2019b);
    }

    @Override // C.D
    public int f(androidx.compose.ui.layout.s sVar) {
        return sVar.P0();
    }

    public int hashCode() {
        return (this.f2018a.hashCode() * 31) + this.f2019b.hashCode();
    }

    @Override // I0.B
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.a(list, i10, interfaceC1687m.s0(this.f2018a.a()));
    }

    @Override // I0.B
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.b(list, i10, interfaceC1687m.s0(this.f2018a.a()));
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        return E.a(this, C5009b.n(j10), C5009b.m(j10), C5009b.l(j10), C5009b.k(j10), lVar.s0(this.f2018a.a()), lVar, list, new androidx.compose.ui.layout.s[list.size()], 0, list.size(), (3072 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // I0.B
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.c(list, i10, interfaceC1687m.s0(this.f2018a.a()));
    }

    @Override // I0.B
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return C1151w.f2186a.d(list, i10, interfaceC1687m.s0(this.f2018a.a()));
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f2018a + ", verticalAlignment=" + this.f2019b + ')';
    }
}

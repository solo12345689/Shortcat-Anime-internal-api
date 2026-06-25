package androidx.compose.foundation.layout;

import I0.A;
import I0.B;
import I0.C;
import Td.L;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.e f26146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26147b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26148a = new a();

        a() {
            super(1);
        }

        public final void invoke(s.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f26150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f26151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f26154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.s sVar, A a10, androidx.compose.ui.layout.l lVar, int i10, int i11, g gVar) {
            super(1);
            this.f26149a = sVar;
            this.f26150b = a10;
            this.f26151c = lVar;
            this.f26152d = i10;
            this.f26153e = i11;
            this.f26154f = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            f.i(aVar, this.f26149a, this.f26150b, this.f26151c.getLayoutDirection(), this.f26152d, this.f26153e, this.f26154f.f26146a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s[] f26155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f26156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f26157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f26158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f26159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f26160f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.layout.s[] sVarArr, List list, androidx.compose.ui.layout.l lVar, kotlin.jvm.internal.L l10, kotlin.jvm.internal.L l11, g gVar) {
            super(1);
            this.f26155a = sVarArr;
            this.f26156b = list;
            this.f26157c = lVar;
            this.f26158d = l10;
            this.f26159e = l11;
            this.f26160f = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.s[] sVarArr = this.f26155a;
            List list = this.f26156b;
            androidx.compose.ui.layout.l lVar = this.f26157c;
            kotlin.jvm.internal.L l10 = this.f26158d;
            kotlin.jvm.internal.L l11 = this.f26159e;
            g gVar = this.f26160f;
            int length = sVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                androidx.compose.ui.layout.s sVar = sVarArr[i10];
                AbstractC5504s.f(sVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                f.i(aVar, sVar, (A) list.get(i11), lVar.getLayoutDirection(), l10.f52257a, l11.f52257a, gVar.f26146a);
                i10++;
                i11++;
            }
        }
    }

    public g(l0.e eVar, boolean z10) {
        this.f26146a = eVar;
        this.f26147b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC5504s.c(this.f26146a, gVar.f26146a) && this.f26147b == gVar.f26147b;
    }

    public int hashCode() {
        return (this.f26146a.hashCode() * 31) + Boolean.hashCode(this.f26147b);
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        long j11;
        int iN;
        int iM;
        androidx.compose.ui.layout.s sVarV0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.l.u0(lVar, C5009b.n(j10), C5009b.m(j10), null, a.f26148a, 4, null);
        }
        if (this.f26147b) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = C5009b.d(j11, 0, 0, 0, 0, 10, null);
        }
        if (list.size() == 1) {
            A a10 = (A) list.get(0);
            if (f.g(a10)) {
                iN = C5009b.n(j11);
                iM = C5009b.m(j11);
                sVarV0 = a10.v0(C5009b.f48540b.c(C5009b.n(j11), C5009b.m(j11)));
            } else {
                sVarV0 = a10.v0(j10);
                iN = Math.max(C5009b.n(j11), sVarV0.W0());
                iM = Math.max(C5009b.m(j11), sVarV0.P0());
            }
            int i10 = iN;
            int i11 = iM;
            return androidx.compose.ui.layout.l.u0(lVar, i10, i11, null, new b(sVarV0, a10, lVar, i10, i11, this), 4, null);
        }
        androidx.compose.ui.layout.s[] sVarArr = new androidx.compose.ui.layout.s[list.size()];
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = C5009b.n(j11);
        kotlin.jvm.internal.L l11 = new kotlin.jvm.internal.L();
        l11.f52257a = C5009b.m(j11);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            A a11 = (A) list.get(i12);
            if (f.g(a11)) {
                z10 = true;
            } else {
                androidx.compose.ui.layout.s sVarV02 = a11.v0(j10);
                sVarArr[i12] = sVarV02;
                l10.f52257a = Math.max(l10.f52257a, sVarV02.W0());
                l11.f52257a = Math.max(l11.f52257a, sVarV02.P0());
            }
        }
        if (z10) {
            int i13 = l10.f52257a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = l11.f52257a;
            long jA = AbstractC5010c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                A a12 = (A) list.get(i16);
                if (f.g(a12)) {
                    sVarArr[i16] = a12.v0(jA);
                }
            }
        }
        return androidx.compose.ui.layout.l.u0(lVar, l10.f52257a, l11.f52257a, null, new c(sVarArr, list, lVar, l10, l11, this), 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f26146a + ", propagateMinConstraints=" + this.f26147b + ')';
    }
}

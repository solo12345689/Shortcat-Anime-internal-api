package C;

import Y.C0;
import Y.b2;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.W0;
import i1.C5009b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: C.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1142m extends W0 implements I0.v, J0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P f2154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f2155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0 f2156e;

    /* JADX INFO: renamed from: C.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2157a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
        }
    }

    /* JADX INFO: renamed from: C.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f2158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f2158a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f2158a, 0, 0, 0.0f, 4, null);
        }
    }

    public C1142m(P p10, Function1 function1, Function2 function2) {
        super(function1);
        this.f2154c = p10;
        this.f2155d = function2;
        this.f2156e = b2.e(p10, null, 2, null);
    }

    private final P a() {
        return (P) this.f2156e.getValue();
    }

    private final void c(P p10) {
        this.f2156e.setValue(p10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142m)) {
            return false;
        }
        C1142m c1142m = (C1142m) obj;
        return AbstractC5504s.c(this.f2154c, c1142m.f2154c) && this.f2155d == c1142m.f2155d;
    }

    @Override // J0.d
    public void f(J0.k kVar) {
        c(S.d(this.f2154c, (P) kVar.j(T.a())));
    }

    public int hashCode() {
        return (this.f2154c.hashCode() * 31) + this.f2155d.hashCode();
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public I0.C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        int iIntValue = ((Number) this.f2155d.invoke(a(), lVar)).intValue();
        if (iIntValue == 0) {
            return androidx.compose.ui.layout.l.u0(lVar, 0, 0, null, a.f2157a, 4, null);
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(C5009b.d(j10, 0, 0, iIntValue, iIntValue, 3, null));
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), iIntValue, null, new b(sVarV0), 4, null);
    }
}

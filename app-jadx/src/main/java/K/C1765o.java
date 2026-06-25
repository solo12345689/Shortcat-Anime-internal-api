package K;

import androidx.compose.ui.layout.s;
import i1.C5009b;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1765o implements I0.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f10267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.d0 f10269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5082a f10270e;

    /* JADX INFO: renamed from: K.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f10271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1765o f10272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f10273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10274d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.l lVar, C1765o c1765o, androidx.compose.ui.layout.s sVar, int i10) {
            super(1);
            this.f10271a = lVar;
            this.f10272b = c1765o;
            this.f10273c = sVar;
            this.f10274d = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.l lVar = this.f10271a;
            int iA = this.f10272b.a();
            a1.d0 d0VarI = this.f10272b.i();
            Z z10 = (Z) this.f10272b.h().invoke();
            this.f10272b.c().j(z.q.Horizontal, U.b(lVar, iA, d0VarI, z10 != null ? z10.f() : null, this.f10271a.getLayoutDirection() == EnumC5027t.f48574b, this.f10273c.W0()), this.f10274d, this.f10273c.W0());
            s.a.W(aVar, this.f10273c, Math.round(-this.f10272b.c().d()), 0, 0.0f, 4, null);
        }
    }

    public C1765o(V v10, int i10, a1.d0 d0Var, InterfaceC5082a interfaceC5082a) {
        this.f10267b = v10;
        this.f10268c = i10;
        this.f10269d = d0Var;
        this.f10270e = interfaceC5082a;
    }

    public final int a() {
        return this.f10268c;
    }

    public final V c() {
        return this.f10267b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1765o)) {
            return false;
        }
        C1765o c1765o = (C1765o) obj;
        return AbstractC5504s.c(this.f10267b, c1765o.f10267b) && this.f10268c == c1765o.f10268c && AbstractC5504s.c(this.f10269d, c1765o.f10269d) && AbstractC5504s.c(this.f10270e, c1765o.f10270e);
    }

    public final InterfaceC5082a h() {
        return this.f10270e;
    }

    public int hashCode() {
        return (((((this.f10267b.hashCode() * 31) + Integer.hashCode(this.f10268c)) * 31) + this.f10269d.hashCode()) * 31) + this.f10270e.hashCode();
    }

    public final a1.d0 i() {
        return this.f10269d;
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        long j11;
        if (a10.q0(C5009b.k(j10)) < C5009b.l(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = C5009b.d(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
        int iMin = Math.min(sVarV0.W0(), C5009b.l(j11));
        return androidx.compose.ui.layout.l.u0(lVar, iMin, sVarV0.P0(), null, new a(lVar, this, sVarV0, iMin), 4, null);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f10267b + ", cursorOffset=" + this.f10268c + ", transformedText=" + this.f10269d + ", textLayoutResultProvider=" + this.f10270e + ')';
    }
}

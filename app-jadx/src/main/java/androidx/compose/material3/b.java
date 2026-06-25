package androidx.compose.material3;

import B.k;
import K0.InterfaceC1794j;
import i1.C5015h;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.InterfaceC6389t0;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b implements InterfaceC6989I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6389t0 f26566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26567d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC6389t0 {
        a() {
        }

        @Override // s0.InterfaceC6389t0
        public final long a() {
            return b.this.f26567d;
        }
    }

    public /* synthetic */ b(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    @Override // x.InterfaceC6989I
    public InterfaceC1794j a(k kVar) {
        InterfaceC6389t0 aVar = this.f26566c;
        if (aVar == null) {
            aVar = new a();
        }
        return new DelegatingThemeAwareRippleNode(kVar, this.f26564a, this.f26565b, aVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26564a == bVar.f26564a && C5015h.q(this.f26565b, bVar.f26565b) && AbstractC5504s.c(this.f26566c, bVar.f26566c)) {
            return C6385r0.s(this.f26567d, bVar.f26567d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f26564a) * 31) + C5015h.r(this.f26565b)) * 31;
        InterfaceC6389t0 interfaceC6389t0 = this.f26566c;
        return ((iHashCode + (interfaceC6389t0 != null ? interfaceC6389t0.hashCode() : 0)) * 31) + C6385r0.y(this.f26567d);
    }

    private b(boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, long j10) {
        this.f26564a = z10;
        this.f26565b = f10;
        this.f26566c = interfaceC6389t0;
        this.f26567d = j10;
    }

    private b(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC6389t0) null, j10);
    }
}

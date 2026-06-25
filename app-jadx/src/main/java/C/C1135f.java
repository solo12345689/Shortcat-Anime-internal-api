package C;

import i1.C5009b;
import i1.C5015h;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: C.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1135f implements InterfaceC1134e, InterfaceC1132c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5011d f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.h f2132c;

    public /* synthetic */ C1135f(InterfaceC5011d interfaceC5011d, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5011d, j10);
    }

    @Override // C.InterfaceC1134e
    public float a() {
        return C5009b.h(d()) ? this.f2130a.A(C5009b.l(d())) : C5015h.f48547b.b();
    }

    @Override // C.InterfaceC1132c
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, l0.e eVar2) {
        return this.f2132c.b(eVar, eVar2);
    }

    @Override // C.InterfaceC1132c
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return this.f2132c.c(eVar);
    }

    public long d() {
        return this.f2131b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1135f)) {
            return false;
        }
        C1135f c1135f = (C1135f) obj;
        return AbstractC5504s.c(this.f2130a, c1135f.f2130a) && C5009b.f(this.f2131b, c1135f.f2131b);
    }

    public int hashCode() {
        return (this.f2130a.hashCode() * 31) + C5009b.o(this.f2131b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f2130a + ", constraints=" + ((Object) C5009b.q(this.f2131b)) + ')';
    }

    private C1135f(InterfaceC5011d interfaceC5011d, long j10) {
        this.f2130a = interfaceC5011d;
        this.f2131b = j10;
        this.f2132c = androidx.compose.foundation.layout.h.f26161a;
    }
}

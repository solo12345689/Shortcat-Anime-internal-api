package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F1 extends AbstractC6358h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58876a;

    public /* synthetic */ F1(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final long a() {
        return this.f58876a;
    }

    @Override // s0.AbstractC6358h0
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo965applyToPq9zytI(long j10, InterfaceC6368k1 interfaceC6368k1, float f10) {
        long jQ;
        interfaceC6368k1.e(1.0f);
        if (f10 == 1.0f) {
            jQ = this.f58876a;
        } else {
            long j11 = this.f58876a;
            jQ = C6385r0.q(j11, C6385r0.t(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        interfaceC6368k1.p(jQ);
        if (interfaceC6368k1.w() != null) {
            interfaceC6368k1.v(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F1) && C6385r0.s(this.f58876a, ((F1) obj).f58876a);
    }

    public int hashCode() {
        return C6385r0.y(this.f58876a);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C6385r0.z(this.f58876a)) + ')';
    }

    private F1(long j10) {
        super(null);
        this.f58876a = j10;
    }
}

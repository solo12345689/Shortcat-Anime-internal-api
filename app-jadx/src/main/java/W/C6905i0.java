package w;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: w.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6905i0 implements InterfaceC6904i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6904i f62532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62533b;

    public C6905i0(InterfaceC6904i interfaceC6904i, long j10) {
        this.f62532a = interfaceC6904i;
        this.f62533b = j10;
    }

    @Override // w.InterfaceC6904i
    public v0 a(s0 s0Var) {
        return new j0(this.f62532a.a(s0Var), this.f62533b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6905i0)) {
            return false;
        }
        C6905i0 c6905i0 = (C6905i0) obj;
        return c6905i0.f62533b == this.f62533b && AbstractC5504s.c(c6905i0.f62532a, this.f62532a);
    }

    public int hashCode() {
        return (this.f62532a.hashCode() * 31) + Long.hashCode(this.f62533b);
    }
}

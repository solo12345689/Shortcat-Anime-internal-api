package G;

import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6699b;

    public B(int i10) {
        this.f6699b = i10;
    }

    @Override // G.A
    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        return AbstractC5874j.m(i11, (int) AbstractC5874j.f(j10 - ((long) this.f6699b), 0L), (int) AbstractC5874j.j(j10 + ((long) this.f6699b), 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && this.f6699b == ((B) obj).f6699b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6699b);
    }
}

package a1;

import b1.AbstractC2968a;

/* JADX INFO: renamed from: a1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2539g implements InterfaceC2541i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23610b;

    public C2539g(int i10, int i11) {
        this.f23609a = i10;
        this.f23610b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC2968a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // a1.InterfaceC2541i
    public void a(C2545m c2545m) {
        int iJ = c2545m.j();
        int i10 = this.f23610b;
        int iH = iJ + i10;
        if (((iJ ^ iH) & (i10 ^ iH)) < 0) {
            iH = c2545m.h();
        }
        c2545m.b(c2545m.j(), Math.min(iH, c2545m.h()));
        int iK = c2545m.k();
        int i11 = this.f23609a;
        int i12 = iK - i11;
        if (((iK ^ i12) & (i11 ^ iK)) < 0) {
            i12 = 0;
        }
        c2545m.b(Math.max(0, i12), c2545m.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2539g)) {
            return false;
        }
        C2539g c2539g = (C2539g) obj;
        return this.f23609a == c2539g.f23609a && this.f23610b == c2539g.f23610b;
    }

    public int hashCode() {
        return (this.f23609a * 31) + this.f23610b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f23609a + ", lengthAfterCursor=" + this.f23610b + ')';
    }
}

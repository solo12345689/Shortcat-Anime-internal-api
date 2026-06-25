package a1;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: a1.O */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2522O implements InterfaceC2541i {

    /* JADX INFO: renamed from: a */
    private final int f23535a;

    /* JADX INFO: renamed from: b */
    private final int f23536b;

    public C2522O(int i10, int i11) {
        this.f23535a = i10;
        this.f23536b = i11;
    }

    @Override // a1.InterfaceC2541i
    public void a(C2545m c2545m) {
        if (c2545m.l()) {
            c2545m.a();
        }
        int iM = AbstractC5874j.m(this.f23535a, 0, c2545m.h());
        int iM2 = AbstractC5874j.m(this.f23536b, 0, c2545m.h());
        if (iM != iM2) {
            if (iM < iM2) {
                c2545m.n(iM, iM2);
            } else {
                c2545m.n(iM2, iM);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2522O)) {
            return false;
        }
        C2522O c2522o = (C2522O) obj;
        return this.f23535a == c2522o.f23535a && this.f23536b == c2522o.f23536b;
    }

    public int hashCode() {
        return (this.f23535a * 31) + this.f23536b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f23535a + ", end=" + this.f23536b + ')';
    }
}

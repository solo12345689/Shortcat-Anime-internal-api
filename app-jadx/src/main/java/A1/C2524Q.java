package a1;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: a1.Q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2524Q implements InterfaceC2541i {

    /* JADX INFO: renamed from: a */
    private final int f23539a;

    /* JADX INFO: renamed from: b */
    private final int f23540b;

    public C2524Q(int i10, int i11) {
        this.f23539a = i10;
        this.f23540b = i11;
    }

    @Override // a1.InterfaceC2541i
    public void a(C2545m c2545m) {
        int iM = AbstractC5874j.m(this.f23539a, 0, c2545m.h());
        int iM2 = AbstractC5874j.m(this.f23540b, 0, c2545m.h());
        if (iM < iM2) {
            c2545m.p(iM, iM2);
        } else {
            c2545m.p(iM2, iM);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2524Q)) {
            return false;
        }
        C2524Q c2524q = (C2524Q) obj;
        return this.f23539a == c2524q.f23539a && this.f23540b == c2524q.f23540b;
    }

    public int hashCode() {
        return (this.f23539a * 31) + this.f23540b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f23539a + ", end=" + this.f23540b + ')';
    }
}

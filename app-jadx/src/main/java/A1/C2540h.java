package a1;

import b1.AbstractC2968a;

/* JADX INFO: renamed from: a1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2540h implements InterfaceC2541i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23612b;

    public C2540h(int i10, int i11) {
        this.f23611a = i10;
        this.f23612b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC2968a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // a1.InterfaceC2541i
    public void a(C2545m c2545m) {
        int i10 = this.f23611a;
        int i11 = 0;
        int i12 = 0;
        int iK = 0;
        while (true) {
            if (i12 < i10) {
                int i13 = iK + 1;
                if (c2545m.k() <= i13) {
                    iK = c2545m.k();
                    break;
                } else {
                    iK = AbstractC2542j.b(c2545m.c((c2545m.k() - i13) + (-1)), c2545m.c(c2545m.k() - i13)) ? iK + 2 : i13;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i14 = this.f23612b;
        int iH = 0;
        while (true) {
            if (i11 >= i14) {
                break;
            }
            int i15 = iH + 1;
            if (c2545m.j() + i15 >= c2545m.h()) {
                iH = c2545m.h() - c2545m.j();
                break;
            } else {
                iH = AbstractC2542j.b(c2545m.c((c2545m.j() + i15) + (-1)), c2545m.c(c2545m.j() + i15)) ? iH + 2 : i15;
                i11++;
            }
        }
        c2545m.b(c2545m.j(), c2545m.j() + iH);
        c2545m.b(c2545m.k() - iK, c2545m.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2540h)) {
            return false;
        }
        C2540h c2540h = (C2540h) obj;
        return this.f23611a == c2540h.f23611a && this.f23612b == c2540h.f23612b;
    }

    public int hashCode() {
        return (this.f23611a * 31) + this.f23612b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f23611a + ", lengthAfterCursor=" + this.f23612b + ')';
    }
}

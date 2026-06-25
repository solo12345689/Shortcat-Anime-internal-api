package N2;

import M2.b0;
import N2.f;
import U2.C2253n;
import U2.O;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f12582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0[] f12583b;

    public c(int[] iArr, b0[] b0VarArr) {
        this.f12582a = iArr;
        this.f12583b = b0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f12583b.length];
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f12583b;
            if (i10 >= b0VarArr.length) {
                return iArr;
            }
            iArr[i10] = b0VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (b0 b0Var : this.f12583b) {
            b0Var.c0(j10);
        }
    }

    @Override // N2.f.b
    public O e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f12582a;
            if (i12 >= iArr.length) {
                AbstractC6635w.d("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C2253n();
            }
            if (i11 == iArr[i12]) {
                return this.f12583b[i12];
            }
            i12++;
        }
    }
}

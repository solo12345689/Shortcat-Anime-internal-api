package U2;

import U2.J;
import java.util.Arrays;
import t2.a0;

/* JADX INFO: renamed from: U2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2246g implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f19034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f19035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f19036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19037f;

    public C2246g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f19033b = iArr;
        this.f19034c = jArr;
        this.f19035d = jArr2;
        this.f19036e = jArr3;
        int length = iArr.length;
        this.f19032a = length;
        if (length > 0) {
            this.f19037f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f19037f = 0L;
        }
    }

    public int a(long j10) {
        return a0.k(this.f19036e, j10, true, true);
    }

    @Override // U2.J
    public J.a g(long j10) {
        int iA = a(j10);
        K k10 = new K(this.f19036e[iA], this.f19034c[iA]);
        if (k10.f18923a >= j10 || iA == this.f19032a - 1) {
            return new J.a(k10);
        }
        int i10 = iA + 1;
        return new J.a(k10, new K(this.f19036e[i10], this.f19034c[i10]));
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // U2.J
    public long n() {
        return this.f19037f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f19032a + ", sizes=" + Arrays.toString(this.f19033b) + ", offsets=" + Arrays.toString(this.f19034c) + ", timeUs=" + Arrays.toString(this.f19036e) + ", durationsUs=" + Arrays.toString(this.f19035d) + ")";
    }
}

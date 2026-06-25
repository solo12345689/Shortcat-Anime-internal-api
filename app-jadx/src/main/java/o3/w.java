package o3;

import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f54444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f54446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f54447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f54449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f54450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f54451h;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC6614a.a(iArr.length == jArr2.length);
        AbstractC6614a.a(jArr.length == jArr2.length);
        AbstractC6614a.a(iArr2.length == jArr2.length);
        this.f54444a = tVar;
        this.f54446c = jArr;
        this.f54447d = iArr;
        this.f54448e = i10;
        this.f54449f = jArr2;
        this.f54450g = iArr2;
        this.f54451h = j10;
        this.f54445b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iK = a0.k(this.f54449f, j10, true, false); iK >= 0; iK--) {
            if ((this.f54450g[iK] & 1) != 0) {
                return iK;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iG = a0.g(this.f54449f, j10, true, false); iG < this.f54449f.length; iG++) {
            if ((this.f54450g[iG] & 1) != 0) {
                return iG;
            }
        }
        return -1;
    }
}

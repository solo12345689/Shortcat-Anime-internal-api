package i0;

import java.util.Arrays;
import t.C6542H;

/* JADX INFO: renamed from: i0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4996o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6542H f48508a;

    public C4996o(long[] jArr) {
        C6542H c6542h;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c6542h = new C6542H(jArrCopyOf.length);
            c6542h.e(c6542h.f60129b, jArrCopyOf);
        } else {
            c6542h = new C6542H(0, 1, null);
        }
        this.f48508a = c6542h;
    }

    public final void a(long j10) {
        this.f48508a.d(j10);
    }

    public final long[] b() {
        C6542H c6542h = this.f48508a;
        int i10 = c6542h.f60129b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = c6542h.f60128a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}

package androidx.media3.exoplayer;

import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface O0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(N0 n02);
    }

    static int C(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int F(int i10) {
        return i10 & 64;
    }

    static int Q(int i10) {
        return i10 & 7;
    }

    static int k(int i10) {
        return i10 & 384;
    }

    static boolean l(int i10, boolean z10) {
        int iQ = Q(i10);
        if (iQ != 4) {
            return z10 && iQ == 3;
        }
        return true;
    }

    static int o(int i10, int i11, int i12, int i13, int i14) {
        return C(i10, i11, i12, i13, i14, 0);
    }

    static int q(int i10, int i11, int i12, int i13) {
        return C(i10, i11, i12, 0, 128, i13);
    }

    static int r(int i10) {
        return i10 & 32;
    }

    static int s(int i10) {
        return i10 & 24;
    }

    static int t(int i10) {
        return q(i10, 0, 0, 0);
    }

    static int y(int i10) {
        return i10 & 3584;
    }

    void H(a aVar);

    int L();

    int b(C6109x c6109x);

    int f();

    String getName();

    void h();
}

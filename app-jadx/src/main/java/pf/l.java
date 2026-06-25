package Pf;

import Lf.E;
import Lf.H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l {

    /* JADX INFO: renamed from: a */
    private static final int f13968a = H.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    private static final E f13969b = new E("PERMIT");

    /* JADX INFO: renamed from: c */
    private static final E f13970c = new E("TAKEN");

    /* JADX INFO: renamed from: d */
    private static final E f13971d = new E("BROKEN");

    /* JADX INFO: renamed from: e */
    private static final E f13972e = new E("CANCELLED");

    /* JADX INFO: renamed from: f */
    private static final int f13973f = H.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final h a(int i10, int i11) {
        return new k(i10, i11);
    }

    public static /* synthetic */ h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final m j(long j10, m mVar) {
        return new m(j10, mVar, 0);
    }
}

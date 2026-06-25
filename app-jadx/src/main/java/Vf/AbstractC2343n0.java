package Vf;

/* JADX INFO: renamed from: Vf.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2343n0 {
    public static /* synthetic */ void c(AbstractC2343n0 abstractC2343n0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC2343n0.d() + 1;
        }
        abstractC2343n0.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}

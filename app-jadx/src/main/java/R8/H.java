package R8;

import P8.a;
import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f15209a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.b f15210b;

    public H(com.google.android.gms.common.b bVar) {
        AbstractC2115p.l(bVar);
        this.f15210b = bVar;
    }

    public final int a(Context context, int i10) {
        return this.f15209a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC2115p.l(context);
        AbstractC2115p.l(fVar);
        int iH = 0;
        if (!fVar.e()) {
            return 0;
        }
        int iK = fVar.k();
        int iA = a(context, iK);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f15209a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f15209a.keyAt(i10);
            if (iKeyAt > iK && this.f15209a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iH == -1) {
            iH = this.f15210b.h(context, iK);
        }
        this.f15209a.put(iK, iH);
        return iH;
    }

    public final void c() {
        this.f15209a.clear();
    }
}

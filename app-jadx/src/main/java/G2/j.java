package G2;

import android.util.SparseArray;
import t2.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f7013a = new SparseArray();

    public O a(int i10) {
        O o10 = (O) this.f7013a.get(i10);
        if (o10 != null) {
            return o10;
        }
        O o11 = new O(9223372036854775806L);
        this.f7013a.put(i10, o11);
        return o11;
    }

    public void b() {
        this.f7013a.clear();
    }
}

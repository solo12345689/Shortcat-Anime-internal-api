package P2;

import A2.N;
import java.util.Objects;
import q2.h0;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N[] f13277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A[] f13278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f13279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13280e;

    public H(N[] nArr, A[] aArr, h0 h0Var, Object obj) {
        AbstractC6614a.a(nArr.length == aArr.length);
        this.f13277b = nArr;
        this.f13278c = (A[]) aArr.clone();
        this.f13279d = h0Var;
        this.f13280e = obj;
        this.f13276a = nArr.length;
    }

    public boolean a(H h10) {
        if (h10 == null || h10.f13278c.length != this.f13278c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13278c.length; i10++) {
            if (!b(h10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(H h10, int i10) {
        return h10 != null && Objects.equals(this.f13277b[i10], h10.f13277b[i10]) && Objects.equals(this.f13278c[i10], h10.f13278c[i10]);
    }

    public boolean c(int i10) {
        return this.f13277b[i10] != null;
    }
}

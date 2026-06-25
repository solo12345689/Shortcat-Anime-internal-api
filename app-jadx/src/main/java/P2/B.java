package P2;

import java.util.List;
import q2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC1986c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f13264j;

    public B(a0 a0Var, int i10, int i11) {
        this(a0Var, i10, i11, 0, null);
    }

    @Override // P2.A
    public int b() {
        return 0;
    }

    @Override // P2.A
    public Object i() {
        return this.f13264j;
    }

    @Override // P2.A
    public int r() {
        return this.f13263i;
    }

    public B(a0 a0Var, int i10, int i11, int i12, Object obj) {
        super(a0Var, new int[]{i10}, i11);
        this.f13263i = i12;
        this.f13264j = obj;
    }

    @Override // P2.A
    public void k(long j10, long j11, long j12, List list, N2.n[] nVarArr) {
    }
}

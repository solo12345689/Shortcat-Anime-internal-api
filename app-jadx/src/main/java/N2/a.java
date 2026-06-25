package N2;

import q2.C6109x;
import t2.AbstractC6614a;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f12575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f12577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f12578n;

    public a(InterfaceC6940g interfaceC6940g, w2.o oVar, C6109x c6109x, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(interfaceC6940g, oVar, c6109x, i10, obj, j10, j11, j14);
        this.f12575k = j12;
        this.f12576l = j13;
    }

    public final int i(int i10) {
        return ((int[]) AbstractC6614a.i(this.f12578n))[i10];
    }

    protected final c j() {
        return (c) AbstractC6614a.i(this.f12577m);
    }

    public void k(c cVar) {
        this.f12577m = cVar;
        this.f12578n = cVar.a();
    }
}

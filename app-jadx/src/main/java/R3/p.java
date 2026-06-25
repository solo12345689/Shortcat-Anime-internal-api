package r3;

import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends z2.g implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f58518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58519f;

    @Override // r3.j
    public int a(long j10) {
        return ((j) AbstractC6614a.e(this.f58518e)).a(j10 - this.f58519f);
    }

    @Override // r3.j
    public List b(long j10) {
        return ((j) AbstractC6614a.e(this.f58518e)).b(j10 - this.f58519f);
    }

    @Override // r3.j
    public long c(int i10) {
        return ((j) AbstractC6614a.e(this.f58518e)).c(i10) + this.f58519f;
    }

    @Override // r3.j
    public int h() {
        return ((j) AbstractC6614a.e(this.f58518e)).h();
    }

    @Override // z2.g, z2.AbstractC7276a
    public void m() {
        super.m();
        this.f58518e = null;
    }

    public void x(long j10, j jVar, long j11) {
        this.f65563b = j10;
        this.f58518e = jVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f58519f = j10;
    }
}

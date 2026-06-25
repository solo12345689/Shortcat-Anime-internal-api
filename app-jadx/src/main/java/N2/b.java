package N2;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12581d;

    public b(long j10, long j11) {
        this.f12579b = j10;
        this.f12580c = j11;
        f();
    }

    protected final void c() {
        long j10 = this.f12581d;
        if (j10 < this.f12579b || j10 > this.f12580c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f12581d;
    }

    public boolean e() {
        return this.f12581d > this.f12580c;
    }

    public void f() {
        this.f12581d = this.f12579b - 1;
    }

    @Override // N2.n
    public boolean next() {
        this.f12581d++;
        return !e();
    }
}

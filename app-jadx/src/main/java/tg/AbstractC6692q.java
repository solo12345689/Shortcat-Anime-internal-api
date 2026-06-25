package tg;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6692q implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f61072a;

    public AbstractC6692q(X delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f61072a = delegate;
    }

    @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61072a.close();
    }

    @Override // tg.X, java.io.Flushable
    public void flush() {
        this.f61072a.flush();
    }

    @Override // tg.X
    public a0 t() {
        return this.f61072a.t();
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) {
        AbstractC5504s.h(source, "source");
        this.f61072a.t0(source, j10);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f61072a + ')';
    }
}

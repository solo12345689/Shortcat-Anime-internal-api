package tg;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f61073a;

    public r(Z delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f61073a = delegate;
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) {
        AbstractC5504s.h(sink, "sink");
        return this.f61073a.N0(sink, j10);
    }

    public final Z a() {
        return this.f61073a;
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61073a.close();
    }

    @Override // tg.Z
    public a0 t() {
        return this.f61073a.t();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f61073a + ')';
    }
}

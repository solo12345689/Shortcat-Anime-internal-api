package tg;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class O implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f60966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f60967b;

    public O(OutputStream out, a0 timeout) {
        AbstractC5504s.h(out, "out");
        AbstractC5504s.h(timeout, "timeout");
        this.f60966a = out;
        this.f60967b = timeout;
    }

    @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f60966a.close();
    }

    @Override // tg.X, java.io.Flushable
    public void flush() throws IOException {
        this.f60966a.flush();
    }

    @Override // tg.X
    public a0 t() {
        return this.f60967b;
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC6680e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f60967b.f();
            U u10 = source.f61033a;
            AbstractC5504s.e(u10);
            int iMin = (int) Math.min(j10, u10.f60988c - u10.f60987b);
            this.f60966a.write(u10.f60986a, u10.f60987b, iMin);
            u10.f60987b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.G0(source.size() - j11);
            if (u10.f60987b == u10.f60988c) {
                source.f61033a = u10.b();
                V.b(u10);
            }
        }
    }

    public String toString() {
        return "sink(" + this.f60966a + ')';
    }
}

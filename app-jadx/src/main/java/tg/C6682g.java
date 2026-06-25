package tg;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6682g implements X {
    @Override // tg.X
    public a0 t() {
        return a0.f61004e;
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) throws EOFException {
        AbstractC5504s.h(source, "source");
        source.skip(j10);
    }

    @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // tg.X, java.io.Flushable
    public void flush() {
    }
}

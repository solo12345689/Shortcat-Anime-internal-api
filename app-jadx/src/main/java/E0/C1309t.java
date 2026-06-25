package E0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: E0.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1309t extends CancellationException {
    public C1309t(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(W.f4095a);
        return this;
    }
}

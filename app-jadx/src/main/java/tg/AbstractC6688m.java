package tg;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6688m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f61055d = d0.b();

    /* JADX INFO: renamed from: tg.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC6688m f61056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f61057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61058c;

        public a(AbstractC6688m fileHandle, long j10) {
            AbstractC5504s.h(fileHandle, "fileHandle");
            this.f61056a = fileHandle;
            this.f61057b = j10;
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) {
            AbstractC5504s.h(sink, "sink");
            if (this.f61058c) {
                throw new IllegalStateException("closed");
            }
            long jO = this.f61056a.o(this.f61057b, sink, j10);
            if (jO != -1) {
                this.f61057b += jO;
            }
            return jO;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f61058c) {
                return;
            }
            this.f61058c = true;
            ReentrantLock reentrantLockJ = this.f61056a.j();
            reentrantLockJ.lock();
            try {
                AbstractC6688m abstractC6688m = this.f61056a;
                abstractC6688m.f61054c--;
                if (this.f61056a.f61054c == 0 && this.f61056a.f61053b) {
                    Td.L l10 = Td.L.f17438a;
                    reentrantLockJ.unlock();
                    this.f61056a.k();
                }
            } finally {
                reentrantLockJ.unlock();
            }
        }

        @Override // tg.Z
        public a0 t() {
            return a0.f61004e;
        }
    }

    public AbstractC6688m(boolean z10) {
        this.f61052a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o(long j10, C6683h c6683h, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            U uQ1 = c6683h.q1(1);
            int iL = l(j13, uQ1.f60986a, uQ1.f60988c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iL == -1) {
                if (uQ1.f60987b == uQ1.f60988c) {
                    c6683h.f61033a = uQ1.b();
                    V.b(uQ1);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                uQ1.f60988c += iL;
                long j14 = iL;
                j13 += j14;
                c6683h.G0(c6683h.size() + j14);
            }
        }
        return j13 - j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f61055d;
        reentrantLock.lock();
        try {
            if (this.f61053b) {
                return;
            }
            this.f61053b = true;
            if (this.f61054c != 0) {
                return;
            }
            Td.L l10 = Td.L.f17438a;
            reentrantLock.unlock();
            k();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock j() {
        return this.f61055d;
    }

    protected abstract void k();

    protected abstract int l(long j10, byte[] bArr, int i10, int i11);

    protected abstract long m();

    public final Z q(long j10) {
        ReentrantLock reentrantLock = this.f61055d;
        reentrantLock.lock();
        try {
            if (this.f61053b) {
                throw new IllegalStateException("closed");
            }
            this.f61054c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f61055d;
        reentrantLock.lock();
        try {
            if (this.f61053b) {
                throw new IllegalStateException("closed");
            }
            Td.L l10 = Td.L.f17438a;
            reentrantLock.unlock();
            return m();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}

package x2;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63786a;

    public q(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        AbstractC6614a.g(this.f63786a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f63786a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f63786a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            a0.t1(th);
        }
    }

    public q(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}

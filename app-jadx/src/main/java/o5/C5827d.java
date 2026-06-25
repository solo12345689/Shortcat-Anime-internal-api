package o5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: o5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5827d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f54531c = l.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f54532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f54533b;

    C5827d() {
    }

    public static C5827d b(InputStream inputStream) {
        C5827d c5827d;
        Queue queue = f54531c;
        synchronized (queue) {
            c5827d = (C5827d) queue.poll();
        }
        if (c5827d == null) {
            c5827d = new C5827d();
        }
        c5827d.h(inputStream);
        return c5827d;
    }

    public IOException a() {
        return this.f54533b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f54532a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54532a.close();
    }

    public void g() {
        this.f54533b = null;
        this.f54532a = null;
        Queue queue = f54531c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void h(InputStream inputStream) {
        this.f54532a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f54532a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f54532a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f54532a.read();
        } catch (IOException e10) {
            this.f54533b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f54532a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f54532a.skip(j10);
        } catch (IOException e10) {
            this.f54533b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f54532a.read(bArr);
        } catch (IOException e10) {
            this.f54533b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f54532a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f54533b = e10;
            throw e10;
        }
    }
}

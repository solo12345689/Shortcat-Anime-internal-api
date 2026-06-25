package tg;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6687l implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6684i f61049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f61050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61051c;

    public C6687l(InterfaceC6684i sink, Deflater deflater) {
        AbstractC5504s.h(sink, "sink");
        AbstractC5504s.h(deflater, "deflater");
        this.f61049a = sink;
        this.f61050b = deflater;
    }

    private final void a(boolean z10) throws IOException {
        U uQ1;
        int iDeflate;
        C6683h c6683hS = this.f61049a.s();
        while (true) {
            uQ1 = c6683hS.q1(1);
            if (z10) {
                try {
                    Deflater deflater = this.f61050b;
                    byte[] bArr = uQ1.f60986a;
                    int i10 = uQ1.f60988c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f61050b;
                byte[] bArr2 = uQ1.f60986a;
                int i11 = uQ1.f60988c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                uQ1.f60988c += iDeflate;
                c6683hS.G0(c6683hS.size() + ((long) iDeflate));
                this.f61049a.g0();
            } else if (this.f61050b.needsInput()) {
                break;
            }
        }
        if (uQ1.f60987b == uQ1.f60988c) {
            c6683hS.f61033a = uQ1.b();
            V.b(uQ1);
        }
    }

    public final void b() throws IOException {
        this.f61050b.finish();
        a(false);
    }

    @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f61051c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f61050b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f61049a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f61051c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // tg.X, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f61049a.flush();
    }

    @Override // tg.X
    public a0 t() {
        return this.f61049a.t();
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC6680e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            U u10 = source.f61033a;
            AbstractC5504s.e(u10);
            int iMin = (int) Math.min(j10, u10.f60988c - u10.f60987b);
            this.f61050b.setInput(u10.f60986a, u10.f60987b, iMin);
            a(false);
            long j11 = iMin;
            source.G0(source.size() - j11);
            int i10 = u10.f60987b + iMin;
            u10.f60987b = i10;
            if (i10 == u10.f60988c) {
                source.f61033a = u10.b();
                V.b(u10);
            }
            j10 -= j11;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f61049a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6687l(X sink, Deflater deflater) {
        this(K.c(sink), deflater);
        AbstractC5504s.h(sink, "sink");
        AbstractC5504s.h(deflater, "deflater");
    }
}

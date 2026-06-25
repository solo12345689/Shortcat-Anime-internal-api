package tg;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class C6696v implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f61084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f61085b;

    public C6696v(InputStream input, a0 timeout) {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(timeout, "timeout");
        this.f61084a = input;
        this.f61085b = timeout;
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) throws IOException {
        AbstractC5504s.h(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f61085b.f();
            U uQ1 = sink.q1(1);
            int i10 = this.f61084a.read(uQ1.f60986a, uQ1.f60988c, (int) Math.min(j10, 8192 - uQ1.f60988c));
            if (i10 != -1) {
                uQ1.f60988c += i10;
                long j11 = i10;
                sink.G0(sink.size() + j11);
                return j11;
            }
            if (uQ1.f60987b != uQ1.f60988c) {
                return -1L;
            }
            sink.f61033a = uQ1.b();
            V.b(uQ1);
            return -1L;
        } catch (AssertionError e10) {
            if (K.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f61084a.close();
    }

    @Override // tg.Z
    public a0 t() {
        return this.f61085b;
    }

    public String toString() {
        return "source(" + this.f61084a + ')';
    }
}

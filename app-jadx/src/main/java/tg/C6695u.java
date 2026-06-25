package tg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6695u implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f61080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f61081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61083d;

    public C6695u(InterfaceC6685j source, Inflater inflater) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(inflater, "inflater");
        this.f61080a = source;
        this.f61081b = inflater;
    }

    private final void g() {
        int i10 = this.f61082c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f61081b.getRemaining();
        this.f61082c -= remaining;
        this.f61080a.skip(remaining);
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) throws IOException {
        AbstractC5504s.h(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f61081b.finished() || this.f61081b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f61080a.f1());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C6683h sink, long j10) throws IOException {
        AbstractC5504s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f61083d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            U uQ1 = sink.q1(1);
            int iMin = (int) Math.min(j10, 8192 - uQ1.f60988c);
            b();
            int iInflate = this.f61081b.inflate(uQ1.f60986a, uQ1.f60988c, iMin);
            g();
            if (iInflate > 0) {
                uQ1.f60988c += iInflate;
                long j11 = iInflate;
                sink.G0(sink.size() + j11);
                return j11;
            }
            if (uQ1.f60987b == uQ1.f60988c) {
                sink.f61033a = uQ1.b();
                V.b(uQ1);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f61081b.needsInput()) {
            return false;
        }
        if (this.f61080a.f1()) {
            return true;
        }
        U u10 = this.f61080a.s().f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60988c;
        int i11 = u10.f60987b;
        int i12 = i10 - i11;
        this.f61082c = i12;
        this.f61081b.setInput(u10.f60986a, i11, i12);
        return false;
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f61083d) {
            return;
        }
        this.f61081b.end();
        this.f61083d = true;
        this.f61080a.close();
    }

    @Override // tg.Z
    public a0 t() {
        return this.f61080a.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6695u(Z source, Inflater inflater) {
        this(K.d(source), inflater);
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(inflater, "inflater");
    }
}

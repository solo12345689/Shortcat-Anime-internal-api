package tg;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6694t implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f61075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f61076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f61077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6695u f61078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f61079e;

    public C6694t(Z source) {
        AbstractC5504s.h(source, "source");
        T t10 = new T(source);
        this.f61076b = t10;
        Inflater inflater = new Inflater(true);
        this.f61077c = inflater;
        this.f61078d = new C6695u((InterfaceC6685j) t10, inflater);
        this.f61079e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        AbstractC5504s.g(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    private final void b() throws IOException {
        this.f61076b.R0(10L);
        byte bD = this.f61076b.f60982b.D(3L);
        boolean z10 = ((bD >> 1) & 1) == 1;
        if (z10) {
            h(this.f61076b.f60982b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f61076b.readShort());
        this.f61076b.skip(8L);
        if (((bD >> 2) & 1) == 1) {
            this.f61076b.R0(2L);
            if (z10) {
                h(this.f61076b.f60982b, 0L, 2L);
            }
            long jJ0 = this.f61076b.f60982b.J0() & 65535;
            this.f61076b.R0(jJ0);
            if (z10) {
                h(this.f61076b.f60982b, 0L, jJ0);
            }
            this.f61076b.skip(jJ0);
        }
        if (((bD >> 3) & 1) == 1) {
            long jA = this.f61076b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                h(this.f61076b.f60982b, 0L, jA + 1);
            }
            this.f61076b.skip(jA + 1);
        }
        if (((bD >> 4) & 1) == 1) {
            long jA2 = this.f61076b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                h(this.f61076b.f60982b, 0L, jA2 + 1);
            }
            this.f61076b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f61076b.J0(), (short) this.f61079e.getValue());
            this.f61079e.reset();
        }
    }

    private final void g() throws IOException {
        a("CRC", this.f61076b.J1(), (int) this.f61079e.getValue());
        a("ISIZE", this.f61076b.J1(), (int) this.f61077c.getBytesWritten());
    }

    private final void h(C6683h c6683h, long j10, long j11) {
        U u10 = c6683h.f61033a;
        AbstractC5504s.e(u10);
        while (true) {
            int i10 = u10.f60988c;
            int i11 = u10.f60987b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) u10.f60987b) + j10);
            int iMin = (int) Math.min(u10.f60988c - i12, j11);
            this.f61079e.update(u10.f60986a, i12, iMin);
            j11 -= (long) iMin;
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            j10 = 0;
        }
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) throws IOException {
        C6694t c6694t;
        AbstractC5504s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f61075a == 0) {
            b();
            this.f61075a = (byte) 1;
        }
        if (this.f61075a == 1) {
            long size = sink.size();
            long jN0 = this.f61078d.N0(sink, j10);
            if (jN0 != -1) {
                h(sink, size, jN0);
                return jN0;
            }
            c6694t = this;
            c6694t.f61075a = (byte) 2;
        } else {
            c6694t = this;
        }
        if (c6694t.f61075a == 2) {
            g();
            c6694t.f61075a = (byte) 3;
            if (!c6694t.f61076b.f1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61078d.close();
    }

    @Override // tg.Z
    public a0 t() {
        return this.f61076b.t();
    }
}

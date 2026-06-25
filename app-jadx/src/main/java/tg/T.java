package tg;

import Df.AbstractC1268a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;
import ug.AbstractC6775a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class T implements InterfaceC6685j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f60981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6683h f60982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60983c;

    public T(Z source) {
        AbstractC5504s.h(source, "source");
        this.f60981a = source;
        this.f60982b = new C6683h();
    }

    @Override // tg.InterfaceC6685j
    public String D0() {
        return i0(Long.MAX_VALUE);
    }

    @Override // tg.InterfaceC6685j
    public byte[] I0(long j10) throws EOFException {
        R0(j10);
        return this.f60982b.I0(j10);
    }

    @Override // tg.InterfaceC6685j
    public short J0() throws EOFException {
        R0(2L);
        return this.f60982b.J0();
    }

    @Override // tg.InterfaceC6685j
    public int J1() throws EOFException {
        R0(4L);
        return this.f60982b.J1();
    }

    @Override // tg.InterfaceC6685j
    public long K0() throws EOFException {
        R0(8L);
        return this.f60982b.K0();
    }

    @Override // tg.InterfaceC6685j
    public InputStream L() {
        return new a();
    }

    @Override // tg.InterfaceC6685j
    public String M1() {
        this.f60982b.O0(this.f60981a);
        return this.f60982b.M1();
    }

    @Override // tg.InterfaceC6685j
    public int N(N options) throws EOFException {
        AbstractC5504s.h(options, "options");
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iE = AbstractC6775a.e(this.f60982b, options, true);
            if (iE != -2) {
                if (iE == -1) {
                    return -1;
                }
                this.f60982b.skip(options.l()[iE].K());
                return iE;
            }
        } while (this.f60981a.N0(this.f60982b, 8192L) != -1);
        return -1;
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) {
        AbstractC5504s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        if (this.f60982b.size() == 0 && this.f60981a.N0(this.f60982b, 8192L) == -1) {
            return -1L;
        }
        return this.f60982b.N0(sink, Math.min(j10, this.f60982b.size()));
    }

    @Override // tg.InterfaceC6685j
    public boolean Q1(long j10, C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        return g(j10, bytes, 0, bytes.K());
    }

    @Override // tg.InterfaceC6685j
    public void R0(long j10) throws EOFException {
        if (!y0(j10)) {
            throw new EOFException();
        }
    }

    @Override // tg.InterfaceC6685j
    public long U(X sink) {
        AbstractC5504s.h(sink, "sink");
        long j10 = 0;
        while (this.f60981a.N0(this.f60982b, 8192L) != -1) {
            long j11 = this.f60982b.j();
            if (j11 > 0) {
                j10 += j11;
                sink.t0(this.f60982b, j11);
            }
        }
        if (this.f60982b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f60982b.size();
        C6683h c6683h = this.f60982b;
        sink.t0(c6683h, c6683h.size());
        return size;
    }

    @Override // tg.InterfaceC6685j
    public String V0(long j10) throws EOFException {
        R0(j10);
        return this.f60982b.V0(j10);
    }

    @Override // tg.InterfaceC6685j
    public long X1() throws EOFException {
        byte bD;
        R0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!y0(i11)) {
                break;
            }
            bD = this.f60982b.D(i10);
            if ((bD < 48 || bD > 57) && ((bD < 97 || bD > 102) && (bD < 65 || bD > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bD, AbstractC1268a.a(AbstractC1268a.a(16)));
            AbstractC5504s.g(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f60982b.X1();
    }

    @Override // tg.InterfaceC6685j
    public C6686k Y0(long j10) throws EOFException {
        R0(j10);
        return this.f60982b.Y0(j10);
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jE = this.f60982b.E(b11, jMax, j12);
            if (jE != -1) {
                return jE;
            }
            long size = this.f60982b.size();
            if (size >= j12 || this.f60981a.N0(this.f60982b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f60983c) {
            return;
        }
        this.f60983c = true;
        this.f60981a.close();
        this.f60982b.g();
    }

    @Override // tg.InterfaceC6685j
    public byte[] e1() {
        this.f60982b.O0(this.f60981a);
        return this.f60982b.e1();
    }

    @Override // tg.InterfaceC6685j
    public void f0(C6683h sink, long j10) throws EOFException {
        AbstractC5504s.h(sink, "sink");
        try {
            R0(j10);
            this.f60982b.f0(sink, j10);
        } catch (EOFException e10) {
            sink.O0(this.f60982b);
            throw e10;
        }
    }

    @Override // tg.InterfaceC6685j
    public boolean f1() {
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        return this.f60982b.f1() && this.f60981a.N0(this.f60982b, 8192L) == -1;
    }

    public boolean g(long j10, C6686k bytes, int i10, int i11) {
        AbstractC5504s.h(bytes, "bytes");
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.K() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!y0(1 + j11) || this.f60982b.D(j11) != bytes.m(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // tg.InterfaceC6685j
    public String i0(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jB = b((byte) 10, 0L, j11);
        if (jB != -1) {
            return AbstractC6775a.d(this.f60982b, jB);
        }
        if (j11 < Long.MAX_VALUE && y0(j11) && this.f60982b.D(j11 - 1) == 13 && y0(j11 + 1) && this.f60982b.D(j11) == 10) {
            return AbstractC6775a.d(this.f60982b, j11);
        }
        C6683h c6683h = new C6683h();
        C6683h c6683h2 = this.f60982b;
        c6683h2.m(c6683h, 0L, Math.min(32, c6683h2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f60982b.size(), j10) + " content=" + c6683h.p0().u() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f60983c;
    }

    @Override // tg.InterfaceC6685j
    public long j1() throws EOFException {
        byte bD;
        R0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!y0(j11)) {
                break;
            }
            bD = this.f60982b.D(j10);
            if ((bD < 48 || bD > 57) && !(j10 == 0 && bD == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bD, AbstractC1268a.a(AbstractC1268a.a(16)));
            AbstractC5504s.g(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f60982b.j1();
    }

    @Override // tg.InterfaceC6685j
    public InterfaceC6685j peek() {
        return K.d(new Q(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC5504s.h(sink, "sink");
        if (this.f60982b.size() == 0 && this.f60981a.N0(this.f60982b, 8192L) == -1) {
            return -1;
        }
        return this.f60982b.read(sink);
    }

    @Override // tg.InterfaceC6685j
    public byte readByte() throws EOFException {
        R0(1L);
        return this.f60982b.readByte();
    }

    @Override // tg.InterfaceC6685j
    public void readFully(byte[] sink) throws EOFException {
        AbstractC5504s.h(sink, "sink");
        try {
            R0(sink.length);
            this.f60982b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f60982b.size() > 0) {
                C6683h c6683h = this.f60982b;
                int i11 = c6683h.read(sink, i10, (int) c6683h.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // tg.InterfaceC6685j
    public int readInt() throws EOFException {
        R0(4L);
        return this.f60982b.readInt();
    }

    @Override // tg.InterfaceC6685j
    public long readLong() throws EOFException {
        R0(8L);
        return this.f60982b.readLong();
    }

    @Override // tg.InterfaceC6685j
    public short readShort() throws EOFException {
        R0(2L);
        return this.f60982b.readShort();
    }

    @Override // tg.InterfaceC6685j
    public C6683h s() {
        return this.f60982b;
    }

    @Override // tg.InterfaceC6685j
    public void skip(long j10) throws EOFException {
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f60982b.size() == 0 && this.f60981a.N0(this.f60982b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f60982b.size());
            this.f60982b.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // tg.Z
    public a0 t() {
        return this.f60981a.t();
    }

    public String toString() {
        return "buffer(" + this.f60981a + ')';
    }

    @Override // tg.InterfaceC6685j
    public String w1(Charset charset) {
        AbstractC5504s.h(charset, "charset");
        this.f60982b.O0(this.f60981a);
        return this.f60982b.w1(charset);
    }

    @Override // tg.InterfaceC6685j
    public boolean y0(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f60983c) {
            throw new IllegalStateException("closed");
        }
        while (this.f60982b.size() < j10) {
            if (this.f60981a.N0(this.f60982b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            T t10 = T.this;
            if (t10.f60983c) {
                throw new IOException("closed");
            }
            return (int) Math.min(t10.f60982b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            T.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            T t10 = T.this;
            if (t10.f60983c) {
                throw new IOException("closed");
            }
            if (t10.f60982b.size() == 0) {
                T t11 = T.this;
                if (t11.f60981a.N0(t11.f60982b, 8192L) == -1) {
                    return -1;
                }
            }
            return T.this.f60982b.readByte() & 255;
        }

        public String toString() {
            return T.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            AbstractC5504s.h(data, "data");
            if (!T.this.f60983c) {
                AbstractC6680e.b(data.length, i10, i11);
                if (T.this.f60982b.size() == 0) {
                    T t10 = T.this;
                    if (t10.f60981a.N0(t10.f60982b, 8192L) == -1) {
                        return -1;
                    }
                }
                return T.this.f60982b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}

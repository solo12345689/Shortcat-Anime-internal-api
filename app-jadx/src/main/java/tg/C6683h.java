package tg;

import Df.C1271d;
import Ud.AbstractC2273n;
import com.facebook.imageutils.JfifUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;
import ug.AbstractC6775a;

/* JADX INFO: renamed from: tg.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6683h implements InterfaceC6685j, InterfaceC6684i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public U f61033a;

    /* JADX INFO: renamed from: b */
    private long f61034b;

    /* JADX INFO: renamed from: tg.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a */
        public C6683h f61035a;

        /* JADX INFO: renamed from: b */
        public boolean f61036b;

        /* JADX INFO: renamed from: c */
        private U f61037c;

        /* JADX INFO: renamed from: e */
        public byte[] f61039e;

        /* JADX INFO: renamed from: d */
        public long f61038d = -1;

        /* JADX INFO: renamed from: f */
        public int f61040f = -1;

        /* JADX INFO: renamed from: g */
        public int f61041g = -1;

        public final U a() {
            return this.f61037c;
        }

        public final int b() {
            long j10 = this.f61038d;
            C6683h c6683h = this.f61035a;
            AbstractC5504s.e(c6683h);
            if (j10 == c6683h.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f61038d;
            return h(j11 == -1 ? 0L : j11 + ((long) (this.f61041g - this.f61040f)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f61035a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f61035a = null;
            j(null);
            this.f61038d = -1L;
            this.f61039e = null;
            this.f61040f = -1;
            this.f61041g = -1;
        }

        public final long g(long j10) {
            C6683h c6683h = this.f61035a;
            if (c6683h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f61036b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c6683h.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    U u10 = c6683h.f61033a;
                    AbstractC5504s.e(u10);
                    U u11 = u10.f60992g;
                    AbstractC5504s.e(u11);
                    int i10 = u11.f60988c;
                    long j12 = i10 - u11.f60987b;
                    if (j12 > j11) {
                        u11.f60988c = i10 - ((int) j11);
                        break;
                    }
                    c6683h.f61033a = u11.b();
                    V.b(u11);
                    j11 -= j12;
                }
                j(null);
                this.f61038d = j10;
                this.f61039e = null;
                this.f61040f = -1;
                this.f61041g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    U uQ1 = c6683h.q1(1);
                    int iMin = (int) Math.min(j13, 8192 - uQ1.f60988c);
                    uQ1.f60988c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        j(uQ1);
                        this.f61038d = size;
                        this.f61039e = uQ1.f60986a;
                        int i11 = uQ1.f60988c;
                        this.f61040f = i11 - iMin;
                        this.f61041g = i11;
                        z10 = false;
                    }
                }
            }
            c6683h.G0(j10);
            return size;
        }

        public final int h(long j10) {
            U uC;
            C6683h c6683h = this.f61035a;
            if (c6683h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c6683h.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c6683h.size());
            }
            if (j10 == -1 || j10 == c6683h.size()) {
                j(null);
                this.f61038d = j10;
                this.f61039e = null;
                this.f61040f = -1;
                this.f61041g = -1;
                return -1;
            }
            long size = c6683h.size();
            U uA = c6683h.f61033a;
            long j11 = 0;
            if (a() != null) {
                long j12 = this.f61038d;
                int i10 = this.f61040f;
                U uA2 = a();
                AbstractC5504s.e(uA2);
                long j13 = j12 - ((long) (i10 - uA2.f60987b));
                if (j13 > j10) {
                    uC = uA;
                    uA = a();
                    size = j13;
                } else {
                    uC = a();
                    j11 = j13;
                }
            } else {
                uC = uA;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    AbstractC5504s.e(uC);
                    int i11 = uC.f60988c;
                    int i12 = uC.f60987b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    uC = uC.f60991f;
                }
            } else {
                while (size > j10) {
                    AbstractC5504s.e(uA);
                    uA = uA.f60992g;
                    AbstractC5504s.e(uA);
                    size -= (long) (uA.f60988c - uA.f60987b);
                }
                j11 = size;
                uC = uA;
            }
            if (this.f61036b) {
                AbstractC5504s.e(uC);
                if (uC.f60989d) {
                    U uF = uC.f();
                    if (c6683h.f61033a == uC) {
                        c6683h.f61033a = uF;
                    }
                    uC = uC.c(uF);
                    U u10 = uC.f60992g;
                    AbstractC5504s.e(u10);
                    u10.b();
                }
            }
            j(uC);
            this.f61038d = j10;
            AbstractC5504s.e(uC);
            this.f61039e = uC.f60986a;
            int i13 = uC.f60987b + ((int) (j10 - j11));
            this.f61040f = i13;
            int i14 = uC.f60988c;
            this.f61041g = i14;
            return i14 - i13;
        }

        public final void j(U u10) {
            this.f61037c = u10;
        }
    }

    /* JADX INFO: renamed from: tg.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C6683h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C6683h.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            AbstractC5504s.h(data, "data");
            C6683h.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a k0(C6683h c6683h, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC6680e.d();
        }
        return c6683h.h0(aVar);
    }

    public final byte D(long j10) {
        AbstractC6680e.b(size(), j10, 1L);
        U u10 = this.f61033a;
        if (u10 == null) {
            AbstractC5504s.e(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                u10 = u10.f60992g;
                AbstractC5504s.e(u10);
                size -= (long) (u10.f60988c - u10.f60987b);
            }
            AbstractC5504s.e(u10);
            return u10.f60986a[(int) ((((long) u10.f60987b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (u10.f60988c - u10.f60987b)) + j11;
            if (j12 > j10) {
                AbstractC5504s.e(u10);
                return u10.f60986a[(int) ((((long) u10.f60987b) + j10) - j11)];
            }
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            j11 = j12;
        }
    }

    @Override // tg.InterfaceC6685j
    public String D0() {
        return i0(Long.MAX_VALUE);
    }

    public long E(byte b10, long j10, long j11) {
        U u10;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (u10 = this.f61033a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                u10 = u10.f60992g;
                AbstractC5504s.e(u10);
                size -= (long) (u10.f60988c - u10.f60987b);
            }
            while (size < j11) {
                byte[] bArr = u10.f60986a;
                int iMin = (int) Math.min(u10.f60988c, (((long) u10.f60987b) + j11) - size);
                i10 = (int) ((((long) u10.f60987b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (u10.f60988c - u10.f60987b);
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (u10.f60988c - u10.f60987b)) + size;
            if (j12 > j10) {
                break;
            }
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = u10.f60986a;
            int iMin2 = (int) Math.min(u10.f60988c, (((long) u10.f60987b) + j11) - size);
            i10 = (int) ((((long) u10.f60987b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (u10.f60988c - u10.f60987b);
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - u10.f60987b)) + size;
    }

    public String F0(long j10, Charset charset) throws EOFException {
        AbstractC5504s.h(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f61034b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60987b;
        if (((long) i10) + j10 > u10.f60988c) {
            return new String(I0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(u10.f60986a, i10, i11, charset);
        int i12 = u10.f60987b + i11;
        u10.f60987b = i12;
        this.f61034b -= j10;
        if (i12 == u10.f60988c) {
            this.f61033a = u10.b();
            V.b(u10);
        }
        return str;
    }

    public final void G0(long j10) {
        this.f61034b = j10;
    }

    public long H(C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        return J(bytes, 0L);
    }

    @Override // tg.InterfaceC6685j
    public byte[] I0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public long J(C6686k bytes, long j10) {
        int i10;
        long j11 = j10;
        AbstractC5504s.h(bytes, "bytes");
        if (bytes.K() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        U u10 = this.f61033a;
        if (u10 == null) {
            return -1L;
        }
        if (size() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (u10.f60988c - u10.f60987b)) + size;
                if (j12 > j11) {
                    break;
                }
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                size = j12;
            }
            byte[] bArrY = bytes.y();
            byte b10 = bArrY[0];
            int iK = bytes.K();
            long size2 = (size() - ((long) iK)) + 1;
            while (size < size2) {
                byte[] bArr = u10.f60986a;
                int iMin = (int) Math.min(u10.f60988c, (((long) u10.f60987b) + size2) - size);
                i10 = (int) ((((long) u10.f60987b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] == b10 && AbstractC6775a.c(u10, i10 + 1, bArrY, 1, iK)) {
                    }
                    i10++;
                }
                size += (long) (u10.f60988c - u10.f60987b);
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                j11 = size;
            }
            return -1L;
        }
        size = size();
        while (size > j11) {
            u10 = u10.f60992g;
            AbstractC5504s.e(u10);
            size -= (long) (u10.f60988c - u10.f60987b);
        }
        byte[] bArrY2 = bytes.y();
        byte b11 = bArrY2[0];
        int iK2 = bytes.K();
        long size3 = (size() - ((long) iK2)) + 1;
        while (size < size3) {
            byte[] bArr2 = u10.f60986a;
            long j13 = size3;
            int iMin2 = (int) Math.min(u10.f60988c, (((long) u10.f60987b) + size3) - size);
            i10 = (int) ((((long) u10.f60987b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b11 || !AbstractC6775a.c(u10, i10 + 1, bArrY2, 1, iK2)) {
                    i10++;
                }
            }
            size += (long) (u10.f60988c - u10.f60987b);
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            j11 = size;
            size3 = j13;
        }
        return -1L;
        return ((long) (i10 - u10.f60987b)) + size;
    }

    @Override // tg.InterfaceC6685j
    public short J0() {
        return AbstractC6680e.j(readShort());
    }

    @Override // tg.InterfaceC6685j
    public int J1() {
        return AbstractC6680e.h(readInt());
    }

    @Override // tg.InterfaceC6685j
    public long K0() {
        return AbstractC6680e.i(readLong());
    }

    @Override // tg.InterfaceC6685j
    public InputStream L() {
        return new b();
    }

    public final C6686k M0() {
        if (size() <= 2147483647L) {
            return a1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // tg.InterfaceC6685j
    public String M1() {
        return F0(this.f61034b, C1271d.f3718b);
    }

    @Override // tg.InterfaceC6685j
    public int N(N options) throws EOFException {
        AbstractC5504s.h(options, "options");
        int iF = AbstractC6775a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(options.l()[iF].K());
        return iF;
    }

    @Override // tg.Z
    public long N0(C6683h sink, long j10) {
        AbstractC5504s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.t0(this, j10);
        return j10;
    }

    public long O(C6686k targetBytes) {
        AbstractC5504s.h(targetBytes, "targetBytes");
        return S(targetBytes, 0L);
    }

    @Override // tg.InterfaceC6684i
    public long O0(Z source) {
        AbstractC5504s.h(source, "source");
        long j10 = 0;
        while (true) {
            long jN0 = source.N0(this, 8192L);
            if (jN0 == -1) {
                return j10;
            }
            j10 += jN0;
        }
    }

    @Override // tg.InterfaceC6685j
    public boolean Q1(long j10, C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        return Y(j10, bytes, 0, bytes.K());
    }

    @Override // tg.InterfaceC6685j
    public void R0(long j10) throws EOFException {
        if (this.f61034b < j10) {
            throw new EOFException();
        }
    }

    public long S(C6686k targetBytes, long j10) {
        int i10;
        int i11;
        AbstractC5504s.h(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        U u10 = this.f61033a;
        if (u10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                u10 = u10.f60992g;
                AbstractC5504s.e(u10);
                size -= (long) (u10.f60988c - u10.f60987b);
            }
            if (targetBytes.K() == 2) {
                byte bM = targetBytes.m(0);
                byte bM2 = targetBytes.m(1);
                while (size < size()) {
                    byte[] bArr = u10.f60986a;
                    i10 = (int) ((((long) u10.f60987b) + j10) - size);
                    int i12 = u10.f60988c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bM || b10 == bM2) {
                            i11 = u10.f60987b;
                        } else {
                            i10++;
                        }
                    }
                    size += (long) (u10.f60988c - u10.f60987b);
                    u10 = u10.f60991f;
                    AbstractC5504s.e(u10);
                    j10 = size;
                }
            } else {
                byte[] bArrY = targetBytes.y();
                while (size < size()) {
                    byte[] bArr2 = u10.f60986a;
                    i10 = (int) ((((long) u10.f60987b) + j10) - size);
                    int i13 = u10.f60988c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrY) {
                            if (b11 == b12) {
                                i11 = u10.f60987b;
                            }
                        }
                        i10++;
                    }
                    size += (long) (u10.f60988c - u10.f60987b);
                    u10 = u10.f60991f;
                    AbstractC5504s.e(u10);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (u10.f60988c - u10.f60987b)) + size;
            if (j11 > j10) {
                break;
            }
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
            size = j11;
        }
        if (targetBytes.K() == 2) {
            byte bM3 = targetBytes.m(0);
            byte bM4 = targetBytes.m(1);
            while (size < size()) {
                byte[] bArr3 = u10.f60986a;
                i10 = (int) ((((long) u10.f60987b) + j10) - size);
                int i14 = u10.f60988c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bM3 || b13 == bM4) {
                        i11 = u10.f60987b;
                    } else {
                        i10++;
                    }
                }
                size += (long) (u10.f60988c - u10.f60987b);
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                j10 = size;
            }
        } else {
            byte[] bArrY2 = targetBytes.y();
            while (size < size()) {
                byte[] bArr4 = u10.f60986a;
                i10 = (int) ((((long) u10.f60987b) + j10) - size);
                int i15 = u10.f60988c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrY2) {
                        if (b14 == b15) {
                            i11 = u10.f60987b;
                        }
                    }
                    i10++;
                }
                size += (long) (u10.f60988c - u10.f60987b);
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                j10 = size;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public C6683h S1(Z source, long j10) throws EOFException {
        AbstractC5504s.h(source, "source");
        while (j10 > 0) {
            long jN0 = source.N0(this, j10);
            if (jN0 == -1) {
                throw new EOFException();
            }
            j10 -= jN0;
        }
        return this;
    }

    @Override // tg.InterfaceC6685j
    public long U(X sink) {
        AbstractC5504s.h(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.t0(this, size);
        }
        return size;
    }

    @Override // tg.InterfaceC6685j
    public String V0(long j10) throws EOFException {
        return F0(j10, C1271d.f3718b);
    }

    @Override // tg.InterfaceC6684i
    public OutputStream V1() {
        return new c();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a7 A[EDGE_INSN: B:92:0x00a7->B:86:0x00a7 BREAK  A[LOOP:0: B:54:0x000d->B:94:?], SYNTHETIC] */
    @Override // tg.InterfaceC6685j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long X1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            tg.U r6 = r14.f61033a
            kotlin.jvm.internal.AbstractC5504s.e(r6)
            byte[] r7 = r6.f60986a
            int r8 = r6.f60987b
            int r9 = r6.f60988c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            tg.h r0 = new tg.h
            r0.<init>()
            tg.h r0 = r0.z1(r4)
            tg.h r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.M1()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = tg.AbstractC6680e.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            tg.U r7 = r6.b()
            r14.f61033a = r7
            tg.V.b(r6)
            goto La1
        L9f:
            r6.f60987b = r8
        La1:
            if (r1 != 0) goto La7
            tg.U r6 = r14.f61033a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.G0(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C6683h.X1():long");
    }

    public boolean Y(long j10, C6686k bytes, int i10, int i11) {
        AbstractC5504s.h(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.K() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (D(((long) i12) + j10) != bytes.m(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // tg.InterfaceC6685j
    public C6686k Y0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C6686k(I0(j10));
        }
        C6686k c6686kA1 = a1((int) j10);
        skip(j10);
        return c6686kA1;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: Y1 */
    public C6683h write(byte[] source) {
        AbstractC5504s.h(source, "source");
        return write(source, 0, source.length);
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: Z1 */
    public C6683h write(byte[] source, int i10, int i11) {
        AbstractC5504s.h(source, "source");
        long j10 = i11;
        AbstractC6680e.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            U uQ1 = q1(1);
            int iMin = Math.min(i12 - i10, 8192 - uQ1.f60988c);
            int i13 = i10 + iMin;
            AbstractC2273n.h(source, uQ1.f60986a, uQ1.f60988c, i10, i13);
            uQ1.f60988c += iMin;
            i10 = i13;
        }
        G0(size() + j10);
        return this;
    }

    public final long a() {
        return this.f61034b;
    }

    public final C6686k a1(int i10) {
        if (i10 == 0) {
            return C6686k.f61045e;
        }
        AbstractC6680e.b(size(), 0L, i10);
        U u10 = this.f61033a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC5504s.e(u10);
            int i14 = u10.f60988c;
            int i15 = u10.f60987b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            u10 = u10.f60991f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        U u11 = this.f61033a;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC5504s.e(u11);
            bArr[i16] = u11.f60986a;
            i11 += u11.f60988c - u11.f60987b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = u11.f60987b;
            u11.f60989d = true;
            i16++;
            u11 = u11.f60991f;
        }
        return new W(bArr, iArr);
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: a2 */
    public C6683h writeByte(int i10) {
        U uQ1 = q1(1);
        byte[] bArr = uQ1.f60986a;
        int i11 = uQ1.f60988c;
        uQ1.f60988c = i11 + 1;
        bArr[i11] = (byte) i10;
        G0(size() + 1);
        return this;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: b2 */
    public C6683h S0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return s0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        U uQ1 = q1(i10);
        byte[] bArr = uQ1.f60986a;
        int i11 = uQ1.f60988c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = AbstractC6775a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        uQ1.f60988c += i10;
        G0(size() + ((long) i10));
        return this;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: c2 */
    public C6683h z1(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        U uQ1 = q1(i10);
        byte[] bArr = uQ1.f60986a;
        int i11 = uQ1.f60988c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = AbstractC6775a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        uQ1.f60988c += i10;
        G0(size() + ((long) i10));
        return this;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: d2 */
    public C6683h writeInt(int i10) {
        U uQ1 = q1(4);
        byte[] bArr = uQ1.f60986a;
        int i11 = uQ1.f60988c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        uQ1.f60988c = i11 + 4;
        G0(size() + 4);
        return this;
    }

    @Override // tg.InterfaceC6685j
    public byte[] e1() {
        return I0(size());
    }

    public C6683h e2(long j10) {
        U uQ1 = q1(8);
        byte[] bArr = uQ1.f60986a;
        int i10 = uQ1.f60988c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        uQ1.f60988c = i10 + 8;
        G0(size() + 8);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6683h)) {
            return false;
        }
        C6683h c6683h = (C6683h) obj;
        if (size() != c6683h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        U u11 = c6683h.f61033a;
        AbstractC5504s.e(u11);
        int i10 = u10.f60987b;
        int i11 = u11.f60987b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(u10.f60988c - i10, u11.f60988c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (u10.f60986a[i10] != u11.f60986a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == u10.f60988c) {
                u10 = u10.f60991f;
                AbstractC5504s.e(u10);
                i10 = u10.f60987b;
            }
            if (i11 == u11.f60988c) {
                u11 = u11.f60991f;
                AbstractC5504s.e(u11);
                i11 = u11.f60987b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // tg.InterfaceC6685j
    public void f0(C6683h sink, long j10) throws EOFException {
        AbstractC5504s.h(sink, "sink");
        if (size() >= j10) {
            sink.t0(this, j10);
        } else {
            sink.t0(this, size());
            throw new EOFException();
        }
    }

    @Override // tg.InterfaceC6685j
    public boolean f1() {
        return this.f61034b == 0;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: f2 */
    public C6683h writeShort(int i10) {
        U uQ1 = q1(2);
        byte[] bArr = uQ1.f60986a;
        int i11 = uQ1.f60988c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        uQ1.f60988c = i11 + 2;
        G0(size() + 2);
        return this;
    }

    public final void g() throws EOFException {
        skip(size());
    }

    public C6683h g2(String string, int i10, int i11, Charset charset) {
        AbstractC5504s.h(string, "string");
        AbstractC5504s.h(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (AbstractC5504s.c(charset, C1271d.f3718b)) {
            return j2(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC5504s.g(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: h */
    public C6683h clone() {
        return k();
    }

    public final a h0(a unsafeCursor) {
        AbstractC5504s.h(unsafeCursor, "unsafeCursor");
        return AbstractC6775a.a(this, unsafeCursor);
    }

    public C6683h h2(String string, Charset charset) {
        AbstractC5504s.h(string, "string");
        AbstractC5504s.h(charset, "charset");
        return g2(string, 0, string.length(), charset);
    }

    public int hashCode() {
        U u10 = this.f61033a;
        if (u10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = u10.f60988c;
            for (int i12 = u10.f60987b; i12 < i11; i12++) {
                i10 = (i10 * 31) + u10.f60986a[i12];
            }
            u10 = u10.f60991f;
            AbstractC5504s.e(u10);
        } while (u10 != this.f61033a);
        return i10;
    }

    @Override // tg.InterfaceC6685j
    public String i0(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jE = E((byte) 10, 0L, j11);
        if (jE != -1) {
            return AbstractC6775a.d(this, jE);
        }
        if (j11 < size() && D(j11 - 1) == 13 && D(j11) == 10) {
            return AbstractC6775a.d(this, j11);
        }
        C6683h c6683h = new C6683h();
        m(c6683h, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c6683h.p0().u() + (char) 8230);
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: i2 */
    public C6683h s0(String string) {
        AbstractC5504s.h(string, "string");
        return j2(string, 0, string.length());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        U u11 = u10.f60992g;
        AbstractC5504s.e(u11);
        int i10 = u11.f60988c;
        return (i10 >= 8192 || !u11.f60990e) ? size : size - ((long) (i10 - u11.f60987b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0045, code lost:
    
        r1 = new tg.C6683h().S0(r8).writeByte(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0052, code lost:
    
        if (r2 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.M1());
     */
    @Override // tg.InterfaceC6685j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j1() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C6683h.j1():long");
    }

    public C6683h j2(String string, int i10, int i11) {
        char cCharAt;
        AbstractC5504s.h(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                U uQ1 = q1(1);
                byte[] bArr = uQ1.f60986a;
                int i12 = uQ1.f60988c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = uQ1.f60988c;
                int i15 = (i12 + i10) - i14;
                uQ1.f60988c = i14 + i15;
                G0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    U uQ12 = q1(2);
                    byte[] bArr2 = uQ12.f60986a;
                    int i16 = uQ12.f60988c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | JfifUtil.MARKER_SOFn);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    uQ12.f60988c = i16 + 2;
                    G0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    U uQ13 = q1(3);
                    byte[] bArr3 = uQ13.f60986a;
                    int i17 = uQ13.f60988c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    uQ13.f60988c = i17 + 3;
                    G0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        U uQ14 = q1(4);
                        byte[] bArr4 = uQ14.f60986a;
                        int i20 = uQ14.f60988c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        uQ14.f60988c = i20 + 4;
                        G0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public final C6683h k() {
        C6683h c6683h = new C6683h();
        if (size() == 0) {
            return c6683h;
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        U uD = u10.d();
        c6683h.f61033a = uD;
        uD.f60992g = uD;
        uD.f60991f = uD;
        for (U u11 = u10.f60991f; u11 != u10; u11 = u11.f60991f) {
            U u12 = uD.f60992g;
            AbstractC5504s.e(u12);
            AbstractC5504s.e(u11);
            u12.c(u11.d());
        }
        c6683h.G0(size());
        return c6683h;
    }

    public C6683h k2(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            U uQ1 = q1(2);
            byte[] bArr = uQ1.f60986a;
            int i11 = uQ1.f60988c;
            bArr[i11] = (byte) ((i10 >> 6) | JfifUtil.MARKER_SOFn);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            uQ1.f60988c = i11 + 2;
            G0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            U uQ12 = q1(3);
            byte[] bArr2 = uQ12.f60986a;
            int i12 = uQ12.f60988c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            uQ12.f60988c = i12 + 3;
            G0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC6680e.l(i10));
        }
        U uQ13 = q1(4);
        byte[] bArr3 = uQ13.f60986a;
        int i13 = uQ13.f60988c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        uQ13.f60988c = i13 + 4;
        G0(size() + 4);
        return this;
    }

    public final C6683h m(C6683h out, long j10, long j11) {
        AbstractC5504s.h(out, "out");
        long j12 = j10;
        AbstractC6680e.b(size(), j12, j11);
        if (j11 != 0) {
            out.G0(out.size() + j11);
            U u10 = this.f61033a;
            while (true) {
                AbstractC5504s.e(u10);
                int i10 = u10.f60988c;
                int i11 = u10.f60987b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                u10 = u10.f60991f;
            }
            U u11 = u10;
            long j13 = j11;
            while (j13 > 0) {
                AbstractC5504s.e(u11);
                U uD = u11.d();
                int i12 = uD.f60987b + ((int) j12);
                uD.f60987b = i12;
                uD.f60988c = Math.min(i12 + ((int) j13), uD.f60988c);
                U u12 = out.f61033a;
                if (u12 == null) {
                    uD.f60992g = uD;
                    uD.f60991f = uD;
                    out.f61033a = uD;
                } else {
                    AbstractC5504s.e(u12);
                    U u13 = u12.f60992g;
                    AbstractC5504s.e(u13);
                    u13.c(uD);
                }
                j13 -= (long) (uD.f60988c - uD.f60987b);
                u11 = u11.f60991f;
                j12 = 0;
            }
        }
        return this;
    }

    public C6686k p0() {
        return Y0(size());
    }

    @Override // tg.InterfaceC6685j
    public InterfaceC6685j peek() {
        return K.d(new Q(this));
    }

    public final U q1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        U u10 = this.f61033a;
        if (u10 != null) {
            AbstractC5504s.e(u10);
            U u11 = u10.f60992g;
            AbstractC5504s.e(u11);
            return (u11.f60988c + i10 > 8192 || !u11.f60990e) ? u11.c(V.c()) : u11;
        }
        U uC = V.c();
        this.f61033a = uC;
        uC.f60992g = uC;
        uC.f60991f = uC;
        return uC;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC5504s.h(sink, "sink");
        U u10 = this.f61033a;
        if (u10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), u10.f60988c - u10.f60987b);
        sink.put(u10.f60986a, u10.f60987b, iMin);
        int i10 = u10.f60987b + iMin;
        u10.f60987b = i10;
        this.f61034b -= (long) iMin;
        if (i10 == u10.f60988c) {
            this.f61033a = u10.b();
            V.b(u10);
        }
        return iMin;
    }

    @Override // tg.InterfaceC6685j
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60987b;
        int i11 = u10.f60988c;
        int i12 = i10 + 1;
        byte b10 = u10.f60986a[i10];
        G0(size() - 1);
        if (i12 != i11) {
            u10.f60987b = i12;
            return b10;
        }
        this.f61033a = u10.b();
        V.b(u10);
        return b10;
    }

    @Override // tg.InterfaceC6685j
    public void readFully(byte[] sink) throws EOFException {
        AbstractC5504s.h(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // tg.InterfaceC6685j
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60987b;
        int i11 = u10.f60988c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = u10.f60986a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        G0(size() - 4);
        if (i14 != i11) {
            u10.f60987b = i14;
            return i15;
        }
        this.f61033a = u10.b();
        V.b(u10);
        return i15;
    }

    @Override // tg.InterfaceC6685j
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60987b;
        int i11 = u10.f60988c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = u10.f60986a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        G0(size() - 8);
        if (i13 != i11) {
            u10.f60987b = i13;
            return j11;
        }
        this.f61033a = u10.b();
        V.b(u10);
        return j11;
    }

    @Override // tg.InterfaceC6685j
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        U u10 = this.f61033a;
        AbstractC5504s.e(u10);
        int i10 = u10.f60987b;
        int i11 = u10.f60988c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = u10.f60986a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        G0(size() - 2);
        if (i14 == i11) {
            this.f61033a = u10.b();
            V.b(u10);
        } else {
            u10.f60987b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f61034b;
    }

    @Override // tg.InterfaceC6685j
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            U u10 = this.f61033a;
            if (u10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, u10.f60988c - u10.f60987b);
            long j11 = iMin;
            G0(size() - j11);
            j10 -= j11;
            int i10 = u10.f60987b + iMin;
            u10.f60987b = i10;
            if (i10 == u10.f60988c) {
                this.f61033a = u10.b();
                V.b(u10);
            }
        }
    }

    @Override // tg.Z
    public a0 t() {
        return a0.f61004e;
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) {
        U u10;
        AbstractC5504s.h(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC6680e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            U u11 = source.f61033a;
            AbstractC5504s.e(u11);
            int i10 = u11.f60988c;
            AbstractC5504s.e(source.f61033a);
            if (j10 < i10 - r1.f60987b) {
                U u12 = this.f61033a;
                if (u12 != null) {
                    AbstractC5504s.e(u12);
                    u10 = u12.f60992g;
                } else {
                    u10 = null;
                }
                if (u10 != null && u10.f60990e) {
                    if ((((long) u10.f60988c) + j10) - ((long) (u10.f60989d ? 0 : u10.f60987b)) <= 8192) {
                        U u13 = source.f61033a;
                        AbstractC5504s.e(u13);
                        u13.g(u10, (int) j10);
                        source.G0(source.size() - j10);
                        G0(size() + j10);
                        return;
                    }
                }
                U u14 = source.f61033a;
                AbstractC5504s.e(u14);
                source.f61033a = u14.e((int) j10);
            }
            U u15 = source.f61033a;
            AbstractC5504s.e(u15);
            long j11 = u15.f60988c - u15.f60987b;
            source.f61033a = u15.b();
            U u16 = this.f61033a;
            if (u16 == null) {
                this.f61033a = u15;
                u15.f60992g = u15;
                u15.f60991f = u15;
            } else {
                AbstractC5504s.e(u16);
                U u17 = u16.f60992g;
                AbstractC5504s.e(u17);
                u17.c(u15).a();
            }
            source.G0(source.size() - j11);
            G0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: t1 */
    public C6683h A0(C6686k byteString) {
        AbstractC5504s.h(byteString, "byteString");
        byteString.R(this, 0, byteString.K());
        return this;
    }

    public String toString() {
        return M0().toString();
    }

    @Override // tg.InterfaceC6685j
    public String w1(Charset charset) {
        AbstractC5504s.h(charset, "charset");
        return F0(this.f61034b, charset);
    }

    @Override // tg.InterfaceC6685j
    public boolean y0(long j10) {
        return this.f61034b >= j10;
    }

    /* JADX INFO: renamed from: tg.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C6683h.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C6683h.this.size() > 0) {
                return C6683h.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C6683h.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            AbstractC5504s.h(sink, "sink");
            return C6683h.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC5504s.h(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            U uQ1 = q1(1);
            int iMin = Math.min(i10, 8192 - uQ1.f60988c);
            source.get(uQ1.f60986a, uQ1.f60988c, iMin);
            i10 -= iMin;
            uQ1.f60988c += iMin;
        }
        this.f61034b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        AbstractC5504s.h(sink, "sink");
        AbstractC6680e.b(sink.length, i10, i11);
        U u10 = this.f61033a;
        if (u10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, u10.f60988c - u10.f60987b);
        byte[] bArr = u10.f60986a;
        int i12 = u10.f60987b;
        AbstractC2273n.h(bArr, sink, i10, i12, i12 + iMin);
        u10.f60987b += iMin;
        G0(size() - ((long) iMin));
        if (u10.f60987b == u10.f60988c) {
            this.f61033a = u10.b();
            V.b(u10);
        }
        return iMin;
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: C */
    public C6683h g0() {
        return this;
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // tg.InterfaceC6684i, tg.X, java.io.Flushable
    public void flush() {
    }

    @Override // tg.InterfaceC6684i
    /* JADX INFO: renamed from: q */
    public C6683h V() {
        return this;
    }

    @Override // tg.InterfaceC6685j
    public C6683h s() {
        return this;
    }
}

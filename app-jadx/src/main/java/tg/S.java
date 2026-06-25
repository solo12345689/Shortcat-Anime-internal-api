package tg;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class S implements InterfaceC6684i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f60977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6683h f60978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60979c;

    public S(X sink) {
        AbstractC5504s.h(sink, "sink");
        this.f60977a = sink;
        this.f60978b = new C6683h();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i A0(C6686k byteString) {
        AbstractC5504s.h(byteString, "byteString");
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.A0(byteString);
        return g0();
    }

    @Override // tg.InterfaceC6684i
    public long O0(Z source) {
        AbstractC5504s.h(source, "source");
        long j10 = 0;
        while (true) {
            long jN0 = source.N0(this.f60978b, 8192L);
            if (jN0 == -1) {
                return j10;
            }
            j10 += jN0;
            g0();
        }
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i S0(long j10) {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.S0(j10);
        return g0();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i V() {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f60978b.size();
        if (size > 0) {
            this.f60977a.t0(this.f60978b, size);
        }
        return this;
    }

    @Override // tg.InterfaceC6684i
    public OutputStream V1() {
        return new a();
    }

    @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f60979c) {
            return;
        }
        try {
            if (this.f60978b.size() > 0) {
                X x10 = this.f60977a;
                C6683h c6683h = this.f60978b;
                x10.t0(c6683h, c6683h.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f60977a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f60979c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // tg.InterfaceC6684i, tg.X, java.io.Flushable
    public void flush() {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        if (this.f60978b.size() > 0) {
            X x10 = this.f60977a;
            C6683h c6683h = this.f60978b;
            x10.t0(c6683h, c6683h.size());
        }
        this.f60977a.flush();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i g0() {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f60978b.j();
        if (j10 > 0) {
            this.f60977a.t0(this.f60978b, j10);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f60979c;
    }

    @Override // tg.InterfaceC6684i
    public C6683h s() {
        return this.f60978b;
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i s0(String string) {
        AbstractC5504s.h(string, "string");
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.s0(string);
        return g0();
    }

    @Override // tg.X
    public a0 t() {
        return this.f60977a.t();
    }

    @Override // tg.X
    public void t0(C6683h source, long j10) {
        AbstractC5504s.h(source, "source");
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.t0(source, j10);
        g0();
    }

    public String toString() {
        return "buffer(" + this.f60977a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC5504s.h(source, "source");
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f60978b.write(source);
        g0();
        return iWrite;
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i writeByte(int i10) {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.writeByte(i10);
        return g0();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i writeInt(int i10) {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.writeInt(i10);
        return g0();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i writeShort(int i10) {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.writeShort(i10);
        return g0();
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i z1(long j10) {
        if (this.f60979c) {
            throw new IllegalStateException("closed");
        }
        this.f60978b.z1(j10);
        return g0();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            S.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            S s10 = S.this;
            if (s10.f60979c) {
                return;
            }
            s10.flush();
        }

        public String toString() {
            return S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            S s10 = S.this;
            if (s10.f60979c) {
                throw new IOException("closed");
            }
            s10.f60978b.writeByte((byte) i10);
            S.this.g0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            AbstractC5504s.h(data, "data");
            S s10 = S.this;
            if (!s10.f60979c) {
                s10.f60978b.write(data, i10, i11);
                S.this.g0();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i write(byte[] source) {
        AbstractC5504s.h(source, "source");
        if (!this.f60979c) {
            this.f60978b.write(source);
            return g0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // tg.InterfaceC6684i
    public InterfaceC6684i write(byte[] source, int i10, int i11) {
        AbstractC5504s.h(source, "source");
        if (!this.f60979c) {
            this.f60978b.write(source, i10, i11);
            return g0();
        }
        throw new IllegalStateException("closed");
    }
}

package sg;

import fg.AbstractC4807e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6685j f59790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f59791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f59793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f59795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f59796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6683h f59800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C6683h f59801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C6532c f59802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f59803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6683h.a f59804p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(String str);

        void c(C6686k c6686k);

        void d(C6686k c6686k);

        void f(C6686k c6686k);

        void g(int i10, String str);
    }

    public g(boolean z10, InterfaceC6685j source, a frameCallback, boolean z11, boolean z12) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(frameCallback, "frameCallback");
        this.f59789a = z10;
        this.f59790b = source;
        this.f59791c = frameCallback;
        this.f59792d = z11;
        this.f59793e = z12;
        this.f59800l = new C6683h();
        this.f59801m = new C6683h();
        this.f59803o = z10 ? null : new byte[4];
        this.f59804p = z10 ? null : new C6683h.a();
    }

    private final void b() throws ProtocolException, EOFException {
        short s10;
        String strM1;
        long j10 = this.f59796h;
        if (j10 > 0) {
            this.f59790b.f0(this.f59800l, j10);
            if (!this.f59789a) {
                C6683h c6683h = this.f59800l;
                C6683h.a aVar = this.f59804p;
                AbstractC5504s.e(aVar);
                c6683h.h0(aVar);
                this.f59804p.h(0L);
                f fVar = f.f59788a;
                C6683h.a aVar2 = this.f59804p;
                byte[] bArr = this.f59803o;
                AbstractC5504s.e(bArr);
                fVar.b(aVar2, bArr);
                this.f59804p.close();
            }
        }
        switch (this.f59795g) {
            case 8:
                long size = this.f59800l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f59800l.readShort();
                    strM1 = this.f59800l.M1();
                    String strA = f.f59788a.a(s10);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s10 = 1005;
                    strM1 = "";
                }
                this.f59791c.g(s10, strM1);
                this.f59794f = true;
                return;
            case 9:
                this.f59791c.f(this.f59800l.p0());
                return;
            case 10:
                this.f59791c.c(this.f59800l.p0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + AbstractC4807e.R(this.f59795g));
        }
    }

    private final void g() throws IOException {
        boolean z10;
        if (this.f59794f) {
            throw new IOException("closed");
        }
        long jH = this.f59790b.t().h();
        this.f59790b.t().b();
        try {
            int iD = AbstractC4807e.d(this.f59790b.readByte(), 255);
            this.f59790b.t().g(jH, TimeUnit.NANOSECONDS);
            int i10 = iD & 15;
            this.f59795g = i10;
            boolean z11 = (iD & 128) != 0;
            this.f59797i = z11;
            boolean z12 = (iD & 8) != 0;
            this.f59798j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iD & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f59792d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f59799k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = AbstractC4807e.d(this.f59790b.readByte(), 255);
            boolean z14 = (iD2 & 128) != 0;
            if (z14 == this.f59789a) {
                throw new ProtocolException(this.f59789a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iD2 & 127;
            this.f59796h = j10;
            if (j10 == 126) {
                this.f59796h = AbstractC4807e.e(this.f59790b.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.f59790b.readLong();
                this.f59796h = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + AbstractC4807e.S(this.f59796h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f59798j && this.f59796h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                InterfaceC6685j interfaceC6685j = this.f59790b;
                byte[] bArr = this.f59803o;
                AbstractC5504s.e(bArr);
                interfaceC6685j.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.f59790b.t().g(jH, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    private final void h() throws IOException {
        while (!this.f59794f) {
            long j10 = this.f59796h;
            if (j10 > 0) {
                this.f59790b.f0(this.f59801m, j10);
                if (!this.f59789a) {
                    C6683h c6683h = this.f59801m;
                    C6683h.a aVar = this.f59804p;
                    AbstractC5504s.e(aVar);
                    c6683h.h0(aVar);
                    this.f59804p.h(this.f59801m.size() - this.f59796h);
                    f fVar = f.f59788a;
                    C6683h.a aVar2 = this.f59804p;
                    byte[] bArr = this.f59803o;
                    AbstractC5504s.e(bArr);
                    fVar.b(aVar2, bArr);
                    this.f59804p.close();
                }
            }
            if (this.f59797i) {
                return;
            }
            k();
            if (this.f59795g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + AbstractC4807e.R(this.f59795g));
            }
        }
        throw new IOException("closed");
    }

    private final void j() throws IOException {
        int i10 = this.f59795g;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + AbstractC4807e.R(i10));
        }
        h();
        if (this.f59799k) {
            C6532c c6532c = this.f59802n;
            if (c6532c == null) {
                c6532c = new C6532c(this.f59793e);
                this.f59802n = c6532c;
            }
            c6532c.a(this.f59801m);
        }
        if (i10 == 1) {
            this.f59791c.a(this.f59801m.M1());
        } else {
            this.f59791c.d(this.f59801m.p0());
        }
    }

    private final void k() throws IOException {
        while (!this.f59794f) {
            g();
            if (!this.f59798j) {
                return;
            } else {
                b();
            }
        }
    }

    public final void a() throws IOException {
        g();
        if (this.f59798j) {
            b();
        } else {
            j();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6532c c6532c = this.f59802n;
        if (c6532c != null) {
            c6532c.close();
        }
    }
}

package sg;

import com.facebook.imageutils.JfifUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6684i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6684i f59806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f59807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f59809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f59810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6683h f59811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6683h f59812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6530a f59814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f59815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6683h.a f59816l;

    public h(boolean z10, InterfaceC6684i sink, Random random, boolean z11, boolean z12, long j10) {
        AbstractC5504s.h(sink, "sink");
        AbstractC5504s.h(random, "random");
        this.f59805a = z10;
        this.f59806b = sink;
        this.f59807c = random;
        this.f59808d = z11;
        this.f59809e = z12;
        this.f59810f = j10;
        this.f59811g = new C6683h();
        this.f59812h = sink.s();
        this.f59815k = z10 ? new byte[4] : null;
        this.f59816l = z10 ? new C6683h.a() : null;
    }

    private final void b(int i10, C6686k c6686k) throws IOException {
        if (this.f59813i) {
            throw new IOException("closed");
        }
        int iK = c6686k.K();
        if (iK > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f59812h.writeByte(i10 | 128);
        if (this.f59805a) {
            this.f59812h.writeByte(iK | 128);
            Random random = this.f59807c;
            byte[] bArr = this.f59815k;
            AbstractC5504s.e(bArr);
            random.nextBytes(bArr);
            this.f59812h.write(this.f59815k);
            if (iK > 0) {
                long size = this.f59812h.size();
                this.f59812h.A0(c6686k);
                C6683h c6683h = this.f59812h;
                C6683h.a aVar = this.f59816l;
                AbstractC5504s.e(aVar);
                c6683h.h0(aVar);
                this.f59816l.h(size);
                f.f59788a.b(this.f59816l, this.f59815k);
                this.f59816l.close();
            }
        } else {
            this.f59812h.writeByte(iK);
            this.f59812h.A0(c6686k);
        }
        this.f59806b.flush();
    }

    public final void a(int i10, C6686k c6686k) {
        C6686k c6686kP0 = C6686k.f61045e;
        if (i10 != 0 || c6686k != null) {
            if (i10 != 0) {
                f.f59788a.c(i10);
            }
            C6683h c6683h = new C6683h();
            c6683h.writeShort(i10);
            if (c6686k != null) {
                c6683h.A0(c6686k);
            }
            c6686kP0 = c6683h.p0();
        }
        try {
            b(8, c6686kP0);
        } finally {
            this.f59813i = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        C6530a c6530a = this.f59814j;
        if (c6530a != null) {
            c6530a.close();
        }
    }

    public final void g(int i10, C6686k data) throws IOException {
        AbstractC5504s.h(data, "data");
        if (this.f59813i) {
            throw new IOException("closed");
        }
        this.f59811g.A0(data);
        int i11 = i10 | 128;
        if (this.f59808d && data.K() >= this.f59810f) {
            C6530a c6530a = this.f59814j;
            if (c6530a == null) {
                c6530a = new C6530a(this.f59809e);
                this.f59814j = c6530a;
            }
            c6530a.a(this.f59811g);
            i11 = i10 | JfifUtil.MARKER_SOFn;
        }
        long size = this.f59811g.size();
        this.f59812h.writeByte(i11);
        int i12 = this.f59805a ? 128 : 0;
        if (size <= 125) {
            this.f59812h.writeByte(i12 | ((int) size));
        } else if (size <= 65535) {
            this.f59812h.writeByte(i12 | 126);
            this.f59812h.writeShort((int) size);
        } else {
            this.f59812h.writeByte(i12 | 127);
            this.f59812h.e2(size);
        }
        if (this.f59805a) {
            Random random = this.f59807c;
            byte[] bArr = this.f59815k;
            AbstractC5504s.e(bArr);
            random.nextBytes(bArr);
            this.f59812h.write(this.f59815k);
            if (size > 0) {
                C6683h c6683h = this.f59811g;
                C6683h.a aVar = this.f59816l;
                AbstractC5504s.e(aVar);
                c6683h.h0(aVar);
                this.f59816l.h(0L);
                f.f59788a.b(this.f59816l, this.f59815k);
                this.f59816l.close();
            }
        }
        this.f59812h.t0(this.f59811g, size);
        this.f59806b.V();
    }

    public final void h(C6686k payload) throws IOException {
        AbstractC5504s.h(payload, "payload");
        b(9, payload);
    }

    public final void j(C6686k payload) throws IOException {
        AbstractC5504s.h(payload, "payload");
        b(10, payload);
    }
}

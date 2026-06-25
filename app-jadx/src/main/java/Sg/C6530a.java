package sg;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;
import tg.C6687l;
import tg.X;

/* JADX INFO: renamed from: sg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6530a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6683h f59732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deflater f59733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6687l f59734d;

    public C6530a(boolean z10) {
        this.f59731a = z10;
        C6683h c6683h = new C6683h();
        this.f59732b = c6683h;
        Deflater deflater = new Deflater(-1, true);
        this.f59733c = deflater;
        this.f59734d = new C6687l((X) c6683h, deflater);
    }

    private final boolean b(C6683h c6683h, C6686k c6686k) {
        return c6683h.Q1(c6683h.size() - ((long) c6686k.K()), c6686k);
    }

    public final void a(C6683h buffer) throws IOException {
        AbstractC5504s.h(buffer, "buffer");
        if (this.f59732b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f59731a) {
            this.f59733c.reset();
        }
        this.f59734d.t0(buffer, buffer.size());
        this.f59734d.flush();
        if (b(this.f59732b, AbstractC6531b.f59735a)) {
            long size = this.f59732b.size() - ((long) 4);
            C6683h.a aVarK0 = C6683h.k0(this.f59732b, null, 1, null);
            try {
                aVarK0.g(size);
                fe.c.a(aVarK0, null);
            } finally {
            }
        } else {
            this.f59732b.writeByte(0);
        }
        C6683h c6683h = this.f59732b;
        buffer.t0(c6683h, c6683h.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f59734d.close();
    }
}

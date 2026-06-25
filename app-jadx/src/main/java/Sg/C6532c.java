package sg;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6695u;
import tg.Z;

/* JADX INFO: renamed from: sg.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6532c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6683h f59737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f59738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6695u f59739d;

    public C6532c(boolean z10) {
        this.f59736a = z10;
        C6683h c6683h = new C6683h();
        this.f59737b = c6683h;
        Inflater inflater = new Inflater(true);
        this.f59738c = inflater;
        this.f59739d = new C6695u((Z) c6683h, inflater);
    }

    public final void a(C6683h buffer) throws IOException {
        AbstractC5504s.h(buffer, "buffer");
        if (this.f59737b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f59736a) {
            this.f59738c.reset();
        }
        this.f59737b.O0(buffer);
        this.f59737b.writeInt(65535);
        long bytesRead = this.f59738c.getBytesRead() + this.f59737b.size();
        do {
            this.f59739d.a(buffer, Long.MAX_VALUE);
        } while (this.f59738c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f59739d.close();
    }
}

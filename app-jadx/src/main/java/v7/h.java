package v7;

import dg.D;
import dg.x;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6678c;
import tg.InterfaceC6684i;
import tg.X;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f61991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f61992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f61993d;

    public h(D requestBody, g progressListener) {
        AbstractC5504s.h(requestBody, "requestBody");
        AbstractC5504s.h(progressListener, "progressListener");
        this.f61991b = requestBody;
        this.f61992c = progressListener;
    }

    private final X i(InterfaceC6684i interfaceC6684i) {
        return AbstractC6678c.a().d(new a(interfaceC6684i.V1()));
    }

    @Override // dg.D
    public long a() {
        if (this.f61993d == 0) {
            this.f61993d = this.f61991b.a();
        }
        return this.f61993d;
    }

    @Override // dg.D
    public x b() {
        return this.f61991b.b();
    }

    @Override // dg.D
    public void f(InterfaceC6684i sink) {
        AbstractC5504s.h(sink, "sink");
        InterfaceC6684i interfaceC6684iA = AbstractC6678c.a().a(i(sink));
        a();
        this.f61991b.f(interfaceC6684iA);
        interfaceC6684iA.flush();
    }

    public final String h() {
        return "[Preview unavailable]";
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f61994a;

        a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void a() {
            long j10 = this.f61994a;
            long jA = h.this.a();
            h.this.f61992c.a(j10, jA, j10 == jA);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            AbstractC5504s.h(data, "data");
            super.write(data, i10, i11);
            this.f61994a += (long) i11;
            a();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            super.write(i10);
            this.f61994a++;
            a();
        }
    }
}

package x4;

import java.io.Closeable;
import tg.AbstractC6690o;
import tg.InterfaceC6685j;
import tg.K;
import tg.P;
import x4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f63914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6690o f63915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f63916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Closeable f63917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p.a f63918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC6685j f63920g;

    public o(P p10, AbstractC6690o abstractC6690o, String str, Closeable closeable, p.a aVar) {
        super(null);
        this.f63914a = p10;
        this.f63915b = abstractC6690o;
        this.f63916c = str;
        this.f63917d = closeable;
        this.f63918e = aVar;
    }

    private final void g() {
        if (this.f63919f) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // x4.p
    public p.a a() {
        return this.f63918e;
    }

    @Override // x4.p
    public synchronized InterfaceC6685j b() {
        g();
        InterfaceC6685j interfaceC6685j = this.f63920g;
        if (interfaceC6685j != null) {
            return interfaceC6685j;
        }
        InterfaceC6685j interfaceC6685jD = K.d(j().q(this.f63914a));
        this.f63920g = interfaceC6685jD;
        return interfaceC6685jD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f63919f = true;
            InterfaceC6685j interfaceC6685j = this.f63920g;
            if (interfaceC6685j != null) {
                L4.j.d(interfaceC6685j);
            }
            Closeable closeable = this.f63917d;
            if (closeable != null) {
                L4.j.d(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String h() {
        return this.f63916c;
    }

    public AbstractC6690o j() {
        return this.f63915b;
    }
}

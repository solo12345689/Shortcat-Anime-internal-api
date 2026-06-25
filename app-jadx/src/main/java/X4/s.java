package x4;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6690o;
import tg.InterfaceC6685j;
import tg.K;
import tg.P;
import x4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.a f63926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC6685j f63928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5082a f63929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private P f63930e;

    public s(InterfaceC6685j interfaceC6685j, InterfaceC5082a interfaceC5082a, p.a aVar) {
        super(null);
        this.f63926a = aVar;
        this.f63928c = interfaceC6685j;
        this.f63929d = interfaceC5082a;
    }

    private final void g() {
        if (this.f63927b) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // x4.p
    public p.a a() {
        return this.f63926a;
    }

    @Override // x4.p
    public synchronized InterfaceC6685j b() {
        g();
        InterfaceC6685j interfaceC6685j = this.f63928c;
        if (interfaceC6685j != null) {
            return interfaceC6685j;
        }
        AbstractC6690o abstractC6690oH = h();
        P p10 = this.f63930e;
        AbstractC5504s.e(p10);
        InterfaceC6685j interfaceC6685jD = K.d(abstractC6690oH.q(p10));
        this.f63928c = interfaceC6685jD;
        return interfaceC6685jD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f63927b = true;
            InterfaceC6685j interfaceC6685j = this.f63928c;
            if (interfaceC6685j != null) {
                L4.j.d(interfaceC6685j);
            }
            P p10 = this.f63930e;
            if (p10 != null) {
                h().h(p10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public AbstractC6690o h() {
        return AbstractC6690o.f61068b;
    }
}

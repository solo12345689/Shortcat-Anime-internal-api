package z8;

import javax.inject.Provider;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f65962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f65963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f65964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f65965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f65966e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f65962a = provider;
        this.f65963b = provider2;
        this.f65964c = provider3;
        this.f65965d = provider4;
        this.f65966e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(B8.a aVar, B8.a aVar2, Object obj, Object obj2, Provider provider) {
        return new M(aVar, aVar2, (AbstractC7328e) obj, (U) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((B8.a) this.f65962a.get(), (B8.a) this.f65963b.get(), this.f65964c.get(), this.f65965d.get(), this.f65966e);
    }
}

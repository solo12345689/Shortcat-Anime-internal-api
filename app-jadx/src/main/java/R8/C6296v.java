package r8;

import javax.inject.Provider;
import t8.InterfaceC6651b;
import x8.InterfaceC7065e;

/* JADX INFO: renamed from: r8.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6296v implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f58718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f58719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f58720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f58721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f58722e;

    public C6296v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f58718a = provider;
        this.f58719b = provider2;
        this.f58720c = provider3;
        this.f58721d = provider4;
        this.f58722e = provider5;
    }

    public static C6296v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C6296v(provider, provider2, provider3, provider4, provider5);
    }

    public static C6294t c(B8.a aVar, B8.a aVar2, InterfaceC7065e interfaceC7065e, y8.r rVar, y8.v vVar) {
        return new C6294t(aVar, aVar2, interfaceC7065e, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6294t get() {
        return c((B8.a) this.f58718a.get(), (B8.a) this.f58719b.get(), (InterfaceC7065e) this.f58720c.get(), (y8.r) this.f58721d.get(), (y8.v) this.f58722e.get());
    }
}

package x8;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import t8.InterfaceC6651b;
import y8.x;
import z8.InterfaceC7327d;

/* JADX INFO: renamed from: x8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7064d implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f64060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f64061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f64062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f64063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f64064e;

    public C7064d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f64060a = provider;
        this.f64061b = provider2;
        this.f64062c = provider3;
        this.f64063d = provider4;
        this.f64064e = provider5;
    }

    public static C7064d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C7064d(provider, provider2, provider3, provider4, provider5);
    }

    public static C7063c c(Executor executor, s8.e eVar, x xVar, InterfaceC7327d interfaceC7327d, A8.b bVar) {
        return new C7063c(executor, eVar, xVar, interfaceC7327d, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7063c get() {
        return c((Executor) this.f64060a.get(), (s8.e) this.f64061b.get(), (x) this.f64062c.get(), (InterfaceC7327d) this.f64063d.get(), (A8.b) this.f64064e.get());
    }
}

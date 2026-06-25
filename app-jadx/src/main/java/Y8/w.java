package y8;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import t8.InterfaceC6651b;
import z8.InterfaceC7327d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f64981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f64982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f64983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f64984d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f64981a = provider;
        this.f64982b = provider2;
        this.f64983c = provider3;
        this.f64984d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC7327d interfaceC7327d, x xVar, A8.b bVar) {
        return new v(executor, interfaceC7327d, xVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f64981a.get(), (InterfaceC7327d) this.f64982b.get(), (x) this.f64983c.get(), (A8.b) this.f64984d.get());
    }
}

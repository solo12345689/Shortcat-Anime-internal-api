package y8;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import t8.InterfaceC6651b;
import z8.InterfaceC7326c;
import z8.InterfaceC7327d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f64966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f64967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f64968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f64969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f64970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f64971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f64972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f64973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f64974i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f64966a = provider;
        this.f64967b = provider2;
        this.f64968c = provider3;
        this.f64969d = provider4;
        this.f64970e = provider5;
        this.f64971f = provider6;
        this.f64972g = provider7;
        this.f64973h = provider8;
        this.f64974i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, s8.e eVar, InterfaceC7327d interfaceC7327d, x xVar, Executor executor, A8.b bVar, B8.a aVar, B8.a aVar2, InterfaceC7326c interfaceC7326c) {
        return new r(context, eVar, interfaceC7327d, xVar, executor, bVar, aVar, aVar2, interfaceC7326c);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f64966a.get(), (s8.e) this.f64967b.get(), (InterfaceC7327d) this.f64968c.get(), (x) this.f64969d.get(), (Executor) this.f64970e.get(), (A8.b) this.f64971f.get(), (B8.a) this.f64972g.get(), (B8.a) this.f64973h.get(), (InterfaceC7326c) this.f64974i.get());
    }
}

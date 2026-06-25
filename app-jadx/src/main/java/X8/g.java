package x8;

import javax.inject.Provider;
import t8.AbstractC6653d;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f64065a;

    public g(Provider provider) {
        this.f64065a = provider;
    }

    public static y8.f a(B8.a aVar) {
        return (y8.f) AbstractC6653d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y8.f get() {
        return a((B8.a) this.f64065a.get());
    }
}

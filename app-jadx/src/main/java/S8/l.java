package s8;

import android.content.Context;
import javax.inject.Provider;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f59292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f59293b;

    public l(Provider provider, Provider provider2) {
        this.f59292a = provider;
        this.f59293b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f59292a.get(), this.f59293b.get());
    }
}

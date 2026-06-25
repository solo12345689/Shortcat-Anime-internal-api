package z8;

import android.content.Context;
import javax.inject.Provider;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f65977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f65978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f65979c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f65977a = provider;
        this.f65978b = provider2;
        this.f65979c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f65977a.get(), (String) this.f65978b.get(), ((Integer) this.f65979c.get()).intValue());
    }
}

package s8;

import android.content.Context;
import javax.inject.Provider;
import t8.InterfaceC6651b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f59284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f59285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f59286c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f59284a = provider;
        this.f59285b = provider2;
        this.f59286c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, B8.a aVar, B8.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f59284a.get(), (B8.a) this.f59285b.get(), (B8.a) this.f59286c.get());
    }
}

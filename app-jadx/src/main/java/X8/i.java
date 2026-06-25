package x8;

import android.content.Context;
import javax.inject.Provider;
import t8.AbstractC6653d;
import t8.InterfaceC6651b;
import y8.x;
import z8.InterfaceC7327d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f64066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f64067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f64068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f64069d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f64066a = provider;
        this.f64067b = provider2;
        this.f64068c = provider3;
        this.f64069d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC7327d interfaceC7327d, y8.f fVar, B8.a aVar) {
        return (x) AbstractC6653d.c(h.a(context, interfaceC7327d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f64066a.get(), (InterfaceC7327d) this.f64067b.get(), (y8.f) this.f64068c.get(), (B8.a) this.f64069d.get());
    }
}

package z8;

import android.content.Context;
import javax.inject.Provider;
import t8.AbstractC6653d;
import t8.InterfaceC6651b;

/* JADX INFO: renamed from: z8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7331h implements InterfaceC6651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f65995a;

    public C7331h(Provider provider) {
        this.f65995a = provider;
    }

    public static C7331h a(Provider provider) {
        return new C7331h(provider);
    }

    public static String c(Context context) {
        return (String) AbstractC6653d.c(AbstractC7329f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f65995a.get());
    }
}

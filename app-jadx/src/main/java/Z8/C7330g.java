package z8;

import t8.AbstractC6653d;
import t8.InterfaceC6651b;

/* JADX INFO: renamed from: z8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7330g implements InterfaceC6651b {

    /* JADX INFO: renamed from: z8.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C7330g f65994a = new C7330g();
    }

    public static C7330g a() {
        return a.f65994a;
    }

    public static String b() {
        return (String) AbstractC6653d.c(AbstractC7329f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}

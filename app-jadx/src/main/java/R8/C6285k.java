package r8;

import java.util.concurrent.Executor;
import t8.AbstractC6653d;
import t8.InterfaceC6651b;

/* JADX INFO: renamed from: r8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6285k implements InterfaceC6651b {

    /* JADX INFO: renamed from: r8.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C6285k f58701a = new C6285k();
    }

    public static C6285k a() {
        return a.f58701a;
    }

    public static Executor b() {
        return (Executor) AbstractC6653d.c(AbstractC6284j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}

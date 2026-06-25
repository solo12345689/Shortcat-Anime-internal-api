package pf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC6046k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56070a = a.f56071a;

    /* JADX INFO: renamed from: pf.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f56071a = new a();

        private a() {
        }

        public final C6039d a(Runnable runnable, Function1 function1) {
            return (runnable == null || function1 == null) ? new C6039d(null, 1, null) : new C6038c(runnable, function1);
        }
    }

    void lock();

    void unlock();
}

package F2;

import B2.K1;
import F2.InterfaceC1558m;
import F2.t;
import F2.u;
import android.os.Looper;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6273a = new a();

    int b(C6109x c6109x);

    default b c(t.a aVar, C6109x c6109x) {
        return b.f6274a;
    }

    InterfaceC1558m d(t.a aVar, C6109x c6109x);

    void e(Looper looper, K1 k12);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6274a = new b() { // from class: F2.v
            @Override // F2.u.b
            public final void a() {
                u.b.b();
            }
        };

        void a();

        static /* synthetic */ void b() {
        }
    }

    default void a() {
    }

    default void s() {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements u {
        a() {
        }

        @Override // F2.u
        public int b(C6109x c6109x) {
            return c6109x.f57026s != null ? 1 : 0;
        }

        @Override // F2.u
        public InterfaceC1558m d(t.a aVar, C6109x c6109x) {
            if (c6109x.f57026s == null) {
                return null;
            }
            return new z(new InterfaceC1558m.a(new O(1), 6001));
        }

        @Override // F2.u
        public void e(Looper looper, K1 k12) {
        }
    }
}

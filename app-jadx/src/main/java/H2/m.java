package H2;

import M2.L;
import Q2.k;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        m a(G2.d dVar, Q2.k kVar, l lVar, Q2.e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        boolean b(Uri uri, k.c cVar, boolean z10);

        void e();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7903a;

        public c(Uri uri) {
            this.f7903a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7904a;

        public d(Uri uri) {
            this.f7904a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void i(f fVar);
    }

    void a(Uri uri, L.a aVar, e eVar);

    void b(Uri uri);

    void c(Uri uri);

    long d();

    i e();

    void f(Uri uri);

    boolean g(Uri uri);

    boolean i();

    boolean k(Uri uri, long j10);

    void l();

    f m(Uri uri, boolean z10);

    void o(b bVar);

    void p(b bVar);

    void stop();
}

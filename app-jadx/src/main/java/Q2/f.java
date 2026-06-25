package Q2;

import android.net.Uri;
import t2.Q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O9.g f14276a = O9.g.g(com.amazon.a.a.o.b.f.f34694a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public abstract f a();

        public abstract a b(long j10);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? Q.e(uri, "CMCD") : uri;
    }

    public abstract w2.o a(w2.o oVar);
}

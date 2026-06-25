package Y1;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22744a;

    a(a aVar) {
        this.f22744a = aVar;
    }

    public static a g(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public static a h(Context context, Uri uri) {
        String strC = H1.c.c(uri);
        if (H1.c.d(context, uri)) {
            strC = H1.c.b(uri);
        }
        if (strC == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriA = H1.c.a(uri, strC);
        if (uriA != null) {
            return new d(null, context, uriA);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(String str);

    public abstract a d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    public abstract String j();

    public abstract Uri k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract long n();

    public abstract long o();

    public abstract a[] p();
}

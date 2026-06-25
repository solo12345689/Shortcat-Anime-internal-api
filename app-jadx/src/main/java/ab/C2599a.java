package ab;

import Df.r;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ab.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C2599a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23909b;

    public C2599a(Context context, String str) {
        AbstractC5504s.h(context, "context");
        this.f23908a = context;
        this.f23909b = str;
    }

    private final Uri a(String str, Context context) {
        return C2600b.f23910a.b(context, str);
    }

    private final Uri b(Context context) {
        String str = this.f23909b;
        if (str == null) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() == null ? a(str, context) : uri;
        } catch (Exception unused) {
            return a(str, context);
        }
    }

    private final boolean d(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return r.Q(scheme, "res", false, 2, null);
    }

    public final Uri c(Context context) {
        AbstractC5504s.h(context, "context");
        Uri uriB = b(context);
        if (!d(uriB)) {
            return uriB;
        }
        AbstractC5504s.e(uriB);
        String string = uriB.toString();
        AbstractC5504s.g(string, "toString(...)");
        return Uri.parse(r.K(string, "res:/", "android.resource://" + context.getPackageName() + "/", false, 4, null));
    }
}

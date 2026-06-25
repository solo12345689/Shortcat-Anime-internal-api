package d5;

import U4.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l implements S4.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S4.g f45019b = S4.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45020a;

    public l(Context context) {
        this.f45020a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f45020a.getPackageName())) {
            return this.f45020a;
        }
        try {
            return this.f45020a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f45020a.getPackageName())) {
                return this.f45020a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(Uri uri, int i10, int i11, S4.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) o5.k.e(authority)).equals(this.f45020a.getPackageName()) ? (Resources.Theme) hVar.c(f45019b) : null;
            return k.c(theme == null ? i.b(this.f45020a, contextD, iG) : i.a(this.f45020a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // S4.j
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, S4.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}

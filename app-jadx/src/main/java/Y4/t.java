package Y4;

import Y4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f22841b;

    t(Context context, n nVar) {
        this.f22840a = context.getApplicationContext();
        this.f22841b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, S4.h hVar) {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f22841b.b(Integer.valueOf(i12), i10, i11, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, S4.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f22840a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f22840a.getPackageName());
        if (identifier != 0) {
            return this.f22841b.b(Integer.valueOf(identifier), i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, S4.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f22840a.getPackageName().equals(uri.getAuthority());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22842a;

        a(Context context) {
            this.f22842a = context;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new t(this.f22842a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22843a;

        b(Context context) {
            this.f22843a = context;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new t(this.f22843a, rVar.d(Integer.class, InputStream.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

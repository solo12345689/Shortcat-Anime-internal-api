package D4;

import Df.r;
import G4.m;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements d {
    private final boolean b(Uri uri) {
        String authority;
        return AbstractC5504s.c(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !r.l0(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // D4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, m mVar) throws PackageManager.NameNotFoundException {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + '/' + identifier);
        AbstractC5504s.g(uri2, "parse(this)");
        return uri2;
    }
}

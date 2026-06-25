package D4;

import Df.r;
import G4.m;
import L4.j;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {
    private final boolean b(Uri uri) {
        String scheme;
        if (!j.p(uri) && ((scheme = uri.getScheme()) == null || AbstractC5504s.c(scheme, "file"))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (r.Q0(path, '/', false, 2, null) && j.h(uri) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // D4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        if (!AbstractC5504s.c(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}

package Y4;

import Y4.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class v implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f22845a;

    public v(n nVar) {
        this.f22845a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String str, int i10, int i11, S4.h hVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f22845a.a(uriE)) {
            return null;
        }
        return this.f22845a.b(uriE, i10, i11, hVar);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements o {
        @Override // Y4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements o {
        @Override // Y4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c implements o {
        @Override // Y4.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

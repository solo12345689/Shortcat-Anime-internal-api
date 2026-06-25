package Y4;

import Y4.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f22835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f22836b;

    public s(Resources resources, n nVar) {
        this.f22836b = resources;
        this.f22835a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f22836b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, S4.h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f22835a.b(uriD, i10, i11, hVar);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f22837a;

        public a(Resources resources) {
            this.f22837a = resources;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new s(this.f22837a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f22838a;

        public b(Resources resources) {
            this.f22838a = resources;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new s(this.f22838a, rVar.d(Uri.class, InputStream.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f22839a;

        public c(Resources resources) {
            this.f22839a = resources;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new s(this.f22839a, w.c());
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

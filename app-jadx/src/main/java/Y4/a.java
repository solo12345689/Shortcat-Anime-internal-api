package Y4;

import Y4.n;
import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22750c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f22751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0385a f22752b;

    /* JADX INFO: renamed from: Y4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0385a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC0385a interfaceC0385a) {
        this.f22751a = assetManager;
        this.f22752b = interfaceC0385a;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(uri), this.f22752b.a(this.f22751a, uri.toString().substring(f22750c)));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements o, InterfaceC0385a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f22753a;

        public b(AssetManager assetManager) {
            this.f22753a = assetManager;
        }

        @Override // Y4.a.InterfaceC0385a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new a(this.f22753a, this);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c implements o, InterfaceC0385a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f22754a;

        public c(AssetManager assetManager) {
            this.f22754a = assetManager;
        }

        @Override // Y4.a.InterfaceC0385a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new a(this.f22754a, this);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

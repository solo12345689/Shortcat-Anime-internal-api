package M1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f11637a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f11637a = new a(uri, clipDescription, uri2);
        } else {
            this.f11637a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f11637a.b();
    }

    public ClipDescription b() {
        return this.f11637a.getDescription();
    }

    public Uri c() {
        return this.f11637a.d();
    }

    public void d() {
        this.f11637a.c();
    }

    public Object e() {
        return this.f11637a.a();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f11638a;

        a(Object obj) {
            this.f11638a = (InputContentInfo) obj;
        }

        @Override // M1.f.c
        public Object a() {
            return this.f11638a;
        }

        @Override // M1.f.c
        public Uri b() {
            return this.f11638a.getContentUri();
        }

        @Override // M1.f.c
        public void c() {
            this.f11638a.requestPermission();
        }

        @Override // M1.f.c
        public Uri d() {
            return this.f11638a.getLinkUri();
        }

        @Override // M1.f.c
        public ClipDescription getDescription() {
            return this.f11638a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f11638a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f11637a = cVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f11639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f11640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f11641c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f11639a = uri;
            this.f11640b = clipDescription;
            this.f11641c = uri2;
        }

        @Override // M1.f.c
        public Object a() {
            return null;
        }

        @Override // M1.f.c
        public Uri b() {
            return this.f11639a;
        }

        @Override // M1.f.c
        public Uri d() {
            return this.f11641c;
        }

        @Override // M1.f.c
        public ClipDescription getDescription() {
            return this.f11640b;
        }

        @Override // M1.f.c
        public void c() {
        }
    }
}

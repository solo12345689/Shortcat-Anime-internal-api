package Y4;

import Y4.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f22849b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f22850a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public x(c cVar) {
        this.f22850a = cVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(uri), this.f22850a.a(uri));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f22849b.contains(uri.getScheme());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f22851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22852b;

        public a(ContentResolver contentResolver, boolean z10) {
            this.f22851a = contentResolver;
            this.f22852b = z10;
        }

        @Override // Y4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f22851a, uri, this.f22852b);
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f22853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22854b;

        public b(ContentResolver contentResolver, boolean z10) {
            this.f22853a = contentResolver;
            this.f22854b = z10;
        }

        @Override // Y4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f22853a, uri, this.f22854b);
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f22855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22856b;

        public d(ContentResolver contentResolver, boolean z10) {
            this.f22855a = contentResolver;
            this.f22856b = z10;
        }

        @Override // Y4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f22855a, uri, this.f22856b);
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new x(this);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

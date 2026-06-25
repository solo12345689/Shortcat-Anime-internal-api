package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2752d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f29028a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f29029a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f29029a = new b(clipData, i10);
            } else {
                this.f29029a = new C0497d(clipData, i10);
            }
        }

        public C2752d a() {
            return this.f29029a.build();
        }

        public a b(Bundle bundle) {
            this.f29029a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f29029a.c(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f29029a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f29030a;

        b(ClipData clipData, int i10) {
            this.f29030a = AbstractC2758g.a(clipData, i10);
        }

        @Override // androidx.core.view.C2752d.c
        public void a(Uri uri) {
            this.f29030a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C2752d.c
        public C2752d build() {
            return new C2752d(new e(this.f29030a.build()));
        }

        @Override // androidx.core.view.C2752d.c
        public void c(int i10) {
            this.f29030a.setFlags(i10);
        }

        @Override // androidx.core.view.C2752d.c
        public void setExtras(Bundle bundle) {
            this.f29030a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        void a(Uri uri);

        C2752d build();

        void c(int i10);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0497d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f29031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f29034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f29035e;

        C0497d(ClipData clipData, int i10) {
            this.f29031a = clipData;
            this.f29032b = i10;
        }

        @Override // androidx.core.view.C2752d.c
        public void a(Uri uri) {
            this.f29034d = uri;
        }

        @Override // androidx.core.view.C2752d.c
        public C2752d build() {
            return new C2752d(new g(this));
        }

        @Override // androidx.core.view.C2752d.c
        public void c(int i10) {
            this.f29033c = i10;
        }

        @Override // androidx.core.view.C2752d.c
        public void setExtras(Bundle bundle) {
            this.f29035e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f29036a;

        e(ContentInfo contentInfo) {
            this.f29036a = AbstractC2750c.a(K1.f.g(contentInfo));
        }

        @Override // androidx.core.view.C2752d.f
        public int k() {
            return this.f29036a.getSource();
        }

        @Override // androidx.core.view.C2752d.f
        public ClipData l() {
            return this.f29036a.getClip();
        }

        @Override // androidx.core.view.C2752d.f
        public ContentInfo m() {
            return this.f29036a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f29036a + "}";
        }

        @Override // androidx.core.view.C2752d.f
        public int w() {
            return this.f29036a.getFlags();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface f {
        int k();

        ClipData l();

        ContentInfo m();

        int w();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f29037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f29040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f29041e;

        g(C0497d c0497d) {
            this.f29037a = (ClipData) K1.f.g(c0497d.f29031a);
            this.f29038b = K1.f.c(c0497d.f29032b, 0, 5, "source");
            this.f29039c = K1.f.f(c0497d.f29033c, 1);
            this.f29040d = c0497d.f29034d;
            this.f29041e = c0497d.f29035e;
        }

        @Override // androidx.core.view.C2752d.f
        public int k() {
            return this.f29038b;
        }

        @Override // androidx.core.view.C2752d.f
        public ClipData l() {
            return this.f29037a;
        }

        @Override // androidx.core.view.C2752d.f
        public ContentInfo m() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f29037a.getDescription());
            sb2.append(", source=");
            sb2.append(C2752d.e(this.f29038b));
            sb2.append(", flags=");
            sb2.append(C2752d.a(this.f29039c));
            if (this.f29040d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f29040d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f29041e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }

        @Override // androidx.core.view.C2752d.f
        public int w() {
            return this.f29039c;
        }
    }

    C2752d(f fVar) {
        this.f29028a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C2752d g(ContentInfo contentInfo) {
        return new C2752d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f29028a.l();
    }

    public int c() {
        return this.f29028a.w();
    }

    public int d() {
        return this.f29028a.k();
    }

    public ContentInfo f() {
        ContentInfo contentInfoM = this.f29028a.m();
        Objects.requireNonNull(contentInfoM);
        return AbstractC2750c.a(contentInfoM);
    }

    public String toString() {
        return this.f29028a.toString();
    }
}

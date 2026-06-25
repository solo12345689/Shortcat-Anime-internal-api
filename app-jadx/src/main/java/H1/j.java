package H1;

import A1.s;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Uri f7672a;

        /* JADX INFO: renamed from: b */
        private final int f7673b;

        /* JADX INFO: renamed from: c */
        private final int f7674c;

        /* JADX INFO: renamed from: d */
        private final boolean f7675d;

        /* JADX INFO: renamed from: e */
        private final String f7676e;

        /* JADX INFO: renamed from: f */
        private final int f7677f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f7677f;
        }

        public String c() {
            if (i()) {
                return this.f7672a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f7673b;
        }

        public Uri e() {
            return this.f7672a;
        }

        public String f() {
            return this.f7676e;
        }

        public int g() {
            return this.f7674c;
        }

        public boolean h() {
            return this.f7675d;
        }

        public boolean i() {
            return Objects.equals(this.f7672a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f7672a = (Uri) K1.f.g(uri);
            this.f7673b = i10;
            this.f7674c = i11;
            this.f7675d = z10;
            this.f7676e = str;
            this.f7677f = i12;
        }

        public b(String str, String str2) {
            this.f7672a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f7673b = 0;
            this.f7674c = 400;
            this.f7675d = false;
            this.f7676e = str2;
            this.f7677f = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return s.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, f fVar) {
        return e.e(context, h.a(new Object[]{fVar}), cancellationSignal);
    }

    public static Typeface c(Context context, f fVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        return d(context, h.a(new Object[]{fVar}), i10, z10, i11, handler, cVar);
    }

    public static Typeface d(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        H1.a aVar = new H1.a(cVar, k.b(handler));
        if (!z10) {
            return i.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (f) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final int f7670a;

        /* JADX INFO: renamed from: b */
        private final List f7671b;

        public a(int i10, b[] bVarArr) {
            this.f7670a = i10;
            this.f7671b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f7671b.get(0);
        }

        public List d() {
            return this.f7671b;
        }

        public int e() {
            return this.f7670a;
        }

        boolean f() {
            return this.f7671b.size() > 1;
        }

        a(int i10, List list) {
            this.f7670a = i10;
            this.f7671b = list;
        }
    }
}

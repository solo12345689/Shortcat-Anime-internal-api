package Y4;

import Y4.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22799a;

    public l(Context context) {
        this.f22799a = context;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(uri), new b(this.f22799a, uri));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return T4.c.d(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22800a;

        public a(Context context) {
            this.f22800a = context;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new l(this.f22800a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f22801c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f22803b;

        b(Context context, Uri uri) {
            this.f22802a = context;
            this.f22803b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor cursorQuery = this.f22802a.getContentResolver().query(this.f22803b, f22801c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f22803b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}

package T4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f17149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f17150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f17151c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f17152b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f17153a;

        a(ContentResolver contentResolver) {
            this.f17153a = contentResolver;
        }

        @Override // T4.e
        public Cursor a(Uri uri) {
            return this.f17153a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f17152b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f17154b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f17155a;

        b(ContentResolver contentResolver) {
            this.f17155a = contentResolver;
        }

        @Override // T4.e
        public Cursor a(Uri uri) {
            return this.f17155a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f17154b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    d(Uri uri, f fVar) {
        this.f17149a = uri;
        this.f17150b = fVar;
    }

    private static d c(Context context, Uri uri, e eVar) {
        return new d(uri, new f(com.bumptech.glide.b.d(context).k().g(), eVar, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }

    public static d f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static d g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f17150b.d(this.f17149a);
        int iA = inputStreamD != null ? this.f17150b.a(this.f17149a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f17151c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f17151c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}

package Z4;

import S4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f23158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f23159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f23160d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: Z4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0398d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String[] f23163k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f23165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f23166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f23167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f23168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f23170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f23171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f23172i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f23173j;

        C0398d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f23164a = context.getApplicationContext();
            this.f23165b = nVar;
            this.f23166c = nVar2;
            this.f23167d = uri;
            this.f23168e = i10;
            this.f23169f = i11;
            this.f23170g = hVar;
            this.f23171h = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f23165b.b(h(this.f23167d), this.f23168e, this.f23169f, this.f23170g);
            }
            if (T4.c.a(this.f23167d)) {
                return this.f23166c.b(this.f23167d, this.f23168e, this.f23169f, this.f23170g);
            }
            return this.f23166c.b(g() ? MediaStore.setRequireOriginal(this.f23167d) : this.f23167d, this.f23168e, this.f23169f, this.f23170g);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f22812c;
            }
            return null;
        }

        private boolean g() {
            return this.f23164a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            try {
                Cursor cursorQuery = this.f23164a.getContentResolver().query(uri, f23163k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23171h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f23173j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f23172i = true;
            com.bumptech.glide.load.data.d dVar = this.f23173j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f23167d));
                    return;
                }
                this.f23173j = dVarF;
                if (this.f23172i) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f23157a = context.getApplicationContext();
        this.f23158b = nVar;
        this.f23159c = nVar2;
        this.f23160d = cls;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new n5.c(uri), new C0398d(this.f23157a, this.f23158b, this.f23159c, uri, i10, i11, hVar, this.f23160d));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && T4.c.d(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f23162b;

        a(Context context, Class cls) {
            this.f23161a = context;
            this.f23162b = cls;
        }

        @Override // Y4.o
        public final n d(r rVar) {
            return new d(this.f23161a, rVar.d(File.class, this.f23162b), rVar.d(Uri.class, this.f23162b), this.f23162b);
        }

        @Override // Y4.o
        public final void teardown() {
        }
    }
}

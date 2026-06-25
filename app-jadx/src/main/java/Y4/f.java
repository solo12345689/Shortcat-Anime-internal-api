package Y4;

import Y4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f22768b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f22767a = context.getApplicationContext();
        this.f22768b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, S4.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(d5.l.f45019b);
        return new n.a(new n5.c(num), new d(theme, theme != null ? theme.getResources() : this.f22767a.getResources(), this.f22768b, num.intValue()));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22769a;

        a(Context context) {
            this.f22769a = context;
        }

        @Override // Y4.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new f(this.f22769a, this);
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22770a;

        b(Context context) {
            this.f22770a = context;
        }

        @Override // Y4.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new f(this.f22770a, this);
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return d5.i.a(this.f22770a, i10, theme);
        }

        @Override // Y4.o
        public void teardown() {
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22771a;

        c(Context context) {
            this.f22771a = context;
        }

        @Override // Y4.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new f(this.f22771a, this);
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // Y4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f22772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f22773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f22774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f22776e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f22772a = theme;
            this.f22773b = resources;
            this.f22774c = eVar;
            this.f22775d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f22774c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f22776e;
            if (obj != null) {
                try {
                    this.f22774c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objC = this.f22774c.c(this.f22772a, this.f22773b, this.f22775d);
                this.f22776e = objC;
                aVar.f(objC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}

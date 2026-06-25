package Y4;

import Y4.n;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22761a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    public e(a aVar) {
        this.f22761a = aVar;
    }

    @Override // Y4.n
    public boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // Y4.n
    public n.a b(Object obj, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(obj), new b(obj.toString(), this.f22761a));
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f22763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f22764c;

        b(String str, a aVar) {
            this.f22762a = str;
            this.f22763b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f22763b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f22763b.b(this.f22764c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objC = this.f22763b.c(this.f22762a);
                this.f22764c = objC;
                aVar.f(objC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f22765a = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements a {
            a() {
            }

            @Override // Y4.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // Y4.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // Y4.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new e(this.f22765a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

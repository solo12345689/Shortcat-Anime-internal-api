package Y4;

import Y4.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f22777a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements d {
            a() {
            }

            @Override // Y4.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // Y4.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // Y4.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements d {
            a() {
            }

            @Override // Y4.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // Y4.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // Y4.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f22777a = dVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(File file, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(file), new c(file, this.f22777a));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f22778a;

        public a(d dVar) {
            this.f22778a = dVar;
        }

        @Override // Y4.o
        public final n d(r rVar) {
            return new g(this.f22778a);
        }

        @Override // Y4.o
        public final void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f22779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f22780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f22781c;

        c(File file, d dVar) {
            this.f22779a = file;
            this.f22780b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f22780b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f22781c;
            if (obj != null) {
                try {
                    this.f22780b.b(obj);
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
                Object objC = this.f22780b.c(this.f22779a);
                this.f22781c = objC;
                aVar.f(objC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}

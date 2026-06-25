package Y4;

import Y4.n;
import com.bumptech.glide.load.data.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class w implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f22846a = new w();

    public static w c() {
        return f22846a;
    }

    @Override // Y4.n
    public boolean a(Object obj) {
        return true;
    }

    @Override // Y4.n
    public n.a b(Object obj, int i10, int i11, S4.h hVar) {
        return new n.a(new n5.c(obj), new b(obj));
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f22847a = new a();

        public static a a() {
            return f22847a;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return w.c();
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f22848a;

        b(Object obj) {
            this.f22848a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f22848a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return S4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f22848a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}

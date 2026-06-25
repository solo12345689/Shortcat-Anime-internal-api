package b5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.AbstractC5824a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
interface Q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f33116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V4.b f33117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f33118c;

        b(InputStream inputStream, List list, V4.b bVar) {
            this.f33117b = (V4.b) o5.k.e(bVar);
            this.f33118c = (List) o5.k.e(list);
            this.f33116a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // b5.Q
        public Bitmap a(BitmapFactory.Options options) {
            return N.b(this.f33116a.a(), options, this);
        }

        @Override // b5.Q
        public boolean b() {
            return com.bumptech.glide.load.a.j(this.f33118c, this.f33116a.a(), this.f33117b);
        }

        @Override // b5.Q
        public void c() {
            this.f33116a.c();
        }

        @Override // b5.Q
        public int d() {
            return com.bumptech.glide.load.a.b(this.f33118c, this.f33116a.a(), this.f33117b);
        }

        @Override // b5.Q
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.f(this.f33118c, this.f33116a.a(), this.f33117b);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    boolean b();

    void c();

    int d();

    ImageHeaderParser.ImageType e();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f33113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f33114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V4.b f33115c;

        a(ByteBuffer byteBuffer, List list, V4.b bVar) {
            this.f33113a = byteBuffer;
            this.f33114b = list;
            this.f33115c = bVar;
        }

        private InputStream f() {
            return AbstractC5824a.g(AbstractC5824a.d(this.f33113a));
        }

        @Override // b5.Q
        public Bitmap a(BitmapFactory.Options options) {
            return N.b(f(), options, this);
        }

        @Override // b5.Q
        public boolean b() {
            return com.bumptech.glide.load.a.k(this.f33114b, AbstractC5824a.d(this.f33113a), this.f33115c);
        }

        @Override // b5.Q
        public int d() {
            return com.bumptech.glide.load.a.c(this.f33114b, AbstractC5824a.d(this.f33113a), this.f33115c);
        }

        @Override // b5.Q
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.g(this.f33114b, AbstractC5824a.d(this.f33113a));
        }

        @Override // b5.Q
        public void c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V4.b f33119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f33120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f33121c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, V4.b bVar) {
            this.f33119a = (V4.b) o5.k.e(bVar);
            this.f33120b = (List) o5.k.e(list);
            this.f33121c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // b5.Q
        public Bitmap a(BitmapFactory.Options options) {
            return N.a(this.f33121c.a().getFileDescriptor(), options, this);
        }

        @Override // b5.Q
        public boolean b() {
            return com.bumptech.glide.load.a.i(this.f33120b, this.f33121c, this.f33119a);
        }

        @Override // b5.Q
        public int d() {
            return com.bumptech.glide.load.a.a(this.f33120b, this.f33121c, this.f33119a);
        }

        @Override // b5.Q
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.e(this.f33120b, this.f33121c, this.f33119a);
        }

        @Override // b5.Q
        public void c() {
        }
    }
}

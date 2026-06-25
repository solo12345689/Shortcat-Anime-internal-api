package d5;

import U4.v;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.AbstractC5824a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.b f45013b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f45014a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f45014a = animatedImageDrawable;
        }

        @Override // U4.v
        public Class a() {
            return Drawable.class;
        }

        @Override // U4.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f45014a;
        }

        @Override // U4.v
        public int getSize() {
            return this.f45014a.getIntrinsicWidth() * this.f45014a.getIntrinsicHeight() * o5.l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // U4.v
        public void recycle() {
            this.f45014a.stop();
            this.f45014a.clearAnimationCallbacks();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements S4.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f45015a;

        b(h hVar) {
            this.f45015a = hVar;
        }

        @Override // S4.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(ByteBuffer byteBuffer, int i10, int i11, S4.h hVar) {
            return this.f45015a.b(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
        }

        @Override // S4.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, S4.h hVar) {
            return this.f45015a.d(byteBuffer);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements S4.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f45016a;

        c(h hVar) {
            this.f45016a = hVar;
        }

        @Override // S4.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(InputStream inputStream, int i10, int i11, S4.h hVar) {
            return this.f45016a.b(ImageDecoder.createSource(AbstractC5824a.b(inputStream)), i10, i11, hVar);
        }

        @Override // S4.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, S4.h hVar) {
            return this.f45016a.c(inputStream);
        }
    }

    private h(List list, V4.b bVar) {
        this.f45012a = list;
        this.f45013b = bVar;
    }

    public static S4.j a(List list, V4.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static S4.j f(List list, V4.b bVar) {
        return new c(new h(list, bVar));
    }

    v b(ImageDecoder.Source source, int i10, int i11, S4.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new a5.i(i10, i11, hVar));
        if (d5.b.a(drawableDecodeDrawable)) {
            return new a(d5.c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f45012a, inputStream, this.f45013b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f45012a, byteBuffer));
    }
}

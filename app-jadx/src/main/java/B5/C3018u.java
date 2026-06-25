package b5;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o5.AbstractC5824a;

/* JADX INFO: renamed from: b5.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3018u implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(ByteBuffer byteBuffer, V4.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, V4.b bVar) {
        return c(AbstractC5824a.g(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, V4.b bVar) {
        int iC = new androidx.exifinterface.media.a(inputStream).c("Orientation", 1);
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean d(InputStream inputStream, V4.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType e(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType f(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

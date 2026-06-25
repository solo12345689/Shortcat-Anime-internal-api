package com.bumptech.glide.load;

import V4.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface ImageHeaderParser {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f35672a;

        ImageType(boolean z10) {
            this.f35672a = z10;
        }

        public boolean hasAlpha() {
            return this.f35672a;
        }

        public boolean isWebp() {
            int i10 = a.f35673a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35673a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f35673a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35673a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35673a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    boolean a(ByteBuffer byteBuffer, b bVar);

    int b(ByteBuffer byteBuffer, b bVar);

    int c(InputStream inputStream, b bVar);

    boolean d(InputStream inputStream, b bVar);

    ImageType e(ByteBuffer byteBuffer);

    ImageType f(InputStream inputStream);
}

package I6;

import H6.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i bitmapPool, K1.d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        AbstractC5504s.h(bitmapPool, "bitmapPool");
        AbstractC5504s.h(decodeBuffers, "decodeBuffers");
        AbstractC5504s.h(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // I6.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        AbstractC5504s.h(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return BitmapUtil.getSizeInByteForBitmap(i10, i11, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}

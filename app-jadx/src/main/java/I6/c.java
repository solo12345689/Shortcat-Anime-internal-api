package I6;

import H6.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f8851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i bitmapPool, K1.d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        AbstractC5504s.h(bitmapPool, "bitmapPool");
        AbstractC5504s.h(decodeBuffers, "decodeBuffers");
        AbstractC5504s.h(platformDecoderOptions, "platformDecoderOptions");
        this.f8851h = platformDecoderOptions;
    }

    @Override // I6.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        AbstractC5504s.h(options, "options");
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return BitmapUtil.getSizeInByteForBitmap(i10, i11, config);
    }
}

package w6;

import H6.i;
import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.AbstractC5504s;
import z6.C7287a;

/* JADX INFO: renamed from: w6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6949a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f62929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7287a f62930b;

    public C6949a(i bitmapPool, C7287a closeableReferenceFactory) {
        AbstractC5504s.h(bitmapPool, "bitmapPool");
        AbstractC5504s.h(closeableReferenceFactory, "closeableReferenceFactory");
        this.f62929a = bitmapPool;
        this.f62930b = closeableReferenceFactory;
    }

    @Override // w6.d
    public C5.a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        AbstractC5504s.h(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f62929a.get(BitmapUtil.getSizeInByteForBitmap(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * BitmapUtil.getPixelSizeForBitmapConfig(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        C5.a aVarC = this.f62930b.c(bitmap, this.f62929a);
        AbstractC5504s.g(aVarC, "create(...)");
        return aVarC;
    }
}

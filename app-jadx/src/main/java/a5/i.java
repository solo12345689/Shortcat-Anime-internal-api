package a5;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import b5.AbstractC3012n;
import b5.P;
import b5.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    private final P f23803a = P.b();

    /* JADX INFO: renamed from: b */
    private final int f23804b;

    /* JADX INFO: renamed from: c */
    private final int f23805c;

    /* JADX INFO: renamed from: d */
    private final S4.b f23806d;

    /* JADX INFO: renamed from: e */
    private final AbstractC3012n f23807e;

    /* JADX INFO: renamed from: f */
    private final boolean f23808f;

    /* JADX INFO: renamed from: g */
    private final S4.i f23809g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public i(int i10, int i11, S4.h hVar) {
        this.f23804b = i10;
        this.f23805c = i11;
        this.f23806d = (S4.b) hVar.c(r.f33186f);
        this.f23807e = (AbstractC3012n) hVar.c(AbstractC3012n.f33181h);
        S4.g gVar = r.f33190j;
        this.f23808f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f23809g = (S4.i) hVar.c(r.f33187g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f23803a.f(this.f23804b, this.f23805c, this.f23808f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f23806d == S4.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f23804b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f23805c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f23807e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        S4.i iVar = this.f23809g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == S4.i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

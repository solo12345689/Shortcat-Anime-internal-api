package b5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: b5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3004f implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.d f33162a = new V4.e();

    @Override // S4.j
    public /* bridge */ /* synthetic */ U4.v a(Object obj, int i10, int i11, S4.h hVar) {
        return c(AbstractC3002d.a(obj), i10, i11, hVar);
    }

    @Override // S4.j
    public /* bridge */ /* synthetic */ boolean b(Object obj, S4.h hVar) {
        return d(AbstractC3002d.a(obj), hVar);
    }

    public U4.v c(ImageDecoder.Source source, int i10, int i11, S4.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new a5.i(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C3005g(bitmapDecodeBitmap, this.f33162a);
    }

    public boolean d(ImageDecoder.Source source, S4.h hVar) {
        return true;
    }
}

package Q4;

import S4.h;
import S4.j;
import U4.v;
import V4.d;
import android.graphics.Bitmap;
import android.util.Log;
import b5.C3005g;
import b5.r;
import java.nio.ByteBuffer;
import o5.k;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f14364a;

    public a(d dVar) {
        this.f14364a = (d) k.e(dVar);
    }

    private ByteBuffer e(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        ByteBuffer byteBufferE = e(byteBuffer);
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(byteBufferE, byteBufferE.remaining(), info)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Requested to decode byte buffer which cannot be handled by AvifDecoder");
            }
            return null;
        }
        Bitmap bitmapD = this.f14364a.d(info.width, info.height, hVar.c(r.f33186f) == S4.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : info.depth == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        if (AvifDecoder.decode(byteBufferE, byteBufferE.remaining(), bitmapD)) {
            return C3005g.c(bitmapD, this.f14364a);
        }
        if (Log.isLoggable("AvifBitmapDecoder", 6)) {
            Log.e("AvifBitmapDecoder", "Failed to decode ByteBuffer as Avif.");
        }
        this.f14364a.c(bitmapD);
        return null;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, h hVar) {
        return AvifDecoder.isAvifImage(e(byteBuffer));
    }
}

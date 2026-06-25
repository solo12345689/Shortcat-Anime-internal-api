package x4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC5504s;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f63910a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f63911b = new Paint(3);

    private m() {
    }

    public final j a(String str, InterfaceC6685j interfaceC6685j, l lVar) {
        if (!n.c(lVar, str)) {
            return j.f63901d;
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(new k(interfaceC6685j.peek().L()));
        return new j(aVar.s(), aVar.l());
    }

    public final Bitmap b(Bitmap bitmap, j jVar) {
        Bitmap bitmapCreateBitmap;
        if (!jVar.b() && !n.a(jVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (jVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (n.a(jVar)) {
            matrix.postRotate(jVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        if (n.b(jVar)) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), L4.a.c(bitmap));
            AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(width, height, config)");
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), L4.a.c(bitmap));
            AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f63911b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}

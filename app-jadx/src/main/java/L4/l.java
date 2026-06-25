package L4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11282a = new l();

    private l() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, H4.h hVar, H4.g gVar) {
        if (z10) {
            return true;
        }
        return x4.h.c(bitmap.getWidth(), bitmap.getHeight(), H4.b.a(hVar) ? bitmap.getWidth() : j.z(hVar.b(), gVar), H4.b.a(hVar) ? bitmap.getHeight() : j.z(hVar.a(), gVar), gVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, H4.h hVar, H4.g gVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, hVar, gVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iO = j.o(drawableMutate);
        int i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        if (iO <= 0) {
            iO = 512;
        }
        int i11 = j.i(drawableMutate);
        if (i11 > 0) {
            i10 = i11;
        }
        double dC = x4.h.c(iO, i10, H4.b.a(hVar) ? iO : j.z(hVar.b(), gVar), H4.b.a(hVar) ? i10 : j.z(hVar.a(), gVar), gVar);
        int iC = AbstractC5466a.c(((double) iO) * dC);
        int iC2 = AbstractC5466a.c(dC * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, a.e(config));
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Rect bounds = drawableMutate.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i12, i13, i14, i15);
        return bitmapCreateBitmap;
    }
}

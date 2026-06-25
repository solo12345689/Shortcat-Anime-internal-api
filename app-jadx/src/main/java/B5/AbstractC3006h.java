package b5;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: b5.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3006h implements S4.l {
    @Override // S4.l
    public final U4.v a(Context context, U4.v vVar, int i10, int i11) {
        if (!o5.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        V4.d dVarG = com.bumptech.glide.b.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarG, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? vVar : C3005g.c(bitmapC, dVarG);
    }

    protected abstract Bitmap c(V4.d dVar, Bitmap bitmap, int i10, int i11);
}

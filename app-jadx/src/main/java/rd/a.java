package Rd;

import S4.l;
import U4.v;
import V4.d;
import android.content.Context;
import android.graphics.Bitmap;
import b5.C3005g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements l {
    @Override // S4.l
    public final v a(Context context, v vVar, int i10, int i11) {
        if (!o5.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        d dVarG = com.bumptech.glide.b.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        int i12 = i10;
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapD = d(context.getApplicationContext(), dVarG, bitmap, i12, i11);
        return bitmap.equals(bitmapD) ? vVar : C3005g.c(bitmapD, dVarG);
    }

    void c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    protected abstract Bitmap d(Context context, d dVar, Bitmap bitmap, int i10, int i11);
}

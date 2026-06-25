package R8;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* JADX INFO: renamed from: R8.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2122x extends Button {
    public C2122x(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = M8.b.f12256b;
        int i14 = M8.b.f12257c;
        int iB = b(i11, i13, i14, i14);
        int i15 = M8.b.f12258d;
        int i16 = M8.b.f12259e;
        int iB2 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            iB = iB2;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable drawableR = B1.a.r(resources.getDrawable(iB));
        B1.a.o(drawableR, resources.getColorStateList(M8.a.f12254c));
        B1.a.p(drawableR, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableR);
        int i17 = M8.a.f12252a;
        int i18 = M8.a.f12253b;
        setTextColor((ColorStateList) AbstractC2115p.l(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(M8.c.f12275p));
        } else if (i10 == 1) {
            setText(resources.getString(M8.c.f12276q));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown button size: " + i10);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.h.c(getContext())) {
            setGravity(19);
        }
    }
}

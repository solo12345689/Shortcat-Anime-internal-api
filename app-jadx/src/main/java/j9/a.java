package J9;

import E9.b;
import E9.c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;
import o9.AbstractC5838a;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends D {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void s(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, AbstractC5848k.f54950G3);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, AbstractC5848k.f54974J3, AbstractC5848k.f54990L3);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, AbstractC5838a.f54603I0, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC5848k.f54998M3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55006N3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i10, int i11) {
        int iU;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i10, i11) || (iU = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC5848k.f54998M3, i10, i11);
        int iW = w(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55014O3, AbstractC5848k.f55022P3);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(K9.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }
}

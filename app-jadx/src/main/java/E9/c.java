package E9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.h0;
import i.j;
import j.AbstractC5323a;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListA = AbstractC5323a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListA;
    }

    public static ColorStateList b(Context context, h0 h0Var, int i10) {
        int iN;
        ColorStateList colorStateListA;
        return (!h0Var.s(i10) || (iN = h0Var.n(i10, 0)) == 0 || (colorStateListA = AbstractC5323a.a(context, iN)) == null) ? h0Var.c(i10) : colorStateListA;
    }

    private static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable e(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableB = AbstractC5323a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableB;
    }

    public static float f(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int g(TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    public static e h(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new e(context, resourceId);
    }

    public static int i(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC5848k.f54950G3);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(AbstractC5848k.f54990L3, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(AbstractC5848k.f54974J3, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i11;
    }

    public static int j(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f48223S2);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(j.f48228T2, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i11;
    }

    public static boolean k(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

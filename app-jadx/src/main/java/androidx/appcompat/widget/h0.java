package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import j.AbstractC5323a;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f25410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f25411c;

    private h0(Context context, TypedArray typedArray) {
        this.f25409a = context;
        this.f25410b = typedArray;
    }

    public static h0 t(Context context, int i10, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static h0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f25410b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f25410b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f25410b.hasValue(i10) || (resourceId = this.f25410b.getResourceId(i10, 0)) == 0 || (colorStateListA = AbstractC5323a.a(this.f25409a, resourceId)) == null) ? this.f25410b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f25410b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f25410b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f25410b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f25410b.hasValue(i10) || (resourceId = this.f25410b.getResourceId(i10, 0)) == 0) ? this.f25410b.getDrawable(i10) : AbstractC5323a.b(this.f25409a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f25410b.hasValue(i10) || (resourceId = this.f25410b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C2657k.b().d(this.f25409a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f25410b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, k.e eVar) {
        int resourceId = this.f25410b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f25411c == null) {
            this.f25411c = new TypedValue();
        }
        return z1.k.i(this.f25409a, resourceId, this.f25411c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f25410b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f25410b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f25410b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f25410b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f25410b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f25410b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f25410b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f25410b;
    }

    public boolean s(int i10) {
        return this.f25410b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f25410b.peekValue(i10);
    }

    public void x() {
        this.f25410b.recycle();
    }
}

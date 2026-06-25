package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f24987l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f24988m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24989a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24990b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f24991c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f24992d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24993e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f24994f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24995g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f24996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f24997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f24998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f24999k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.E.b, androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f24997i = textView;
        this.f24998j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f24999k = new c();
        } else {
            this.f24999k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f24989a = 0;
        this.f24992d = -1.0f;
        this.f24993e = -1.0f;
        this.f24991c = -1.0f;
        this.f24994f = new int[0];
        this.f24990b = false;
    }

    private int e(RectF rectF) {
        int length = this.f24994f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f24994f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f24994f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f24988m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f24988m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f24997i.getPaint().getTextSize()) {
            this.f24997i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f24997i.isInLayout();
            if (this.f24997i.getLayout() != null) {
                this.f24990b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f24997i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f24997i.forceLayout();
                } else {
                    this.f24997i.requestLayout();
                }
                this.f24997i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f24989a == 1) {
            if (!this.f24995g || this.f24994f.length == 0) {
                int iFloor = ((int) Math.floor((this.f24993e - this.f24992d) / this.f24991c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f24992d + (i10 * this.f24991c));
                }
                this.f24994f = b(iArr);
            }
            this.f24990b = true;
        } else {
            this.f24990b = false;
        }
        return this.f24990b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f24994f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f24994f.length > 0;
        this.f24995g = z10;
        if (z10) {
            this.f24989a = 1;
            this.f24992d = r0[0];
            this.f24993e = r0[r1 - 1];
            this.f24991c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f24997i.getText();
        TransformationMethod transformationMethod = this.f24997i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f24997i)) != null) {
            text = transformation;
        }
        int maxLines = this.f24997i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f24997i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f24997i instanceof C2658l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f24989a = 1;
        this.f24992d = f10;
        this.f24993e = f11;
        this.f24991c = f12;
        this.f24995g = false;
    }

    void a() {
        if (n()) {
            if (this.f24990b) {
                if (this.f24997i.getMeasuredHeight() <= 0 || this.f24997i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f24999k.b(this.f24997i) ? 1048576 : (this.f24997i.getMeasuredWidth() - this.f24997i.getTotalPaddingLeft()) - this.f24997i.getTotalPaddingRight();
                int height = (this.f24997i.getHeight() - this.f24997i.getCompoundPaddingBottom()) - this.f24997i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f24987l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f24997i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f24990b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f24997i, this.f24996h, this.f24999k);
    }

    int f() {
        return Math.round(this.f24993e);
    }

    int g() {
        return Math.round(this.f24992d);
    }

    int h() {
        return Math.round(this.f24991c);
    }

    int[] i() {
        return this.f24994f;
    }

    int j() {
        return this.f24989a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f24996h;
        if (textPaint == null) {
            this.f24996h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f24996h.set(this.f24997i.getPaint());
        this.f24996h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f24989a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f24998j.obtainStyledAttributes(attributeSet, i.j.f48289g0, i10, 0);
        TextView textView = this.f24997i;
        AbstractC2747a0.i0(textView, textView.getContext(), i.j.f48289g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48314l0)) {
            this.f24989a = typedArrayObtainStyledAttributes.getInt(i.j.f48314l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(i.j.f48309k0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f48309k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i.j.f48299i0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f48299i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i.j.f48294h0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f48294h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48304j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i.j.f48304j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f24989a = 0;
            return;
        }
        if (this.f24989a == 1) {
            if (!this.f24995g) {
                DisplayMetrics displayMetrics = this.f24998j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f24998j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f24998j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f24994f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f24995g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f24998j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f24998j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}

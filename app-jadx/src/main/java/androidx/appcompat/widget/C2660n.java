package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import d2.C4562f;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2660n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f25467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4562f f25468b;

    C2660n(TextView textView) {
        this.f25467a = textView;
        this.f25468b = new C4562f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f25468b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f25468b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f25467a.getContext().obtainStyledAttributes(attributeSet, i.j.f48289g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i.j.f48359u0) ? typedArrayObtainStyledAttributes.getBoolean(i.j.f48359u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f25468b.c(z10);
    }

    void e(boolean z10) {
        this.f25468b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f25468b.e(transformationMethod);
    }
}

package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d2.C4557a;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2659m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f25465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4557a f25466b;

    C2659m(EditText editText) {
        this.f25465a = editText;
        this.f25466b = new C4557a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f25466b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f25465a.getContext().obtainStyledAttributes(attributeSet, i.j.f48289g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i.j.f48359u0) ? typedArrayObtainStyledAttributes.getBoolean(i.j.f48359u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f25466b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f25466b.c(z10);
    }
}

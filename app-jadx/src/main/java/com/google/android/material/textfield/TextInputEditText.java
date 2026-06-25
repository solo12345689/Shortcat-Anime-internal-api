package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C2658l;
import i.AbstractC4956a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends C2658l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f42828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42829h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47939A);
    }

    private boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f42829h;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f42828g);
        rect.bottom = this.f42828g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.T()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.T() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C2658l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f42828g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f42828g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f42829h = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(K9.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f42828g = new Rect();
        TypedArray typedArrayI = com.google.android.material.internal.m.i(context, attributeSet, AbstractC5848k.f54928D5, i10, AbstractC5847j.f54885n, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(AbstractC5848k.f54936E5, false));
        typedArrayI.recycle();
    }
}

package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import o9.AbstractC5841d;
import o9.AbstractC5846i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class y extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f43041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f43042g;

    y(r rVar, int i10) {
        super(rVar);
        this.f43040e = AbstractC5841d.f54753a;
        this.f43042g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.v(this.f43039a, view);
            }
        };
        if (i10 != 0) {
            this.f43040e = i10;
        }
    }

    public static /* synthetic */ void v(y yVar, View view) {
        EditText editText = yVar.f43041f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (yVar.w()) {
            yVar.f43041f.setTransformationMethod(null);
        } else {
            yVar.f43041f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            yVar.f43041f.setSelection(selectionEnd);
        }
        yVar.r();
    }

    private boolean w() {
        EditText editText = this.f43041f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return AbstractC5846i.f54841C;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f43040e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f43042g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f43041f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f43041f)) {
            this.f43041f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f43041f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

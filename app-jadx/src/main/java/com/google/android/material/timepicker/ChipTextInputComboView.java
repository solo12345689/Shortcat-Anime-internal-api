package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.l;
import com.google.android.material.internal.p;
import com.google.android.material.textfield.TextInputLayout;
import o9.AbstractC5842e;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f43053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f43054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EditText f43055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextWatcher f43056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f43057e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends l {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f43053a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f43053a;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void d() {
        this.f43055c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f43053a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f43053a.setChecked(z10);
        this.f43055c.setVisibility(z10 ? 0 : 4);
        this.f43053a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            p.j(this.f43055c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43053a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f43053a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f43053a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(AbstractC5844g.f54826j, (ViewGroup) this, false);
        this.f43053a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(AbstractC5844g.f54827k, (ViewGroup) this, false);
        this.f43054b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f43055c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f43056d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f43057e = (TextView) findViewById(AbstractC5842e.f54801n);
        editText.setId(View.generateViewId());
        this.f43057e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}

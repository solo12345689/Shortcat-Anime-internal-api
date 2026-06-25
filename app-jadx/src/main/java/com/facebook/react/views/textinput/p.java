package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f38471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f38477g;

    public p(EditText editText) {
        AbstractC5504s.h(editText, "editText");
        this.f38471a = new SpannableStringBuilder(editText.getText());
        this.f38472b = editText.getTextSize();
        this.f38473c = editText.getMinLines();
        this.f38474d = editText.getMaxLines();
        this.f38475e = editText.getInputType();
        this.f38476f = editText.getBreakStrategy();
        this.f38477g = editText.getHint();
    }

    public final void a(EditText editText) {
        AbstractC5504s.h(editText, "editText");
        editText.setText(this.f38471a);
        editText.setTextSize(0, this.f38472b);
        editText.setMinLines(this.f38473c);
        editText.setMaxLines(this.f38474d);
        editText.setInputType(this.f38475e);
        editText.setHint(this.f38477g);
        editText.setBreakStrategy(this.f38476f);
    }
}

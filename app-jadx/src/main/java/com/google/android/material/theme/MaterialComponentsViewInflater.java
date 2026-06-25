package com.google.android.material.theme;

import D9.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.s;
import androidx.appcompat.widget.C2650d;
import androidx.appcompat.widget.C2652f;
import androidx.appcompat.widget.C2653g;
import androidx.appcompat.widget.C2667v;
import androidx.appcompat.widget.D;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;
import v9.C6854b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends s {
    @Override // androidx.appcompat.app.s
    protected C2650d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C2652f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C2653g e(Context context, AttributeSet attributeSet) {
        return new C6854b(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C2667v k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected D o(Context context, AttributeSet attributeSet) {
        return new J9.a(context, attributeSet);
    }
}

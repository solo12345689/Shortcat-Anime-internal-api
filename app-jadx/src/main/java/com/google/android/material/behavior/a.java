package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends d {
    a() {
    }

    @Override // com.google.android.material.behavior.d
    int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.d
    int b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.d
    int c() {
        return 1;
    }

    @Override // com.google.android.material.behavior.d
    ViewPropertyAnimator d(View view, int i10) {
        return view.animate().translationY(i10);
    }

    @Override // com.google.android.material.behavior.d
    void e(View view, int i10) {
        view.setTranslationY(i10);
    }
}

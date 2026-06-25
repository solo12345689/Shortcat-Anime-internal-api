package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC2946k;
import androidx.transition.y;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends AbstractC2946k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f42605a;

        a(TextView textView) {
            this.f42605a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f42605a.setScaleX(fFloatValue);
            this.f42605a.setScaleY(fFloatValue);
        }
    }

    private void t0(y yVar) {
        View view = yVar.f32494b;
        if (view instanceof TextView) {
            yVar.f32493a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public void i(y yVar) {
        t0(yVar);
    }

    @Override // androidx.transition.AbstractC2946k
    public void m(y yVar) {
        t0(yVar);
    }

    @Override // androidx.transition.AbstractC2946k
    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        if (yVar == null || yVar2 == null || !(yVar.f32494b instanceof TextView)) {
            return null;
        }
        View view = yVar2.f32494b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = yVar.f32493a;
        Map map2 = yVar2.f32493a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}

package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.react.AbstractC3251p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f36749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Activity context, View view) {
        super(context, AbstractC3251p.f37152b);
        AbstractC5504s.h(context, "context");
        this.f36749a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 c(int i10, View view, L0 windowInsets) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(windowInsets, "windowInsets");
        A1.b bVarF = windowInsets.f(i10);
        AbstractC5504s.g(bVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(bVarF.f104a, bVarF.f105b, bVarF.f106c, bVarF.f107d);
        return L0.f28953b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 d(Function2 function2, View p02, L0 p12) {
        AbstractC5504s.h(p02, "p0");
        AbstractC5504s.h(p12, "p1");
        return (L0) function2.invoke(p02, p12);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.f36749a;
        if (view != null) {
            final int i10 = L0.p.i() | L0.p.c();
            final Function2 function2 = new Function2() { // from class: com.facebook.react.devsupport.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i0.c(i10, (View) obj, (L0) obj2);
                }
            };
            AbstractC2747a0.w0(view, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.h0
                @Override // androidx.core.view.I
                public final L0 d(View view2, L0 l02) {
                    return i0.d(function2, view2, l02);
                }
            });
        }
    }
}

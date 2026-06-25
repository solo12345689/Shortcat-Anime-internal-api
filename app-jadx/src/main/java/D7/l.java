package d7;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.AbstractC3251p;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3289e;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45064i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45065j = Color.parseColor("#6C6C6C");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f45066k = 12.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f45067l = 10.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Typeface f45068m = Typeface.create("sans-serif", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f45070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Dialog f45071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f45072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f45073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f45074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f45075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f45076h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends ColorDrawable {
        b() {
            super(0);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) l.this.i(10.0f);
        }
    }

    public l(Context context, InterfaceC5082a onButtonPress) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(onButtonPress, "onButtonPress");
        this.f45069a = context;
        this.f45070b = onButtonPress;
        C3289e.i(context);
        this.f45071c = g();
    }

    private final Dialog d(float f10, final float f11) {
        View decorView;
        final Dialog dialog = new Dialog(this.f45069a, AbstractC3251p.f37151a);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        dialog.setCancelable(false);
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            WindowManager.LayoutParams attributes = window3.getAttributes();
            if (attributes != null) {
                attributes.width = -2;
                attributes.height = -2;
                attributes.gravity = 8388661;
                attributes.x = (int) f10;
                attributes.y = (int) f11;
            } else {
                attributes = null;
            }
            window3.setAttributes(attributes);
        }
        Window window4 = dialog.getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            AbstractC2747a0.w0(decorView, new I() { // from class: d7.k
                @Override // androidx.core.view.I
                public final L0 d(View view, L0 l02) {
                    return l.e(f11, dialog, view, l02);
                }
            });
        }
        return dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 e(float f10, Dialog dialog, View view, L0 windowInsets) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(windowInsets, "windowInsets");
        A1.b bVarF = windowInsets.f(L0.p.i());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.y = bVarF.f105b + ((int) f10);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setAttributes(layoutParams2);
        }
        return L0.f28953b;
    }

    private final LinearLayout f() {
        LinearLayout linearLayout = new LinearLayout(this.f45069a);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int i10 = (int) i(14.0f);
        int i11 = (int) i(7.0f);
        linearLayout.setPadding(i10, i11, i10, i11);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setCornerRadius(i(14.5f));
        gradientDrawable.setAlpha(102);
        gradientDrawable.setStroke((int) i(1.0f), f45065j);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(new b());
        return linearLayout;
    }

    private final Dialog g() {
        TextView textView = new TextView(this.f45069a);
        textView.setWidth((int) i(12.0f));
        textView.setHeight((int) i(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-65536);
        textView.setBackground(gradientDrawable);
        this.f45072d = textView;
        LinearLayout linearLayout = new LinearLayout(this.f45069a);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) i(2.0f), 0, 0, 0);
        TextView textView2 = new TextView(this.f45069a);
        float f10 = f45066k;
        textView2.setTextSize(f10);
        textView2.setTextColor(-1);
        Typeface typeface = f45068m;
        textView2.setTypeface(typeface);
        this.f45073e = textView2;
        TextView textView3 = new TextView(this.f45069a);
        textView3.setTextSize(f45067l);
        textView3.setTextColor(-1);
        textView3.setTypeface(typeface);
        this.f45074f = textView3;
        TextView textView4 = this.f45073e;
        WindowManager.LayoutParams layoutParams = null;
        if (textView4 == null) {
            AbstractC5504s.u("statusLabel");
            textView4 = null;
        }
        linearLayout.addView(textView4);
        TextView textView5 = this.f45074f;
        if (textView5 == null) {
            AbstractC5504s.u("tooltipLabel");
            textView5 = null;
        }
        linearLayout.addView(textView5);
        LinearLayout linearLayout2 = new LinearLayout(this.f45069a);
        linearLayout2.setPadding((int) i(8.0f), 0, 0, 0);
        linearLayout2.setVisibility(8);
        this.f45075g = linearLayout2;
        TextView textView6 = new TextView(this.f45069a);
        textView6.setTextSize(f10);
        textView6.setTextColor(-1);
        textView6.setTypeface(typeface);
        Drawable drawable = textView6.getContext().getDrawable(R.drawable.ic_dialog_alert);
        if (drawable != null) {
            drawable.setBounds(0, 1, (int) i(f10), ((int) i(f10)) + 1);
        } else {
            drawable = null;
        }
        textView6.setCompoundDrawables(drawable, null, null, null);
        textView6.setCompoundDrawablePadding((int) i(6.0f));
        this.f45076h = textView6;
        LinearLayout linearLayout3 = this.f45075g;
        if (linearLayout3 == null) {
            AbstractC5504s.u("issuesContainer");
            linearLayout3 = null;
        }
        TextView textView7 = this.f45076h;
        if (textView7 == null) {
            AbstractC5504s.u("issueCountLabel");
            textView7 = null;
        }
        linearLayout3.addView(textView7);
        LinearLayout linearLayoutF = f();
        linearLayoutF.setOnClickListener(new View.OnClickListener() { // from class: d7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.h(this.f45061a, view);
            }
        });
        TextView textView8 = this.f45072d;
        if (textView8 == null) {
            AbstractC5504s.u("statusIndicator");
            textView8 = null;
        }
        linearLayoutF.addView(textView8);
        linearLayoutF.addView(linearLayout);
        LinearLayout linearLayout4 = this.f45075g;
        if (linearLayout4 == null) {
            AbstractC5504s.u("issuesContainer");
            linearLayout4 = null;
        }
        linearLayoutF.addView(linearLayout4);
        Dialog dialogD = d(i(12.0f), i(12.0f));
        dialogD.setContentView(linearLayoutF);
        Window window = dialogD.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.flags |= 8;
                layoutParams = attributes;
            }
            window.setAttributes(layoutParams);
        }
        return dialogD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l lVar, View view) {
        lVar.f45070b.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float i(float f10) {
        return B.i(f10);
    }

    public final void j() {
        this.f45071c.hide();
    }

    public final void k() {
        this.f45071c.show();
    }

    public final void l(int i10) {
        TextView textView = this.f45076h;
        LinearLayout linearLayout = null;
        if (textView == null) {
            AbstractC5504s.u("issueCountLabel");
            textView = null;
        }
        textView.setText(String.valueOf(i10));
        LinearLayout linearLayout2 = this.f45075g;
        if (linearLayout2 == null) {
            AbstractC5504s.u("issuesContainer");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(i10 == 0 ? 8 : 0);
    }

    public final void m(TracingState state) {
        AbstractC5504s.h(state, "state");
        if (state == TracingState.ENABLED_IN_CDP_MODE) {
            this.f45071c.hide();
            return;
        }
        TextView textView = null;
        if (state == TracingState.ENABLED_IN_BACKGROUND_MODE) {
            TextView textView2 = this.f45072d;
            if (textView2 == null) {
                AbstractC5504s.u("statusIndicator");
                textView2 = null;
            }
            Drawable background = textView2.getBackground();
            AbstractC5504s.f(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(-65536);
            TextView textView3 = this.f45073e;
            if (textView3 == null) {
                AbstractC5504s.u("statusLabel");
                textView3 = null;
            }
            textView3.setText("Profiling Active");
            TextView textView4 = this.f45074f;
            if (textView4 == null) {
                AbstractC5504s.u("tooltipLabel");
            } else {
                textView = textView4;
            }
            textView.setText(this.f45069a.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? "Tap to open" : "Press ☰ to open");
        } else {
            TextView textView5 = this.f45072d;
            if (textView5 == null) {
                AbstractC5504s.u("statusIndicator");
                textView5 = null;
            }
            Drawable background2 = textView5.getBackground();
            AbstractC5504s.f(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background2).setColor(-7829368);
            TextView textView6 = this.f45073e;
            if (textView6 == null) {
                AbstractC5504s.u("statusLabel");
                textView6 = null;
            }
            textView6.setText("Profiling Stopped");
            TextView textView7 = this.f45074f;
            if (textView7 == null) {
                AbstractC5504s.u("tooltipLabel");
            } else {
                textView = textView7;
            }
            textView.setText(this.f45069a.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? "Tap to restart" : "Press ☰ to restart");
        }
        this.f45071c.show();
    }
}

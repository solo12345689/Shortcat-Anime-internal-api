package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: f */
    private static final C0628a f37975f = new C0628a(null);

    /* JADX INFO: renamed from: a */
    private Integer f37976a;

    /* JADX INFO: renamed from: b */
    private boolean f37977b;

    /* JADX INFO: renamed from: c */
    private boolean f37978c;

    /* JADX INFO: renamed from: d */
    private double f37979d;

    /* JADX INFO: renamed from: e */
    private ProgressBar f37980e;

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0628a {
        public /* synthetic */ C0628a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0628a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f37977b = true;
        this.f37978c = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f37976a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.f37980e;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.f37977b);
        setColor(progressBar);
        progressBar.setProgress((int) (this.f37979d * ((double) 1000)));
        progressBar.setVisibility(this.f37978c ? 0 : 4);
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f37978c;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.f37976a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f37977b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f37979d;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        AbstractC5504s.h(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(AbstractC3247l.f36928v);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z10) {
        this.f37978c = z10;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.f37976a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z10) {
        this.f37977b = z10;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.f37979d = d10;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        ProgressBar progressBarA = companion.a(getContext(), companion.b(str));
        progressBarA.setMax(1000);
        this.f37980e = progressBarA;
        removeAllViews();
        addView(this.f37980e, new ViewGroup.LayoutParams(-1, -1));
    }
}

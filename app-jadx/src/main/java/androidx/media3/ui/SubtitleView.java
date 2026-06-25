package androidx.media3.ui;

import G3.C1592a;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.C6403a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f31357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1592a f31358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f31361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f31365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f31366j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        void a(List list, C1592a c1592a, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31357a = Collections.EMPTY_LIST;
        this.f31358b = C1592a.f7129g;
        this.f31359c = 0;
        this.f31360d = 0.0533f;
        this.f31361e = 0.08f;
        this.f31362f = true;
        this.f31363g = true;
        C2923a c2923a = new C2923a(context);
        this.f31365i = c2923a;
        this.f31366j = c2923a;
        addView(c2923a);
        this.f31364h = 1;
    }

    private C6403a a(C6403a c6403a) {
        C6403a.b bVarA = c6403a.a();
        if (!this.f31362f) {
            F.c(bVarA);
        } else if (!this.f31363g) {
            F.d(bVarA);
        }
        return bVarA.a();
    }

    private void d(int i10, float f10) {
        this.f31359c = i10;
        this.f31360d = f10;
        g();
    }

    private void g() {
        this.f31365i.a(getCuesWithStylingPreferencesApplied(), this.f31358b, this.f31360d, this.f31359c, this.f31361e);
    }

    private List<C6403a> getCuesWithStylingPreferencesApplied() {
        if (this.f31362f && this.f31363g) {
            return this.f31357a;
        }
        ArrayList arrayList = new ArrayList(this.f31357a.size());
        for (int i10 = 0; i10 < this.f31357a.size(); i10++) {
            arrayList.add(a((C6403a) this.f31357a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1592a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C1592a.f7129g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C1592a.f7129g : C1592a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f31366j);
        View view = this.f31366j;
        if (view instanceof H) {
            ((H) view).g();
        }
        this.f31366j = t10;
        this.f31365i = t10;
        addView(t10);
    }

    public void b(int i10, float f10) {
        Context context = getContext();
        d(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void c(float f10, boolean z10) {
        d(z10 ? 1 : 0, f10);
    }

    public void e() {
        setStyle(getUserCaptionStyle());
    }

    public void f() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f31363g = z10;
        g();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f31362f = z10;
        g();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f31361e = f10;
        g();
    }

    public void setCues(List<C6403a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f31357a = list;
        g();
    }

    public void setFractionalTextSize(float f10) {
        c(f10, false);
    }

    public void setStyle(C1592a c1592a) {
        this.f31358b = c1592a;
        g();
    }

    public void setViewType(int i10) {
        if (this.f31364h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new C2923a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new H(getContext()));
        }
        this.f31364h = i10;
    }
}

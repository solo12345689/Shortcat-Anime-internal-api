package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.r;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends r implements o {

    /* JADX INFO: renamed from: e */
    public static final a f37981e = new a(null);

    /* JADX INFO: renamed from: a */
    private final SparseIntArray f37982a = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    private final SparseIntArray f37983b = new SparseIntArray();

    /* JADX INFO: renamed from: c */
    private final Set f37984c = new HashSet();

    /* JADX INFO: renamed from: d */
    private String f37985d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("ProgressBarShadowNode", W6.a.f20778b);
    }

    public b() {
        setMeasureFunction(this);
        this.f37985d = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    @Override // com.facebook.yoga.o
    public long measure(com.facebook.yoga.r node, float f10, p widthMode, float f11, p heightMode) {
        AbstractC5504s.h(node, "node");
        AbstractC5504s.h(widthMode, "widthMode");
        AbstractC5504s.h(heightMode, "heightMode");
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        int iB = companion.b(this.f37985d);
        if (!this.f37984c.contains(Integer.valueOf(iB))) {
            ProgressBar progressBarA = companion.a(getThemedContext(), iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f37982a.put(iB, progressBarA.getMeasuredHeight());
            this.f37983b.put(iB, progressBarA.getMeasuredWidth());
            this.f37984c.add(Integer.valueOf(iB));
        }
        return q.b(this.f37983b.get(iB), this.f37982a.get(iB));
    }

    @B7.a(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.f37985d = str;
    }
}

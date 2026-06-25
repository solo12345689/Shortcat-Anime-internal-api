package com.facebook.react.views.switchview;

import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends r implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38193d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38196c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("ReactSwitchShadowNode", W6.a.f20778b);
    }

    public d() {
        f();
    }

    private final void f() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.o
    public long measure(com.facebook.yoga.r node, float f10, p widthMode, float f11, p heightMode) {
        AbstractC5504s.h(node, "node");
        AbstractC5504s.h(widthMode, "widthMode");
        AbstractC5504s.h(heightMode, "heightMode");
        if (!this.f38196c) {
            C3284b0 themedContext = getThemedContext();
            AbstractC5504s.g(themedContext, "getThemedContext(...)");
            com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(themedContext);
            aVar.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f38194a = aVar.getMeasuredWidth();
            this.f38195b = aVar.getMeasuredHeight();
            this.f38196c = true;
        }
        return q.b(this.f38194a, this.f38195b);
    }
}

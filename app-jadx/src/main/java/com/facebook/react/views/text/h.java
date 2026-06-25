package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.C3309z;
import com.facebook.react.uimanager.O;
import com.facebook.react.uimanager.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends d {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final a f38270H = new a(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final TextPaint f38271I = new TextPaint(1);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Spannable f38272D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f38273E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.facebook.yoga.o f38274F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.facebook.yoga.b f38275G;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(o oVar) {
        super(oVar);
        this.f38274F = new com.facebook.yoga.o() { // from class: com.facebook.react.views.text.f
            @Override // com.facebook.yoga.o
            public final long measure(com.facebook.yoga.r rVar, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2) {
                return h.O(this.f38248a, rVar, f10, pVar, f11, pVar2);
            }
        };
        this.f38275G = new com.facebook.yoga.b() { // from class: com.facebook.react.views.text.g
            @Override // com.facebook.yoga.b
            public final float a(com.facebook.yoga.r rVar, float f10, float f11) {
                return h.N(this.f38269a, rVar, f10, f11);
            }
        };
        L();
    }

    private final int K() {
        int iV = super.v();
        if (getLayoutDirection() == com.facebook.yoga.h.RTL) {
            if (iV == 3) {
                return 5;
            }
            if (iV == 5) {
                return 3;
            }
        }
        return iV;
    }

    private final void L() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.f38274F);
        setBaselineFunction(this.f38275G);
    }

    private final Layout M(Spannable spannable, float f10, com.facebook.yoga.p pVar) {
        float fCeil = f10;
        TextPaint textPaint = f38271I;
        textPaint.setTextSize(w().c());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z10 = pVar == com.facebook.yoga.p.UNDEFINED || fCeil < 0.0f;
        int iK = K();
        Layout.Alignment alignment = iK != 1 ? (iK == 3 || iK != 5) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        if (metricsIsBoring == null && (z10 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= fCeil))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(p()).setBreakStrategy(x()).setHyphenationFrequency(o());
            AbstractC5504s.g(hyphenationFrequency, "setHyphenationFrequency(...)");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hyphenationFrequency.setJustificationMode(r());
            }
            if (i10 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            StaticLayout staticLayoutBuild = hyphenationFrequency.build();
            AbstractC5504s.g(staticLayoutBuild, "build(...)");
            return staticLayoutBuild;
        }
        if (metricsIsBoring != null && (z10 || metricsIsBoring.width <= fCeil)) {
            BoringLayout boringLayoutMake = BoringLayout.make(spannable, textPaint, (int) Math.max(metricsIsBoring.width, 0.0d), alignment, 1.0f, 0.0f, metricsIsBoring, p());
            AbstractC5504s.g(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        Layout.Alignment alignment2 = alignment;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) fCeil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(p()).setBreakStrategy(x()).setHyphenationFrequency(o());
        AbstractC5504s.g(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (i11 >= 26) {
            hyphenationFrequency2.setJustificationMode(r());
        }
        if (i11 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild2 = hyphenationFrequency2.build();
        AbstractC5504s.g(staticLayoutBuild2, "build(...)");
        return staticLayoutBuild2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float N(h hVar, com.facebook.yoga.r node, float f10, float f11) {
        AbstractC5504s.h(node, "node");
        Spannable spannable = hVar.f38272D;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        Layout layoutM = hVar.M(spannable, f10, com.facebook.yoga.p.EXACTLY);
        return layoutM.getLineBaseline(layoutM.getLineCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long O(com.facebook.react.views.text.h r17, com.facebook.yoga.r r18, float r19, com.facebook.yoga.p r20, float r21, com.facebook.yoga.p r22) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.h.O(com.facebook.react.views.text.h, com.facebook.yoga.r, float, com.facebook.yoga.p, float, com.facebook.yoga.p):long");
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public Iterable calculateLayoutOnChildren() {
        Map mapQ = q();
        if (mapQ == null || mapQ.isEmpty()) {
            return null;
        }
        Spannable spannable = this.f38272D;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        P7.s[] sVarArr = (P7.s[]) spannable.getSpans(0, spannable.length(), P7.s.class);
        ArrayList arrayList = new ArrayList();
        Iterator itA = AbstractC5489c.a(sVarArr);
        while (itA.hasNext()) {
            P7.s sVar = (P7.s) itA.next();
            Map mapQ2 = q();
            O o10 = mapQ2 != null ? (O) mapQ2.get(Integer.valueOf(sVar.b())) : null;
            if (o10 == null) {
                throw new IllegalStateException("Child is null");
            }
            o10.calculateLayout();
            arrayList.add(o10);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.P
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.P
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.P
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void onBeforeLayout(C3309z nativeViewHierarchyOptimizer) {
        AbstractC5504s.h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        this.f38272D = H(this, null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.P
    public void onCollectExtraUpdates(j0 uiViewOperationQueue) {
        AbstractC5504s.h(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        Spannable spannable = this.f38272D;
        if (spannable == null) {
            return;
        }
        uiViewOperationQueue.O(getReactTag(), new i(spannable, -1, j(), getPadding(4), getPadding(1), getPadding(5), getPadding(3), K(), x(), r()));
    }

    @B7.a(name = "onTextLayout")
    public final void setShouldNotifyOnTextLayout(boolean z10) {
        this.f38273E = z10;
    }
}

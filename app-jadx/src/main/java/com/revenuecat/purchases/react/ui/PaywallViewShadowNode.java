package com.revenuecat.purchases.react.ui;

import android.view.View;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/react/ui/PaywallViewShadowNode;", "Lcom/facebook/react/uimanager/r;", "Lcom/facebook/yoga/o;", "<init>", "()V", "Lcom/facebook/yoga/r;", "yogaNode", "", "width", "Lcom/facebook/yoga/p;", "yogaMeasureMode", "height", "yogaMeasureMode1", "", "measure", "(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaywallViewShadowNode extends r implements o {
    public PaywallViewShadowNode() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.o
    public long measure(com.facebook.yoga.r yogaNode, float width, p yogaMeasureMode, float height, p yogaMeasureMode1) {
        AbstractC5504s.h(yogaNode, "yogaNode");
        AbstractC5504s.h(yogaMeasureMode, "yogaMeasureMode");
        AbstractC5504s.h(yogaMeasureMode1, "yogaMeasureMode1");
        return q.a(View.MeasureSpec.getSize((int) width), View.MeasureSpec.getSize((int) height));
    }
}

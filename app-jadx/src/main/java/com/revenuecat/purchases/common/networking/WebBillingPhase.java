package com.revenuecat.purchases.common.networking;

import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", b.f34666x, "", "periodDuration", "", "cycleCount", "<init>", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;ILVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingPhase;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "getPrice", "Ljava/lang/String;", "getPeriodDuration", "getPeriodDuration$annotations", "()V", "I", "getCycleCount", "getCycleCount$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebBillingPhase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int cycleCount;
    private final String periodDuration;
    private final WebBillingPrice price;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rf.b serializer() {
            return WebBillingPhase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebBillingPhase() {
        this((WebBillingPrice) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ WebBillingPhase copy$default(WebBillingPhase webBillingPhase, WebBillingPrice webBillingPrice, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            webBillingPrice = webBillingPhase.price;
        }
        if ((i11 & 2) != 0) {
            str = webBillingPhase.periodDuration;
        }
        if ((i11 & 4) != 0) {
            i10 = webBillingPhase.cycleCount;
        }
        return webBillingPhase.copy(webBillingPrice, str, i10);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingPhase self, d output, e serialDesc) {
        if (output.g(serialDesc, 0) || self.price != null) {
            output.f(serialDesc, 0, WebBillingPrice$$serializer.INSTANCE, self.price);
        }
        if (output.g(serialDesc, 1) || self.periodDuration != null) {
            output.f(serialDesc, 1, x0.f20253a, self.periodDuration);
        }
        if (!output.g(serialDesc, 2) && self.cycleCount == 1) {
            return;
        }
        output.p(serialDesc, 2, self.cycleCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebBillingPrice getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeriodDuration() {
        return this.periodDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final WebBillingPhase copy(WebBillingPrice price, String periodDuration, int cycleCount) {
        return new WebBillingPhase(price, periodDuration, cycleCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebBillingPhase)) {
            return false;
        }
        WebBillingPhase webBillingPhase = (WebBillingPhase) other;
        return AbstractC5504s.c(this.price, webBillingPhase.price) && AbstractC5504s.c(this.periodDuration, webBillingPhase.periodDuration) && this.cycleCount == webBillingPhase.cycleCount;
    }

    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final String getPeriodDuration() {
        return this.periodDuration;
    }

    public final WebBillingPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        WebBillingPrice webBillingPrice = this.price;
        int iHashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        String str = this.periodDuration;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.cycleCount);
    }

    public String toString() {
        return "WebBillingPhase(price=" + this.price + ", periodDuration=" + this.periodDuration + ", cycleCount=" + this.cycleCount + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ WebBillingPhase(int i10, WebBillingPrice webBillingPrice, String str, int i11, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.price = null;
        } else {
            this.price = webBillingPrice;
        }
        if ((i10 & 2) == 0) {
            this.periodDuration = null;
        } else {
            this.periodDuration = str;
        }
        if ((i10 & 4) == 0) {
            this.cycleCount = 1;
        } else {
            this.cycleCount = i11;
        }
    }

    public WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i10) {
        this.price = webBillingPrice;
        this.periodDuration = str;
        this.cycleCount = i10;
    }

    public /* synthetic */ WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : webBillingPrice, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 1 : i10);
    }

    public static /* synthetic */ void getCycleCount$annotations() {
    }

    public static /* synthetic */ void getPeriodDuration$annotations() {
    }
}

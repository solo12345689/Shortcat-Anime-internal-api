package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Td.InterfaceC2154e;
import Vf.AbstractC2327f0;
import Vf.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "base", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "getBase", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComponentsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PaywallComponentsConfig base;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return ComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ ComponentsConfig(int i10, PaywallComponentsConfig paywallComponentsConfig, t0 t0Var) {
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, ComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.base = paywallComponentsConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentsConfig) && AbstractC5504s.c(this.base, ((ComponentsConfig) obj).base);
    }

    public final /* synthetic */ PaywallComponentsConfig getBase() {
        return this.base;
    }

    public int hashCode() {
        return this.base.hashCode();
    }

    public String toString() {
        return "ComponentsConfig(base=" + this.base + ')';
    }

    public ComponentsConfig(PaywallComponentsConfig base) {
        AbstractC5504s.h(base, "base");
        this.base = base;
    }
}

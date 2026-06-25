package com.revenuecat.purchases.ui.revenuecatui.activity;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0003R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgsStore;", "", "<init>", "()V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;", "args", "", ProductResponseJsonKeys.STORE, "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;)I", SubscriberAttributeKt.JSON_NAME_KEY, com.amazon.a.a.o.b.au, "(I)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;", "LTd/L;", "remove", "(I)V", "clear", "", "argsByHashCode", "Ljava/util/Map;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallActivityNonSerializableArgsStore {
    public static final PaywallActivityNonSerializableArgsStore INSTANCE = new PaywallActivityNonSerializableArgsStore();
    private static final Map<Integer, PaywallActivityNonSerializableArgs> argsByHashCode = new LinkedHashMap();
    public static final int $stable = 8;

    private PaywallActivityNonSerializableArgsStore() {
    }

    public final synchronized void clear() {
        argsByHashCode.clear();
    }

    public final synchronized PaywallActivityNonSerializableArgs get(int key) {
        return argsByHashCode.get(Integer.valueOf(key));
    }

    public final synchronized void remove(int key) {
        argsByHashCode.remove(Integer.valueOf(key));
    }

    public final synchronized int store(PaywallActivityNonSerializableArgs args) {
        int iIdentityHashCode;
        AbstractC5504s.h(args, "args");
        iIdentityHashCode = System.identityHashCode(args);
        argsByHashCode.put(Integer.valueOf(iIdentityHashCode), args);
        return iIdentityHashCode;
    }
}

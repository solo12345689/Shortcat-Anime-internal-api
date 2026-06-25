package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgsStore;", "", "<init>", "()V", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;", "args", "LTd/L;", "put", "(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;)V", com.amazon.a.a.o.b.au, "(Ljava/lang/String;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;", "remove", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", ProductResponseJsonKeys.STORE, "Ljava/util/concurrent/ConcurrentHashMap;", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallFragmentNonSerializableArgsStore {
    public static final PaywallFragmentNonSerializableArgsStore INSTANCE = new PaywallFragmentNonSerializableArgsStore();
    private static final ConcurrentHashMap<String, PaywallFragmentNonSerializableArgs> store = new ConcurrentHashMap<>();

    private PaywallFragmentNonSerializableArgsStore() {
    }

    public final PaywallFragmentNonSerializableArgs get(String key) {
        AbstractC5504s.h(key, "key");
        return store.get(key);
    }

    public final void put(String key, PaywallFragmentNonSerializableArgs args) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(args, "args");
        store.put(key, args);
    }

    public final void remove(String key) {
        AbstractC5504s.h(key, "key");
        store.remove(key);
    }
}

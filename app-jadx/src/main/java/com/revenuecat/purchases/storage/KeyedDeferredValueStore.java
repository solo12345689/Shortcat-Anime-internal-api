package com.revenuecat.purchases.storage;

import Gf.W;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ie.InterfaceC5082a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "H", "T", "", "lock", "<init>", "(Ljava/lang/Object;)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "LGf/W;", "task", "forgettingFailure", "(Ljava/lang/Object;Lie/a;)LGf/W;", "getOrPut", "Ljava/lang/Object;", "", "deferred", "Ljava/util/Map;", "getDeferred", "()Ljava/util/Map;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyedDeferredValueStore<H, T> {
    private final Map<H, W> deferred;
    private final Object lock;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyedDeferredValueStore() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    private final W forgettingFailure(H key, InterfaceC5082a task) {
        W w10 = (W) task.invoke();
        w10.H(new KeyedDeferredValueStore$forgettingFailure$1$1(this, key));
        return w10;
    }

    public final Map<H, W> getDeferred() {
        return this.deferred;
    }

    public final W getOrPut(H key, InterfaceC5082a task) {
        W wForgettingFailure;
        AbstractC5504s.h(task, "task");
        synchronized (this.lock) {
            wForgettingFailure = this.deferred.get(key);
            if (wForgettingFailure == null) {
                wForgettingFailure = forgettingFailure(key, task);
                this.deferred.put(key, wForgettingFailure);
            }
        }
        return wForgettingFailure;
    }

    public KeyedDeferredValueStore(Object lock) {
        AbstractC5504s.h(lock, "lock");
        this.lock = lock;
        this.deferred = new LinkedHashMap();
    }

    public /* synthetic */ KeyedDeferredValueStore(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Object() { // from class: com.revenuecat.purchases.storage.KeyedDeferredValueStore.1
        } : obj);
    }
}

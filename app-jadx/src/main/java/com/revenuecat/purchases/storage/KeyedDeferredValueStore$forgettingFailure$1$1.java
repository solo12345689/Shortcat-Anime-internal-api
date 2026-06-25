package com.revenuecat.purchases.storage;

import Td.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"H", "T", "", "exception", "LTd/L;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class KeyedDeferredValueStore$forgettingFailure$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ H $key;
    final /* synthetic */ KeyedDeferredValueStore<H, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyedDeferredValueStore$forgettingFailure$1$1(KeyedDeferredValueStore<H, T> keyedDeferredValueStore, H h10) {
        super(1);
        this.this$0 = keyedDeferredValueStore;
        this.$key = h10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return L.f17438a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            KeyedDeferredValueStore<H, T> keyedDeferredValueStore = this.this$0;
            Object obj = this.$key;
            synchronized (((KeyedDeferredValueStore) keyedDeferredValueStore).lock) {
                keyedDeferredValueStore.getDeferred().remove(obj);
                L l10 = L.f17438a;
            }
        }
    }
}

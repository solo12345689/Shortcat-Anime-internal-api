package com.revenuecat.purchases.common.caching;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.C2330h;
import Vf.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0015¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "", "isAutoRenewing", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenCacheEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean isAutoRenewing;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return TokenCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenCacheEntry() {
        this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TokenCacheEntry copy$default(TokenCacheEntry tokenCacheEntry, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = tokenCacheEntry.isAutoRenewing;
        }
        return tokenCacheEntry.copy(bool);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TokenCacheEntry self, d output, e serialDesc) {
        if (!output.g(serialDesc, 0) && self.isAutoRenewing == null) {
            return;
        }
        output.f(serialDesc, 0, C2330h.f20193a, self.isAutoRenewing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final TokenCacheEntry copy(Boolean isAutoRenewing) {
        return new TokenCacheEntry(isAutoRenewing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenCacheEntry) && AbstractC5504s.c(this.isAutoRenewing, ((TokenCacheEntry) other).isAutoRenewing);
    }

    public int hashCode() {
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "TokenCacheEntry(isAutoRenewing=" + this.isAutoRenewing + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ TokenCacheEntry(int i10, Boolean bool, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.isAutoRenewing = null;
        } else {
            this.isAutoRenewing = bool;
        }
    }

    public TokenCacheEntry(Boolean bool) {
        this.isAutoRenewing = bool;
    }

    public /* synthetic */ TokenCacheEntry(Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool);
    }
}

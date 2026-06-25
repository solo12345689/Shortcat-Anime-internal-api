package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.AbstractC2163n;
import Td.q;
import Vf.C2321c0;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabControlComponent implements PaywallComponent {
    public static final TabControlComponent INSTANCE = new TabControlComponent();
    private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.TabControlComponent$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return new C2321c0("tab_control", TabControlComponent.INSTANCE, new Annotation[0]);
        }
    }

    private TabControlComponent() {
    }

    private final /* synthetic */ b get$cachedSerializer() {
        return (b) $cachedSerializer$delegate.getValue();
    }

    public final b serializer() {
        return get$cachedSerializer();
    }
}

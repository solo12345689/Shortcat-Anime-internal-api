package com.revenuecat.purchases;

import Td.AbstractC2163n;
import Td.q;
import Td.r;
import Vf.A;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "", "(Ljava/lang/String;I)V", "postReceiptFieldValue", "", "getPostReceiptFieldValue", "()Ljava/lang/String;", "RESTORE", "PURCHASE", "UNSYNCED_ACTIVE_PURCHASES", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptInitiationSource$Companion$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final Rf.b invoke() {
                return A.b("com.revenuecat.purchases.PostReceiptInitiationSource", PostReceiptInitiationSource.values());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Rf.b get$cachedSerializer() {
            return (Rf.b) PostReceiptInitiationSource.$cachedSerializer$delegate.getValue();
        }

        public final Rf.b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getPostReceiptFieldValue() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "restore";
        }
        if (i10 == 2) {
            return "purchase";
        }
        if (i10 == 3) {
            return "unsynced_active_purchases";
        }
        throw new r();
    }
}

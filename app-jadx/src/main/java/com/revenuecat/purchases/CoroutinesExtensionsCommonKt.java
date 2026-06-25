package com.revenuecat.purchases;

import Td.u;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a:\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0004*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\u0003\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0014\u0010\u0018\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0018\u0010\u0003\u001a,\u0010\u001f\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0086@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;", "LTd/u;", "awaitOfferingsResult", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;LZd/e;)Ljava/lang/Object;", "awaitPurchaseResult", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;", "awaitGetProductsResult", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "awaitRestoreResult", "awaitStorefrontCountryCode", "Lcom/revenuecat/purchases/Purchases$Companion;", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "", "awaitCanMakePayments", "(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;LZd/e;)Ljava/lang/Object;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsCommonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {171}, m = "awaitGetProductsResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitGetProductsResult = CoroutinesExtensionsCommonKt.awaitGetProductsResult(null, null, null, this);
            return objAwaitGetProductsResult == AbstractC2605b.f() ? objAwaitGetProductsResult : u.a(objAwaitGetProductsResult);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {50}, m = "awaitOfferingsResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C40181 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40181(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitOfferingsResult = CoroutinesExtensionsCommonKt.awaitOfferingsResult(null, this);
            return objAwaitOfferingsResult == AbstractC2605b.f() ? objAwaitOfferingsResult : u.a(objAwaitOfferingsResult);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {109}, m = "awaitPurchaseResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C40191 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C40191(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitPurchaseResult = CoroutinesExtensionsCommonKt.awaitPurchaseResult(null, null, this);
            return objAwaitPurchaseResult == AbstractC2605b.f() ? objAwaitPurchaseResult : u.a(objAwaitPurchaseResult);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {230}, m = "awaitRestoreResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C40201 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40201(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitRestoreResult = CoroutinesExtensionsCommonKt.awaitRestoreResult(null, this);
            return objAwaitRestoreResult == AbstractC2605b.f() ? objAwaitRestoreResult : u.a(objAwaitRestoreResult);
        }
    }

    public static final /* synthetic */ Object awaitCanMakePayments(Purchases.Companion companion, Context context, List list, Zd.e eVar) throws Throwable {
        final Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        companion.canMakePayments(context, list, new Callback() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1
            @Override // com.revenuecat.purchases.interfaces.Callback
            public final void onReceived(Boolean bool) {
                kVar.resumeWith(u.b(bool));
            }
        });
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCanMakePayments$default(Purchases.Companion companion, Context context, List list, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC2279u.m();
        }
        return awaitCanMakePayments(companion, context, list, eVar);
    }

    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitGetProductsResult(com.revenuecat.purchases.Purchases r4, java.util.List r5, com.revenuecat.purchases.ProductType r6, Zd.e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.L$2
            com.revenuecat.purchases.ProductType r4 = (com.revenuecat.purchases.ProductType) r4
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Td.v.b(r7)
            goto L6e
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            Td.v.b(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            Zd.k r7 = new Zd.k
            Zd.e r2 = ae.AbstractC2605b.c(r0)
            r7.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1
            r2.<init>(r7)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2
            r3.<init>(r7)
            com.revenuecat.purchases.ListenerConversionsCommonKt.getProductsWith(r4, r5, r6, r2, r3)
            java.lang.Object r7 = r7.a()
            java.lang.Object r4 = ae.AbstractC2605b.f()
            if (r7 != r4) goto L6b
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            Td.u r7 = (Td.u) r7
            java.lang.Object r4 = r7.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProductsResult(com.revenuecat.purchases.Purchases, java.util.List, com.revenuecat.purchases.ProductType, Zd.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitGetProductsResult$default(Purchases purchases, List list, ProductType productType, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProductsResult(purchases, list, productType, eVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitOfferingsResult(com.revenuecat.purchases.Purchases r4, Zd.e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40181
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Td.v.b(r5)
            goto L62
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Td.v.b(r5)
            r0.L$0 = r4
            r0.label = r3
            Zd.k r5 = new Zd.k
            Zd.e r2 = ae.AbstractC2605b.c(r0)
            r5.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1
            r2.<init>(r5)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2
            r3.<init>(r5)
            com.revenuecat.purchases.ListenerConversionsCommonKt.getOfferingsWith(r4, r2, r3)
            java.lang.Object r5 = r5.a()
            java.lang.Object r4 = ae.AbstractC2605b.f()
            if (r5 != r4) goto L5f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L5f:
            if (r5 != r1) goto L62
            return r1
        L62:
            Td.u r5 = (Td.u) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitOfferingsResult(com.revenuecat.purchases.Purchases, Zd.e):java.lang.Object");
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(kVar)));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitPurchaseResult(com.revenuecat.purchases.Purchases r4, com.revenuecat.purchases.PurchaseParams r5, Zd.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40191
            if (r0 == 0) goto L13
            r0 = r6
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            com.revenuecat.purchases.PurchaseParams r4 = (com.revenuecat.purchases.PurchaseParams) r4
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Td.v.b(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            Td.v.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            Zd.k r6 = new Zd.k
            Zd.e r2 = ae.AbstractC2605b.c(r0)
            r6.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1
            r2.<init>(r6)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2
            r3.<init>(r6)
            com.revenuecat.purchases.interfaces.PurchaseCallback r2 = com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback(r2, r3)
            r4.purchase(r5, r2)
            java.lang.Object r6 = r6.a()
            java.lang.Object r4 = ae.AbstractC2605b.f()
            if (r6 != r4) goto L69
            kotlin.coroutines.jvm.internal.h.c(r0)
        L69:
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Td.u r6 = (Td.u) r6
            java.lang.Object r4 = r6.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitPurchaseResult(com.revenuecat.purchases.Purchases, com.revenuecat.purchases.PurchaseParams, Zd.e):java.lang.Object");
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitRestoreResult(com.revenuecat.purchases.Purchases r4, Zd.e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40201
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.C40201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Td.v.b(r5)
            goto L62
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Td.v.b(r5)
            r0.L$0 = r4
            r0.label = r3
            Zd.k r5 = new Zd.k
            Zd.e r2 = ae.AbstractC2605b.c(r0)
            r5.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1
            r2.<init>(r5)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2
            r3.<init>(r5)
            com.revenuecat.purchases.ListenerConversionsCommonKt.restorePurchasesWith(r4, r2, r3)
            java.lang.Object r5 = r5.a()
            java.lang.Object r4 = ae.AbstractC2605b.f()
            if (r5 != r4) goto L5f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L5f:
            if (r5 != r1) goto L62
            return r1
        L62:
            Td.u r5 = (Td.u) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitRestoreResult(com.revenuecat.purchases.Purchases, Zd.e):java.lang.Object");
    }

    public static final Object awaitStorefrontCountryCode(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(purchases, new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }
}

package com.revenuecat.purchases.paywalls.events;

import Rf.b;
import Rf.j;
import Sf.a;
import Tf.e;
import Tf.k;
import Uf.d;
import Uf.f;
import Wf.AbstractC2358b;
import Wf.C;
import Wf.h;
import Wf.i;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5490d;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "PAYWALL_IDENTIFIER_INDEX", "I", "PRESENTED_OFFERING_CONTEXT_INDEX", "PAYWALL_REVISION_INDEX", "SESSION_IDENTIFIER_INDEX", "DISPLAY_MODE_INDEX", "LOCALE_IDENTIFIER_INDEX", "DARK_MODE_INDEX", "EXIT_OFFER_TYPE_INDEX", "EXIT_OFFERING_IDENTIFIER_INDEX", "PACKAGE_IDENTIFIER_INDEX", "PRODUCT_IDENTIFIER_INDEX", "ERROR_CODE_INDEX", "ERROR_MESSAGE_INDEX", "", "nullableStringSerializer", "LRf/b;", "nullableIntSerializer", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "nullableExitOfferTypeSerializer", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallEventDataSerializer implements b {
    private static final int DARK_MODE_INDEX = 6;
    private static final int DISPLAY_MODE_INDEX = 4;
    private static final int ERROR_CODE_INDEX = 11;
    private static final int ERROR_MESSAGE_INDEX = 12;
    private static final int EXIT_OFFERING_IDENTIFIER_INDEX = 8;
    private static final int EXIT_OFFER_TYPE_INDEX = 7;
    private static final int LOCALE_IDENTIFIER_INDEX = 5;
    private static final int PACKAGE_IDENTIFIER_INDEX = 9;
    private static final int PAYWALL_IDENTIFIER_INDEX = 0;
    private static final int PAYWALL_REVISION_INDEX = 2;
    private static final int PRESENTED_OFFERING_CONTEXT_INDEX = 1;
    private static final int PRODUCT_IDENTIFIER_INDEX = 10;
    private static final int SESSION_IDENTIFIER_INDEX = 3;
    public static final PaywallEventDataSerializer INSTANCE = new PaywallEventDataSerializer();
    private static final b nullableStringSerializer = a.p(a.F(U.f52264a));
    private static final b nullableIntSerializer = a.p(a.C(r.f52290a));
    private static final b nullableExitOfferTypeSerializer = a.p(ExitOfferType.INSTANCE.serializer());
    private static final e descriptor = k.c("PaywallEvent.Data", new e[0], PaywallEventDataSerializer$descriptor$1.INSTANCE);

    private PaywallEventDataSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public PaywallEvent.Data deserialize(Uf.e decoder) {
        PresentedOfferingContext presentedOfferingContext;
        h hVar;
        String str;
        AbstractC5504s.h(decoder, "decoder");
        if (!(decoder instanceof h)) {
            throw new j("PaywallEvent.Data only supports JSON deserialization");
        }
        h hVar2 = (h) decoder;
        C cN = Wf.j.n(hVar2.g());
        if (cN.containsKey("presentedOfferingContext")) {
            AbstractC2358b abstractC2358bD = hVar2.d();
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = PresentedOfferingContextSerializer.INSTANCE;
            Object obj = cN.get("presentedOfferingContext");
            AbstractC5504s.e(obj);
            presentedOfferingContext = (PresentedOfferingContext) abstractC2358bD.c(presentedOfferingContextSerializer, (i) obj);
        } else {
            if (!cN.containsKey("offeringIdentifier")) {
                throw new j("Missing offering context information");
            }
            Object obj2 = cN.get("offeringIdentifier");
            AbstractC5504s.e(obj2);
            presentedOfferingContext = new PresentedOfferingContext(Wf.j.o((i) obj2).b());
        }
        i iVar = (i) cN.get("paywallIdentifier");
        String str2 = iVar != null ? (String) hVar2.d().c(a.F(U.f52264a), iVar) : null;
        AbstractC2358b abstractC2358bD2 = hVar2.d();
        r rVar = r.f52290a;
        b bVarC = a.C(rVar);
        Object obj3 = cN.get("paywallRevision");
        AbstractC5504s.e(obj3);
        int iIntValue = ((Number) abstractC2358bD2.c(bVarC, (i) obj3)).intValue();
        AbstractC2358b abstractC2358bD3 = hVar2.d();
        UUIDSerializer uUIDSerializer = UUIDSerializer.INSTANCE;
        Object obj4 = cN.get("sessionIdentifier");
        AbstractC5504s.e(obj4);
        UUID uuid = (UUID) abstractC2358bD3.c(uUIDSerializer, (i) obj4);
        AbstractC2358b abstractC2358bD4 = hVar2.d();
        U u10 = U.f52264a;
        b bVarF = a.F(u10);
        Object obj5 = cN.get("displayMode");
        AbstractC5504s.e(obj5);
        String str3 = (String) abstractC2358bD4.c(bVarF, (i) obj5);
        AbstractC2358b abstractC2358bD5 = hVar2.d();
        b bVarF2 = a.F(u10);
        Object obj6 = cN.get("localeIdentifier");
        AbstractC5504s.e(obj6);
        String str4 = (String) abstractC2358bD5.c(bVarF2, (i) obj6);
        AbstractC2358b abstractC2358bD6 = hVar2.d();
        b bVarX = a.x(C5490d.f52276a);
        Object obj7 = cN.get("darkMode");
        AbstractC5504s.e(obj7);
        boolean zBooleanValue = ((Boolean) abstractC2358bD6.c(bVarX, (i) obj7)).booleanValue();
        i iVar2 = (i) cN.get("exitOfferType");
        ExitOfferType exitOfferType = iVar2 != null ? (ExitOfferType) hVar2.d().c(ExitOfferType.INSTANCE.serializer(), iVar2) : null;
        i iVar3 = (i) cN.get("exitOfferingIdentifier");
        String str5 = iVar3 != null ? (String) hVar2.d().c(a.F(u10), iVar3) : null;
        i iVar4 = (i) cN.get("packageIdentifier");
        String str6 = iVar4 != null ? (String) hVar2.d().c(a.F(u10), iVar4) : null;
        i iVar5 = (i) cN.get("productIdentifier");
        if (iVar5 != null) {
            hVar = hVar2;
            str = (String) hVar2.d().c(a.F(u10), iVar5);
        } else {
            hVar = hVar2;
            str = null;
        }
        i iVar6 = (i) cN.get("errorCode");
        Integer numValueOf = iVar6 != null ? Integer.valueOf(((Number) hVar.d().c(a.C(rVar), iVar6)).intValue()) : null;
        i iVar7 = (i) cN.get(com.amazon.a.a.o.b.f34648f);
        return new PaywallEvent.Data(str2, presentedOfferingContext, iIntValue, uuid, str3, str4, zBooleanValue, exitOfferType, str5, str6, str, numValueOf, iVar7 != null ? (String) hVar.d().c(a.F(u10), iVar7) : null);
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallEvent.Data value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        String paywallIdentifier = value.getPaywallIdentifier();
        if (paywallIdentifier != null) {
            dVarB.k(INSTANCE.getDescriptor(), 0, paywallIdentifier);
        }
        PaywallEventDataSerializer paywallEventDataSerializer = INSTANCE;
        dVarB.m(paywallEventDataSerializer.getDescriptor(), 1, PresentedOfferingContextSerializer.INSTANCE, value.getPresentedOfferingContext());
        dVarB.p(paywallEventDataSerializer.getDescriptor(), 2, value.getPaywallRevision());
        dVarB.m(paywallEventDataSerializer.getDescriptor(), 3, UUIDSerializer.INSTANCE, value.getSessionIdentifier());
        dVarB.k(paywallEventDataSerializer.getDescriptor(), 4, value.getDisplayMode());
        dVarB.k(paywallEventDataSerializer.getDescriptor(), 5, value.getLocaleIdentifier());
        dVarB.B(paywallEventDataSerializer.getDescriptor(), 6, value.getDarkMode());
        ExitOfferType exitOfferType = value.getExitOfferType();
        if (exitOfferType != null) {
            dVarB.m(paywallEventDataSerializer.getDescriptor(), 7, ExitOfferType.INSTANCE.serializer(), exitOfferType);
        }
        String exitOfferingIdentifier = value.getExitOfferingIdentifier();
        if (exitOfferingIdentifier != null) {
            dVarB.k(paywallEventDataSerializer.getDescriptor(), 8, exitOfferingIdentifier);
        }
        String packageIdentifier = value.getPackageIdentifier();
        if (packageIdentifier != null) {
            dVarB.k(paywallEventDataSerializer.getDescriptor(), PACKAGE_IDENTIFIER_INDEX, packageIdentifier);
        }
        String productIdentifier = value.getProductIdentifier();
        if (productIdentifier != null) {
            dVarB.k(paywallEventDataSerializer.getDescriptor(), PRODUCT_IDENTIFIER_INDEX, productIdentifier);
        }
        Integer errorCode = value.getErrorCode();
        if (errorCode != null) {
            dVarB.p(paywallEventDataSerializer.getDescriptor(), ERROR_CODE_INDEX, errorCode.intValue());
        }
        String errorMessage = value.getErrorMessage();
        if (errorMessage != null) {
            dVarB.k(paywallEventDataSerializer.getDescriptor(), 12, errorMessage);
        }
        dVarB.c(descriptor2);
    }
}

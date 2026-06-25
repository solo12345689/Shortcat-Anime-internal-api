package com.revenuecat.purchases.subscriberattributes;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jk\u0010\u0013\u001a\u00020\u000b2 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "LTd/L;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;Lie/a;Lie/o;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ InterfaceC5096o $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5096o interfaceC5096o) {
            super(1);
            this.$onErrorHandler = interfaceC5096o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.$onErrorHandler.invoke(error, Boolean.FALSE, AbstractC2279u.m());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "responseCode", "Lorg/json/JSONObject;", "body", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ InterfaceC5096o $onErrorHandler;
        final /* synthetic */ InterfaceC5082a $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC5082a interfaceC5082a, InterfaceC5096o interfaceC5096o) {
            super(3);
            this.$onSuccessHandler = interfaceC5082a;
            this.$onErrorHandler = interfaceC5096o;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError, int i10, JSONObject body) throws JSONException {
            L l10;
            AbstractC5504s.h(body, "body");
            if (purchasesError != null) {
                InterfaceC5096o interfaceC5096o = this.$onErrorHandler;
                boolean zIsServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i10);
                boolean z10 = false;
                boolean z11 = i10 == 404;
                if (!zIsServerError && !z11) {
                    z10 = true;
                }
                List<SubscriberAttributeError> listM = AbstractC2279u.m();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    listM = BackendHelpersKt.getAttributeErrors(body);
                }
                interfaceC5096o.invoke(purchasesError, Boolean.valueOf(z10), listM);
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        AbstractC5504s.h(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> attributes, String appUserID, InterfaceC5082a onSuccessHandler, InterfaceC5096o onErrorHandler) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onSuccessHandler, "onSuccessHandler");
        AbstractC5504s.h(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(appUserID), S.f(z.a("attributes", attributes)), null, Delay.DEFAULT, new AnonymousClass1(onErrorHandler), new AnonymousClass2(onSuccessHandler, onErrorHandler));
    }
}

package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.S;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toMap", "", "", "", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FeatureEventMapperKt {
    public static final Map<String, Object> toMap(FeatureEvent featureEvent) {
        AbstractC5504s.h(featureEvent, "<this>");
        if (featureEvent instanceof PaywallEvent) {
            PaywallEvent paywallEvent = (PaywallEvent) featureEvent;
            return S.l(z.a("discriminator", "paywalls"), z.a("type", paywallEvent.getType().getValue()), z.a(DiagnosticsEntry.ID_KEY, paywallEvent.getCreationData().getId().toString()), z.a(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(paywallEvent.getCreationData().getDate().getTime())), z.a("offering_id", paywallEvent.getData().getPresentedOfferingContext().getOfferingIdentifier()), z.a("paywall_revision", Integer.valueOf(paywallEvent.getData().getPaywallRevision())), z.a("session_id", paywallEvent.getData().getSessionIdentifier().toString()), z.a("display_mode", paywallEvent.getData().getDisplayMode()), z.a("locale", paywallEvent.getData().getLocaleIdentifier()), z.a("dark_mode", Boolean.valueOf(paywallEvent.getData().getDarkMode())));
        }
        if (featureEvent instanceof CustomerCenterImpressionEvent) {
            CustomerCenterImpressionEvent customerCenterImpressionEvent = (CustomerCenterImpressionEvent) featureEvent;
            return S.l(z.a("discriminator", "customer_center"), z.a("type", "customer_center_impression"), z.a(DiagnosticsEntry.ID_KEY, customerCenterImpressionEvent.getCreationData().getId().toString()), z.a(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(customerCenterImpressionEvent.getCreationData().getDate().getTime())), z.a("dark_mode", Boolean.valueOf(customerCenterImpressionEvent.getData().getDarkMode())), z.a("locale", customerCenterImpressionEvent.getData().getLocale()), z.a("display_mode", customerCenterImpressionEvent.getData().getDisplayMode().name()), z.a("revision_id", Integer.valueOf(customerCenterImpressionEvent.getData().getRevisionID())));
        }
        if (!(featureEvent instanceof CustomerCenterSurveyOptionChosenEvent)) {
            return S.l(z.a("discriminator", "unknown"), z.a("type", "unknown"), z.a("class_name", O.b(featureEvent.getClass()).v()));
        }
        CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent = (CustomerCenterSurveyOptionChosenEvent) featureEvent;
        return S.l(z.a("discriminator", "customer_center"), z.a("type", "customer_center_survey_option_chosen"), z.a(DiagnosticsEntry.ID_KEY, customerCenterSurveyOptionChosenEvent.getCreationData().getId().toString()), z.a(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(customerCenterSurveyOptionChosenEvent.getCreationData().getDate().getTime())), z.a("dark_mode", Boolean.valueOf(customerCenterSurveyOptionChosenEvent.getData().getDarkMode())), z.a("locale", customerCenterSurveyOptionChosenEvent.getData().getLocale()), z.a("display_mode", customerCenterSurveyOptionChosenEvent.getData().getDisplayMode().name()), z.a("survey_option_id", customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionID()), z.a("path", customerCenterSurveyOptionChosenEvent.getData().getPath().name()), z.a("url", customerCenterSurveyOptionChosenEvent.getData().getUrl()), z.a("revision_id", Integer.valueOf(customerCenterSurveyOptionChosenEvent.getData().getRevisionID())));
    }
}

package com.revenuecat.purchases.ui.revenuecatui.data;

import Df.r;
import Ud.S;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Ljava/util/Locale;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    @Override // ie.InterfaceC5082a
    public final Map<String, Locale> invoke() {
        String str = this.this$0.storefrontCountryCode;
        if (str == null || r.l0(str)) {
            return S.i();
        }
        PaywallState.Loaded.Components components = this.this$0;
        Map mapC = S.c();
        Locale[] availableLocales = Locale.getAvailableLocales();
        AbstractC5504s.g(availableLocales, "getAvailableLocales()");
        for (Locale availableLocale : availableLocales) {
            if (r.B(availableLocale.getCountry(), components.storefrontCountryCode, true)) {
                String language = availableLocale.getLanguage();
                AbstractC5504s.g(language, "availableLocale.language");
                String lowerCase = language.toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase, "toLowerCase(...)");
                AbstractC5504s.g(availableLocale, "availableLocale");
                mapC.put(lowerCase, availableLocale);
            }
        }
        return S.b(mapC);
    }
}

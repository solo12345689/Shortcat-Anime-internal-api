package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Df.r;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createLocaleFromString", "Ljava/util/Locale;", "localeString", "", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocaleHelpersKt {
    public static final Locale createLocaleFromString(String localeString) {
        AbstractC5504s.h(localeString, "localeString");
        if (!r.V(localeString, '-', false, 2, null) && !r.V(localeString, '_', false, 2, null)) {
            return new Locale(localeString);
        }
        List listM0 = r.V(localeString, '-', false, 2, null) ? r.M0(localeString, new char[]{'-'}, false, 2, 2, null) : r.M0(localeString, new char[]{'_'}, false, 2, 2, null);
        return listM0.size() >= 2 ? new Locale((String) listM0.get(0), (String) listM0.get(1)) : new Locale((String) listM0.get(0));
    }
}

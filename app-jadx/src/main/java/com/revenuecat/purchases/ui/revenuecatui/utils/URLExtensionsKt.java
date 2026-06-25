package com.revenuecat.purchases.ui.revenuecatui.utils;

import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"appendQueryParameter", "Ljava/net/URL;", "name", "", "value", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class URLExtensionsKt {
    public static final /* synthetic */ URL appendQueryParameter(URL url, String name, String value) {
        AbstractC5504s.h(url, "<this>");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(value, "value");
        return new URL(url + (url.getQuery() == null ? "?" : "&") + name + '=' + value);
    }
}

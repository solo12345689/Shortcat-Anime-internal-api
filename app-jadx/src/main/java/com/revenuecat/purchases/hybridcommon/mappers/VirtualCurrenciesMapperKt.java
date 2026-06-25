package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.S;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrenciesMapperKt {
    public static final Map<String, Object> map(VirtualCurrencies virtualCurrencies) {
        AbstractC5504s.h(virtualCurrencies, "<this>");
        Map<String, VirtualCurrency> all = virtualCurrencies.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), VirtualCurrencyMapperKt.map((VirtualCurrency) entry.getValue()));
        }
        return S.f(z.a("all", linkedHashMap));
    }
}

package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/EntitlementInfos;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfosMapperKt {
    public static final Map<String, Object> map(EntitlementInfos entitlementInfos) {
        AbstractC5504s.h(entitlementInfos, "<this>");
        Set<Map.Entry<String, EntitlementInfo>> setEntrySet = entitlementInfos.getAll().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = z.a(entry.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry.getValue()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        Pair pairA2 = z.a("all", linkedHashMap);
        Set<Map.Entry<String, EntitlementInfo>> setEntrySet2 = entitlementInfos.getActive().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet2, 10)), 16));
        Iterator<T> it2 = setEntrySet2.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Pair pairA3 = z.a(entry2.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry2.getValue()));
            linkedHashMap2.put(pairA3.c(), pairA3.d());
        }
        return S.l(pairA2, z.a(AppStateModule.APP_STATE_ACTIVE, linkedHashMap2), z.a("verification", entitlementInfos.getVerification().name()));
    }
}

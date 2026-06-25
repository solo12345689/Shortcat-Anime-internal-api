package com.revenuecat.purchases.utils;

import Df.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001H\u0000\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\\\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012 \u0010\n\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\f\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u000bH\u0000¨\u0006\r"}, d2 = {"filterNotNullValues", "", "K", "V", "getStringValueForPrimitive", "", SubscriberAttributeKt.JSON_NAME_KEY, "mapNotNullKeys", "R", "", "transform", "Lkotlin/Function1;", "", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        AbstractC5504s.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String getStringValueForPrimitive(Map<?, ?> map, String key) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(key, "key");
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String ? true : obj instanceof Number ? true : obj instanceof Boolean ? true : obj instanceof Character) {
            String string = obj.toString();
            if (!r.l0(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapNotNullKeys(Map<K, ? extends V> map, Function1 transform) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            Object objInvoke = transform.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(objInvoke, entry.getValue());
            }
        }
        return linkedHashMap;
    }
}

package com.revenuecat.purchases.common.networking;

import Td.z;
import Ud.S;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0004\u0018\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/MapConverter;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "ifSuccess", "tryCast", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "", "inputMap", "Lorg/json/JSONObject;", "convertToJSON$purchases_defaultsBc8Release", "(Ljava/util/Map;)Lorg/json/JSONObject;", "convertToJSON", "createJSONObject$purchases_defaultsBc8Release", "createJSONObject", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MapConverter {
    private final /* synthetic */ <T> Object tryCast(Object obj, Function1 function1) {
        AbstractC5504s.l(3, "T");
        return obj != null ? function1.invoke(obj) : obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsBc8Release(Map<String, ? extends Object> inputMap) throws JSONException {
        AbstractC5504s.h(inputMap, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(inputMap.size()));
        Iterator<T> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    value = new JSONObject(S.f(z.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                } else {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (!(it2.next() instanceof String)) {
                            break;
                        }
                    }
                    value = new JSONObject(S.f(z.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsBc8Release((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsBc8Release(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsBc8Release(Map<String, ? extends Object> inputMap) {
        AbstractC5504s.h(inputMap, "inputMap");
        return new JSONObject(inputMap);
    }
}

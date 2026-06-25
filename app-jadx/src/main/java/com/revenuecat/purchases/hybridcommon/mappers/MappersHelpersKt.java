package com.revenuecat.purchases.hybridcommon.mappers;

import Cf.i;
import Cf.l;
import Gf.K;
import Gf.O;
import Gf.P;
import Td.AbstractC2163n;
import Td.z;
import Ud.AbstractC2273n;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000*\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0001*\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\"\u001b\u0010\u001f\u001a\u00020\u00158@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019\"\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "", "Lorg/json/JSONObject;", "convertToJson", "(Ljava/util/Map;)Lorg/json/JSONObject;", "", "Lorg/json/JSONArray;", "convertToJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "convertToMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Ljava/util/Date;", "", "toMillis", "(Ljava/util/Date;)J", "toIso8601", "(Ljava/util/Date;)Ljava/lang/String;", "priceCurrencyCode", "number", "formatUsingDeviceLocale", "(Ljava/lang/String;J)Ljava/lang/String;", "LGf/K;", "overrideMapperDispatcher", "LGf/K;", "getOverrideMapperDispatcher", "()LGf/K;", "setOverrideMapperDispatcher", "(LGf/K;)V", "mapperDispatcher$delegate", "Lkotlin/Lazy;", "getMapperDispatcher", "mapperDispatcher", "LGf/O;", "mainScope", "LGf/O;", "getMainScope", "()LGf/O;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MappersHelpersKt {
    private static K overrideMapperDispatcher;
    private static final Lazy mapperDispatcher$delegate = AbstractC2163n.b(MappersHelpersKt$mapperDispatcher$2.INSTANCE);
    private static final O mainScope = P.b();

    public static final JSONObject convertToJson(Map<String, ?> map) throws JSONException {
        AbstractC5504s.h(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(key, JSONObject.NULL);
            } else if (value instanceof Map) {
                AbstractC5504s.f(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONObject.put(key, convertToJson((Map) value));
            } else if (value instanceof List) {
                jSONObject.put(key, convertToJsonArray((List) value));
            } else if (value instanceof Object[]) {
                jSONObject.put(key, convertToJsonArray(AbstractC2273n.V0((Object[]) value)));
            } else {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List<?> list) {
        AbstractC5504s.h(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (obj instanceof Map) {
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONArray.put(convertToJson((Map) obj));
            } else if (obj instanceof Object[]) {
                jSONArray.put(convertToJsonArray(AbstractC2273n.e((Object[]) obj)));
            } else if (obj instanceof List) {
                jSONArray.put(convertToJsonArray((List) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final Map<String, String> convertToMap(JSONObject jSONObject) {
        AbstractC5504s.h(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC5504s.g(itKeys, "this.keys()");
        i<String> iVarG = l.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : iVarG) {
            Pair pairA = jSONObject.isNull(str) ? z.a(str, null) : z.a(str, jSONObject.getString(str));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String priceCurrencyCode, long j10) {
        AbstractC5504s.h(priceCurrencyCode, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(priceCurrencyCode));
        String str = currencyInstance.format(j10);
        AbstractC5504s.g(str, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return str;
    }

    public static final O getMainScope() {
        return mainScope;
    }

    public static final K getMapperDispatcher() {
        return (K) mapperDispatcher$delegate.getValue();
    }

    public static final K getOverrideMapperDispatcher() {
        return overrideMapperDispatcher;
    }

    public static final void setOverrideMapperDispatcher(K k10) {
        overrideMapperDispatcher = k10;
    }

    public static final String toIso8601(Date date) {
        AbstractC5504s.h(date, "<this>");
        String str = Iso8601Utils.format(date);
        AbstractC5504s.g(str, "format(this)");
        return str;
    }

    public static final long toMillis(Date date) {
        AbstractC5504s.h(date, "<this>");
        return date.getTime();
    }
}

package com.revenuecat.purchases.react.ui;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u00030\u0007H\u0007J\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0002¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;", "", "<init>", "()V", "convertMapToWriteableMap", "Lcom/facebook/react/bridge/WritableMap;", "map", "", "", "convertArrayToWritableArray", "Lcom/facebook/react/bridge/WritableArray;", "array", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "offeringIdentifier", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNPurchasesConverters {
    public static final RNPurchasesConverters INSTANCE = new RNPurchasesConverters();

    private RNPurchasesConverters() {
    }

    private final WritableArray convertArrayToWritableArray(Object[] array) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : array) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                writableNativeArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                writableNativeArray.pushMap(convertMapToWriteableMap((Map) obj));
            } else if (obj instanceof Object[]) {
                writableNativeArray.pushArray(convertArrayToWritableArray((Object[]) obj));
            } else if (obj instanceof List) {
                writableNativeArray.pushArray(convertArrayToWritableArray(((Collection) obj).toArray(new Object[0])));
            }
        }
        return writableNativeArray;
    }

    public static final WritableMap convertMapToWriteableMap(Map<String, ?> map) {
        AbstractC5504s.h(map, "map");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                writableNativeMap.putNull(key);
            } else if (value instanceof Boolean) {
                writableNativeMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableNativeMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                writableNativeMap.putDouble(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                writableNativeMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                writableNativeMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                AbstractC5504s.f(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                writableNativeMap.putMap(key, convertMapToWriteableMap((Map) value));
            } else if (value instanceof Object[]) {
                writableNativeMap.putArray(key, INSTANCE.convertArrayToWritableArray((Object[]) value));
            } else if (value instanceof List) {
                writableNativeMap.putArray(key, INSTANCE.convertArrayToWritableArray(((Collection) value).toArray(new Object[0])));
            }
        }
        return writableNativeMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext(java.lang.String r5, java.util.Map<?, ?> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "offeringIdentifier"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            if (r6 != 0) goto Ld
            com.revenuecat.purchases.PresentedOfferingContext r6 = new com.revenuecat.purchases.PresentedOfferingContext
            r6.<init>(r5)
            return r6
        Ld:
            java.lang.String r0 = "targetingContext"
            java.lang.Object r0 = r6.get(r0)
            boolean r1 = r0 instanceof java.util.Map
            r2 = 0
            if (r1 == 0) goto L1b
            java.util.Map r0 = (java.util.Map) r0
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L54
            java.lang.String r1 = "revision"
            java.lang.Object r1 = r0.get(r1)
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto L2b
            java.lang.Number r1 = (java.lang.Number) r1
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L37
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L38
        L37:
            r1 = r2
        L38:
            java.lang.String r3 = "ruleId"
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L45
            java.lang.String r0 = (java.lang.String) r0
            goto L46
        L45:
            r0 = r2
        L46:
            if (r1 == 0) goto L54
            if (r0 == 0) goto L54
            com.revenuecat.purchases.PresentedOfferingContext$TargetingContext r3 = new com.revenuecat.purchases.PresentedOfferingContext$TargetingContext
            int r1 = r1.intValue()
            r3.<init>(r1, r0)
            goto L55
        L54:
            r3 = r2
        L55:
            java.lang.String r0 = "placementIdentifier"
            java.lang.Object r6 = r6.get(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L62
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L62:
            com.revenuecat.purchases.PresentedOfferingContext r6 = new com.revenuecat.purchases.PresentedOfferingContext
            r6.<init>(r5, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.react.ui.RNPurchasesConverters.presentedOfferingContext(java.lang.String, java.util.Map):com.revenuecat.purchases.PresentedOfferingContext");
    }
}

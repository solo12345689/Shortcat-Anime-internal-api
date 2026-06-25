package com.adjust.nativemodule;

import android.net.Uri;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a {

    /* JADX INFO: renamed from: com.adjust.nativemodule.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class C0580a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33903a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f33903a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33903a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33903a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33903a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33903a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33903a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static WritableMap a(AdjustAttribution adjustAttribution) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustAttribution == null) {
            return writableMapCreateMap;
        }
        String str = adjustAttribution.trackerToken;
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("trackerToken", str);
        String str2 = adjustAttribution.trackerName;
        if (str2 == null) {
            str2 = "";
        }
        writableMapCreateMap.putString("trackerName", str2);
        String str3 = adjustAttribution.network;
        if (str3 == null) {
            str3 = "";
        }
        writableMapCreateMap.putString("network", str3);
        String str4 = adjustAttribution.campaign;
        if (str4 == null) {
            str4 = "";
        }
        writableMapCreateMap.putString("campaign", str4);
        String str5 = adjustAttribution.adgroup;
        if (str5 == null) {
            str5 = "";
        }
        writableMapCreateMap.putString("adgroup", str5);
        String str6 = adjustAttribution.creative;
        if (str6 == null) {
            str6 = "";
        }
        writableMapCreateMap.putString("creative", str6);
        String str7 = adjustAttribution.clickLabel;
        if (str7 == null) {
            str7 = "";
        }
        writableMapCreateMap.putString("clickLabel", str7);
        String str8 = adjustAttribution.costType;
        if (str8 == null) {
            str8 = "";
        }
        writableMapCreateMap.putString("costType", str8);
        Double d10 = adjustAttribution.costAmount;
        writableMapCreateMap.putDouble("costAmount", (d10 == null || d10.isNaN()) ? 0.0d : adjustAttribution.costAmount.doubleValue());
        String str9 = adjustAttribution.costCurrency;
        if (str9 == null) {
            str9 = "";
        }
        writableMapCreateMap.putString("costCurrency", str9);
        String str10 = adjustAttribution.jsonResponse;
        writableMapCreateMap.putString("jsonResponse", str10 != null ? str10.toString() : "");
        String str11 = adjustAttribution.fbInstallReferrer;
        writableMapCreateMap.putString("fbInstallReferrer", str11 != null ? str11 : "");
        return writableMapCreateMap;
    }

    public static WritableMap b(Uri uri) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (uri == null) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString(Constants.DEEPLINK, uri.toString());
        return writableMapCreateMap;
    }

    public static WritableMap c(AdjustEventFailure adjustEventFailure) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustEventFailure == null) {
            return writableMapCreateMap;
        }
        String str = adjustEventFailure.message;
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("message", str);
        String str2 = adjustEventFailure.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        writableMapCreateMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str2);
        String str3 = adjustEventFailure.adid;
        if (str3 == null) {
            str3 = "";
        }
        writableMapCreateMap.putString("adid", str3);
        String str4 = adjustEventFailure.eventToken;
        if (str4 == null) {
            str4 = "";
        }
        writableMapCreateMap.putString("eventToken", str4);
        String str5 = adjustEventFailure.callbackId;
        if (str5 == null) {
            str5 = "";
        }
        writableMapCreateMap.putString("callbackId", str5);
        writableMapCreateMap.putString("willRetry", adjustEventFailure.willRetry ? b.f34640af : b.f34641ag);
        JSONObject jSONObject = adjustEventFailure.jsonResponse;
        writableMapCreateMap.putString("jsonResponse", jSONObject != null ? jSONObject.toString() : "");
        return writableMapCreateMap;
    }

    public static WritableMap d(AdjustEventSuccess adjustEventSuccess) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustEventSuccess == null) {
            return writableMapCreateMap;
        }
        String str = adjustEventSuccess.message;
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("message", str);
        String str2 = adjustEventSuccess.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        writableMapCreateMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str2);
        String str3 = adjustEventSuccess.adid;
        if (str3 == null) {
            str3 = "";
        }
        writableMapCreateMap.putString("adid", str3);
        String str4 = adjustEventSuccess.eventToken;
        if (str4 == null) {
            str4 = "";
        }
        writableMapCreateMap.putString("eventToken", str4);
        String str5 = adjustEventSuccess.callbackId;
        if (str5 == null) {
            str5 = "";
        }
        writableMapCreateMap.putString("callbackId", str5);
        JSONObject jSONObject = adjustEventSuccess.jsonResponse;
        writableMapCreateMap.putString("jsonResponse", jSONObject != null ? jSONObject.toString() : "");
        return writableMapCreateMap;
    }

    public static boolean e(String str) {
        return (str == null || str.equals("") || str.equals("null")) ? false : true;
    }

    public static WritableMap f(AdjustRemoteTrigger adjustRemoteTrigger) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustRemoteTrigger == null) {
            writableMapCreateMap.putString("label", "");
            writableMapCreateMap.putString("payloadJson", "{}");
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("label", adjustRemoteTrigger.getLabel() != null ? adjustRemoteTrigger.getLabel() : "");
        writableMapCreateMap.putString("payloadJson", adjustRemoteTrigger.getPayload() != null ? adjustRemoteTrigger.getPayload().toString() : "{}");
        return writableMapCreateMap;
    }

    public static WritableMap g(AdjustSessionFailure adjustSessionFailure) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustSessionFailure == null) {
            return writableMapCreateMap;
        }
        String str = adjustSessionFailure.message;
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("message", str);
        String str2 = adjustSessionFailure.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        writableMapCreateMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str2);
        String str3 = adjustSessionFailure.adid;
        if (str3 == null) {
            str3 = "";
        }
        writableMapCreateMap.putString("adid", str3);
        writableMapCreateMap.putString("willRetry", adjustSessionFailure.willRetry ? b.f34640af : b.f34641ag);
        JSONObject jSONObject = adjustSessionFailure.jsonResponse;
        writableMapCreateMap.putString("jsonResponse", jSONObject != null ? jSONObject.toString() : "");
        return writableMapCreateMap;
    }

    public static WritableMap h(AdjustSessionSuccess adjustSessionSuccess) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (adjustSessionSuccess == null) {
            return writableMapCreateMap;
        }
        String str = adjustSessionSuccess.message;
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("message", str);
        String str2 = adjustSessionSuccess.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        writableMapCreateMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str2);
        String str3 = adjustSessionSuccess.adid;
        if (str3 == null) {
            str3 = "";
        }
        writableMapCreateMap.putString("adid", str3);
        JSONObject jSONObject = adjustSessionSuccess.jsonResponse;
        writableMapCreateMap.putString("jsonResponse", jSONObject != null ? jSONObject.toString() : "");
        return writableMapCreateMap;
    }

    public static List i(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (C0580a.f33903a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    int i11 = (int) d10;
                    if (d10 == i11) {
                        arrayList.add(Integer.valueOf(i11));
                    } else {
                        arrayList.add(Double.valueOf(d10));
                    }
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(j(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList = i(readableArray.getArray(i10));
                    break;
                default:
                    AdjustFactory.getLogger().error("Could not convert object with index: " + i10 + ".", new Object[0]);
                    break;
            }
        }
        return arrayList;
    }

    public static Map j(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        if (!readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            return null;
        }
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = k(readableMap, strNextKey).toString();
            if (string == null) {
                AdjustFactory.getLogger().warn("Null parameter inside key-value pair with key: " + strNextKey, new Object[0]);
            } else {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    private static Object k(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (C0580a.f33903a[readableMap.getType(str).ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                double d10 = readableMap.getDouble(str);
                int i10 = (int) d10;
                if (d10 != i10) {
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AdjustFactory.getLogger().error("Could not convert object with key: " + str + ".", new Object[0]);
                break;
        }
        return null;
    }
}

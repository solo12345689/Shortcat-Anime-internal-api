package v7;

import Td.L;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.InspectorNetworkReporter;
import dg.C;
import dg.D;
import dg.t;
import h7.C4914b;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f61988a = new e();

    private e() {
    }

    public static final void b(String devToolsRequestId, C request) {
        String strH;
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        AbstractC5504s.h(request, "request");
        if (C4914b.r()) {
            Map mapA = f61988a.a(request.b());
            String str = "";
            if (Y6.a.f22860b) {
                D dA = request.a();
                h hVar = dA instanceof h ? (h) dA : null;
                if (hVar == null || (strH = hVar.h()) == null) {
                    D dA2 = request.a();
                    String string = dA2 != null ? dA2.toString() : null;
                    if (string != null) {
                        str = string;
                    }
                } else {
                    str = strH;
                }
            }
            String str2 = str;
            String string2 = request.d().toString();
            String strC = request.c();
            D dA3 = request.a();
            InspectorNetworkReporter.reportRequestStart(devToolsRequestId, string2, strC, mapA, str2, dA3 != null ? dA3.a() : 0L);
            InspectorNetworkReporter.reportConnectionTiming(devToolsRequestId, mapA);
        }
    }

    public static final void c(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, WritableMap data, byte[] rawData) {
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(rawData, "rawData");
        if (C4914b.r()) {
            String strEncodeToString = Base64.encodeToString(rawData, 2);
            AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, strEncodeToString, true);
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(i10);
            writableArrayCreateArray.pushMap(data);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void d(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, String str, String responseType) {
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        AbstractC5504s.h(responseType, "responseType");
        if (C4914b.r()) {
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, str == null ? "" : str, AbstractC5504s.c(responseType, "base64"));
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.add(str);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void e(ReactApplicationContext reactApplicationContext, int i10, long j10, long j11) {
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.add((int) j10);
            readableArrayBuilder.add((int) j11);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    public static final void f(ReactApplicationContext reactApplicationContext, int i10, long j10, long j11) {
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.add((int) j10);
            readableArrayBuilder.add((int) j11);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    public static final void g(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, String str, long j10, long j11) {
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        if (C4914b.r() && str != null) {
            InspectorNetworkReporter.reportDataReceived(devToolsRequestId, str);
            InspectorNetworkReporter.maybeStoreResponseBodyIncremental(devToolsRequestId, str);
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.add(str);
            readableArrayBuilder.add((int) j10);
            readableArrayBuilder.add((int) j11);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    public static final void h(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, String str, Throwable th2) {
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        if (C4914b.r()) {
            InspectorNetworkReporter.reportRequestFailed(devToolsRequestId, false);
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.add(str);
            if (AbstractC5504s.c(th2 != null ? th2.getClass() : null, SocketTimeoutException.class)) {
                readableArrayBuilder.add(true);
            }
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void i(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, long j10) {
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        if (C4914b.r()) {
            InspectorNetworkReporter.reportResponseEnd(devToolsRequestId, j10);
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i10);
            readableArrayBuilder.addNull();
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void j(ReactApplicationContext reactApplicationContext, int i10, String devToolsRequestId, String str, int i11, Map headers, long j10) {
        int i12;
        AbstractC5504s.h(devToolsRequestId, "devToolsRequestId");
        AbstractC5504s.h(headers, "headers");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : headers.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (C4914b.r()) {
            i12 = i11;
            InspectorNetworkReporter.reportResponseStart(devToolsRequestId, str == null ? "" : str, i12, headers, j10);
        } else {
            i12 = i11;
        }
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(i10);
            writableArrayCreateArray.pushInt(i12);
            writableArrayCreateArray.pushMap(Arguments.fromBundle(bundle));
            writableArrayCreateArray.pushString(str);
            L l10 = L.f17438a;
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }

    public final Map a(t headers) {
        AbstractC5504s.h(headers, "headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iB = headers.b();
        for (int i10 = 0; i10 < iB; i10++) {
            String strF = headers.f(i10);
            if (linkedHashMap.containsKey(strF)) {
                linkedHashMap.put(strF, linkedHashMap.get(strF) + ", " + headers.p(i10));
            } else {
                linkedHashMap.put(strF, headers.p(i10));
            }
        }
        return linkedHashMap;
    }
}

package com.facebook.react.modules.network;

import Df.r;
import com.facebook.soloader.SoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bH\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u001a\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0016H\u0087 ¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010*J(\u0010+\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010\u001eJ \u0010-\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b-\u0010\u001e¨\u0006."}, d2 = {"Lcom/facebook/react/modules/network/InspectorNetworkReporter;", "", "<init>", "()V", "", "isDebuggingEnabled", "()Z", "", "requestId", "requestUrl", "requestMethod", "", "requestHeaders", "requestBody", "", "encodedDataLength", "LTd/L;", "reportRequestStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "headers", "reportConnectionTiming", "(Ljava/lang/String;Ljava/util/Map;)V", "", "responseStatus", "responseHeaders", "expectedDataLength", "reportResponseStart", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;J)V", "data", "reportDataReceived", "(Ljava/lang/String;Ljava/lang/String;)V", "dataLength", "reportDataReceivedImpl", "(Ljava/lang/String;I)V", "reportResponseEnd", "(Ljava/lang/String;J)V", "cancelled", "reportRequestFailed", "(Ljava/lang/String;Z)V", "body", "base64Encoded", "maybeStoreResponseBody", "(Ljava/lang/String;Ljava/lang/String;Z)V", "maybeStoreResponseBodyImpl", "maybeStoreResponseBodyIncremental", "maybeStoreResponseBodyIncrementalImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorNetworkReporter {
    public static final InspectorNetworkReporter INSTANCE = new InspectorNetworkReporter();

    static {
        SoLoader.t("react_devsupportjni");
    }

    private InspectorNetworkReporter() {
    }

    public static final native boolean isDebuggingEnabled();

    public static final void maybeStoreResponseBody(String requestId, String body, boolean base64Encoded) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(body, "body");
        if (isDebuggingEnabled()) {
            maybeStoreResponseBodyImpl(requestId, body, base64Encoded);
        }
    }

    public static final native void maybeStoreResponseBodyImpl(String requestId, String body, boolean base64Encoded);

    public static final void maybeStoreResponseBodyIncremental(String requestId, String data) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(data, "data");
        if (isDebuggingEnabled()) {
            maybeStoreResponseBodyIncrementalImpl(requestId, data);
        }
    }

    public static final native void maybeStoreResponseBodyIncrementalImpl(String requestId, String data);

    public static final native void reportConnectionTiming(String requestId, Map<String, String> headers);

    public static final void reportDataReceived(String requestId, String data) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(data, "data");
        if (isDebuggingEnabled()) {
            reportDataReceivedImpl(requestId, r.y(data).length);
        }
    }

    public static final native void reportDataReceivedImpl(String requestId, int dataLength);

    public static final native void reportRequestFailed(String requestId, boolean cancelled);

    public static final native void reportRequestStart(String requestId, String requestUrl, String requestMethod, Map<String, String> requestHeaders, String requestBody, long encodedDataLength);

    public static final native void reportResponseEnd(String requestId, long encodedDataLength);

    public static final native void reportResponseStart(String requestId, String requestUrl, int responseStatus, Map<String, String> responseHeaders, long expectedDataLength);
}

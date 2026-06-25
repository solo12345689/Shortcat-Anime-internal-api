package com.facebook.react.modules.network;

import Df.r;
import Td.InterfaceC2154e;
import Td.L;
import a7.C2584a;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import dg.C4618A;
import dg.D;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.n;
import dg.t;
import dg.v;
import dg.w;
import dg.x;
import dg.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.AbstractC6678c;
import tg.C6694t;
import v7.InterfaceC6851a;
import v7.i;
import v7.j;
import v7.l;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "Networking")
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b\u0007\u0018\u0000 v2\u00020\u0001:\u0004wxyzB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u0010.J1\u00106\u001a\u0004\u0018\u0001052\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u0004\u0018\u00010:2\b\u00108\u001a\u0004\u0018\u00010\u001a2\b\u00109\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b=\u00101J\u000f\u0010>\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u00101J\u0017\u0010C\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010K\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bL\u0010BJ\u0017\u0010O\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000¢\u0006\u0004\bN\u0010FJ\u0017\u0010Q\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010JJ[\u0010U\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010S\u001a\u00020R2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020R2\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\bU\u0010VJ]\u0010W\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\"2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\"2\u0006\u0010\\\u001a\u00020[H\u0017¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\"2\b\u0010_\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\"2\u0006\u0010b\u001a\u00020RH\u0016¢\u0006\u0004\bc\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00180l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020D0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020?0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020H0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006{"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule;", "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "defaultUserAgent", "Ldg/A;", "client", "", "", "networkInterceptorCreators", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V", "context", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "data", "extractOrGenerateDevToolsRequestId", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;", "method", "url", "", "requestId", "Lcom/facebook/react/bridge/ReadableArray;", "headers", "responseType", "", "useIncrementalUpdates", "timeout", "withCredentials", NetworkingModule.REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID, "LTd/L;", "sendRequestInternalReal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V", "Ldg/D;", "requestBody", "wrapRequestBodyWithProgressEmitter", "(Ldg/D;I)Ldg/D;", "Ldg/F;", "responseBody", "readWithProgress", "(ILjava/lang/String;Ldg/F;)V", "addRequest", "(I)V", "removeRequest", "cancelAllRequests", "()V", "cancelRequest", "body", "contentType", "Ldg/y$a;", "constructMultipartBody", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;)Ldg/y$a;", "headersArray", "requestData", "Ldg/t;", "extractHeaders", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Ldg/t;", "initialize", "invalidate", "Lcom/facebook/react/modules/network/NetworkingModule$d;", "handler", "addUriHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$d;)V", "addUriHandler", "Lcom/facebook/react/modules/network/NetworkingModule$b;", "addRequestBodyHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$b;)V", "addRequestBodyHandler", "Lcom/facebook/react/modules/network/NetworkingModule$c;", "addResponseHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$c;)V", "addResponseHandler", "removeUriHandler$ReactAndroid_release", "removeUriHandler", "removeRequestBodyHandler$ReactAndroid_release", "removeRequestBodyHandler", "removeResponseHandler$ReactAndroid_release", "removeResponseHandler", "", "requestIdAsDouble", "timeoutAsDouble", "sendRequest", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V", "sendRequestInternal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/Callback;", "callback", "clearCookies", "(Lcom/facebook/react/bridge/Callback;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "Ldg/A;", "Lv7/d;", "cookieHandler", "Lv7/d;", "Ljava/lang/String;", "Lv7/a;", "cookieJarContainer", "Lv7/a;", "", "requestIds", "Ljava/util/Set;", "", "requestBodyHandlers", "Ljava/util/List;", "uriHandlers", "responseHandlers", "shuttingDown", "Z", "Companion", "d", "b", "c", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID = "devToolsRequestId";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static v7.b customClientBuilder;
    private final C4618A client;
    private final v7.d cookieHandler;
    private InterfaceC6851a cookieJarContainer;
    private final String defaultUserAgent;
    private final List<b> requestBodyHandlers;
    private final Set<Integer> requestIds;
    private final List<c> responseHandlers;
    private boolean shuttingDown;
    private final List<d> uriHandlers;

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(C4618A.a aVar) {
            NetworkingModule.access$getCustomClientBuilder$cp();
        }

        public final boolean e(long j10, long j11) {
            return j11 + ((long) NetworkingModule.CHUNK_TIMEOUT_NS) < j10;
        }

        public final void d(v7.b bVar) {
            NetworkingModule.access$setCustomClientBuilder$cp(bVar);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        boolean a(ReadableMap readableMap);

        D b(ReadableMap readableMap, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        WritableMap a(byte[] bArr);

        boolean b(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        Pair a(Uri uri);

        boolean b(Uri uri, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements v {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f37041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ReactApplicationContext f37042b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f37043c;

        public e(String str, ReactApplicationContext reactApplicationContext, int i10) {
            this.f37041a = str;
            this.f37042b = reactApplicationContext;
            this.f37043c = i10;
        }

        @Override // dg.v
        public final E a(v.a chain) {
            AbstractC5504s.h(chain, "chain");
            E eA = chain.a(chain.z());
            F fA = eA.a();
            if (fA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return eA.Y().b(new i(fA, new f(this.f37041a, this.f37042b, this.f37043c))).c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements v7.g {

        /* JADX INFO: renamed from: a */
        private long f37044a = System.nanoTime();

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f37045b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ReactApplicationContext f37046c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f37047d;

        f(String str, ReactApplicationContext reactApplicationContext, int i10) {
            this.f37045b = str;
            this.f37046c = reactApplicationContext;
            this.f37047d = i10;
        }

        @Override // v7.g
        public void a(long j10, long j11, boolean z10) {
            long jNanoTime = System.nanoTime();
            if ((z10 || NetworkingModule.INSTANCE.e(jNanoTime, this.f37044a)) && !AbstractC5504s.c(this.f37045b, "text")) {
                v7.e.e(this.f37046c, this.f37047d, j10, j11);
                this.f37044a = jNanoTime;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC4625f {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f37049b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ReactApplicationContext f37050c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f37051d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f37052e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f37053f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ boolean f37054g;

        g(int i10, ReactApplicationContext reactApplicationContext, String str, String str2, String str3, boolean z10) {
            this.f37049b = i10;
            this.f37050c = reactApplicationContext;
            this.f37051d = str;
            this.f37052e = str2;
            this.f37053f = str3;
            this.f37054g = z10;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, E response) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            if (NetworkingModule.this.shuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f37049b);
            ReactApplicationContext reactApplicationContext = this.f37050c;
            int i10 = this.f37049b;
            String str = this.f37051d;
            String str2 = this.f37052e;
            int iB = response.b();
            Map mapA = v7.e.f61988a.a(response.g());
            F fA = response.a();
            v7.e.j(reactApplicationContext, i10, str, str2, iB, mapA, fA != null ? fA.h() : 0L);
            try {
                F fA2 = response.a();
                if (fA2 == null) {
                    v7.e.h(this.f37050c, this.f37049b, this.f37051d, "Response body is null", null);
                    return;
                }
                if (r.B("gzip", E.D(response, "Content-Encoding", null, 2, null), true)) {
                    C6694t c6694t = new C6694t(fA2.k());
                    String strD = E.D(response, "Content-Type", null, 2, null);
                    fA2 = F.f45298a.a(strD != null ? x.f45605e.a(strD) : null, -1L, AbstractC6678c.a().b(c6694t));
                }
                if (fA2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                for (c cVar : NetworkingModule.this.responseHandlers) {
                    if (cVar.b(this.f37053f)) {
                        byte[] bArrB = fA2.b();
                        v7.e.c(this.f37050c, this.f37049b, this.f37051d, cVar.a(bArrB), bArrB);
                        v7.e.i(this.f37050c, this.f37049b, this.f37051d, fA2.h());
                        return;
                    }
                }
                if (this.f37054g && AbstractC5504s.c(this.f37053f, "text")) {
                    NetworkingModule.this.readWithProgress(this.f37049b, this.f37051d, fA2);
                    v7.e.i(this.f37050c, this.f37049b, this.f37051d, fA2.h());
                    return;
                }
                String strL = "";
                if (AbstractC5504s.c(this.f37053f, "text")) {
                    try {
                        strL = fA2.l();
                    } catch (IOException e10) {
                        if (!r.B(response.h().c(), "HEAD", true)) {
                            v7.e.h(this.f37050c, this.f37049b, this.f37051d, e10.getMessage(), e10);
                        }
                    }
                } else if (AbstractC5504s.c(this.f37053f, NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    strL = Base64.encodeToString(fA2.b(), 2);
                }
                v7.e.d(this.f37050c, this.f37049b, this.f37051d, strL, this.f37053f);
                v7.e.i(this.f37050c, this.f37049b, this.f37051d, fA2.h());
            } catch (IOException e11) {
                v7.e.h(this.f37050c, this.f37049b, this.f37051d, e11.getMessage(), e11);
            }
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            if (NetworkingModule.this.shuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f37049b);
            String message = e10.getMessage();
            if (message == null) {
                message = "Error while executing request: " + e10.getClass().getSimpleName();
            }
            v7.e.h(this.f37050c, this.f37049b, this.f37051d, message, e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements v7.g {

        /* JADX INFO: renamed from: a */
        private long f37055a = System.nanoTime();

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ReactApplicationContext f37056b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f37057c;

        h(ReactApplicationContext reactApplicationContext, int i10) {
            this.f37056b = reactApplicationContext;
            this.f37057c = i10;
        }

        @Override // v7.g
        public void a(long j10, long j11, boolean z10) {
            long jNanoTime = System.nanoTime();
            if (z10 || NetworkingModule.INSTANCE.e(jNanoTime, this.f37055a)) {
                v7.e.f(this.f37056b, this.f37057c, j10, j11);
                this.f37055a = jNanoTime;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext reactContext, String str, C4618A client, List<Object> list) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(client, "client");
        this.cookieHandler = new v7.d();
        this.requestIds = new HashSet();
        this.requestBodyHandlers = new ArrayList();
        this.uriHandlers = new ArrayList();
        this.responseHandlers = new ArrayList();
        if (list != null) {
            C4618A.a aVarF = client.F();
            Iterator<Object> it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            client = aVarF.c();
        }
        this.client = client;
        n nVarD = client.d();
        this.cookieJarContainer = nVarD instanceof InterfaceC6851a ? (InterfaceC6851a) nVarD : null;
        this.defaultUserAgent = str;
    }

    public static final /* synthetic */ v7.b access$getCustomClientBuilder$cp() {
        return null;
    }

    private final synchronized void addRequest(int requestId) {
        this.requestIds.add(Integer.valueOf(requestId));
    }

    private final synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.requestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.requestIds.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void cancelRequest(int requestId) {
        C2584a.a(this.client, Integer.valueOf(requestId));
    }

    private final y.a constructMultipartBody(ReadableArray body, String contentType, int requestId, String str) {
        x xVarA;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        y.a aVar = new y.a(null, 1, null);
        x xVarA2 = x.f45605e.a(contentType);
        if (xVarA2 == null) {
            v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Invalid media type.", null);
            return null;
        }
        aVar.f(xVarA2);
        int size = body.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = body.getMap(i10);
            if (map == null) {
                v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Unrecognized FormData part.", null);
                return null;
            }
            t tVarExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (tVarExtractHeaders == null) {
                v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String strD = tVarExtractHeaders.d(CONTENT_TYPE_HEADER_NAME);
            if (strD != null) {
                xVarA = x.f45605e.a(strD);
                tVarExtractHeaders = tVarExtractHeaders.l().h(CONTENT_TYPE_HEADER_NAME).e();
            } else {
                xVarA = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING) && map.getString(REQUEST_BODY_KEY_STRING) != null) {
                String string = map.getString(REQUEST_BODY_KEY_STRING);
                if (string == null) {
                    string = "";
                }
                aVar.c(tVarExtractHeaders, D.f45262a.a(xVarA, string));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI) || map.getString(REQUEST_BODY_KEY_URI) == null) {
                v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Unrecognized FormData part.", null);
                L l10 = L.f17438a;
            } else {
                if (xVarA == null) {
                    v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string2 = map.getString(REQUEST_BODY_KEY_URI);
                if (string2 == null) {
                    v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Body must have a valid file uri", null);
                    return null;
                }
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
                InputStream inputStreamH = l.h(reactApplicationContext, string2);
                if (inputStreamH == null) {
                    v7.e.h(reactApplicationContextIfActiveOrWarn, requestId, str, "Could not retrieve file for uri " + string2, null);
                    return null;
                }
                aVar.c(tVarExtractHeaders, l.c(xVarA, inputStreamH));
            }
        }
        return aVar;
    }

    private final t extractHeaders(ReadableArray headersArray, ReadableMap requestData) {
        String str;
        if (headersArray == null) {
            return null;
        }
        t.a aVar = new t.a();
        int size = headersArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableArray array = headersArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String string = array.getString(0);
                if (string != null) {
                    string = a.f37058a.a(string);
                }
                String string2 = array.getString(1);
                if (string != null && string2 != null) {
                    aVar.d(string, string2);
                }
            }
            return null;
        }
        if (aVar.f(USER_AGENT_HEADER_NAME) == null && (str = this.defaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (requestData == null || !requestData.hasKey(REQUEST_BODY_KEY_STRING)) {
            aVar.h(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.e();
    }

    private final String extractOrGenerateDevToolsRequestId(ReadableMap data) {
        String string = (data != null && data.hasKey(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) && data.getType(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) == ReadableType.String) ? data.getString(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) : null;
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        AbstractC5504s.g(string2, "toString(...)");
        return string2;
    }

    public final void readWithProgress(int requestId, String str, F responseBody) throws IOException {
        long jC;
        Charset charsetC;
        long jH = -1;
        try {
            AbstractC5504s.f(responseBody, "null cannot be cast to non-null type com.facebook.react.modules.network.ProgressResponseBody");
            i iVar = (i) responseBody;
            jC = iVar.C();
            try {
                jH = iVar.h();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            jC = -1;
        }
        long j10 = jH;
        long j11 = jC;
        if (responseBody.j() == null) {
            charsetC = StandardCharsets.UTF_8;
        } else {
            x xVarJ = responseBody.j();
            charsetC = xVarJ != null ? xVarJ.c(StandardCharsets.UTF_8) : null;
            if (charsetC == null) {
                throw new IllegalStateException(("Null character set for Content-Type: " + responseBody.j()).toString());
            }
        }
        AbstractC5504s.e(charsetC);
        j jVar = new j(charsetC);
        InputStream inputStreamA = responseBody.a();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i10 = inputStreamA.read(bArr);
                if (i10 == -1) {
                    return;
                } else {
                    v7.e.g(reactApplicationContextIfActiveOrWarn, requestId, str, jVar.a(bArr, i10), j11, j10);
                }
            }
        } finally {
            inputStreamA.close();
        }
    }

    public final synchronized void removeRequest(int requestId) {
        this.requestIds.remove(Integer.valueOf(requestId));
    }

    /* JADX WARN: Removed duplicated region for block: B:284:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendRequestInternalReal(java.lang.String r24, java.lang.String r25, int r26, com.facebook.react.bridge.ReadableArray r27, com.facebook.react.bridge.ReadableMap r28, java.lang.String r29, boolean r30, int r31, boolean r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.network.NetworkingModule.sendRequestInternalReal(java.lang.String, java.lang.String, int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableMap, java.lang.String, boolean, int, boolean, java.lang.String):void");
    }

    public static final void setCustomClientBuilder(v7.b bVar) {
        INSTANCE.d(bVar);
    }

    private final D wrapRequestBodyWithProgressEmitter(D requestBody, int requestId) {
        if (requestBody == null) {
            return null;
        }
        return l.e(requestBody, new h(getReactApplicationContextIfActiveOrWarn(), requestId));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double requestIdAsDouble) {
        int i10 = (int) requestIdAsDouble;
        cancelRequest(i10);
        removeRequest(i10);
    }

    public final void addRequestBodyHandler$ReactAndroid_release(b handler) {
        AbstractC5504s.h(handler, "handler");
        this.requestBodyHandlers.add(handler);
    }

    public final void addResponseHandler$ReactAndroid_release(c handler) {
        AbstractC5504s.h(handler, "handler");
        this.responseHandlers.add(handler);
    }

    public final void addUriHandler$ReactAndroid_release(d handler) {
        AbstractC5504s.h(handler, "handler");
        this.uriHandlers.add(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        AbstractC5504s.h(callback, "callback");
        this.cookieHandler.d(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        InterfaceC6851a interfaceC6851a = this.cookieJarContainer;
        if (interfaceC6851a != null) {
            interfaceC6851a.a(new w(this.cookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.shuttingDown = true;
        cancelAllRequests();
        this.cookieHandler.f();
        InterfaceC6851a interfaceC6851a = this.cookieJarContainer;
        if (interfaceC6851a != null) {
            interfaceC6851a.c();
        }
        this.requestBodyHandlers.clear();
        this.responseHandlers.clear();
        this.uriHandlers.clear();
    }

    public final void removeRequestBodyHandler$ReactAndroid_release(b handler) {
        AbstractC5504s.h(handler, "handler");
        this.requestBodyHandlers.remove(handler);
    }

    public final void removeResponseHandler$ReactAndroid_release(c handler) {
        AbstractC5504s.h(handler, "handler");
        this.responseHandlers.remove(handler);
    }

    public final void removeUriHandler$ReactAndroid_release(d handler) {
        AbstractC5504s.h(handler, "handler");
        this.uriHandlers.remove(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String method, String url, double requestIdAsDouble, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, double timeoutAsDouble, boolean withCredentials) {
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(responseType, "responseType");
        int i10 = (int) requestIdAsDouble;
        int i11 = (int) timeoutAsDouble;
        String strExtractOrGenerateDevToolsRequestId = extractOrGenerateDevToolsRequestId(data);
        try {
            sendRequestInternalReal(method, url, i10, headers, data, responseType, useIncrementalUpdates, i11, withCredentials, strExtractOrGenerateDevToolsRequestId);
        } catch (Throwable th2) {
            AbstractC7283a.n("Networking", "Failed to send url request: " + url, th2);
            v7.e.h(getReactApplicationContextIfActiveOrWarn(), i10, strExtractOrGenerateDevToolsRequestId, th2.getMessage(), th2);
        }
    }

    @InterfaceC2154e
    public final void sendRequestInternal(String method, String url, int requestId, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, int timeout, boolean withCredentials) {
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(responseType, "responseType");
        sendRequestInternalReal(method, url, requestId, headers, data, responseType, useIncrementalUpdates, timeout, withCredentials, extractOrGenerateDevToolsRequestId(data));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(ReactApplicationContext context, String str, C4618A client) {
        this(context, str, client, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(client, "client");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context) {
        AbstractC5504s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        this(context, null, v7.f.b(applicationContext), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context, List<Object> list) {
        AbstractC5504s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        this(context, null, v7.f.b(applicationContext), list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(ReactApplicationContext context, String str) {
        AbstractC5504s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        this(context, str, v7.f.b(applicationContext), null);
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(v7.b bVar) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String eventName) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double count) {
    }
}

package com.facebook.react.modules.websocket;

import Df.r;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dg.C;
import dg.C4618A;
import dg.E;
import dg.I;
import dg.J;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6686k;
import v7.d;
import v7.f;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "WebSocketModule")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010(J\u001d\u0010*\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010/R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "params", "LTd/L;", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "", DiagnosticsEntry.ID_KEY, "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$b;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$b;)V", "url", "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "options", "", "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", "code", "reason", "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "Ltg/k;", "byteString", "(Ltg/k;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "", "Ldg/I;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Lv7/d;", "cookieHandler", "Lv7/d;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "WebSocketModule";
    private static v7.b customClientBuilder;
    private final Map<Integer, b> contentHandlers;
    private final d cookieHandler;
    private final Map<Integer, I> webSocketConnections;

    /* JADX INFO: renamed from: com.facebook.react.modules.websocket.WebSocketModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(C4618A.a aVar) {
            WebSocketModule.access$getCustomClientBuilder$cp();
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String d(java.lang.String r7) {
            /*
                r6 = this;
                java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L92
                r0.<init>(r7)     // Catch: java.net.URISyntaxException -> L92
                java.lang.String r1 = r0.getScheme()     // Catch: java.net.URISyntaxException -> L92
                if (r1 == 0) goto L4d
                int r2 = r1.hashCode()     // Catch: java.net.URISyntaxException -> L92
                r3 = 3804(0xedc, float:5.33E-42)
                java.lang.String r4 = "http"
                if (r2 == r3) goto L45
                r3 = 118039(0x1cd17, float:1.65408E-40)
                java.lang.String r5 = "https"
                if (r2 == r3) goto L3a
                r3 = 3213448(0x310888, float:4.503E-39)
                if (r2 == r3) goto L2e
                r3 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r2 == r3) goto L27
                goto L4d
            L27:
                boolean r1 = r1.equals(r5)     // Catch: java.net.URISyntaxException -> L92
                if (r1 != 0) goto L35
                goto L4d
            L2e:
                boolean r1 = r1.equals(r4)     // Catch: java.net.URISyntaxException -> L92
                if (r1 != 0) goto L35
                goto L4d
            L35:
                java.lang.String r4 = r0.getScheme()     // Catch: java.net.URISyntaxException -> L92
                goto L4f
            L3a:
                java.lang.String r2 = "wss"
                boolean r1 = r1.equals(r2)     // Catch: java.net.URISyntaxException -> L92
                if (r1 != 0) goto L43
                goto L4d
            L43:
                r4 = r5
                goto L4f
            L45:
                java.lang.String r2 = "ws"
                boolean r1 = r1.equals(r2)     // Catch: java.net.URISyntaxException -> L92
                if (r1 != 0) goto L4f
            L4d:
                java.lang.String r4 = ""
            L4f:
                int r1 = r0.getPort()     // Catch: java.net.URISyntaxException -> L92
                r2 = -1
                java.lang.String r3 = "format(...)"
                if (r1 == r2) goto L79
                kotlin.jvm.internal.U r1 = kotlin.jvm.internal.U.f52264a     // Catch: java.net.URISyntaxException -> L92
                java.lang.String r1 = "%s://%s:%s"
                java.lang.String r2 = r0.getHost()     // Catch: java.net.URISyntaxException -> L92
                int r0 = r0.getPort()     // Catch: java.net.URISyntaxException -> L92
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.net.URISyntaxException -> L92
                java.lang.Object[] r0 = new java.lang.Object[]{r4, r2, r0}     // Catch: java.net.URISyntaxException -> L92
                r2 = 3
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.net.URISyntaxException -> L92
                java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.net.URISyntaxException -> L92
                kotlin.jvm.internal.AbstractC5504s.g(r0, r3)     // Catch: java.net.URISyntaxException -> L92
                return r0
            L79:
                kotlin.jvm.internal.U r1 = kotlin.jvm.internal.U.f52264a     // Catch: java.net.URISyntaxException -> L92
                java.lang.String r1 = "%s://%s"
                java.lang.String r0 = r0.getHost()     // Catch: java.net.URISyntaxException -> L92
                java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}     // Catch: java.net.URISyntaxException -> L92
                r2 = 2
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.net.URISyntaxException -> L92
                java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.net.URISyntaxException -> L92
                kotlin.jvm.internal.AbstractC5504s.g(r0, r3)     // Catch: java.net.URISyntaxException -> L92
                return r0
            L92:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to set "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " as default origin header"
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.Companion.d(java.lang.String):java.lang.String");
        }

        public final void e(v7.b bVar) {
            WebSocketModule.access$setCustomClientBuilder$cp(bVar);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(String str, WritableMap writableMap);

        void b(C6686k c6686k, WritableMap writableMap);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends J {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f37095b;

        c(int i10) {
            this.f37095b = i10;
        }

        @Override // dg.J
        public void a(I webSocket, int i10, String reason) {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(reason, "reason");
            int i11 = this.f37095b;
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i11);
            readableMapBuilder.put("code", i10);
            readableMapBuilder.put("reason", reason);
            WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // dg.J
        public void b(I websocket, int i10, String reason) {
            AbstractC5504s.h(websocket, "websocket");
            AbstractC5504s.h(reason, "reason");
            websocket.e(i10, reason);
        }

        @Override // dg.J
        public void c(I webSocket, Throwable t10, E e10) {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(t10, "t");
            WebSocketModule.this.notifyWebSocketFailed(this.f37095b, t10.getMessage());
        }

        @Override // dg.J
        public void d(I webSocket, String text) {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(text, "text");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt(DiagnosticsEntry.ID_KEY, this.f37095b);
            writableMapCreateMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f37095b));
            if (bVar != null) {
                bVar.a(text, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", text);
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // dg.J
        public void e(I webSocket, C6686k bytes) {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(bytes, "bytes");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt(DiagnosticsEntry.ID_KEY, this.f37095b);
            writableMapCreateMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f37095b));
            if (bVar != null) {
                bVar.b(bytes, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", bytes.b());
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // dg.J
        public void f(I webSocket, E response) {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(response, "response");
            WebSocketModule.this.webSocketConnections.put(Integer.valueOf(this.f37095b), webSocket);
            int i10 = this.f37095b;
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
            readableMapBuilder.put("protocol", response.C("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(ReactApplicationContext context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new d();
    }

    public static final /* synthetic */ v7.b access$getCustomClientBuilder$cp() {
        return null;
    }

    private final String getCookie(String uri) {
        try {
            List list = (List) this.cookieHandler.get(new URI(INSTANCE.d(uri)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        }
    }

    public final void notifyWebSocketFailed(int i10, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    public static final void setCustomClientBuilder(v7.b bVar) {
        INSTANCE.e(bVar);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, String reason, double socketID) {
        int i10 = (int) socketID;
        I i11 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            return;
        }
        try {
            i11.e((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i10));
            this.contentHandlers.remove(Integer.valueOf(i10));
        } catch (Exception e10) {
            AbstractC7283a.n("ReactNative", "Could not close WebSocket connection for id " + i10, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String url, ReadableArray protocols, ReadableMap options, double socketID) {
        boolean z10;
        AbstractC5504s.h(url, "url");
        int i10 = (int) socketID;
        C4618A.a aVarF = f.f().F();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C4618A.a aVarP = aVarF.f(10L, timeUnit).Q(10L, timeUnit).P(0L, TimeUnit.MINUTES);
        INSTANCE.c(aVarP);
        C4618A c4618aC = aVarP.c();
        C.a aVarM = new C.a().k(Integer.valueOf(i10)).m(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            aVarM.a("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z10 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (r.B(strNextKey, "origin", true)) {
                        z10 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(("value for name " + strNextKey + " == null").toString());
                    }
                    aVarM.a(strNextKey, string);
                } else {
                    AbstractC7283a.I("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            aVarM.a("origin", INSTANCE.d(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            int size = protocols.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string2 = protocols.getString(i11);
                String string3 = string2 != null ? r.k1(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !r.W(string3, com.amazon.a.a.o.b.f.f34694a, false, 2, null)) {
                    sb2.append(string3);
                    sb2.append(com.amazon.a.a.o.b.f.f34694a);
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                String string4 = sb2.toString();
                AbstractC5504s.g(string4, "toString(...)");
                aVarM.a("Sec-WebSocket-Protocol", string4);
            }
        }
        c4618aC.G(aVarM.b(), new c(i10));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<I> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().e(ErrorCodes.SERVER_RETRY_IN, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i10 = (int) socketID;
        I i11 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (i11 != null) {
            try {
                i11.b(C6686k.f61045e);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String message, double socketID) {
        AbstractC5504s.h(message, "message");
        int i10 = (int) socketID;
        I i11 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (i11 != null) {
            try {
                i11.send(message);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String base64String, double socketID) {
        AbstractC5504s.h(base64String, "base64String");
        int i10 = (int) socketID;
        I i11 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (i11 != null) {
            try {
                C6686k c6686kA = C6686k.f61044d.a(base64String);
                if (c6686kA == null) {
                    throw new IllegalStateException("bytes == null");
                }
                i11.b(c6686kA);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(DiagnosticsEntry.ID_KEY, i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    public final void setContentHandler(int i10, b contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(i10));
        } else {
            this.contentHandlers.put(Integer.valueOf(i10), contentHandler);
        }
    }

    public final void sendBinary(C6686k byteString, int i10) {
        AbstractC5504s.h(byteString, "byteString");
        I i11 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(DiagnosticsEntry.ID_KEY, i10);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
            readableMapBuilder2.put(DiagnosticsEntry.ID_KEY, i10);
            readableMapBuilder2.put("code", 0);
            readableMapBuilder2.put("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(i10));
            this.contentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            i11.b(byteString);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(v7.b bVar) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }
}

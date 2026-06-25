package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import app.notifee.core.event.LogEvent;
import b7.C3026a;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.soloader.SoLoader;
import dg.C;
import dg.C4618A;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096 ¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;", "Lcom/facebook/react/devsupport/f0;", "", "url", "deviceName", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LTd/L;", "connect", "()V", "closeQuietly", "event", "sendEventToAllConnections", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "WebSocketDelegate", "IWebSocket", "DelegateImpl", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxInspectorPackagerConnection implements f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class DelegateImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4618A f36611a = C3026a.f33222a.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f36612b = new Handler(Looper.getMainLooper());

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements IWebSocket {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ dg.I f36613a;

            a(dg.I i10) {
                this.f36613a = i10;
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f36613a.e(1000, "End of session");
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
            public void send(String message) {
                AbstractC5504s.h(message, "message");
                this.f36613a.send(message);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends dg.J {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f36615b;

            b(WebSocketDelegate webSocketDelegate) {
                this.f36615b = webSocketDelegate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(WebSocketDelegate webSocketDelegate) {
                webSocketDelegate.didClose();
                webSocketDelegate.close();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(Throwable th2, WebSocketDelegate webSocketDelegate) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "<Unknown error>";
                }
                webSocketDelegate.didFailWithError(null, message);
                webSocketDelegate.close();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void m(WebSocketDelegate webSocketDelegate, String str) {
                webSocketDelegate.didReceiveMessage(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void n(WebSocketDelegate webSocketDelegate) {
                webSocketDelegate.didOpen();
            }

            @Override // dg.J
            public void a(dg.I webSocket, int i10, String reason) {
                AbstractC5504s.h(webSocket, "webSocket");
                AbstractC5504s.h(reason, "reason");
                DelegateImpl delegateImpl = DelegateImpl.this;
                final WebSocketDelegate webSocketDelegate = this.f36615b;
                delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        CxxInspectorPackagerConnection.DelegateImpl.b.k(webSocketDelegate);
                    }
                }, 0L);
            }

            @Override // dg.J
            public void c(dg.I webSocket, final Throwable t10, dg.E e10) {
                AbstractC5504s.h(webSocket, "webSocket");
                AbstractC5504s.h(t10, "t");
                DelegateImpl delegateImpl = DelegateImpl.this;
                final WebSocketDelegate webSocketDelegate = this.f36615b;
                delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        CxxInspectorPackagerConnection.DelegateImpl.b.l(t10, webSocketDelegate);
                    }
                }, 0L);
            }

            @Override // dg.J
            public void d(dg.I webSocket, final String text) {
                AbstractC5504s.h(webSocket, "webSocket");
                AbstractC5504s.h(text, "text");
                DelegateImpl delegateImpl = DelegateImpl.this;
                final WebSocketDelegate webSocketDelegate = this.f36615b;
                delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        CxxInspectorPackagerConnection.DelegateImpl.b.m(webSocketDelegate, text);
                    }
                }, 0L);
            }

            @Override // dg.J
            public void f(dg.I webSocket, dg.E response) {
                AbstractC5504s.h(webSocket, "webSocket");
                AbstractC5504s.h(response, "response");
                DelegateImpl delegateImpl = DelegateImpl.this;
                final WebSocketDelegate webSocketDelegate = this.f36615b;
                delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        CxxInspectorPackagerConnection.DelegateImpl.b.n(webSocketDelegate);
                    }
                }, 0L);
            }
        }

        public final IWebSocket connectWebSocket(String str, WebSocketDelegate delegate) {
            AbstractC5504s.h(delegate, "delegate");
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return new a(this.f36611a.G(new C.a().m(str).b(), new b(delegate)));
        }

        public final void scheduleCallback(Runnable runnable, long j10) {
            AbstractC5504s.h(runnable, "runnable");
            this.f36612b.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bc\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "Ljava/io/Closeable;", "", "message", "LTd/L;", "send", "(Ljava/lang/String;)V", "close", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(String message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "Ljava/io/Closeable;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "posixCode", "", LogEvent.LEVEL_ERROR, "LTd/L;", "didFailWithError", "(Ljava/lang/Integer;Ljava/lang/String;)V", "message", "didReceiveMessage", "(Ljava/lang/String;)V", "didOpen", "()V", "didClose", "close", "a", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class WebSocketDelegate implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HybridData mHybridData;

        public WebSocketDelegate(HybridData mHybridData) {
            AbstractC5504s.h(mHybridData, "mHybridData");
            this.mHybridData = mHybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        public final native void didClose();

        public final native void didFailWithError(Integer posixCode, String error);

        public final native void didOpen();

        public final native void didReceiveMessage(String message);
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.CxxInspectorPackagerConnection$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b(String str, String str2, String str3, DelegateImpl delegateImpl) {
            return CxxInspectorPackagerConnection.initHybrid(str, str2, str3, delegateImpl);
        }

        private Companion() {
        }
    }

    static {
        SoLoader.t("react_devsupportjni");
    }

    public CxxInspectorPackagerConnection(String url, String deviceName, String packageName) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(deviceName, "deviceName");
        AbstractC5504s.h(packageName, "packageName");
        this.mHybridData = INSTANCE.b(url, deviceName, packageName, new DelegateImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.f0
    public native void closeQuietly();

    public native void connect();

    @Override // com.facebook.react.devsupport.f0
    public native void sendEventToAllConnections(String event);
}

package com.margelo.nitro.core;

import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.u;
import Td.v;
import Zd.k;
import ae.AbstractC2605b;
import app.notifee.core.event.LogEvent;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003%&'B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/margelo/nitro/core/Promise;", "T", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "result", "LTd/L;", "nativeResolve", "(Ljava/lang/Object;)V", "", LogEvent.LEVEL_ERROR, "nativeReject", "(Ljava/lang/Throwable;)V", "Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "callback", "addOnResolvedListener", "(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V", "Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "addOnRejectedListener", "(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "resolve", "reject", "Lkotlin/Function1;", "listener", "then", "(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;", "catch", "await", "(LZd/e;)Ljava/lang/Object;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "OnResolvedCallback", "OnRejectedCallback", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Promise<T> {
    private static final O defaultScope = P.a(C1608f0.a());
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bã\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "", "", LogEvent.LEVEL_ERROR, "LTd/L;", "onRejected", "(Ljava/lang/Throwable;)V", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface OnRejectedCallback {
        void onRejected(Throwable error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bã\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "", "result", "LTd/L;", "onResolved", "(Ljava/lang/Object;)V", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface OnResolvedCallback {
        void onResolved(Object result);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zd.e f43971a;

        b(Zd.e eVar) {
            this.f43971a = eVar;
        }

        public final void a(Object obj) {
            this.f43971a.resumeWith(u.b(obj));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zd.e f43972a;

        c(Zd.e eVar) {
            this.f43972a = eVar;
        }

        public final void a(Throwable error) {
            AbstractC5504s.h(error, "error");
            Zd.e eVar = this.f43972a;
            u.a aVar = u.f17466b;
            eVar.resumeWith(u.b(v.a(error)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L.f17438a;
        }
    }

    public Promise() {
        this.mHybridData = initHybrid();
    }

    private final native void addOnRejectedListener(OnRejectedCallback callback);

    private final native void addOnResolvedListener(OnResolvedCallback callback);

    private final native HybridData initHybrid();

    private final native void nativeReject(Throwable error);

    private final native void nativeResolve(Object result);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void then$lambda$0(Function1 function1, Object obj) {
        if (obj == null) {
            obj = null;
        }
        if (obj == null) {
            throw new Error("Failed to cast Object to T!");
        }
        function1.invoke(obj);
    }

    public final Object await(Zd.e eVar) throws Throwable {
        k kVar = new k(AbstractC2605b.c(eVar));
        then(new b(kVar));
        m105catch(new c(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Promise<T> m105catch(Function1 listener) {
        AbstractC5504s.h(listener, "listener");
        addOnRejectedListener(new e(listener));
        return this;
    }

    public final void reject(Throwable error) {
        AbstractC5504s.h(error, "error");
        nativeReject(error);
    }

    public final void resolve(T result) {
        nativeResolve(result);
    }

    public final Promise<T> then(final Function1 listener) {
        AbstractC5504s.h(listener, "listener");
        addOnResolvedListener(new OnResolvedCallback() { // from class: com.margelo.nitro.core.d
            @Override // com.margelo.nitro.core.Promise.OnResolvedCallback
            public final void onResolved(Object obj) {
                Promise.then$lambda$0(listener, obj);
            }
        });
        return this;
    }

    private Promise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

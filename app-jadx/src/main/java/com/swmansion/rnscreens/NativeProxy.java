package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\f\u0010\u0003J\u0010\u0010\r\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "LTd/L;", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "cleanupExpiredMountingCoordinators", "invalidateNative", "", "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f44376b = new ConcurrentHashMap();
    private final HybridData mHybridData = initHybrid();

    /* JADX INFO: renamed from: com.swmansion.rnscreens.NativeProxy$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, C4546y view) {
            AbstractC5504s.h(view, "view");
            NativeProxy.f44376b.put(Integer.valueOf(i10), new WeakReference(view));
        }

        public final void b() {
            NativeProxy.f44376b.clear();
        }

        public final void c(int i10) {
            NativeProxy.f44376b.remove(Integer.valueOf(i10));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4546y c4546y) {
        c4546y.D();
    }

    private final native HybridData initHybrid();

    public final native void cleanupExpiredMountingCoordinators();

    public final native void invalidateNative();

    public final native void nativeAddMutationsListener(FabricUIManager fabricUIManager);

    public final void notifyScreenRemoved(int screenTag) {
        WeakReference weakReference = (WeakReference) f44376b.get(Integer.valueOf(screenTag));
        if (weakReference == null) {
            return;
        }
        final C4546y c4546y = (C4546y) weakReference.get();
        if (c4546y == null) {
            Log.w("[RNScreens]", "Reference stored in NativeProxy for tag " + screenTag + " no longer points to valid object.");
            return;
        }
        if (c4546y.post(new Runnable() { // from class: com.swmansion.rnscreens.p
            @Override // java.lang.Runnable
            public final void run() {
                NativeProxy.c(c4546y);
            }
        })) {
            return;
        }
        Log.w("[RNScreens]", "Failed to schedule removal transition start for screen with tag " + screenTag);
    }
}

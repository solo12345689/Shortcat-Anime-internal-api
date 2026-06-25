package com.margelo.nitro.core;

import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/core/HybridObject;", "", "<init>", "()V", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "getCxxPart", "()Lcom/margelo/nitro/core/HybridObject$CxxPart;", "LTd/L;", "dispose", "", "toString", "()Ljava/lang/String;", "createCxxPart", "Ljava/lang/ref/WeakReference;", "cxxPartCache", "Ljava/lang/ref/WeakReference;", "", "getMemorySize", "()J", "memorySize", "CxxPart", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridObject {
    private WeakReference<CxxPart> cxxPartCache;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0094 ¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/core/HybridObject$CxxPart;", "", "Lcom/margelo/nitro/core/HybridObject;", "javaPart", "<init>", "(Lcom/margelo/nitro/core/HybridObject;)V", "LTd/L;", "destroy", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/margelo/nitro/core/HybridObject;", "getJavaPart", "()Lcom/margelo/nitro/core/HybridObject;", "mHybridData", "Lcom/facebook/jni/HybridData;", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class CxxPart {
        private final HybridObject javaPart;
        private HybridData mHybridData;

        public CxxPart(HybridObject javaPart) {
            AbstractC5504s.h(javaPart, "javaPart");
            this.javaPart = javaPart;
            this.mHybridData = initHybrid();
        }

        public final void destroy() {
            this.mHybridData.resetNative();
        }

        public final HybridObject getJavaPart() {
            return this.javaPart;
        }

        protected native HybridData initHybrid();
    }

    private final CxxPart getCxxPart() {
        CxxPart cxxPart;
        WeakReference<CxxPart> weakReference = this.cxxPartCache;
        if (weakReference != null && (cxxPart = weakReference.get()) != null) {
            return cxxPart;
        }
        CxxPart cxxPartCreateCxxPart = createCxxPart();
        this.cxxPartCache = new WeakReference<>(cxxPartCreateCxxPart);
        return cxxPartCreateCxxPart;
    }

    protected CxxPart createCxxPart() {
        return new CxxPart(this);
    }

    public void dispose() {
        CxxPart cxxPart;
        WeakReference<CxxPart> weakReference = this.cxxPartCache;
        if (weakReference != null && (cxxPart = weakReference.get()) != null) {
            cxxPart.destroy();
        }
        this.cxxPartCache = null;
    }

    public long getMemorySize() {
        return 0L;
    }

    public String toString() {
        return "[HybridObject " + O.b(getClass()).v() + "]";
    }
}

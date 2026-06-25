package com.margelo.nitro.mmkv;

import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "", "getBaseDirectory", "()Ljava/lang/String;", "getAppGroupDirectory", "toString", "Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec$CxxPart;", "Companion", "CxxPart", "a", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridMMKVPlatformContextSpec extends HybridObject {
    protected static final String TAG = "HybridMMKVPlatformContextSpec";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;", "<init>", "(Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridMMKVPlatformContextSpec javaPart) {
            super(javaPart);
            AbstractC5504s.h(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();
    }

    public abstract String getAppGroupDirectory();

    public abstract String getBaseDirectory();

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject MMKVPlatformContext]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.margelo.nitro.core.HybridObject
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}

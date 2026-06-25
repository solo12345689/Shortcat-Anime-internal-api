package com.facebook.react.bridge;

import Td.InterfaceC2154e;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/CxxModuleWrapperBase;", "Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "getName", "()Ljava/lang/String;", "LTd/L;", "initialize", "()V", "", "canOverrideExistingModule", "()Z", "invalidate", "hd", "resetModule", "Lcom/facebook/jni/HybridData;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CxxModuleWrapperBase implements NativeModule {
    private static final Companion Companion = new Companion(null);
    private HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/CxxModuleWrapperBase$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ReactNativeJNISoLoader.staticInit();
        W6.b.a("CxxModuleWrapperBase", W6.a.f20777a);
    }

    protected CxxModuleWrapperBase(HybridData mHybridData) {
        AbstractC5504s.h(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @InterfaceC2154e
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mHybridData.resetNative();
    }

    protected final void resetModule(HybridData hd2) {
        AbstractC5504s.h(hd2, "hd");
        HybridData hybridData = this.mHybridData;
        if (hd2 != hybridData) {
            hybridData.resetNative();
            this.mHybridData = hd2;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }
}

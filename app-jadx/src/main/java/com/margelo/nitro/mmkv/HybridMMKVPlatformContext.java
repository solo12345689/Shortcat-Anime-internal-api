package com.margelo.nitro.mmkv;

import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.NitroModules;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContext;", "Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;", "<init>", "()V", "getBaseDirectory", "", "getAppGroupDirectory", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridMMKVPlatformContext extends HybridMMKVPlatformContextSpec {
    @Override // com.margelo.nitro.mmkv.HybridMMKVPlatformContextSpec
    public String getAppGroupDirectory() {
        throw new Error("getAppGroupDirectory() is not supported on Android! It's iOS only.");
    }

    @Override // com.margelo.nitro.mmkv.HybridMMKVPlatformContextSpec
    public String getBaseDirectory() {
        ReactApplicationContext reactApplicationContextA = NitroModules.INSTANCE.a();
        if (reactApplicationContextA == null) {
            throw new Error("Cannot get MMKV base directory - No Android Context available!");
        }
        return reactApplicationContextA.getFilesDir().getAbsolutePath() + "/mmkv";
    }
}

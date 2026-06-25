package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JSRuntimeFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f37182a = new a(null);
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSRuntimeFactory(HybridData mHybridData) {
        AbstractC5504s.h(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }
}

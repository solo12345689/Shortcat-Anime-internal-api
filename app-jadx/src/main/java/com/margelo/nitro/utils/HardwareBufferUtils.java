package com.margelo.nitro.utils;

import android.hardware.HardwareBuffer;
import com.margelo.nitro.core.b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/utils/HardwareBufferUtils;", "", "<init>", "()V", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HardwareBufferUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.margelo.nitro.utils.HardwareBufferUtils$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object b(Object obj) {
            return HardwareBufferUtils.copyHardwareBuffer(obj);
        }

        public final HardwareBuffer a(HardwareBuffer hardwareBuffer) {
            AbstractC5504s.h(hardwareBuffer, "hardwareBuffer");
            Object objB = b(hardwareBuffer);
            AbstractC5504s.f(objB, "null cannot be cast to non-null type android.hardware.HardwareBuffer");
            return b.a(objB);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Object copyHardwareBuffer(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void copyHardwareBuffer(Object obj, Object obj2);
}

package Fd;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.video.enums.DRMType;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(DRMType type) {
        super("DRM type `" + type + "` is not supported on Android", null, 2, null);
        AbstractC5504s.h(type, "type");
    }
}

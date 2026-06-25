package Hb;

import kotlin.jvm.internal.AbstractC5504s;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC6300a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String type) {
        super("This device doesn't support the selected haptic type: " + type);
        AbstractC5504s.h(type, "type");
    }
}

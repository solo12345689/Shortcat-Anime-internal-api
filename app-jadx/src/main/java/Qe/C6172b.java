package qe;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: qe.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6172b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6172b(IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        AbstractC5504s.h(cause, "cause");
    }
}

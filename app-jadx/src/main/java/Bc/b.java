package Bc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends CodedException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String id2) {
        super("Failed to handle notification " + id2 + ", it has already been handled.", null, 2, null);
        AbstractC5504s.h(id2, "id");
        this.f1648c = id2;
    }
}

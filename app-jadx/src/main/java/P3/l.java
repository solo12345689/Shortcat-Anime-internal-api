package P3;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class l {
    public static final ArrayList a(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}

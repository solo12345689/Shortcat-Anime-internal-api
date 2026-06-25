package Ud;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class A extends AbstractC2284z {
    public static void A(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void B(List list, Comparator comparator) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

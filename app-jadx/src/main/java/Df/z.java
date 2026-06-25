package Df;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z extends y {
    public static StringBuilder m(StringBuilder sb2, String... value) {
        AbstractC5504s.h(sb2, "<this>");
        AbstractC5504s.h(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }
}

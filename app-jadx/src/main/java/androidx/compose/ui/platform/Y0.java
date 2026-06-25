package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        AbstractC5504s.g(str2, "format(...)");
        sb2.append(str2);
        return sb2.toString();
    }
}

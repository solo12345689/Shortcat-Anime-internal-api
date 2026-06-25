package oc;

import java.util.Iterator;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: oc.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5856e extends j, Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: oc.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static Iterator a(InterfaceC5856e interfaceC5856e) {
            return new k(interfaceC5856e);
        }
    }

    Object get(int i10);
}

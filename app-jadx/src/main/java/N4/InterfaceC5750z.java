package n4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5750z {

    /* JADX INFO: renamed from: n4.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static void a(InterfaceC5750z interfaceC5750z, String id2, Set tags) {
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(tags, "tags");
            Iterator it = tags.iterator();
            while (it.hasNext()) {
                interfaceC5750z.d(new C5749y((String) it.next(), id2));
            }
        }
    }

    List a(String str);

    void b(String str);

    void c(String str, Set set);

    void d(C5749y c5749y);
}

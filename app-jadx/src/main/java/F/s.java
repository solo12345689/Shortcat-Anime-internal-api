package F;

import androidx.compose.ui.layout.D;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class s implements androidx.compose.ui.layout.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1544o f6083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6084b = new LinkedHashMap();

    public s(C1544o c1544o) {
        this.f6083a = c1544o;
    }

    @Override // androidx.compose.ui.layout.D
    public void a(D.a aVar) {
        this.f6084b.clear();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object objC = this.f6083a.c(it.next());
            Integer num = (Integer) this.f6084b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f6084b.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.D
    public boolean b(Object obj, Object obj2) {
        return AbstractC5504s.c(this.f6083a.c(obj), this.f6083a.c(obj2));
    }
}

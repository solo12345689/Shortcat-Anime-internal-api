package ye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class T {
    public static final void a(O o10, Xe.c fqName, Collection packageFragments) {
        AbstractC5504s.h(o10, "<this>");
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(packageFragments, "packageFragments");
        if (o10 instanceof U) {
            ((U) o10).a(fqName, packageFragments);
        } else {
            packageFragments.addAll(o10.c(fqName));
        }
    }

    public static final boolean b(O o10, Xe.c fqName) {
        AbstractC5504s.h(o10, "<this>");
        AbstractC5504s.h(fqName, "fqName");
        return o10 instanceof U ? ((U) o10).b(fqName) : c(o10, fqName).isEmpty();
    }

    public static final List c(O o10, Xe.c fqName) {
        AbstractC5504s.h(o10, "<this>");
        AbstractC5504s.h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o10, fqName, arrayList);
        return arrayList;
    }
}

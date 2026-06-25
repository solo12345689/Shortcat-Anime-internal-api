package ye;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r0 {
    public /* synthetic */ r0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(Xe.f fVar);

    public final r0 b(Function1 transform) {
        AbstractC5504s.h(transform, "transform");
        if (this instanceof C7222A) {
            C7222A c7222a = (C7222A) this;
            return new C7222A(c7222a.c(), (uf.j) transform.invoke(c7222a.d()));
        }
        if (!(this instanceof I)) {
            throw new Td.r();
        }
        List<Pair> listC = ((I) this).c();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listC, 10));
        for (Pair pair : listC) {
            arrayList.add(Td.z.a((Xe.f) pair.getFirst(), transform.invoke((uf.j) pair.getSecond())));
        }
        return new I(arrayList);
    }

    private r0() {
    }
}

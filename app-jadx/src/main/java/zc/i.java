package zc;

import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f66057a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f66058b = new ArrayList();

    private i() {
    }

    public final void a(InterfaceC5082a observer) {
        AbstractC5504s.h(observer, "observer");
        f66058b.remove(observer);
    }

    public final void b() {
        Iterator it = f66058b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5082a) it.next()).invoke();
        }
    }

    public final void c(InterfaceC5082a observer) {
        AbstractC5504s.h(observer, "observer");
        f66058b.add(observer);
    }
}

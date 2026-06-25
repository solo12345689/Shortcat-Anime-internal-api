package n4;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5734j {

    /* JADX INFO: renamed from: n4.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static C5733i a(InterfaceC5734j interfaceC5734j, C5737m id2) {
            AbstractC5504s.h(id2, "id");
            return interfaceC5734j.c(id2.b(), id2.a());
        }

        public static void b(InterfaceC5734j interfaceC5734j, C5737m id2) {
            AbstractC5504s.h(id2, "id");
            interfaceC5734j.f(id2.b(), id2.a());
        }
    }

    void a(C5733i c5733i);

    C5733i b(C5737m c5737m);

    C5733i c(String str, int i10);

    List d();

    void e(C5737m c5737m);

    void f(String str, int i10);

    void g(String str);
}

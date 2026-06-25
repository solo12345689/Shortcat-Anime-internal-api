package Wb;

import Wb.c;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ Object b(c cVar, d dVar, e eVar, Zd.e eVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerForActivityResult");
            }
            if ((i10 & 2) != 0) {
                eVar = new e() { // from class: Wb.b
                    @Override // Wb.e
                    public final void a(Serializable serializable, Object obj2) {
                        c.a.c(serializable, obj2);
                    }
                };
            }
            return cVar.c(dVar, eVar, eVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Serializable serializable, Object obj) {
            AbstractC5504s.h(serializable, "<unused var>");
        }
    }

    Object c(d dVar, e eVar, Zd.e eVar2);
}

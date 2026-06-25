package L4;

import java.io.FileNotFoundException;
import java.io.IOException;
import tg.AbstractC6690o;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final void a(AbstractC6690o abstractC6690o, P p10) {
        if (abstractC6690o.j(p10)) {
            return;
        }
        j.d(abstractC6690o.o(p10));
    }

    public static final void b(AbstractC6690o abstractC6690o, P p10) throws IOException {
        try {
            IOException iOException = null;
            for (P p11 : abstractC6690o.k(p10)) {
                try {
                    if (abstractC6690o.l(p11).f()) {
                        b(abstractC6690o, p11);
                    }
                    abstractC6690o.h(p11);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

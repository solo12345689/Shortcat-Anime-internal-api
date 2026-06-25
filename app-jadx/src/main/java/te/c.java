package Te;

import Se.n;
import Td.z;
import Ze.g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final Pair a(InputStream inputStream) throws IOException {
        n nVarX;
        AbstractC5504s.h(inputStream, "<this>");
        try {
            a aVarA = a.f17480g.a(inputStream);
            if (aVarA.h()) {
                g gVarD = g.d();
                b.a(gVarD);
                nVarX = n.X(inputStream, gVarD);
            } else {
                nVarX = null;
            }
            Pair pairA = z.a(nVarX, aVarA);
            fe.c.a(inputStream, null);
            return pairA;
        } finally {
        }
    }
}

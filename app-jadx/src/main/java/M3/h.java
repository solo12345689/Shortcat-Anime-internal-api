package M3;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q database) {
        super(database);
        AbstractC5504s.h(database, "database");
    }

    protected abstract void i(S3.k kVar, Object obj);

    public final int j(Object obj) {
        S3.k kVarB = b();
        try {
            i(kVarB, obj);
            return kVarB.Z();
        } finally {
            h(kVarB);
        }
    }

    public final int k(Iterable entities) {
        AbstractC5504s.h(entities, "entities");
        S3.k kVarB = b();
        try {
            Iterator it = entities.iterator();
            int iZ = 0;
            while (it.hasNext()) {
                i(kVarB, it.next());
                iZ += kVarB.Z();
            }
            return iZ;
        } finally {
            h(kVarB);
        }
    }
}

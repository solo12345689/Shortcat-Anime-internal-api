package M3;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q database) {
        super(database);
        AbstractC5504s.h(database, "database");
    }

    protected abstract void i(S3.k kVar, Object obj);

    public final void j(Object obj) {
        S3.k kVarB = b();
        try {
            i(kVarB, obj);
            kVarB.T0();
        } finally {
            h(kVarB);
        }
    }

    public final long k(Object obj) {
        S3.k kVarB = b();
        try {
            i(kVarB, obj);
            return kVarB.T0();
        } finally {
            h(kVarB);
        }
    }
}

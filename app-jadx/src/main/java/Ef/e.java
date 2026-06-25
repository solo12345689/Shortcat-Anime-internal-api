package Ef;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        AbstractC5504s.h(sourceUnit, "sourceUnit");
        AbstractC5504s.h(targetUnit, "targetUnit");
        long jConvert = targetUnit.b().convert(1L, sourceUnit.b());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        AbstractC5504s.h(sourceUnit, "sourceUnit");
        AbstractC5504s.h(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        AbstractC5504s.h(sourceUnit, "sourceUnit");
        AbstractC5504s.h(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }
}

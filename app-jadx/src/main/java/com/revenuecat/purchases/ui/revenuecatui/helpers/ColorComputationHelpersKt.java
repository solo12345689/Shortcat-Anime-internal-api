package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u001aC\u0010\u0004\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u0013\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"LTd/y;", "", "color1", "color2", "colorDistance", "(LTd/y;LTd/y;)D", "Ls0/r0;", "color", "relativeLuminance-8_81llA", "(J)D", "relativeLuminance", "contrastRatio--OWjLjI", "(JJ)D", "contrastRatio", "", "from", "againstColor", "selectColorWithBestContrast-4WTKRHQ", "(Ljava/util/List;J)Ls0/r0;", "selectColorWithBestContrast", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorComputationHelpersKt {
    public static final double colorDistance(y color1, y color2) {
        AbstractC5504s.h(color1, "color1");
        AbstractC5504s.h(color2, "color2");
        double dDoubleValue = ((Number) color1.a()).doubleValue();
        double dDoubleValue2 = ((Number) color1.b()).doubleValue();
        double dDoubleValue3 = ((Number) color1.c()).doubleValue();
        double d10 = 2;
        return Math.sqrt(Math.pow(dDoubleValue - ((Number) color2.a()).doubleValue(), d10) + Math.pow(dDoubleValue2 - ((Number) color2.b()).doubleValue(), d10) + Math.pow(dDoubleValue3 - ((Number) color2.c()).doubleValue(), d10));
    }

    /* JADX INFO: renamed from: contrastRatio--OWjLjI, reason: not valid java name */
    public static final double m859contrastRatioOWjLjI(long j10, long j11) {
        double dM860relativeLuminance8_81llA = m860relativeLuminance8_81llA(j10);
        double dM860relativeLuminance8_81llA2 = m860relativeLuminance8_81llA(j11);
        return (Math.max(dM860relativeLuminance8_81llA, dM860relativeLuminance8_81llA2) + 0.05d) / (Math.min(dM860relativeLuminance8_81llA, dM860relativeLuminance8_81llA2) + 0.05d);
    }

    /* JADX INFO: renamed from: relativeLuminance-8_81llA, reason: not valid java name */
    public static final double m860relativeLuminance8_81llA(long j10) {
        return (relativeLuminance_8_81llA$adjust(C6385r0.x(j10)) * 0.2126d) + (relativeLuminance_8_81llA$adjust(C6385r0.w(j10)) * 0.7152d) + (relativeLuminance_8_81llA$adjust(C6385r0.u(j10)) * 0.0722d);
    }

    private static final double relativeLuminance_8_81llA$adjust(float f10) {
        return f10 <= 0.03928f ? ((double) f10) / 12.92d : Math.pow((((double) f10) + 0.055d) / 1.055d, 2.4d);
    }

    /* JADX INFO: renamed from: selectColorWithBestContrast-4WTKRHQ, reason: not valid java name */
    public static final C6385r0 m861selectColorWithBestContrast4WTKRHQ(List<C6385r0> from, long j10) {
        Object obj;
        AbstractC5504s.h(from, "from");
        Iterator<T> it = from.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dM859contrastRatioOWjLjI = m859contrastRatioOWjLjI(((C6385r0) next).A(), j10);
                do {
                    Object next2 = it.next();
                    double dM859contrastRatioOWjLjI2 = m859contrastRatioOWjLjI(((C6385r0) next2).A(), j10);
                    if (Double.compare(dM859contrastRatioOWjLjI, dM859contrastRatioOWjLjI2) < 0) {
                        next = next2;
                        dM859contrastRatioOWjLjI = dM859contrastRatioOWjLjI2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C6385r0) obj;
    }
}

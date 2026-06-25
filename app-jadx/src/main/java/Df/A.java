package Df;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class A extends z {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean n(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Df.A.n(java.lang.String):boolean");
    }

    public static Double o(String str) {
        AbstractC5504s.h(str, "<this>");
        try {
            if (n(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float p(String str) {
        AbstractC5504s.h(str, "<this>");
        try {
            if (n(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}

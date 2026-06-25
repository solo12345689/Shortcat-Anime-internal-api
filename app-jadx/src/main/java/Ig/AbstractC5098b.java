package ig;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;

/* JADX INFO: renamed from: ig.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5098b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        U u10 = U.f52264a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC5504s.g(str2, "format(format, *args)");
        return str2;
    }

    public static final void c(AbstractC5097a abstractC5097a, d dVar, String str) {
        Logger loggerA = e.f48892h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        U u10 = U.f52264a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC5504s.g(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(abstractC5097a.b());
        loggerA.fine(sb2.toString());
    }
}

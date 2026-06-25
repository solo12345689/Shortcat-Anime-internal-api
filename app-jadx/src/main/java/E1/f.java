package e1;

import Td.r;
import U0.a1;
import U0.c1;
import android.text.style.TtsSpan;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final TtsSpan a(a1 a1Var) {
        if (a1Var instanceof c1) {
            return b((c1) a1Var);
        }
        throw new r();
    }

    public static final TtsSpan b(c1 c1Var) {
        return new TtsSpan.VerbatimBuilder(c1Var.a()).build();
    }
}

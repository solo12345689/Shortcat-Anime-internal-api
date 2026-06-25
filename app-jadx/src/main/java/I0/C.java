package I0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface C {
    void A();

    default Function1 B() {
        return null;
    }

    int getHeight();

    int getWidth();

    Map z();
}

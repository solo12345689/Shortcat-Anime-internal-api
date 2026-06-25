package w2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import q2.InterfaceC6098m;

/* JADX INFO: renamed from: w2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6940g extends InterfaceC6098m {

    /* JADX INFO: renamed from: w2.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        InterfaceC6940g a();
    }

    long a(o oVar);

    Uri c();

    void close();

    default Map f() {
        return Collections.EMPTY_MAP;
    }

    void i(InterfaceC6932F interfaceC6932F);
}

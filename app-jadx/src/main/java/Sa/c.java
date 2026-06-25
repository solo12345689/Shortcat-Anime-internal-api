package Sa;

import android.view.View;
import androidx.core.view.I;
import androidx.core.view.L0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16022a = new ArrayList();

    public final void a(I listener) {
        AbstractC5504s.h(listener, "listener");
        this.f16022a.add(listener);
    }

    @Override // androidx.core.view.I
    public L0 d(View v10, L0 insets) {
        AbstractC5504s.h(v10, "v");
        AbstractC5504s.h(insets, "insets");
        Iterator it = this.f16022a.iterator();
        while (it.hasNext()) {
            ((I) it.next()).d(v10, insets);
        }
        return insets;
    }
}

package K0;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y implements e.b {
    public static final int $stable = 0;
    private V0 _inspectorValues;

    private final V0 a() {
        V0 v02 = this._inspectorValues;
        if (v02 != null) {
            return v02;
        }
        V0 v03 = new V0();
        v03.d(kotlin.jvm.internal.O.b(getClass()).v());
        inspectableProperties(v03);
        this._inspectorValues = v03;
        return v03;
    }

    public abstract e.c create();

    public final Cf.i getInspectableElements() {
        return a().b();
    }

    public final String getNameFallback() {
        return a().a();
    }

    public final Object getValueOverride() {
        return a().c();
    }

    public void inspectableProperties(V0 v02) {
        l0.d.c(v02, this);
    }

    public abstract void update(e.c cVar);
}

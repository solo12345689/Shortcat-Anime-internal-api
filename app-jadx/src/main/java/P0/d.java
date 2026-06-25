package P0;

import Td.L;
import android.content.res.Resources;
import android.util.TypedValue;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6540F f13254a = new C6540F(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.f13254a.h();
            L l10 = L.f17438a;
        }
    }

    public final TypedValue b(Resources resources, int i10) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f13254a.c(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                this.f13254a.o(i10, typedValue);
            }
        }
        return typedValue;
    }
}

package L6;

import L6.b;
import android.os.Trace;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b.c {
    @Override // L6.b.c
    public void a(String name) {
        AbstractC5504s.h(name, "name");
        if (c()) {
            Trace.beginSection(name);
        }
    }

    @Override // L6.b.c
    public void b() {
        if (c()) {
            Trace.endSection();
        }
    }

    @Override // L6.b.c
    public boolean c() {
        return false;
    }
}

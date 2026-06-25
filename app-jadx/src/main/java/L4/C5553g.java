package l4;

import android.os.Build;
import i4.j;
import k4.C5446b;
import kotlin.jvm.internal.AbstractC5504s;
import n4.C5745u;

/* JADX INFO: renamed from: l4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5553g extends AbstractC5549c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5553g(m4.h tracker) {
        super(tracker);
        AbstractC5504s.h(tracker, "tracker");
    }

    @Override // l4.AbstractC5549c
    public boolean b(C5745u workSpec) {
        AbstractC5504s.h(workSpec, "workSpec");
        j jVarD = workSpec.f53952j.d();
        if (jVarD != j.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && jVarD == j.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // l4.AbstractC5549c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C5446b value) {
        AbstractC5504s.h(value, "value");
        return !value.a() || value.b();
    }
}

package l4;

import kotlin.jvm.internal.AbstractC5504s;
import n4.C5745u;

/* JADX INFO: renamed from: l4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5547a extends AbstractC5549c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5547a(m4.h tracker) {
        super(tracker);
        AbstractC5504s.h(tracker, "tracker");
    }

    @Override // l4.AbstractC5549c
    public boolean b(C5745u workSpec) {
        AbstractC5504s.h(workSpec, "workSpec");
        return workSpec.f53952j.g();
    }

    @Override // l4.AbstractC5549c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z10) {
        return !z10;
    }
}

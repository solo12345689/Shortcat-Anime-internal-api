package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.H;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: df.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4592a extends AbstractC4598g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4592a(InterfaceC7369c value) {
        super(value);
        AbstractC5504s.h(value, "value");
    }

    @Override // df.AbstractC4598g
    public S a(H module) {
        AbstractC5504s.h(module, "module");
        return ((InterfaceC7369c) b()).getType();
    }
}

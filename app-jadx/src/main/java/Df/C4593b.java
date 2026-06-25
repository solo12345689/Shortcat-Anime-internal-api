package df;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.H;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C4593b extends AbstractC4598g {

    /* JADX INFO: renamed from: b */
    private final Function1 f45151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4593b(List value, Function1 computeType) {
        super(value);
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(computeType, "computeType");
        this.f45151b = computeType;
    }

    @Override // df.AbstractC4598g
    public S a(H module) {
        AbstractC5504s.h(module, "module");
        S s10 = (S) this.f45151b.invoke(module);
        if (!ve.i.d0(s10) && !ve.i.r0(s10)) {
            ve.i.E0(s10);
        }
        return s10;
    }
}

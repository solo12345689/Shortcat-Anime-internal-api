package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5500n;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends d implements InterfaceC5500n {
    private final int arity;

    public l(int i10, Zd.e eVar) {
        super(eVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC5500n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM = O.m(this);
        AbstractC5504s.g(strM, "renderLambdaToString(...)");
        return strM;
    }
}

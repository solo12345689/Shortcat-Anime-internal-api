package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5506u implements InterfaceC5500n, Serializable {
    private final int arity;

    public AbstractC5506u(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC5500n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strN = O.n(this);
        AbstractC5504s.g(strN, "renderLambdaToString(...)");
        return strN;
    }
}

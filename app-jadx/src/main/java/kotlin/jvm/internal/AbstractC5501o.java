package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6018h;

/* JADX INFO: renamed from: kotlin.jvm.internal.o */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5501o extends AbstractC5492f implements InterfaceC5500n, InterfaceC6018h {
    private final int arity;
    private final int flags;

    public AbstractC5501o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    protected InterfaceC6013c computeReflected() {
        return O.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5501o) {
            AbstractC5501o abstractC5501o = (AbstractC5501o) obj;
            return getName().equals(abstractC5501o.getName()) && getSignature().equals(abstractC5501o.getSignature()) && this.flags == abstractC5501o.flags && this.arity == abstractC5501o.arity && AbstractC5504s.c(getBoundReceiver(), abstractC5501o.getBoundReceiver()) && AbstractC5504s.c(getOwner(), abstractC5501o.getOwner());
        }
        if (obj instanceof InterfaceC6018h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC5500n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // pe.InterfaceC6018h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // pe.InterfaceC6018h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // pe.InterfaceC6018h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // pe.InterfaceC6018h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // pe.InterfaceC6013c, pe.InterfaceC6018h
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC6013c interfaceC6013cCompute = compute();
        if (interfaceC6013cCompute != this) {
            return interfaceC6013cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    public InterfaceC6018h getReflected() {
        return (InterfaceC6018h) super.getReflected();
    }
}

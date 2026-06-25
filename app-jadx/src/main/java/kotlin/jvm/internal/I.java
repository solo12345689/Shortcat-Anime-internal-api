package kotlin.jvm.internal;

import pe.InterfaceC6013c;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I extends AbstractC5492f implements InterfaceC6023m {

    /* JADX INFO: renamed from: a */
    private final boolean f52254a;

    public I(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f52254a = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    public InterfaceC6013c compute() {
        return this.f52254a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            return getOwner().equals(i10.getOwner()) && getName().equals(i10.getName()) && getSignature().equals(i10.getSignature()) && AbstractC5504s.c(getBoundReceiver(), i10.getBoundReceiver());
        }
        if (obj instanceof InterfaceC6023m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC5492f
    /* JADX INFO: renamed from: j */
    public InterfaceC6023m getReflected() {
        if (this.f52254a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC6023m) super.getReflected();
    }

    public String toString() {
        InterfaceC6013c interfaceC6013cCompute = compute();
        if (interfaceC6013cCompute != this) {
            return interfaceC6013cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}

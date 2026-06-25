package Q;

import K.EnumC1762l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1762l f14193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f14195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14196d;

    public /* synthetic */ u(EnumC1762l enumC1762l, long j10, t tVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC1762l, j10, tVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f14193a == uVar.f14193a && C6224f.j(this.f14194b, uVar.f14194b) && this.f14195c == uVar.f14195c && this.f14196d == uVar.f14196d;
    }

    public int hashCode() {
        return (((((this.f14193a.hashCode() * 31) + C6224f.o(this.f14194b)) * 31) + this.f14195c.hashCode()) * 31) + Boolean.hashCode(this.f14196d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f14193a + ", position=" + ((Object) C6224f.s(this.f14194b)) + ", anchor=" + this.f14195c + ", visible=" + this.f14196d + ')';
    }

    private u(EnumC1762l enumC1762l, long j10, t tVar, boolean z10) {
        this.f14193a = enumC1762l;
        this.f14194b = j10;
        this.f14195c = tVar;
        this.f14196d = z10;
    }
}

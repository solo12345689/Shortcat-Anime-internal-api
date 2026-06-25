package ye;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ye.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7222A extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.f f65056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uf.j f65057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7222A(Xe.f underlyingPropertyName, uf.j underlyingType) {
        super(null);
        AbstractC5504s.h(underlyingPropertyName, "underlyingPropertyName");
        AbstractC5504s.h(underlyingType, "underlyingType");
        this.f65056a = underlyingPropertyName;
        this.f65057b = underlyingType;
    }

    @Override // ye.r0
    public boolean a(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return AbstractC5504s.c(this.f65056a, name);
    }

    public final Xe.f c() {
        return this.f65056a;
    }

    public final uf.j d() {
        return this.f65057b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f65056a + ", underlyingType=" + this.f65057b + ')';
    }
}

package Wf;

import Xf.a0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.e f20943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20944c;

    public /* synthetic */ v(Object obj, boolean z10, Tf.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : eVar);
    }

    @Override // Wf.E
    public String b() {
        return this.f20944c;
    }

    @Override // Wf.E
    public boolean d() {
        return this.f20942a;
    }

    public final Tf.e e() {
        return this.f20943b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return d() == vVar.d() && AbstractC5504s.c(b(), vVar.b());
    }

    public int hashCode() {
        return (Boolean.hashCode(d()) * 31) + b().hashCode();
    }

    @Override // Wf.E
    public String toString() {
        if (!d()) {
            return b();
        }
        StringBuilder sb2 = new StringBuilder();
        a0.c(sb2, b());
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object body, boolean z10, Tf.e eVar) {
        super(null);
        AbstractC5504s.h(body, "body");
        this.f20942a = z10;
        this.f20943b = eVar;
        this.f20944c = body.toString();
        if (eVar != null && !eVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}

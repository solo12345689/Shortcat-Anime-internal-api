package Ee;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class G extends u implements Oe.B {

    /* JADX INFO: renamed from: a */
    private final E f5908a;

    /* JADX INFO: renamed from: b */
    private final Annotation[] f5909b;

    /* JADX INFO: renamed from: c */
    private final String f5910c;

    /* JADX INFO: renamed from: d */
    private final boolean f5911d;

    public G(E type, Annotation[] reflectAnnotations, String str, boolean z10) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(reflectAnnotations, "reflectAnnotations");
        this.f5908a = type;
        this.f5909b = reflectAnnotations;
        this.f5910c = str;
        this.f5911d = z10;
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.B
    /* JADX INFO: renamed from: Q */
    public E getType() {
        return this.f5908a;
    }

    @Override // Oe.B
    public boolean a() {
        return this.f5911d;
    }

    @Override // Oe.B
    public Xe.f getName() {
        String str = this.f5910c;
        if (str != null) {
            return Xe.f.k(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G.class.getName());
        sb2.append(": ");
        sb2.append(a() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // Oe.InterfaceC1983d
    public List getAnnotations() {
        return k.b(this.f5909b);
    }

    @Override // Oe.InterfaceC1983d
    public C1528g h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return k.a(this.f5909b, fqName);
    }
}

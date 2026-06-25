package Ie;

import He.I;
import Le.C1878j;
import Oe.InterfaceC1980a;
import Oe.InterfaceC1983d;
import Td.z;
import Ud.S;
import Xe.b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;
import ze.InterfaceC7369c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public static final d f9087a = new d();

    /* JADX INFO: renamed from: b */
    private static final Xe.f f9088b;

    /* JADX INFO: renamed from: c */
    private static final Xe.f f9089c;

    /* JADX INFO: renamed from: d */
    private static final Xe.f f9090d;

    /* JADX INFO: renamed from: e */
    private static final Map f9091e;

    static {
        Xe.f fVarM = Xe.f.m("message");
        AbstractC5504s.g(fVarM, "identifier(...)");
        f9088b = fVarM;
        Xe.f fVarM2 = Xe.f.m("allowedTargets");
        AbstractC5504s.g(fVarM2, "identifier(...)");
        f9089c = fVarM2;
        Xe.f fVarM3 = Xe.f.m("value");
        AbstractC5504s.g(fVarM3, "identifier(...)");
        f9090d = fVarM3;
        f9091e = S.l(z.a(o.a.f62197H, I.f8447d), z.a(o.a.f62205L, I.f8449f), z.a(o.a.f62213P, I.f8452i));
    }

    private d() {
    }

    public static /* synthetic */ InterfaceC7369c f(d dVar, InterfaceC1980a interfaceC1980a, Ke.k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(interfaceC1980a, kVar, z10);
    }

    public final InterfaceC7369c a(Xe.c kotlinName, InterfaceC1983d annotationOwner, Ke.k c10) {
        InterfaceC1980a interfaceC1980aH;
        AbstractC5504s.h(kotlinName, "kotlinName");
        AbstractC5504s.h(annotationOwner, "annotationOwner");
        AbstractC5504s.h(c10, "c");
        if (AbstractC5504s.c(kotlinName, o.a.f62279y)) {
            Xe.c DEPRECATED_ANNOTATION = I.f8451h;
            AbstractC5504s.g(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC1980a interfaceC1980aH2 = annotationOwner.h(DEPRECATED_ANNOTATION);
            if (interfaceC1980aH2 != null || annotationOwner.D()) {
                return new h(interfaceC1980aH2, c10);
            }
        }
        Xe.c cVar = (Xe.c) f9091e.get(kotlinName);
        if (cVar == null || (interfaceC1980aH = annotationOwner.h(cVar)) == null) {
            return null;
        }
        return f(f9087a, interfaceC1980aH, c10, false, 4, null);
    }

    public final Xe.f b() {
        return f9088b;
    }

    public final Xe.f c() {
        return f9090d;
    }

    public final Xe.f d() {
        return f9089c;
    }

    public final InterfaceC7369c e(InterfaceC1980a annotation, Ke.k c10, boolean z10) {
        AbstractC5504s.h(annotation, "annotation");
        AbstractC5504s.h(c10, "c");
        Xe.b bVarG = annotation.g();
        b.a aVar = Xe.b.f21759d;
        Xe.c TARGET_ANNOTATION = I.f8447d;
        AbstractC5504s.g(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (AbstractC5504s.c(bVarG, aVar.c(TARGET_ANNOTATION))) {
            return new n(annotation, c10);
        }
        Xe.c RETENTION_ANNOTATION = I.f8449f;
        AbstractC5504s.g(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (AbstractC5504s.c(bVarG, aVar.c(RETENTION_ANNOTATION))) {
            return new l(annotation, c10);
        }
        Xe.c DOCUMENTED_ANNOTATION = I.f8452i;
        AbstractC5504s.g(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (AbstractC5504s.c(bVarG, aVar.c(DOCUMENTED_ANNOTATION))) {
            return new c(c10, annotation, o.a.f62213P);
        }
        Xe.c DEPRECATED_ANNOTATION = I.f8451h;
        AbstractC5504s.g(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (AbstractC5504s.c(bVarG, aVar.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C1878j(c10, annotation, z10);
    }
}

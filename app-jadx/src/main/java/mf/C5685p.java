package mf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import of.InterfaceC5895s;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: mf.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5685p {

    /* JADX INFO: renamed from: a */
    private final C5683n f53458a;

    /* JADX INFO: renamed from: b */
    private final Ue.d f53459b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7235m f53460c;

    /* JADX INFO: renamed from: d */
    private final Ue.h f53461d;

    /* JADX INFO: renamed from: e */
    private final Ue.i f53462e;

    /* JADX INFO: renamed from: f */
    private final Ue.a f53463f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC5895s f53464g;

    /* JADX INFO: renamed from: h */
    private final X f53465h;

    /* JADX INFO: renamed from: i */
    private final K f53466i;

    public C5685p(C5683n components, Ue.d nameResolver, InterfaceC7235m containingDeclaration, Ue.h typeTable, Ue.i versionRequirementTable, Ue.a metadataVersion, InterfaceC5895s interfaceC5895s, X x10, List typeParameters) {
        String strA;
        AbstractC5504s.h(components, "components");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(versionRequirementTable, "versionRequirementTable");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(typeParameters, "typeParameters");
        this.f53458a = components;
        this.f53459b = nameResolver;
        this.f53460c = containingDeclaration;
        this.f53461d = typeTable;
        this.f53462e = versionRequirementTable;
        this.f53463f = metadataVersion;
        this.f53464g = interfaceC5895s;
        this.f53465h = new X(this, x10, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC5895s == null || (strA = interfaceC5895s.a()) == null) ? "[container not found]" : strA);
        this.f53466i = new K(this);
    }

    public static /* synthetic */ C5685p b(C5685p c5685p, InterfaceC7235m interfaceC7235m, List list, Ue.d dVar, Ue.h hVar, Ue.i iVar, Ue.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = c5685p.f53459b;
        }
        Ue.d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            hVar = c5685p.f53461d;
        }
        Ue.h hVar2 = hVar;
        if ((i10 & 16) != 0) {
            iVar = c5685p.f53462e;
        }
        Ue.i iVar2 = iVar;
        if ((i10 & 32) != 0) {
            aVar = c5685p.f53463f;
        }
        return c5685p.a(interfaceC7235m, list, dVar2, hVar2, iVar2, aVar);
    }

    public final C5685p a(InterfaceC7235m descriptor, List typeParameterProtos, Ue.d nameResolver, Ue.h typeTable, Ue.i versionRequirementTable, Ue.a metadataVersion) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(typeParameterProtos, "typeParameterProtos");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(versionRequirementTable, "versionRequirementTable");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        return new C5685p(this.f53458a, nameResolver, descriptor, typeTable, Ue.j.b(metadataVersion) ? versionRequirementTable : this.f53462e, metadataVersion, this.f53464g, this.f53465h, typeParameterProtos);
    }

    public final C5683n c() {
        return this.f53458a;
    }

    public final InterfaceC5895s d() {
        return this.f53464g;
    }

    public final InterfaceC7235m e() {
        return this.f53460c;
    }

    public final K f() {
        return this.f53466i;
    }

    public final Ue.d g() {
        return this.f53459b;
    }

    public final pf.n h() {
        return this.f53458a.u();
    }

    public final X i() {
        return this.f53465h;
    }

    public final Ue.h j() {
        return this.f53461d;
    }

    public final Ue.i k() {
        return this.f53462e;
    }
}

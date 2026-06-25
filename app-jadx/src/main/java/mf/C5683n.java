package mf;

import Ae.a;
import Ae.c;
import Ud.AbstractC2279u;
import hf.InterfaceC4947a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC5690v;
import of.InterfaceC5895s;
import qf.C6213x;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: mf.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5683n {

    /* JADX INFO: renamed from: a */
    private final pf.n f53436a;

    /* JADX INFO: renamed from: b */
    private final ye.H f53437b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5684o f53438c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5679j f53439d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC5674e f53440e;

    /* JADX INFO: renamed from: f */
    private final ye.O f53441f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC5669B f53442g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC5691w f53443h;

    /* JADX INFO: renamed from: i */
    private final Ge.c f53444i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC5692x f53445j;

    /* JADX INFO: renamed from: k */
    private final Iterable f53446k;

    /* JADX INFO: renamed from: l */
    private final ye.M f53447l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC5682m f53448m;

    /* JADX INFO: renamed from: n */
    private final Ae.a f53449n;

    /* JADX INFO: renamed from: o */
    private final Ae.c f53450o;

    /* JADX INFO: renamed from: p */
    private final Ze.g f53451p;

    /* JADX INFO: renamed from: q */
    private final rf.p f53452q;

    /* JADX INFO: renamed from: r */
    private final InterfaceC4947a f53453r;

    /* JADX INFO: renamed from: s */
    private final List f53454s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC5690v f53455t;

    /* JADX INFO: renamed from: u */
    private final C5681l f53456u;

    public C5683n(pf.n storageManager, ye.H moduleDescriptor, InterfaceC5684o configuration, InterfaceC5679j classDataFinder, InterfaceC5674e annotationAndConstantLoader, ye.O packageFragmentProvider, InterfaceC5669B localClassifierTypeSettings, InterfaceC5691w errorReporter, Ge.c lookupTracker, InterfaceC5692x flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, ye.M notFoundClasses, InterfaceC5682m contractDeserializer, Ae.a additionalClassPartsProvider, Ae.c platformDependentDeclarationFilter, Ze.g extensionRegistryLite, rf.p kotlinTypeChecker, InterfaceC4947a samConversionResolver, List typeAttributeTranslators, InterfaceC5690v enumEntriesDeserializationSupport) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(classDataFinder, "classDataFinder");
        AbstractC5504s.h(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC5504s.h(packageFragmentProvider, "packageFragmentProvider");
        AbstractC5504s.h(localClassifierTypeSettings, "localClassifierTypeSettings");
        AbstractC5504s.h(errorReporter, "errorReporter");
        AbstractC5504s.h(lookupTracker, "lookupTracker");
        AbstractC5504s.h(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        AbstractC5504s.h(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(contractDeserializer, "contractDeserializer");
        AbstractC5504s.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC5504s.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC5504s.h(extensionRegistryLite, "extensionRegistryLite");
        AbstractC5504s.h(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC5504s.h(samConversionResolver, "samConversionResolver");
        AbstractC5504s.h(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC5504s.h(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f53436a = storageManager;
        this.f53437b = moduleDescriptor;
        this.f53438c = configuration;
        this.f53439d = classDataFinder;
        this.f53440e = annotationAndConstantLoader;
        this.f53441f = packageFragmentProvider;
        this.f53442g = localClassifierTypeSettings;
        this.f53443h = errorReporter;
        this.f53444i = lookupTracker;
        this.f53445j = flexibleTypeDeserializer;
        this.f53446k = fictitiousClassDescriptorFactories;
        this.f53447l = notFoundClasses;
        this.f53448m = contractDeserializer;
        this.f53449n = additionalClassPartsProvider;
        this.f53450o = platformDependentDeclarationFilter;
        this.f53451p = extensionRegistryLite;
        this.f53452q = kotlinTypeChecker;
        this.f53453r = samConversionResolver;
        this.f53454s = typeAttributeTranslators;
        this.f53455t = enumEntriesDeserializationSupport;
        this.f53456u = new C5681l(this);
    }

    public final C5685p a(ye.N descriptor, Ue.d nameResolver, Ue.h typeTable, Ue.i versionRequirementTable, Ue.a metadataVersion, InterfaceC5895s interfaceC5895s) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(versionRequirementTable, "versionRequirementTable");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        return new C5685p(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC5895s, null, AbstractC2279u.m());
    }

    public final InterfaceC7227e b(Xe.b classId) {
        AbstractC5504s.h(classId, "classId");
        return C5681l.f(this.f53456u, classId, null, 2, null);
    }

    public final Ae.a c() {
        return this.f53449n;
    }

    public final InterfaceC5674e d() {
        return this.f53440e;
    }

    public final InterfaceC5679j e() {
        return this.f53439d;
    }

    public final C5681l f() {
        return this.f53456u;
    }

    public final InterfaceC5684o g() {
        return this.f53438c;
    }

    public final InterfaceC5682m h() {
        return this.f53448m;
    }

    public final InterfaceC5690v i() {
        return this.f53455t;
    }

    public final InterfaceC5691w j() {
        return this.f53443h;
    }

    public final Ze.g k() {
        return this.f53451p;
    }

    public final Iterable l() {
        return this.f53446k;
    }

    public final InterfaceC5692x m() {
        return this.f53445j;
    }

    public final rf.p n() {
        return this.f53452q;
    }

    public final InterfaceC5669B o() {
        return this.f53442g;
    }

    public final Ge.c p() {
        return this.f53444i;
    }

    public final ye.H q() {
        return this.f53437b;
    }

    public final ye.M r() {
        return this.f53447l;
    }

    public final ye.O s() {
        return this.f53441f;
    }

    public final Ae.c t() {
        return this.f53450o;
    }

    public final pf.n u() {
        return this.f53436a;
    }

    public final List v() {
        return this.f53454s;
    }

    public /* synthetic */ C5683n(pf.n nVar, ye.H h10, InterfaceC5684o interfaceC5684o, InterfaceC5679j interfaceC5679j, InterfaceC5674e interfaceC5674e, ye.O o10, InterfaceC5669B interfaceC5669B, InterfaceC5691w interfaceC5691w, Ge.c cVar, InterfaceC5692x interfaceC5692x, Iterable iterable, ye.M m10, InterfaceC5682m interfaceC5682m, Ae.a aVar, Ae.c cVar2, Ze.g gVar, rf.p pVar, InterfaceC4947a interfaceC4947a, List list, InterfaceC5690v interfaceC5690v, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h10, interfaceC5684o, interfaceC5679j, interfaceC5674e, o10, interfaceC5669B, interfaceC5691w, cVar, interfaceC5692x, iterable, m10, interfaceC5682m, (i10 & 8192) != 0 ? a.C0010a.f405a : aVar, (i10 & 16384) != 0 ? c.a.f406a : cVar2, gVar, (65536 & i10) != 0 ? rf.p.f58793b.a() : pVar, interfaceC4947a, (262144 & i10) != 0 ? AbstractC2279u.e(C6213x.f58121a) : list, (i10 & 524288) != 0 ? InterfaceC5690v.a.f53477a : interfaceC5690v);
    }
}

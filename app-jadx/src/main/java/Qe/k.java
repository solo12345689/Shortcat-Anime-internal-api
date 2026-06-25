package Qe;

import Ae.a;
import Ae.c;
import Be.C1117l;
import He.InterfaceC1673u;
import Qe.D;
import Ud.AbstractC2279u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import gf.C4880c;
import hf.C4948b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C5683n;
import mf.C5694z;
import mf.InterfaceC5669B;
import mf.InterfaceC5682m;
import mf.InterfaceC5684o;
import mf.InterfaceC5691w;
import pf.C6041f;
import tf.C6673a;
import xe.C7147k;
import ye.M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: b */
    public static final a f14878b = new a(null);

    /* JADX INFO: renamed from: a */
    private final C5683n f14879a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: Qe.k$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0252a {

            /* JADX INFO: renamed from: a */
            private final k f14880a;

            /* JADX INFO: renamed from: b */
            private final n f14881b;

            public C0252a(k deserializationComponentsForJava, n deserializedDescriptorResolver) {
                AbstractC5504s.h(deserializationComponentsForJava, "deserializationComponentsForJava");
                AbstractC5504s.h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f14880a = deserializationComponentsForJava;
                this.f14881b = deserializedDescriptorResolver;
            }

            public final k a() {
                return this.f14880a;
            }

            public final n b() {
                return this.f14881b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0252a a(v kotlinClassFinder, v jvmBuiltInsKotlinClassFinder, InterfaceC1673u javaClassFinder, String moduleName, InterfaceC5691w errorReporter, Ne.b javaSourceElementFactory) {
            AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
            AbstractC5504s.h(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            AbstractC5504s.h(javaClassFinder, "javaClassFinder");
            AbstractC5504s.h(moduleName, "moduleName");
            AbstractC5504s.h(errorReporter, "errorReporter");
            AbstractC5504s.h(javaSourceElementFactory, "javaSourceElementFactory");
            C6041f c6041f = new C6041f("DeserializationComponentsForJava.ModuleData");
            C7147k c7147k = new C7147k(c6041f, C7147k.a.f64416a);
            Xe.f fVarQ = Xe.f.q('<' + moduleName + '>');
            AbstractC5504s.g(fVarQ, "special(...)");
            Be.F f10 = new Be.F(fVarQ, c6041f, c7147k, null, null, null, 56, null);
            c7147k.F0(f10);
            c7147k.N0(f10, true);
            n nVar = new n();
            Ke.o oVar = new Ke.o();
            M m10 = new M(c6041f, f10);
            Ke.j jVarB = l.b(javaClassFinder, f10, c6041f, m10, kotlinClassFinder, nVar, errorReporter, javaSourceElementFactory, oVar, (IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? D.a.f14803a : null);
            k kVarA = l.a(f10, c6041f, m10, jVarB, kotlinClassFinder, nVar, errorReporter, Ue.c.f19575i);
            nVar.o(kVarA);
            Ie.j EMPTY = Ie.j.f9100a;
            AbstractC5504s.g(EMPTY, "EMPTY");
            C4880c c4880c = new C4880c(jVarB, EMPTY);
            oVar.c(c4880c);
            xe.w wVar = new xe.w(c6041f, jvmBuiltInsKotlinClassFinder, f10, m10, c7147k.M0(), c7147k.M0(), InterfaceC5684o.a.f53457a, rf.p.f58793b.a(), new C4948b(c6041f, AbstractC2279u.m()));
            f10.W0(f10);
            f10.O0(new C1117l(AbstractC2279u.p(c4880c.a(), wVar), "CompositeProvider@RuntimeModuleData for " + f10));
            return new C0252a(kVarA, nVar);
        }

        private a() {
        }
    }

    public k(pf.n storageManager, ye.H moduleDescriptor, InterfaceC5684o configuration, o classDataFinder, C2089h annotationAndConstantLoader, Ke.j packageFragmentProvider, M notFoundClasses, InterfaceC5691w errorReporter, Ge.c lookupTracker, InterfaceC5682m contractDeserializer, rf.p kotlinTypeChecker, C6673a typeAttributeTranslators) {
        Ae.c cVarM0;
        Ae.a aVarM0;
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(classDataFinder, "classDataFinder");
        AbstractC5504s.h(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC5504s.h(packageFragmentProvider, "packageFragmentProvider");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(errorReporter, "errorReporter");
        AbstractC5504s.h(lookupTracker, "lookupTracker");
        AbstractC5504s.h(contractDeserializer, "contractDeserializer");
        AbstractC5504s.h(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC5504s.h(typeAttributeTranslators, "typeAttributeTranslators");
        ve.i iVarN = moduleDescriptor.n();
        C7147k c7147k = iVarN instanceof C7147k ? (C7147k) iVarN : null;
        this.f14879a = new C5683n(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, InterfaceC5669B.a.f53332a, errorReporter, lookupTracker, p.f14892a, AbstractC2279u.m(), notFoundClasses, contractDeserializer, (c7147k == null || (aVarM0 = c7147k.M0()) == null) ? a.C0010a.f405a : aVarM0, (c7147k == null || (cVarM0 = c7147k.M0()) == null) ? c.b.f407a : cVarM0, We.h.f20878a.a(), kotlinTypeChecker, new C4948b(storageManager, AbstractC2279u.m()), typeAttributeTranslators.a(), C5694z.f53486a);
    }

    public final C5683n a() {
        return this.f14879a;
    }
}

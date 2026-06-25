package xf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.S;
import xf.InterfaceC7154f;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7170v implements InterfaceC7154f {

    /* JADX INFO: renamed from: a */
    private final String f64567a;

    /* JADX INFO: renamed from: b */
    private final Function1 f64568b;

    /* JADX INFO: renamed from: c */
    private final String f64569c;

    /* JADX INFO: renamed from: xf.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7170v {

        /* JADX INFO: renamed from: d */
        public static final a f64570d = new a();

        private a() {
            super("Boolean", C7169u.f64566a, null);
        }

        public static final S c(ve.i iVar) {
            AbstractC5504s.h(iVar, "<this>");
            AbstractC6183d0 abstractC6183d0O = iVar.o();
            AbstractC5504s.g(abstractC6183d0O, "getBooleanType(...)");
            return abstractC6183d0O;
        }
    }

    /* JADX INFO: renamed from: xf.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC7170v {

        /* JADX INFO: renamed from: d */
        public static final b f64571d = new b();

        private b() {
            super("Int", C7171w.f64573a, null);
        }

        public static final S c(ve.i iVar) {
            AbstractC5504s.h(iVar, "<this>");
            AbstractC6183d0 abstractC6183d0E = iVar.E();
            AbstractC5504s.g(abstractC6183d0E, "getIntType(...)");
            return abstractC6183d0E;
        }
    }

    /* JADX INFO: renamed from: xf.v$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC7170v {

        /* JADX INFO: renamed from: d */
        public static final c f64572d = new c();

        private c() {
            super("Unit", C7172x.f64574a, null);
        }

        public static final S c(ve.i iVar) {
            AbstractC5504s.h(iVar, "<this>");
            AbstractC6183d0 abstractC6183d0A0 = iVar.a0();
            AbstractC5504s.g(abstractC6183d0A0, "getUnitType(...)");
            return abstractC6183d0A0;
        }
    }

    public /* synthetic */ AbstractC7170v(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // xf.InterfaceC7154f
    public String a(InterfaceC7247z interfaceC7247z) {
        return InterfaceC7154f.a.a(this, interfaceC7247z);
    }

    @Override // xf.InterfaceC7154f
    public boolean b(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        return AbstractC5504s.c(functionDescriptor.getReturnType(), this.f64568b.invoke(ff.e.m(functionDescriptor)));
    }

    @Override // xf.InterfaceC7154f
    public String getDescription() {
        return this.f64569c;
    }

    private AbstractC7170v(String str, Function1 function1) {
        this.f64567a = str;
        this.f64568b = function1;
        this.f64569c = "must return " + str;
    }
}

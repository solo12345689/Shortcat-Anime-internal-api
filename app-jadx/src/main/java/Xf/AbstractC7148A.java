package xf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf.InterfaceC7154f;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7148A implements InterfaceC7154f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64465a;

    /* JADX INFO: renamed from: xf.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7148A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f64466b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f64466b = i10;
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() >= this.f64466b;
        }
    }

    /* JADX INFO: renamed from: xf.A$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC7148A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f64467b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f64467b = i10;
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() == this.f64467b;
        }
    }

    /* JADX INFO: renamed from: xf.A$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC7148A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f64468b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().isEmpty();
        }
    }

    /* JADX INFO: renamed from: xf.A$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC7148A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f64469b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() == 1;
        }
    }

    public /* synthetic */ AbstractC7148A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // xf.InterfaceC7154f
    public String a(InterfaceC7247z interfaceC7247z) {
        return InterfaceC7154f.a.a(this, interfaceC7247z);
    }

    @Override // xf.InterfaceC7154f
    public String getDescription() {
        return this.f64465a;
    }

    private AbstractC7148A(String str) {
        this.f64465a = str;
    }
}

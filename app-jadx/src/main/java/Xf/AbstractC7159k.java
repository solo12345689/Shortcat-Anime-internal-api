package xf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf.InterfaceC7154f;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7159k implements InterfaceC7154f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64492a;

    /* JADX INFO: renamed from: xf.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7159k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f64493b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.K() != null;
        }
    }

    /* JADX INFO: renamed from: xf.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC7159k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f64494b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // xf.InterfaceC7154f
        public boolean b(InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.K() == null && functionDescriptor.O() == null) ? false : true;
        }
    }

    public /* synthetic */ AbstractC7159k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // xf.InterfaceC7154f
    public String a(InterfaceC7247z interfaceC7247z) {
        return InterfaceC7154f.a.a(this, interfaceC7247z);
    }

    @Override // xf.InterfaceC7154f
    public String getDescription() {
        return this.f64492a;
    }

    private AbstractC7159k(String str) {
        this.f64492a = str;
    }
}

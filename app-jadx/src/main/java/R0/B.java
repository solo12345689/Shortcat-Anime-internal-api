package R0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: e */
    public static final int f14926e = 8;

    /* JADX INFO: renamed from: a */
    private final String f14927a;

    /* JADX INFO: renamed from: b */
    private final Function2 f14928b;

    /* JADX INFO: renamed from: c */
    private boolean f14929c;

    /* JADX INFO: renamed from: d */
    private String f14930d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f14931a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public B(String str, Function2 function2) {
        this.f14927a = str;
        this.f14928b = function2;
    }

    public final String a() {
        return this.f14930d;
    }

    public final String b() {
        return this.f14927a;
    }

    public final boolean c() {
        return this.f14929c;
    }

    public final Object d(Object obj, Object obj2) {
        return this.f14928b.invoke(obj, obj2);
    }

    public final void e(C c10, InterfaceC6023m interfaceC6023m, Object obj) {
        c10.b(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f14927a;
    }

    public /* synthetic */ B(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f14931a : function2);
    }

    public B(String str, boolean z10) {
        this(str, (Function2) null, 2, (DefaultConstructorMarker) null);
        this.f14929c = z10;
    }

    public /* synthetic */ B(String str, boolean z10, Function2 function2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, function2, (i10 & 8) != 0 ? null : str2);
    }

    public B(String str, boolean z10, Function2 function2, String str2) {
        this(str, function2);
        this.f14929c = z10;
        this.f14930d = str2;
    }
}

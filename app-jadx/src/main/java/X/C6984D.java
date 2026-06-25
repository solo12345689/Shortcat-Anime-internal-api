package x;

import I0.InterfaceC1690p;
import K0.I0;
import K0.J0;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6984D extends e.c implements I0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f63225c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63226d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f63227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f63228b = f63225c;

    /* JADX INFO: renamed from: x.D$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6984D(Function1 function1) {
        this.f63227a = function1;
    }

    @Override // K0.I0
    public Object B() {
        return this.f63228b;
    }

    public final void E1(InterfaceC1690p interfaceC1690p) {
        this.f63227a.invoke(interfaceC1690p);
        C6984D c6984d = (C6984D) J0.b(this);
        if (c6984d != null) {
            c6984d.E1(interfaceC1690p);
        }
    }
}

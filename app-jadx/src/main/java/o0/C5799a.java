package o0;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E;
import s0.InterfaceC6364j0;
import u0.C6706a;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5799a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5011d f54193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f54195c;

    public /* synthetic */ C5799a(InterfaceC5011d interfaceC5011d, long j10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5011d, j10, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        C6706a c6706a = new C6706a();
        InterfaceC5011d interfaceC5011d = this.f54193a;
        long j10 = this.f54194b;
        EnumC5027t enumC5027t = EnumC5027t.f48573a;
        InterfaceC6364j0 interfaceC6364j0B = E.b(canvas);
        Function1 function1 = this.f54195c;
        C6706a.C0912a c0912aN = c6706a.N();
        InterfaceC5011d interfaceC5011dA = c0912aN.a();
        EnumC5027t enumC5027tB = c0912aN.b();
        InterfaceC6364j0 interfaceC6364j0C = c0912aN.c();
        long jD = c0912aN.d();
        C6706a.C0912a c0912aN2 = c6706a.N();
        c0912aN2.j(interfaceC5011d);
        c0912aN2.k(enumC5027t);
        c0912aN2.i(interfaceC6364j0B);
        c0912aN2.l(j10);
        interfaceC6364j0B.p();
        function1.invoke(c6706a);
        interfaceC6364j0B.k();
        C6706a.C0912a c0912aN3 = c6706a.N();
        c0912aN3.j(interfaceC5011dA);
        c0912aN3.k(enumC5027tB);
        c0912aN3.i(interfaceC6364j0C);
        c0912aN3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        InterfaceC5011d interfaceC5011d = this.f54193a;
        point.set(interfaceC5011d.s0(interfaceC5011d.e1(Float.intBitsToFloat((int) (this.f54194b >> 32)))), interfaceC5011d.s0(interfaceC5011d.e1(Float.intBitsToFloat((int) (this.f54194b & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    private C5799a(InterfaceC5011d interfaceC5011d, long j10, Function1 function1) {
        this.f54193a = interfaceC5011d;
        this.f54194b = j10;
        this.f54195c = function1;
    }
}

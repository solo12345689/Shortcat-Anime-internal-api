package a6;

import a6.InterfaceC2580a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2581b implements InterfaceC2580a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23813e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2580a f23814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23815b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f23816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f23817d;

    /* JADX INFO: renamed from: a6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC2581b(InterfaceC2580a interfaceC2580a) {
        this.f23814a = interfaceC2580a;
    }

    @Override // a6.InterfaceC2583d
    public int a() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.a();
    }

    @Override // a6.InterfaceC2583d
    public int b() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.b();
    }

    @Override // a6.InterfaceC2580a
    public int c() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return -1;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.c();
    }

    @Override // a6.InterfaceC2580a
    public void clear() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a != null) {
            interfaceC2580a.clear();
        }
    }

    @Override // a6.InterfaceC2580a
    public void d(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a != null) {
            interfaceC2580a.d(bounds);
        }
        this.f23817d = bounds;
    }

    @Override // a6.InterfaceC2580a
    public int e() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return -1;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.e();
    }

    @Override // a6.InterfaceC2580a
    public void f(ColorFilter colorFilter) {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a != null) {
            interfaceC2580a.f(colorFilter);
        }
        this.f23816c = colorFilter;
    }

    @Override // a6.InterfaceC2583d
    public int g() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.g();
    }

    @Override // a6.InterfaceC2580a
    public boolean h(Drawable parent, Canvas canvas, int i10) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(canvas, "canvas");
        InterfaceC2580a interfaceC2580a = this.f23814a;
        return interfaceC2580a != null && interfaceC2580a.h(parent, canvas, i10);
    }

    @Override // a6.InterfaceC2583d
    public int j() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.j();
    }

    @Override // a6.InterfaceC2583d
    public int k(int i10) {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.k(i10);
    }

    @Override // a6.InterfaceC2580a
    public void l(int i10) {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a != null) {
            interfaceC2580a.l(i10);
        }
        this.f23815b = i10;
    }

    @Override // a6.InterfaceC2583d
    public int m() {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a == null) {
            return 0;
        }
        AbstractC5504s.e(interfaceC2580a);
        return interfaceC2580a.m();
    }

    @Override // a6.InterfaceC2580a
    public void n(InterfaceC2580a.InterfaceC0415a interfaceC0415a) {
        InterfaceC2580a interfaceC2580a = this.f23814a;
        if (interfaceC2580a != null) {
            interfaceC2580a.n(interfaceC0415a);
        }
    }
}

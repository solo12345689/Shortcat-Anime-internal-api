package w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t.AbstractC6566p;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6540F f62425c;

    public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.f62424b;
    }

    public final int b() {
        return this.f62423a;
    }

    public final C6540F c() {
        return this.f62425c;
    }

    public final void d(int i10) {
        this.f62423a = i10;
    }

    public final Q e(Q q10, InterfaceC6875D interfaceC6875D) {
        q10.c(interfaceC6875D);
        return q10;
    }

    private T() {
        this.f62423a = 300;
        this.f62425c = AbstractC6566p.c();
    }
}

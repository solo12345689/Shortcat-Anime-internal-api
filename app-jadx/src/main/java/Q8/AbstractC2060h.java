package Q8;

import R8.AbstractC2115p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Q8.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2060h {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC2061i f14492a;

    protected AbstractC2060h(InterfaceC2061i interfaceC2061i) {
        this.f14492a = interfaceC2061i;
    }

    protected static InterfaceC2061i c(C2059g c2059g) {
        if (c2059g.a()) {
            return k0.w(c2059g.d());
        }
        if (c2059g.b()) {
            return h0.a(c2059g.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC2061i d(Activity activity) {
        return c(new C2059g(activity));
    }

    public Activity b() {
        Activity activityF = this.f14492a.f();
        AbstractC2115p.l(activityF);
        return activityF;
    }

    public abstract void e(int i10, int i11, Intent intent);

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}

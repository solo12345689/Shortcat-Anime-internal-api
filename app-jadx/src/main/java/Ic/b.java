package Ic;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import androidx.core.app.p;
import androidx.core.app.q;
import java.util.List;
import qb.InterfaceC6168b;
import r4.E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f9023a;

    public b(Context context) {
        this.f9023a = q.i(context);
    }

    @Override // Ic.e
    public NotificationChannelGroup a(String str, CharSequence charSequence, InterfaceC6168b interfaceC6168b) {
        NotificationChannelGroup notificationChannelGroupA = E.a(str, charSequence);
        e(notificationChannelGroupA, interfaceC6168b);
        this.f9023a.f(notificationChannelGroupA);
        return notificationChannelGroupA;
    }

    @Override // Ic.e
    public List b() {
        return this.f9023a.n();
    }

    @Override // Ic.e
    public NotificationChannelGroup c(String str) {
        return this.f9023a.m(str);
    }

    @Override // Ic.e
    public void d(String str) {
        this.f9023a.h(str);
    }

    protected void e(Object obj, InterfaceC6168b interfaceC6168b) {
        if (a.a(obj)) {
            NotificationChannelGroup notificationChannelGroupA = p.a(obj);
            if (Build.VERSION.SDK_INT < 28 || !interfaceC6168b.f(com.amazon.a.a.o.b.f34645c)) {
                return;
            }
            notificationChannelGroupA.setDescription(interfaceC6168b.getString(com.amazon.a.a.o.b.f34645c));
        }
    }
}

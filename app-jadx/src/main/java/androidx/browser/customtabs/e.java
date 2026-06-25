package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.InterfaceC2963b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private Context f25554a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends c {
        a(InterfaceC2963b interfaceC2963b, ComponentName componentName, Context context) {
            super(interfaceC2963b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f25554a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f25554a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC2963b.a.c(iBinder), componentName, this.f25554a));
    }
}

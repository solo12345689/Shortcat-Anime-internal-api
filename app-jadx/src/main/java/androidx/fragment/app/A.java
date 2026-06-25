package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC5504s;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC2844x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f29721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f29723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K f29725e;

    public A(Activity activity, Context context, Handler handler, int i10) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(handler, "handler");
        this.f29721a = activity;
        this.f29722b = context;
        this.f29723c = handler;
        this.f29724d = i10;
        this.f29725e = new L();
    }

    public final Activity e() {
        return this.f29721a;
    }

    public final Context f() {
        return this.f29722b;
    }

    public final K g() {
        return this.f29725e;
    }

    public final Handler h() {
        return this.f29723c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object j();

    public abstract LayoutInflater k();

    public void l(AbstractComponentCallbacksC2838q fragment, String[] permissions, int i10) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(permissions, "permissions");
    }

    public abstract boolean m(String str);

    public void n(AbstractComponentCallbacksC2838q fragment, Intent intent, int i10, Bundle bundle) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC7194b.o(this.f29722b, intent, bundle);
    }

    public void o(AbstractComponentCallbacksC2838q fragment, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f29721a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.w(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public abstract void p();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(AbstractActivityC2842v activity) {
        this(activity, activity, new Handler(), 0);
        AbstractC5504s.h(activity, "activity");
    }
}

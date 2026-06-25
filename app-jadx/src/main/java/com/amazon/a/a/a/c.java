package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import com.amazon.a.a.a.a.d;
import com.amazon.a.a.c.f;
import com.amazon.a.a.o.g;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f34255a = new com.amazon.a.a.o.c("ContextManagerImplV3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f34259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f34260f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Activity> f34256b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g<Activity> f34257c = new g<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<Activity> f34258d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34261g = false;

    private boolean e() {
        return !this.f34261g && this.f34258d.size() == 1;
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34255a.a("Checking if application is destroyed");
        }
        if (!this.f34258d.isEmpty()) {
            return false;
        }
        f34255a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Service service) {
    }

    @Override // com.amazon.a.a.a.a
    public void b(Service service) {
    }

    @Override // com.amazon.a.a.a.a
    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f34255a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        this.f34257c.a(activity);
        this.f34258d.add(activity);
        Activity activityI = i(activity);
        this.f34256b.set(activityI);
        cVar.a("Setting visible to: " + activityI);
        if (com.amazon.a.a.o.c.f34699a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    @Override // com.amazon.a.a.a.a
    public boolean d() {
        return false;
    }

    @Override // com.amazon.a.a.a.a
    public void f() {
    }

    @Override // com.amazon.a.a.a.a
    public void g() {
    }

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    @Override // com.amazon.a.a.a.a
    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        Object[] array = this.f34258d.toArray();
        Activity activity = null;
        for (int length = array.length - 1; length >= 0; length--) {
            activity = (Activity) array[length];
            if (g(activity)) {
                f34255a.a("root activity" + activity);
                return activity;
            }
        }
        if (activity != null || array.length <= 0) {
            return activity;
        }
        f34255a.a("root not fount returning" + activity);
        return (Activity) array[array.length - 1];
    }

    @Override // com.amazon.a.a.a.a
    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f34258d.remove(activity);
        if (com.amazon.a.a.o.c.f34699a) {
            f34255a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f34258d.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            f34255a.a("AppLifeCycle application has been destroyed");
            this.f34261g = false;
            a(d.DESTROY);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f34699a) {
            f34255a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        this.f34258d.add(activity);
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34255a.a("Setting visible activity to null");
            }
            this.f34256b.set(null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f34255a.a("Activity stopped: " + activity);
        this.f34258d.add(activity);
        this.f34257c.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f34257c.a()) {
            a(d.STOP);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f34255a.a("Activity started: " + activity);
        this.f34258d.add(activity);
        this.f34257c.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (e()) {
            this.f34261g = true;
            a(d.CREATE);
        }
        if (this.f34257c.b() == 1) {
            a(d.START);
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean h() {
        com.amazon.a.a.o.a.a.a();
        return (!c() && this.f34258d.isEmpty() && this.f34257c.a()) ? false : true;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f34258d.add(activity);
        if (com.amazon.a.a.o.c.f34699a) {
            f34255a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f34258d.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (e()) {
            this.f34261g = true;
            a(d.CREATE);
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean c() {
        return this.f34256b.get() != null;
    }

    @Override // com.amazon.a.a.a.a
    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f34256b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f34260f.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(d dVar) {
        this.f34260f.a(new com.amazon.a.a.a.a.c(dVar, this.f34259e));
    }
}

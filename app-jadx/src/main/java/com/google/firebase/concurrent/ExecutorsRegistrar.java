package com.google.firebase.concurrent;

import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import aa.w;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import ma.InterfaceC5655b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w f43212a = new w(new InterfaceC5655b() { // from class: ba.b
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f43213b = new w(new InterfaceC5655b() { // from class: ba.c
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w f43214c = new w(new InterfaceC5655b() { // from class: ba.d
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w f43215d = new w(new InterfaceC5655b() { // from class: ba.e
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC2596d interfaceC2596d) {
        return (ScheduledExecutorService) f43213b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC2596d interfaceC2596d) {
        return (ScheduledExecutorService) f43214c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC2596d interfaceC2596d) {
        return (ScheduledExecutorService) f43212a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f43215d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C2595c.d(C2591D.a(Z9.a.class, ScheduledExecutorService.class), C2591D.a(Z9.a.class, ExecutorService.class), C2591D.a(Z9.a.class, Executor.class)).f(new aa.g() { // from class: ba.f
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return ExecutorsRegistrar.g(interfaceC2596d);
            }
        }).d(), C2595c.d(C2591D.a(Z9.b.class, ScheduledExecutorService.class), C2591D.a(Z9.b.class, ExecutorService.class), C2591D.a(Z9.b.class, Executor.class)).f(new aa.g() { // from class: ba.g
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return ExecutorsRegistrar.e(interfaceC2596d);
            }
        }).d(), C2595c.d(C2591D.a(Z9.c.class, ScheduledExecutorService.class), C2591D.a(Z9.c.class, ExecutorService.class), C2591D.a(Z9.c.class, Executor.class)).f(new aa.g() { // from class: ba.h
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return ExecutorsRegistrar.a(interfaceC2596d);
            }
        }).d(), C2595c.c(C2591D.a(Z9.d.class, Executor.class)).f(new aa.g() { // from class: ba.i
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return l.INSTANCE;
            }
        }).d());
    }
}

package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ta.AbstractC6656b;
import ta.EnumC6657c;

/* JADX INFO: renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3977o {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W8.a(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new W8.a("Firebase-Messaging-Init"));
    }

    static ExecutorService d() {
        return AbstractC6656b.a().a(new W8.a("Firebase-Messaging-Intent-Handle"), EnumC6657c.HIGH_SPEED);
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new W8.a("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new W8.a("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new W8.a("Firebase-Messaging-Topics-Io"));
    }
}

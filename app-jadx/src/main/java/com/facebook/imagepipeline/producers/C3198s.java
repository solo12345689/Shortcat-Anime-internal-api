package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3198s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f36295b;

    public C3198s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        AbstractC5504s.h(inputProducer, "inputProducer");
        this.f36294a = inputProducer;
        this.f36295b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3198s this$0, InterfaceC3194n consumer, e0 context) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(consumer, "$consumer");
        AbstractC5504s.h(context, "$context");
        this$0.f36294a.a(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(final InterfaceC3194n consumer, final e0 context) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(context, "context");
        K6.b bVarQ = context.q();
        ScheduledExecutorService scheduledExecutorService = this.f36295b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C3198s.d(this.f36283a, consumer, context);
                }
            }, bVarQ.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f36294a.a(consumer, context);
        }
    }
}

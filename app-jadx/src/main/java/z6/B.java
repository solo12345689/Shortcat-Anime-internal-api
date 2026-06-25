package z6;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f65616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f65617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f65618d;

    public B(int i10, String prefix, boolean z10) {
        AbstractC5504s.h(prefix, "prefix");
        this.f65615a = i10;
        this.f65616b = prefix;
        this.f65617c = z10;
        this.f65618d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Runnable runnable) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f65615a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        AbstractC5504s.h(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: z6.A
            @Override // java.lang.Runnable
            public final void run() {
                B.b(this.f65613a, runnable);
            }
        };
        if (this.f65617c) {
            str = this.f65616b + "-" + this.f65618d.getAndIncrement();
        } else {
            str = this.f65616b;
        }
        return new Thread(runnable2, str);
    }
}

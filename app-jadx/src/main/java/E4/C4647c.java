package e4;

import Ud.AbstractC2279u;
import android.content.Context;
import c4.j;
import d4.InterfaceC4566a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: e4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4647c implements InterfaceC4566a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(K1.a callback) {
        AbstractC5504s.h(callback, "$callback");
        callback.accept(new j(AbstractC2279u.m()));
    }

    @Override // d4.InterfaceC4566a
    public void a(K1.a callback) {
        AbstractC5504s.h(callback, "callback");
    }

    @Override // d4.InterfaceC4566a
    public void b(Context context, Executor executor, final K1.a callback) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(callback, "callback");
        executor.execute(new Runnable() { // from class: e4.b
            @Override // java.lang.Runnable
            public final void run() {
                C4647c.d(callback);
            }
        });
    }
}

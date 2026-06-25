package com.adjust.sdk.scheduler;

import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f34184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncTaskExecutor.a f34185b;

    public a(AsyncTaskExecutor.a aVar, Object obj) {
        this.f34185b = aVar;
        this.f34184a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AsyncTaskExecutor.this.onPostExecute(this.f34184a);
    }
}

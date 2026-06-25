package io.sentry;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
interface l4 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements l4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f50813a = new a();

        private a() {
        }

        static l4 c() {
            return f50813a;
        }

        @Override // io.sentry.l4
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.l4
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}

package pg;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a */
    public static final f f56081a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC5504s.h(record, "record");
        e eVar = e.f56078a;
        String loggerName = record.getLoggerName();
        AbstractC5504s.g(loggerName, "record.loggerName");
        int iB = g.b(record);
        String message = record.getMessage();
        AbstractC5504s.g(message, "record.message");
        eVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}

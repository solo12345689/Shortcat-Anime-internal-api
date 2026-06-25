package O3;

import Df.r;
import M3.q;
import S3.g;
import S3.j;
import Td.L;
import Ud.AbstractC2279u;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(g db2) throws IOException {
        AbstractC5504s.h(db2, "db");
        List listC = AbstractC2279u.c();
        Cursor cursorV1 = db2.v1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorV1.moveToNext()) {
            try {
                listC.add(cursorV1.getString(0));
            } finally {
            }
        }
        L l10 = L.f17438a;
        fe.c.a(cursorV1, null);
        for (String triggerName : AbstractC2279u.a(listC)) {
            AbstractC5504s.g(triggerName, "triggerName");
            if (r.Q(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.T("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(q db2, j sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        AbstractC5504s.h(db2, "db");
        AbstractC5504s.h(sqLiteQuery, "sqLiteQuery");
        Cursor cursorX = db2.x(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorX instanceof AbstractWindowedCursor)) {
            return cursorX;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorX;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorX) : cursorX;
    }

    public static final int c(File databaseFile) throws IOException {
        AbstractC5504s.h(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            fe.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                fe.c.a(channel, th2);
                throw th3;
            }
        }
    }
}

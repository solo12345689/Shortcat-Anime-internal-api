package S3;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface g extends Closeable {
    Cursor E1(j jVar);

    String H0();

    boolean L1();

    void M();

    List R();

    boolean R1();

    void T(String str);

    k c1(String str);

    boolean isOpen();

    void l0();

    void m0(String str, Object[] objArr);

    void n0();

    int n1(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    Cursor o0(j jVar, CancellationSignal cancellationSignal);

    void v0();

    Cursor v1(String str);
}

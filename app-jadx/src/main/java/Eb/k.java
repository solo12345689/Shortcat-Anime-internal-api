package Eb;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface k {
    InputStream L();

    k M(String str, String str2);

    Cf.i N();

    k O(String str);

    OutputStream P(boolean z10);

    List Q();

    boolean R();

    Long S();

    Uri T(Ub.d dVar);

    Uri c();

    boolean delete();

    boolean exists();

    Long getCreationTime();

    String getFileName();

    String getType();

    boolean isDirectory();

    boolean isFile();

    long length();
}

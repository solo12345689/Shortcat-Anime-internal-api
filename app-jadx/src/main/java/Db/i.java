package Db;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends CodedException {
    public i(Uri uri) {
        super("File '" + uri + "' could not be copied because it could not be found", null, 2, null);
    }
}

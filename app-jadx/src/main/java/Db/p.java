package Db;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends CodedException {
    public p() {
        super("Can't read Storage Access Framework directory, use StorageAccessFramework.readDirectoryAsync() instead", null, 2, null);
    }
}

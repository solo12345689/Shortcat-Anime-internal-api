package Jb;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends CodedException {
    public c(String str) {
        super("Cannot decode provided blurhash '" + str + "'", null, 2, null);
    }
}

package m8;

import android.text.TextUtils;

/* JADX INFO: renamed from: m8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5648b extends com.github.penfeizhou.animation.io.b {
    public void g(int i10) {
        i(i10 - 1);
    }

    public void h(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            e(4);
            return;
        }
        b((byte) (str.charAt(0) & 255));
        b((byte) (str.charAt(1) & 255));
        b((byte) (str.charAt(2) & 255));
        b((byte) (str.charAt(3) & 255));
    }

    public void i(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
    }

    public void j(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }
}

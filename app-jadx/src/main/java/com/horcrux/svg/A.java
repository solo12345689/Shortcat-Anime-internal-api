package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f43532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[][] f43533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f43534c;

    A(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f43532a = arrayList;
        this.f43533b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER][];
        this.f43534c = paint;
        arrayList.add(new Path());
    }

    private int a(char c10) {
        int[] iArr = this.f43533b[c10 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c10 & 255];
    }

    Path b(char c10, String str) {
        Path path;
        int iA = a(c10);
        if (iA != 0) {
            path = (Path) this.f43532a.get(iA);
        } else {
            Path path2 = new Path();
            this.f43534c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f43533b;
            int i10 = c10 >> '\b';
            int[] iArr2 = iArr[i10];
            if (iArr2 == null) {
                iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
                iArr[i10] = iArr2;
            }
            iArr2[c10 & 255] = this.f43532a.size();
            this.f43532a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}

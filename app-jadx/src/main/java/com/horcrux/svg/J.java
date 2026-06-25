package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class J extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f43601a;

    public J(ReactContext reactContext) {
        super(reactContext);
        I.f43588a = this.mScale;
        this.f43601a = new Path();
    }

    public void B(String str) {
        this.f43601a = I.o(str);
        ArrayList<H> arrayList = I.f43593f;
        this.elements = arrayList;
        Iterator<H> it = arrayList.iterator();
        while (it.hasNext()) {
            for (L l10 : it.next().f43587b) {
                double d10 = l10.f43616a;
                float f10 = this.mScale;
                l10.f43616a = d10 * ((double) f10);
                l10.f43617b *= (double) f10;
            }
        }
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.f43601a;
    }
}

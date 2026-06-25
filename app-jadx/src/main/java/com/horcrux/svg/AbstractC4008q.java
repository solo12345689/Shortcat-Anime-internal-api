package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4008q extends AbstractC3996e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilterRegion f43864b;

    public AbstractC4008q(ReactContext reactContext) {
        super(reactContext);
        this.f43864b = new FilterRegion();
    }

    protected static Bitmap D(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap B(HashMap map, Bitmap bitmap);

    public String C() {
        return this.f43863a;
    }

    public void E(Dynamic dynamic) {
        this.f43864b.setHeight(dynamic);
        invalidate();
    }

    public void F(String str) {
        this.f43863a = str;
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f43864b.setWidth(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f43864b.setX(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f43864b.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }
}

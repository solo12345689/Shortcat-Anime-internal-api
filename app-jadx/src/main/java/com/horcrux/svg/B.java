package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class B extends RenderableView {

    /* JADX INFO: renamed from: a */
    ReadableMap f43535a;

    /* JADX INFO: renamed from: b */
    private C4017z f43536b;

    /* JADX INFO: renamed from: c */
    private Bitmap f43537c;

    /* JADX INFO: renamed from: d */
    private Canvas f43538d;

    /* JADX INFO: renamed from: e */
    private final Paint f43539e;

    public B(ReactContext reactContext) {
        super(reactContext);
        this.f43539e = new Paint(1);
    }

    private static Object I(Object obj) {
        obj.getClass();
        return obj;
    }

    void B(Canvas canvas, Paint paint, float f10) {
        H();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f43537c;
            if (bitmap == null) {
                this.f43537c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f43538d = new Canvas(this.f43537c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f43537c = bitmapCreateBitmap;
                this.f43538d.setBitmap(bitmapCreateBitmap);
            }
            this.f43538d.save();
            this.f43538d.setMatrix(canvas.getMatrix());
        } else {
            this.f43538d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof G) || (childAt instanceof C3994c)) {
                ((RenderableView) childAt).mergeProperties(this);
            } else if (childAt instanceof VirtualView) {
                VirtualView virtualView = (VirtualView) childAt;
                if (!"none".equals(virtualView.mDisplay)) {
                    boolean z10 = virtualView instanceof RenderableView;
                    if (z10) {
                        ((RenderableView) virtualView).mergeProperties(this);
                    }
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f43538d, this.mCTM);
                    virtualView.render(this.f43538d, paint, f10);
                    RectF clientRect = virtualView.getClientRect();
                    if (clientRect != null) {
                        rectF.union(clientRect);
                    }
                    virtualView.restoreCanvas(this.f43538d, iSaveAndSetupCanvas);
                    if (z10) {
                        ((RenderableView) virtualView).resetProperties();
                    }
                    if (virtualView.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                    ArrayList<H> arrayList = virtualView.elements;
                    if (arrayList != null) {
                        this.elements.addAll(arrayList);
                    }
                }
            } else if (childAt instanceof SvgView) {
                SvgView svgView2 = (SvgView) childAt;
                if (svgView2.getChildCount() > 0) {
                    View childAt2 = svgView2.getChildAt(0);
                    if (childAt2 instanceof B) {
                        ((B) childAt2).mergeProperties(this);
                    }
                }
                svgView2.drawChildren(canvas);
                if (svgView2.isResponsible()) {
                    svgView.enableTouchEvents();
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f43538d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            this.f43539e.setAlpha((int) (this.mOpacity * 255.0f));
            Bitmap bitmap2 = this.f43537c;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f43539e);
            }
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        G();
    }

    void C(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    C4017z D() {
        return this.f43536b;
    }

    Path E(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathE = virtualView instanceof B ? ((B) virtualView).E(canvas, paint, op) : virtualView.getPath(canvas, paint);
                pathE.transform(matrix);
                path.op(pathE, opValueOf);
            }
        }
        return path;
    }

    C4017z F() {
        return ((B) I(getTextRoot())).D();
    }

    void G() {
        F().n();
    }

    void H() {
        F().o(this, this.f43535a);
    }

    public void J(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f43535a = dynamic.asMap();
        } else {
            this.f43535a = null;
        }
        invalidate();
    }

    public void K(ReadableMap readableMap) {
        this.f43535a = readableMap;
        invalidate();
    }

    void L(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f43536b = new C4017z(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        L(canvas);
        clip(canvas, paint);
        B(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path path2 = virtualView.getPath(canvas, paint);
                if (path2 != null) {
                    this.mPath.addPath(path2, matrix);
                }
            }
        }
        return this.mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof G) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.RenderableView
    void resetProperties() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}

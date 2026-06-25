package D9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2667v;
import androidx.core.widget.c;
import com.google.android.material.internal.m;
import i.AbstractC4956a;
import o9.AbstractC5838a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends C2667v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f3561g = AbstractC5847j.f54894w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f3562h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f3563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3564f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47944F);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3563e == null) {
            int iD = AbstractC7066a.d(this, AbstractC4956a.f47972s);
            int iD2 = AbstractC7066a.d(this, AbstractC5838a.f54657r);
            int iD3 = AbstractC7066a.d(this, AbstractC5838a.f54604J);
            int[][] iArr = f3562h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC7066a.j(iD3, iD, 1.0f);
            iArr2[1] = AbstractC7066a.j(iD3, iD2, 0.54f);
            iArr2[2] = AbstractC7066a.j(iD3, iD2, 0.38f);
            iArr2[3] = AbstractC7066a.j(iD3, iD2, 0.38f);
            this.f3563e = new ColorStateList(iArr, iArr2);
        }
        return this.f3563e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3564f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f3564f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f3561g;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55292w3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(AbstractC5848k.f55300x3)) {
            c.d(this, E9.c.a(context2, typedArrayI, AbstractC5848k.f55300x3));
        }
        this.f3564f = typedArrayI.getBoolean(AbstractC5848k.f55308y3, false);
        typedArrayI.recycle();
    }
}

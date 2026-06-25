package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import java.util.HashMap;
import t1.C6592e;
import t1.InterfaceC6596i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: a */
    protected int[] f28065a;

    /* JADX INFO: renamed from: b */
    protected int f28066b;

    /* JADX INFO: renamed from: c */
    protected Context f28067c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC6596i f28068d;

    /* JADX INFO: renamed from: e */
    protected boolean f28069e;

    /* JADX INFO: renamed from: f */
    protected String f28070f;

    /* JADX INFO: renamed from: g */
    protected String f28071g;

    /* JADX INFO: renamed from: h */
    private View[] f28072h;

    /* JADX INFO: renamed from: i */
    protected HashMap f28073i;

    public c(Context context) {
        super(context);
        this.f28065a = new int[32];
        this.f28069e = false;
        this.f28072h = null;
        this.f28073i = new HashMap();
        this.f28067c = context;
        i(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f28067c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iH = h(strTrim);
        if (iH != 0) {
            this.f28073i.put(Integer.valueOf(iH), strTrim);
            b(iH);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f28066b + 1;
        int[] iArr = this.f28065a;
        if (i11 > iArr.length) {
            this.f28065a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f28065a;
        int i12 = this.f28066b;
        iArr2[i12] = i10;
        this.f28066b = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f28067c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f27990b0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f28067c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iG = ((Integer) objG).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iG == 0 ? this.f28067c.getResources().getIdentifier(str, DiagnosticsEntry.ID_KEY, this.f28067c.getPackageName()) : iG;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f28066b; i10++) {
            View viewL = constraintLayout.l(this.f28065a[i10]);
            if (viewL != null) {
                viewL.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f28065a, this.f28066b);
    }

    protected void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f28550m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28268F1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f28070f = string;
                    setIds(string);
                } else if (index == i.f28277G1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f28071g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void j(C6592e c6592e, boolean z10);

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int iG;
        if (isInEditMode()) {
            setIds(this.f28070f);
        }
        InterfaceC6596i interfaceC6596i = this.f28068d;
        if (interfaceC6596i == null) {
            return;
        }
        interfaceC6596i.b();
        for (int i10 = 0; i10 < this.f28066b; i10++) {
            int i11 = this.f28065a[i10];
            View viewL = constraintLayout.l(i11);
            if (viewL == null && (iG = g(constraintLayout, (str = (String) this.f28073i.get(Integer.valueOf(i11))))) != 0) {
                this.f28065a[i10] = iG;
                this.f28073i.put(Integer.valueOf(iG), str);
                viewL = constraintLayout.l(iG);
            }
            if (viewL != null) {
                this.f28068d.c(constraintLayout.p(viewL));
            }
        }
        this.f28068d.a(constraintLayout.f27939c);
    }

    public void o() {
        if (this.f28068d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f28028u0 = (C6592e) this.f28068d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f28070f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f28071g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f28069e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f28070f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f28066b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f28071g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f28066b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f28070f = null;
        this.f28066b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f28070f == null) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28065a = new int[32];
        this.f28069e = false;
        this.f28072h = null;
        this.f28073i = new HashMap();
        this.f28067c = context;
        i(attributeSet);
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}

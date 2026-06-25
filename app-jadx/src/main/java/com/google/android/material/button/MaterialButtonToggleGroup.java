package com.google.android.material.button;

import H9.p;
import L1.B;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o9.AbstractC5838a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends d {

    /* JADX INFO: renamed from: r */
    private static final int f42105r = AbstractC5847j.f54896y;

    /* JADX INFO: renamed from: l */
    private final LinkedHashSet f42106l;

    /* JADX INFO: renamed from: m */
    private boolean f42107m;

    /* JADX INFO: renamed from: n */
    private boolean f42108n;

    /* JADX INFO: renamed from: o */
    private boolean f42109o;

    /* JADX INFO: renamed from: p */
    private final int f42110p;

    /* JADX INFO: renamed from: q */
    private Set f42111q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends C2746a {
        a() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.C0(B.g.b(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54634f0);
    }

    private String getChildrenA11yClassName() {
        return (this.f42108n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void r(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f42111q);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f42108n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f42109o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void t(int i10, boolean z10) {
        Iterator it = this.f42106l.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    public int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private void x(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f42107m = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f42107m = false;
        }
    }

    private void y(Set set) {
        Set set2 = this.f42111q;
        this.f42111q = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            x(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                t(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.d, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        r(materialButton.getId(), materialButton.isChecked());
        AbstractC2747a0.k0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.f42108n || this.f42111q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f42111q.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            if (this.f42111q.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f42110p;
        if (i10 != -1) {
            y(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        B.s1(accessibilityNodeInfo).B0(B.f.b(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f42106l.add(bVar);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z10) {
        this.f42109o = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f42108n != z10) {
            this.f42108n = z10;
            s();
        }
        z();
    }

    public boolean v() {
        return this.f42108n;
    }

    void w(MaterialButton materialButton, boolean z10) {
        if (this.f42107m) {
            return;
        }
        r(materialButton.getId(), z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42105r;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f42106l = new LinkedHashSet();
        this.f42107m = false;
        this.f42111q = new HashSet();
        TypedArray typedArrayI = m.i(getContext(), attributeSet, AbstractC5848k.f54933E2, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(AbstractC5848k.f54965I2, false));
        this.f42110p = typedArrayI.getResourceId(AbstractC5848k.f54949G2, -1);
        this.f42109o = typedArrayI.getBoolean(AbstractC5848k.f54957H2, false);
        if (this.f42122f == null) {
            this.f42122f = p.b(new H9.a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(AbstractC5848k.f54941F2, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}

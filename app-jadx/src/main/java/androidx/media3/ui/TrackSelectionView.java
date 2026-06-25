package androidx.media3.ui;

import G3.C1596e;
import P9.AbstractC2011u;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q2.C6109x;
import q2.a0;
import q2.b0;
import q2.h0;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f31368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f31369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f31370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f31371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f31372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f31373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private G3.E f31376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f31377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Comparator f31379m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0.a f31381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31382b;

        public c(h0.a aVar, int i10) {
            this.f31381a = aVar;
            this.f31382b = i10;
        }

        public C6109x a() {
            return this.f31381a.d(this.f31382b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b0 b0Var = (b0) map.get(((h0.a) list.get(i10)).c());
            if (b0Var != null && (z10 || map2.isEmpty())) {
                map2.put(b0Var.f56743a, b0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f31369c) {
            e();
        } else if (view == this.f31370d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f31378l = false;
        this.f31373g.clear();
    }

    private void e() {
        this.f31378l = true;
        this.f31373g.clear();
    }

    private void f(View view) {
        this.f31378l = false;
        c cVar = (c) AbstractC6614a.e(view.getTag());
        a0 a0VarC = cVar.f31381a.c();
        int i10 = cVar.f31382b;
        b0 b0Var = (b0) this.f31373g.get(a0VarC);
        if (b0Var == null) {
            if (!this.f31375i && !this.f31373g.isEmpty()) {
                this.f31373g.clear();
            }
            this.f31373g.put(a0VarC, new b0(a0VarC, AbstractC2011u.B(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(b0Var.f56744b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f31381a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f31373g.remove(a0VarC);
                return;
            } else {
                this.f31373g.put(a0VarC, new b0(a0VarC, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f31373g.put(a0VarC, new b0(a0VarC, AbstractC2011u.B(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f31373g.put(a0VarC, new b0(a0VarC, arrayList));
        }
    }

    private boolean g(h0.a aVar) {
        return this.f31374h && aVar.f();
    }

    private boolean h() {
        return this.f31375i && this.f31372f.size() > 1;
    }

    private void i() {
        this.f31369c.setChecked(this.f31378l);
        this.f31370d.setChecked(!this.f31378l && this.f31373g.isEmpty());
        for (int i10 = 0; i10 < this.f31377k.length; i10++) {
            b0 b0Var = (b0) this.f31373g.get(((h0.a) this.f31372f.get(i10)).c());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f31377k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (b0Var != null) {
                        this.f31377k[i10][i11].setChecked(b0Var.f56744b.contains(Integer.valueOf(((c) AbstractC6614a.e(checkedTextViewArr[i11].getTag())).f31382b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f31372f.isEmpty()) {
            this.f31369c.setEnabled(false);
            this.f31370d.setEnabled(false);
            return;
        }
        this.f31369c.setEnabled(true);
        this.f31370d.setEnabled(true);
        this.f31377k = new CheckedTextView[this.f31372f.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f31372f.size(); i10++) {
            h0.a aVar = (h0.a) this.f31372f.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f31377k;
            int i11 = aVar.f56884a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f56884a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator comparator = this.f31379m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f31368b.inflate(G3.z.f7222a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f31368b.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f31367a);
                checkedTextView.setText(this.f31376j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.j(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f31371e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f31377k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f31378l;
    }

    public Map<a0, b0> getOverrides() {
        return this.f31373g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f31374h != z10) {
            this.f31374h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f31375i != z10) {
            this.f31375i = z10;
            if (!z10 && this.f31373g.size() > 1) {
                Map mapB = b(this.f31373g, this.f31372f, false);
                this.f31373g.clear();
                this.f31373g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f31369c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(G3.E e10) {
        this.f31376j = (G3.E) AbstractC6614a.e(e10);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f31367a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f31368b = layoutInflaterFrom;
        b bVar = new b();
        this.f31371e = bVar;
        this.f31376j = new C1596e(getResources());
        this.f31372f = new ArrayList();
        this.f31373g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f31369c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(G3.B.f7054x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(G3.z.f7222a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f31370d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(G3.B.f7053w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}

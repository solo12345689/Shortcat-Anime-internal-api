package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f24665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f24666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f24667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f24668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f24669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f24670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f24673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24674j;

    public a(Context context, int i10, int i11) {
        this.f24665a = context;
        this.f24668d = LayoutInflater.from(context);
        this.f24671g = i10;
        this.f24672h = i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        j.a aVar = this.f24670f;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    protected void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f24673i).addView(view, i10);
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f24670f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        j.a aVar = this.f24670f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f24667c;
        }
        return aVar.b(eVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f24674j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f24673i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f24667c;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.f24667c.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListG.get(i12);
                if (s(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewP = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        b(viewP, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        this.f24666b = context;
        this.f24669e = LayoutInflater.from(context);
        this.f24667c = eVar;
    }

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f24668d.inflate(this.f24672h, viewGroup, false);
    }

    protected boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a o() {
        return this.f24670f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        c(gVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f24673i == null) {
            k kVar = (k) this.f24668d.inflate(this.f24671g, viewGroup, false);
            this.f24673i = kVar;
            kVar.a(this.f24667c);
            i(true);
        }
        return this.f24673i;
    }

    public void r(int i10) {
        this.f24674j = i10;
    }

    public abstract boolean s(int i10, g gVar);
}

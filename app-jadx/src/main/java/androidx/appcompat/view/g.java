package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC2748b;
import androidx.core.view.AbstractC2795z;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.MenuItemC5706c;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e */
    static final Class[] f24582e;

    /* JADX INFO: renamed from: f */
    static final Class[] f24583f;

    /* JADX INFO: renamed from: a */
    final Object[] f24584a;

    /* JADX INFO: renamed from: b */
    final Object[] f24585b;

    /* JADX INFO: renamed from: c */
    Context f24586c;

    /* JADX INFO: renamed from: d */
    private Object f24587d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        private static final Class[] f24588c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        private Object f24589a;

        /* JADX INFO: renamed from: b */
        private Method f24590b;

        public a(Object obj, String str) {
            this.f24589a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f24590b = cls.getMethod(str, f24588c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f24590b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f24590b.invoke(this.f24589a, menuItem)).booleanValue();
                }
                this.f24590b.invoke(this.f24589a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b {

        /* JADX INFO: renamed from: A */
        AbstractC2748b f24591A;

        /* JADX INFO: renamed from: B */
        private CharSequence f24592B;

        /* JADX INFO: renamed from: C */
        private CharSequence f24593C;

        /* JADX INFO: renamed from: D */
        private ColorStateList f24594D = null;

        /* JADX INFO: renamed from: E */
        private PorterDuff.Mode f24595E = null;

        /* JADX INFO: renamed from: a */
        private Menu f24597a;

        /* JADX INFO: renamed from: b */
        private int f24598b;

        /* JADX INFO: renamed from: c */
        private int f24599c;

        /* JADX INFO: renamed from: d */
        private int f24600d;

        /* JADX INFO: renamed from: e */
        private int f24601e;

        /* JADX INFO: renamed from: f */
        private boolean f24602f;

        /* JADX INFO: renamed from: g */
        private boolean f24603g;

        /* JADX INFO: renamed from: h */
        private boolean f24604h;

        /* JADX INFO: renamed from: i */
        private int f24605i;

        /* JADX INFO: renamed from: j */
        private int f24606j;

        /* JADX INFO: renamed from: k */
        private CharSequence f24607k;

        /* JADX INFO: renamed from: l */
        private CharSequence f24608l;

        /* JADX INFO: renamed from: m */
        private int f24609m;

        /* JADX INFO: renamed from: n */
        private char f24610n;

        /* JADX INFO: renamed from: o */
        private int f24611o;

        /* JADX INFO: renamed from: p */
        private char f24612p;

        /* JADX INFO: renamed from: q */
        private int f24613q;

        /* JADX INFO: renamed from: r */
        private int f24614r;

        /* JADX INFO: renamed from: s */
        private boolean f24615s;

        /* JADX INFO: renamed from: t */
        private boolean f24616t;

        /* JADX INFO: renamed from: u */
        private boolean f24617u;

        /* JADX INFO: renamed from: v */
        private int f24618v;

        /* JADX INFO: renamed from: w */
        private int f24619w;

        /* JADX INFO: renamed from: x */
        private String f24620x;

        /* JADX INFO: renamed from: y */
        private String f24621y;

        /* JADX INFO: renamed from: z */
        private String f24622z;

        public b(Menu menu) {
            this.f24597a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f24586c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f24615s).setVisible(this.f24616t).setEnabled(this.f24617u).setCheckable(this.f24614r >= 1).setTitleCondensed(this.f24608l).setIcon(this.f24609m);
            int i10 = this.f24618v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f24622z != null) {
                if (g.this.f24586c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f24622z));
            }
            if (this.f24614r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC5706c) {
                    ((MenuItemC5706c) menuItem).h(true);
                }
            }
            String str = this.f24620x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f24582e, g.this.f24584a));
                z10 = true;
            }
            int i11 = this.f24619w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC2748b abstractC2748b = this.f24591A;
            if (abstractC2748b != null) {
                AbstractC2795z.a(menuItem, abstractC2748b);
            }
            AbstractC2795z.c(menuItem, this.f24592B);
            AbstractC2795z.g(menuItem, this.f24593C);
            AbstractC2795z.b(menuItem, this.f24610n, this.f24611o);
            AbstractC2795z.f(menuItem, this.f24612p, this.f24613q);
            PorterDuff.Mode mode = this.f24595E;
            if (mode != null) {
                AbstractC2795z.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f24594D;
            if (colorStateList != null) {
                AbstractC2795z.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f24604h = true;
            i(this.f24597a.add(this.f24598b, this.f24605i, this.f24606j, this.f24607k));
        }

        public SubMenu b() {
            this.f24604h = true;
            SubMenu subMenuAddSubMenu = this.f24597a.addSubMenu(this.f24598b, this.f24605i, this.f24606j, this.f24607k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f24604h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f24586c.obtainStyledAttributes(attributeSet, j.f48330o1);
            this.f24598b = typedArrayObtainStyledAttributes.getResourceId(j.f48340q1, 0);
            this.f24599c = typedArrayObtainStyledAttributes.getInt(j.f48350s1, 0);
            this.f24600d = typedArrayObtainStyledAttributes.getInt(j.f48355t1, 0);
            this.f24601e = typedArrayObtainStyledAttributes.getInt(j.f48360u1, 0);
            this.f24602f = typedArrayObtainStyledAttributes.getBoolean(j.f48345r1, true);
            this.f24603g = typedArrayObtainStyledAttributes.getBoolean(j.f48335p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            h0 h0VarU = h0.u(g.this.f24586c, attributeSet, j.f48365v1);
            this.f24605i = h0VarU.n(j.f48380y1, 0);
            this.f24606j = (h0VarU.k(j.f48137B1, this.f24599c) & (-65536)) | (h0VarU.k(j.f48142C1, this.f24600d) & 65535);
            this.f24607k = h0VarU.p(j.f48147D1);
            this.f24608l = h0VarU.p(j.f48152E1);
            this.f24609m = h0VarU.n(j.f48370w1, 0);
            this.f24610n = c(h0VarU.o(j.f48157F1));
            this.f24611o = h0VarU.k(j.f48192M1, 4096);
            this.f24612p = c(h0VarU.o(j.f48162G1));
            this.f24613q = h0VarU.k(j.f48212Q1, 4096);
            if (h0VarU.s(j.f48167H1)) {
                this.f24614r = h0VarU.a(j.f48167H1, false) ? 1 : 0;
            } else {
                this.f24614r = this.f24601e;
            }
            this.f24615s = h0VarU.a(j.f48385z1, false);
            this.f24616t = h0VarU.a(j.f48132A1, this.f24602f);
            this.f24617u = h0VarU.a(j.f48375x1, this.f24603g);
            this.f24618v = h0VarU.k(j.f48217R1, -1);
            this.f24622z = h0VarU.o(j.f48172I1);
            this.f24619w = h0VarU.n(j.f48177J1, 0);
            this.f24620x = h0VarU.o(j.f48187L1);
            String strO = h0VarU.o(j.f48182K1);
            this.f24621y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f24619w == 0 && this.f24620x == null) {
                this.f24591A = (AbstractC2748b) e(strO, g.f24583f, g.this.f24585b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f24591A = null;
            }
            this.f24592B = h0VarU.p(j.f48197N1);
            this.f24593C = h0VarU.p(j.f48222S1);
            if (h0VarU.s(j.f48207P1)) {
                this.f24595E = O.e(h0VarU.k(j.f48207P1, -1), this.f24595E);
            } else {
                this.f24595E = null;
            }
            if (h0VarU.s(j.f48202O1)) {
                this.f24594D = h0VarU.c(j.f48202O1);
            } else {
                this.f24594D = null;
            }
            h0VarU.x();
            this.f24604h = false;
        }

        public void h() {
            this.f24598b = 0;
            this.f24599c = 0;
            this.f24600d = 0;
            this.f24601e = 0;
            this.f24602f = true;
            this.f24603g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f24582e = clsArr;
        f24583f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f24586c = context;
        Object[] objArr = {context};
        this.f24584a = objArr;
        this.f24585b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0072, code lost:
    
        if (r0.d() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0074, code lost:
    
        r15 = r0.f24591A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0076, code lost:
    
        if (r15 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x007c, code lost:
    
        if (r15.a() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x008e, code lost:
    
        if (r7 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0040, code lost:
    
        if (r6 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0042, code lost:
    
        if (r15 == 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0048, code lost:
    
        if (r15 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x004b, code lost:
    
        if (r15 == 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0053, code lost:
    
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f24591A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f24587d == null) {
            this.f24587d = a(this.f24586c);
        }
        return this.f24587d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof D1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f24586c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}

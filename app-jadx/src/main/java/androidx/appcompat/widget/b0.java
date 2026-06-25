package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import i.AbstractC4956a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class b0 extends O1.c implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    private final SearchView f25273l;

    /* JADX INFO: renamed from: m */
    private final SearchableInfo f25274m;

    /* JADX INFO: renamed from: n */
    private final Context f25275n;

    /* JADX INFO: renamed from: o */
    private final WeakHashMap f25276o;

    /* JADX INFO: renamed from: p */
    private final int f25277p;

    /* JADX INFO: renamed from: q */
    private boolean f25278q;

    /* JADX INFO: renamed from: r */
    private int f25279r;

    /* JADX INFO: renamed from: s */
    private ColorStateList f25280s;

    /* JADX INFO: renamed from: t */
    private int f25281t;

    /* JADX INFO: renamed from: u */
    private int f25282u;

    /* JADX INFO: renamed from: v */
    private int f25283v;

    /* JADX INFO: renamed from: w */
    private int f25284w;

    /* JADX INFO: renamed from: x */
    private int f25285x;

    /* JADX INFO: renamed from: y */
    private int f25286y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f25287a;

        /* JADX INFO: renamed from: b */
        public final TextView f25288b;

        /* JADX INFO: renamed from: c */
        public final ImageView f25289c;

        /* JADX INFO: renamed from: d */
        public final ImageView f25290d;

        /* JADX INFO: renamed from: e */
        public final ImageView f25291e;

        public a(View view) {
            this.f25287a = (TextView) view.findViewById(R.id.text1);
            this.f25288b = (TextView) view.findViewById(R.id.text2);
            this.f25289c = (ImageView) view.findViewById(R.id.icon1);
            this.f25290d = (ImageView) view.findViewById(R.id.icon2);
            this.f25291e = (ImageView) view.findViewById(i.f.f48081r);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f25278q = false;
        this.f25279r = 1;
        this.f25281t = -1;
        this.f25282u = -1;
        this.f25283v = -1;
        this.f25284w = -1;
        this.f25285x = -1;
        this.f25286y = -1;
        this.f25273l = searchView;
        this.f25274m = searchableInfo;
        this.f25277p = searchView.getSuggestionCommitIconResId();
        this.f25275n = context;
        this.f25276o = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f25276o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f25280s == null) {
            TypedValue typedValue = new TypedValue();
            this.f25275n.getTheme().resolveAttribute(AbstractC4956a.f47950L, typedValue, true);
            this.f25280s = this.f25275n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f25280s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f25275n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f25276o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f25276o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f25276o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f25275n.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable drawableM = m(this.f25274m.getSearchActivity());
        return drawableM != null ? drawableM : this.f25275n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f25275n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e102) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f25275n.getPackageName() + "/" + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableE = AbstractC7194b.e(this.f25275n, i10);
            z(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i10 = this.f25284w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f25285x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    private static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f25276o.put(str, drawable.getConstantState());
        }
    }

    @Override // O1.a, O1.b.a
    public void a(Cursor cursor) {
        if (this.f25278q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f25281t = cursor.getColumnIndex("suggest_text_1");
                this.f25282u = cursor.getColumnIndex("suggest_text_2");
                this.f25283v = cursor.getColumnIndex("suggest_text_2_url");
                this.f25284w = cursor.getColumnIndex("suggest_icon_1");
                this.f25285x = cursor.getColumnIndex("suggest_icon_2");
                this.f25286y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // O1.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f25273l.getVisibility() == 0 && this.f25273l.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f25274m, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // O1.a, O1.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f25274m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f25274m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // O1.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f25286y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f25287a != null) {
            y(aVar.f25287a, v(cursor, this.f25281t));
        }
        if (aVar.f25288b != null) {
            String strV = v(cursor, this.f25283v);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f25282u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f25287a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f25287a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f25287a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f25287a.setMaxLines(1);
                }
            }
            y(aVar.f25288b, charSequenceK);
        }
        ImageView imageView = aVar.f25289c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f25290d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f25279r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f25291e.setVisibility(8);
            return;
        }
        aVar.f25291e.setVisibility(0);
        aVar.f25291e.setTag(aVar.f25287a.getText());
        aVar.f25291e.setOnClickListener(this);
    }

    @Override // O1.c, O1.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(i.f.f48081r)).setImageResource(this.f25277p);
        return viewG;
    }

    @Override // O1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewF = f(this.f25275n, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f25287a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // O1.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f25275n, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f25287a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f25273l.S((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f25275n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f25275n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f25279r = i10;
    }
}

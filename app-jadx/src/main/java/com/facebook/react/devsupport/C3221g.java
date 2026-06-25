package com.facebook.react.devsupport;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC3250o;
import kotlin.jvm.internal.AbstractC5504s;
import r7.InterfaceC6274a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3221g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3221g f36743a = new C3221g();

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(String str);
    }

    private C3221g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditText editText, String str, View view) {
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EditText editText, String str, View view) {
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a aVar, EditText editText, AlertDialog alertDialog, View view) {
        aVar.a(editText.getText().toString());
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
    }

    public final void e(Context context, InterfaceC6274a devSettings, final a onClickListener) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(devSettings, "devSettings");
        AbstractC5504s.h(onClickListener, "onClickListener");
        x7.f fVarJ = devSettings.j();
        String strD = fVarJ.d();
        fVarJ.f("");
        final String strD2 = fVarJ.d();
        fVarJ.f(strD);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i10 = (int) (4 * context.getResources().getDisplayMetrics().density);
        int i11 = (int) (16 * context.getResources().getDisplayMetrics().density);
        linearLayout.setPadding(i11, i11, i11, i11);
        TextView textView = new TextView(context);
        textView.setText(context.getString(AbstractC3250o.f37130f));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        final EditText editText = new EditText(context);
        editText.setInputType(1);
        editText.setHint(context.getString(AbstractC3250o.f37129e));
        editText.setBackgroundResource(R.drawable.edit_text);
        editText.setHintTextColor(-3355444);
        editText.setTextColor(-16777216);
        editText.setText(strD);
        Button button = new Button(context);
        button.setText(strD2);
        button.setTextSize(12.0f);
        button.setAllCaps(false);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3221g.f(editText, strD2, view);
            }
        });
        final String strC = com.facebook.react.modules.systeminfo.a.f37076a.c(context);
        Button button2 = new Button(context);
        button2.setText(strC);
        button2.setTextSize(12.0f);
        button2.setAllCaps(false);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3221g.g(editText, strC, view);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(button);
        linearLayout2.addView(button2);
        TextView textView2 = new TextView(context);
        textView2.setText(context.getString(AbstractC3250o.f37131g, com.facebook.react.modules.systeminfo.a.b(context)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10, 0, i11);
        textView2.setLayoutParams(layoutParams);
        Button button3 = new Button(context);
        button3.setText(context.getString(AbstractC3250o.f37127c));
        Button button4 = new Button(context);
        button4.setText(context.getString(AbstractC3250o.f37128d));
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(textView2);
        linearLayout.addView(button3);
        linearLayout.addView(button4);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(context.getString(AbstractC3250o.f37126b)).setView(linearLayout).create();
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3221g.h(onClickListener, editText, alertDialogCreate, view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3221g.i(alertDialogCreate, view);
            }
        });
        alertDialogCreate.show();
    }
}

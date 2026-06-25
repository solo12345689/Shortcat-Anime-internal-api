package app.notifee.core.model;

import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.app.w;
import com.amazon.a.a.o.b;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationAndroidActionModel {
    private Bundle mNotificationAndroidActionBundle;

    private NotificationAndroidActionModel(Bundle bundle) {
        this.mNotificationAndroidActionBundle = bundle;
    }

    public static NotificationAndroidActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidActionModel(bundle);
    }

    public String getIcon() {
        return this.mNotificationAndroidActionBundle.getString("icon");
    }

    public NotificationAndroidPressActionModel getPressAction() {
        return NotificationAndroidPressActionModel.fromBundle(this.mNotificationAndroidActionBundle.getBundle("pressAction"));
    }

    public w getRemoteInput(m.a.C0493a c0493a) {
        if (!this.mNotificationAndroidActionBundle.containsKey("input")) {
            return null;
        }
        Bundle bundle = this.mNotificationAndroidActionBundle.getBundle("input");
        Objects.requireNonNull(bundle);
        w.e eVar = new w.e("app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY");
        if (bundle.containsKey("allowFreeFormInput")) {
            eVar.b(bundle.getBoolean("allowFreeFormInput"));
        }
        if (bundle.containsKey("allowGeneratedReplies")) {
            c0493a.d(bundle.getBoolean("allowGeneratedReplies"));
        }
        if (bundle.containsKey("placeholder")) {
            eVar.e(bundle.getCharSequence("placeholder"));
        }
        if (bundle.containsKey("choices")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("choices");
            Objects.requireNonNull(stringArrayList);
            eVar.c((CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]));
        }
        if (!bundle.containsKey("editableChoices")) {
            eVar.d(0);
        } else if (bundle.getBoolean("editableChoices")) {
            eVar.d(2);
        } else {
            eVar.d(1);
        }
        return eVar.a();
    }

    public String getTitle() {
        String string = this.mNotificationAndroidActionBundle.getString(b.f34626S);
        Objects.requireNonNull(string);
        return string;
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidActionBundle.clone();
    }
}

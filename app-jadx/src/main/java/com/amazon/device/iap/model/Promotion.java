package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new Parcelable.Creator<Promotion>() { // from class: com.amazon.device.iap.model.Promotion.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Promotion createFromParcel(Parcel parcel) {
            return new Promotion(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Promotion[] newArray(int i10) {
            return new Promotion[i10];
        }
    };
    private List<PromotionPlan> promotionPlans;
    private final String promotionType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) obj;
        return getPromotionPlans() != null && getPromotionPlans().equals(promotion.getPromotionPlans()) && getPromotionType() != null && getPromotionType().equals(promotion.getPromotionType());
    }

    public List<PromotionPlan> getPromotionPlans() {
        return this.promotionPlans;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.f34660r, getPromotionType());
        JSONArray jSONArray = new JSONArray();
        Iterator<PromotionPlan> it = getPromotionPlans().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        jSONObject.put(b.f34661s, jSONArray);
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.promotionType);
        parcel.writeTypedList(this.promotionPlans);
    }

    public Promotion(String str, List<PromotionPlan> list) {
        this.promotionType = str;
        this.promotionPlans = list;
    }

    private Promotion(Parcel parcel) {
        this.promotionType = parcel.readString();
        this.promotionPlans = parcel.createTypedArrayList(PromotionPlan.CREATOR);
    }
}

.class public interface abstract Lcom/android/vending/billing/IInAppBillingService;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/vending/billing/IInAppBillingService$_Parcel;,
        Lcom/android/vending/billing/IInAppBillingService$Stub;,
        Lcom/android/vending/billing/IInAppBillingService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "com.android.vending.billing.IInAppBillingService"


# virtual methods
.method public abstract getPurchaseHistory(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

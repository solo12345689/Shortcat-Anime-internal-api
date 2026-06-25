.class public abstract LF8/a;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static zza:Ljava/lang/Boolean;


# direct methods
.method public static zzb(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-static {p0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object v0, LF8/a;->zza:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const-string v0, "com.google.android.gms.analytics.CampaignTrackingReceiver"

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/gtm/zzfs;->zzi(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, LF8/a;->zza:Ljava/lang/Boolean;

    .line 25
    .line 26
    return p0
.end method

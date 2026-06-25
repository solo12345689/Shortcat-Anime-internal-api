.class public final synthetic Lcom/android/billingclient/api/f0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/Q3;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/f0;->a:Lcom/android/billingclient/api/b;

    .line 5
    .line 6
    iput p2, p0, Lcom/android/billingclient/api/f0;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/O3;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/f0;->a:Lcom/android/billingclient/api/b;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/billingclient/api/f0;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/b;->N0(Lcom/android/billingclient/api/b;ILcom/google/android/gms/internal/play_billing/O3;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

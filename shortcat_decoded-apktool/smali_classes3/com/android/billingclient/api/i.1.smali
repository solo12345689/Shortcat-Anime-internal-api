.class public final Lcom/android/billingclient/api/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/i$a;,
        Lcom/android/billingclient/api/i$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/play_billing/N;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/i$a;LN4/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/android/billingclient/api/i$a;->c(Lcom/android/billingclient/api/i$a;)Lcom/google/android/gms/internal/play_billing/N;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/android/billingclient/api/i;->a:Lcom/google/android/gms/internal/play_billing/N;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Lcom/android/billingclient/api/i$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/billingclient/api/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/billingclient/api/i$a;-><init>(LN4/G;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/play_billing/N;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/i;->a:Lcom/google/android/gms/internal/play_billing/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/i;->a:Lcom/google/android/gms/internal/play_billing/N;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/android/billingclient/api/i$b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/billingclient/api/i$b;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.class final Lcom/android/billingclient/api/y;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic a:LN4/i;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/b;Landroid/os/Handler;LN4/i;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/android/billingclient/api/y;->a:LN4/i;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/android/billingclient/api/y;->a:LN4/i;

    .line 2
    .line 3
    const-string v0, "BillingClient"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/V;->h(Landroid/os/Bundle;Ljava/lang/String;)LN4/j;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p1, p2}, LN4/i;->a(LN4/j;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

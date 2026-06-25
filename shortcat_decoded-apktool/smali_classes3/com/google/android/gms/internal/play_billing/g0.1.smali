.class final Lcom/google/android/gms/internal/play_billing/g0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/google/android/gms/internal/play_billing/k0;

.field final b:Lcom/google/android/gms/internal/play_billing/G0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/k0;Lcom/google/android/gms/internal/play_billing/G0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/g0;->a:Lcom/google/android/gms/internal/play_billing/k0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/g0;->b:Lcom/google/android/gms/internal/play_billing/G0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/g0;->a:Lcom/google/android/gms/internal/play_billing/k0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/q0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/g0;->b:Lcom/google/android/gms/internal/play_billing/G0;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/g0;->a:Lcom/google/android/gms/internal/play_billing/k0;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/k0;->j(Lcom/google/android/gms/internal/play_billing/G0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v1, p0, v0}, Lcom/google/android/gms/internal/play_billing/q0;->i(Lcom/google/android/gms/internal/play_billing/q0;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/g0;->a:Lcom/google/android/gms/internal/play_billing/k0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/k0;->n(Lcom/google/android/gms/internal/play_billing/k0;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

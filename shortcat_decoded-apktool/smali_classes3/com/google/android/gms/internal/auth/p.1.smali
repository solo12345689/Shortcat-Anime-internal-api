.class final Lcom/google/android/gms/internal/auth/p;
.super Landroid/database/ContentObserver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/auth/q;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/q;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/p;->a:Lcom/google/android/gms/internal/auth/q;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/auth/p;->a:Lcom/google/android/gms/internal/auth/q;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/q;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

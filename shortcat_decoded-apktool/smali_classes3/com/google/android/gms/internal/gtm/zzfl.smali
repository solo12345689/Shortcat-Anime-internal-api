.class final Lcom/google/android/gms/internal/gtm/zzfl;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzcz;


# instance fields
.field final synthetic zza:Ljava/lang/Runnable;

.field final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzfn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzfn;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zzb:Lcom/google/android/gms/internal/gtm/zzfn;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zza:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zzb:Lcom/google/android/gms/internal/gtm/zzfn;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzfn;->zzb(Lcom/google/android/gms/internal/gtm/zzfn;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zza:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

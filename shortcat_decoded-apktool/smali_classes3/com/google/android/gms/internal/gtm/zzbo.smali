.class final Lcom/google/android/gms/internal/gtm/zzbo;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/gtm/zzcz;

.field final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzbq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzbq;Lcom/google/android/gms/internal/gtm/zzcz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzbo;->zzb:Lcom/google/android/gms/internal/gtm/zzbq;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzbo;->zza:Lcom/google/android/gms/internal/gtm/zzcz;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbo;->zzb:Lcom/google/android/gms/internal/gtm/zzbq;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbq;->zzb(Lcom/google/android/gms/internal/gtm/zzbq;)Lcom/google/android/gms/internal/gtm/zzck;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbo;->zza:Lcom/google/android/gms/internal/gtm/zzcz;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzck;->zzf(Lcom/google/android/gms/internal/gtm/zzcz;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.class final Lcom/google/android/gms/internal/gtm/zzca;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Landroid/content/ComponentName;

.field final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzcb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzcb;Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzca;->zzb:Lcom/google/android/gms/internal/gtm/zzcb;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzca;->zza:Landroid/content/ComponentName;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzca;->zzb:Lcom/google/android/gms/internal/gtm/zzcb;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzcb;->zza:Lcom/google/android/gms/internal/gtm/zzcc;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzca;->zza:Landroid/content/ComponentName;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzcc;->zzb(Lcom/google/android/gms/internal/gtm/zzcc;Landroid/content/ComponentName;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.class public final synthetic Lcom/google/android/gms/internal/gtm/zzfj;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/gtm/zzfn;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/gtm/zzfb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/gtm/zzfn;ILcom/google/android/gms/internal/gtm/zzfb;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzb:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzc:Lcom/google/android/gms/internal/gtm/zzfb;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzb:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzc:Lcom/google/android/gms/internal/gtm/zzfb;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gtm/zzfn;->zzc(ILcom/google/android/gms/internal/gtm/zzfb;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

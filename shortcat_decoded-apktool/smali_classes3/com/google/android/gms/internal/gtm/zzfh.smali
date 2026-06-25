.class public final Lcom/google/android/gms/internal/gtm/zzfh;
.super Lcom/google/android/gms/internal/gtm/zzbs;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private zza:Landroid/content/SharedPreferences;

.field private zzb:J

.field private zzc:J

.field private final zzd:Lcom/google/android/gms/internal/gtm/zzfg;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzbs;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzc:J

    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/gtm/zzfg;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 11
    .line 12
    .line 13
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzeu;->zzP:Lcom/google/android/gms/internal/gtm/zzet;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    const/4 v7, 0x0

    .line 26
    const-string v4, "monitoring"

    .line 27
    .line 28
    move-object v3, p0

    .line 29
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/gtm/zzfg;-><init>(Lcom/google/android/gms/internal/gtm/zzfh;Ljava/lang/String;JLcom/google/android/gms/internal/gtm/zzff;)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v3, Lcom/google/android/gms/internal/gtm/zzfh;->zzd:Lcom/google/android/gms/internal/gtm/zzfg;

    .line 33
    .line 34
    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/gtm/zzfh;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final zza()J
    .locals 6

    .line 1
    invoke-static {}, LF8/n;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    .line 5
    .line 6
    .line 7
    iget-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzb:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v4, v0, v2

    .line 12
    .line 13
    if-nez v4, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v1, "first_run"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iput-wide v4, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzb:J

    .line 28
    .line 29
    return-wide v4

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzC()Lcom/google/android/gms/common/util/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    const-string v0, "Failed to commit first run time"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzR(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iput-wide v2, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzb:J

    .line 59
    .line 60
    return-wide v2

    .line 61
    :cond_2
    return-wide v0
.end method

.method public final zzb()J
    .locals 4

    .line 1
    invoke-static {}, LF8/n;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    .line 5
    .line 6
    .line 7
    iget-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzc:J

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v1, "last_dispatch"

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzc:J

    .line 26
    .line 27
    :cond_0
    return-wide v0
.end method

.method protected final zzd()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzo()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.google.android.gms.analytics.prefs"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    return-void
.end method

.method public final zze()Lcom/google/android/gms/internal/gtm/zzfg;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzd:Lcom/google/android/gms/internal/gtm/zzfg;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzi()V
    .locals 4

    .line 1
    invoke-static {}, LF8/n;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzC()Lcom/google/android/gms/common/util/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zza:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "last_dispatch"

    .line 22
    .line 23
    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfh;->zzc:J

    .line 30
    .line 31
    return-void
.end method

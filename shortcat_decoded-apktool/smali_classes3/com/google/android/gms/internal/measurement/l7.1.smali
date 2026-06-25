.class public final Lcom/google/android/gms/internal/measurement/l7;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/o4;

.field public static final b:Lcom/google/android/gms/internal/measurement/o4;

.field public static final c:Lcom/google/android/gms/internal/measurement/o4;

.field public static final d:Lcom/google/android/gms/internal/measurement/o4;

.field public static final e:Lcom/google/android/gms/internal/measurement/o4;

.field public static final f:Lcom/google/android/gms/internal/measurement/o4;

.field public static final g:Lcom/google/android/gms/internal/measurement/o4;

.field public static final h:Lcom/google/android/gms/internal/measurement/o4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/i4;

    .line 2
    .line 3
    const-string v1, "com.google.android.gms.measurement"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/d4;->a(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/i4;-><init>(Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i4;->a()Lcom/google/android/gms/internal/measurement/i4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i4;->b()Lcom/google/android/gms/internal/measurement/i4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "measurement.rb.attribution.ad_campaign_info"

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 24
    .line 25
    .line 26
    const-string v1, "measurement.rb.attribution.service.bundle_on_backgrounded"

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 29
    .line 30
    .line 31
    const-string v1, "measurement.rb.attribution.client2"

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->a:Lcom/google/android/gms/internal/measurement/o4;

    .line 38
    .line 39
    const-string v1, "measurement.rb.attribution.followup1.service"

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->b:Lcom/google/android/gms/internal/measurement/o4;

    .line 47
    .line 48
    const-string v1, "measurement.rb.attribution.client.get_trigger_uris_async"

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 51
    .line 52
    .line 53
    const-string v1, "measurement.rb.attribution.service.trigger_uris_high_priority"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->c:Lcom/google/android/gms/internal/measurement/o4;

    .line 60
    .line 61
    const-string v1, "measurement.rb.attribution.index_out_of_bounds_fix"

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 64
    .line 65
    .line 66
    const-string v1, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->d:Lcom/google/android/gms/internal/measurement/o4;

    .line 73
    .line 74
    const-string v1, "measurement.rb.attribution.retry_disposition"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->e:Lcom/google/android/gms/internal/measurement/o4;

    .line 81
    .line 82
    const-string v1, "measurement.rb.attribution.service"

    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->f:Lcom/google/android/gms/internal/measurement/o4;

    .line 89
    .line 90
    const-string v1, "measurement.rb.attribution.enable_trigger_redaction"

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->g:Lcom/google/android/gms/internal/measurement/o4;

    .line 97
    .line 98
    const-string v1, "measurement.rb.attribution.uuid_generation"

    .line 99
    .line 100
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sput-object v1, Lcom/google/android/gms/internal/measurement/l7;->h:Lcom/google/android/gms/internal/measurement/o4;

    .line 105
    .line 106
    const-string v1, "measurement.id.rb.attribution.retry_disposition"

    .line 107
    .line 108
    const-wide/16 v3, 0x0

    .line 109
    .line 110
    invoke-virtual {v0, v1, v3, v4}, Lcom/google/android/gms/internal/measurement/i4;->c(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/o4;

    .line 111
    .line 112
    .line 113
    const-string v1, "measurement.rb.attribution.improved_retry"

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->g:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->h:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->a:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->b:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->c:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->d:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->e:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->f:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final zza()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

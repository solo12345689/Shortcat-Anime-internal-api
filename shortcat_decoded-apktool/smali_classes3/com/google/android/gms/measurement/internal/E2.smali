.class final Lcom/google/android/gms/measurement/internal/E2;
.super Lcom/google/android/gms/measurement/internal/B3;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final A:Landroid/util/Pair;


# instance fields
.field private c:Landroid/content/SharedPreferences;

.field private d:Landroid/content/SharedPreferences;

.field public e:Lcom/google/android/gms/measurement/internal/C2;

.field public final f:Lcom/google/android/gms/measurement/internal/B2;

.field public final g:Lcom/google/android/gms/measurement/internal/B2;

.field public final h:Lcom/google/android/gms/measurement/internal/D2;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:J

.field public final l:Lcom/google/android/gms/measurement/internal/B2;

.field public final m:Lcom/google/android/gms/measurement/internal/z2;

.field public final n:Lcom/google/android/gms/measurement/internal/D2;

.field public final o:Lcom/google/android/gms/measurement/internal/A2;

.field public final p:Lcom/google/android/gms/measurement/internal/z2;

.field public final q:Lcom/google/android/gms/measurement/internal/B2;

.field public final r:Lcom/google/android/gms/measurement/internal/B2;

.field public s:Z

.field public final t:Lcom/google/android/gms/measurement/internal/z2;

.field public final u:Lcom/google/android/gms/measurement/internal/z2;

.field public final v:Lcom/google/android/gms/measurement/internal/B2;

.field public final w:Lcom/google/android/gms/measurement/internal/D2;

.field public final x:Lcom/google/android/gms/measurement/internal/D2;

.field public final y:Lcom/google/android/gms/measurement/internal/B2;

.field public final z:Lcom/google/android/gms/measurement/internal/A2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/measurement/internal/E2;->A:Landroid/util/Pair;

    .line 15
    .line 16
    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/X2;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/B3;-><init>(Lcom/google/android/gms/measurement/internal/X2;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 5
    .line 6
    const-wide/32 v0, 0x1b7740

    .line 7
    .line 8
    .line 9
    const-string v2, "session_timeout"

    .line 10
    .line 11
    invoke-direct {p1, p0, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->l:Lcom/google/android/gms/measurement/internal/B2;

    .line 15
    .line 16
    new-instance p1, Lcom/google/android/gms/measurement/internal/z2;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const-string v1, "start_new_session"

    .line 20
    .line 21
    invoke-direct {p1, p0, v1, v0}, Lcom/google/android/gms/measurement/internal/z2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->m:Lcom/google/android/gms/measurement/internal/z2;

    .line 25
    .line 26
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 27
    .line 28
    const-string v0, "last_pause_time"

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->q:Lcom/google/android/gms/measurement/internal/B2;

    .line 36
    .line 37
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 38
    .line 39
    const-string v0, "session_id"

    .line 40
    .line 41
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->r:Lcom/google/android/gms/measurement/internal/B2;

    .line 45
    .line 46
    new-instance p1, Lcom/google/android/gms/measurement/internal/D2;

    .line 47
    .line 48
    const-string v0, "non_personalized_ads"

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/D2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->n:Lcom/google/android/gms/measurement/internal/D2;

    .line 55
    .line 56
    new-instance p1, Lcom/google/android/gms/measurement/internal/A2;

    .line 57
    .line 58
    const-string v0, "last_received_uri_timestamps_by_source"

    .line 59
    .line 60
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/A2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->o:Lcom/google/android/gms/measurement/internal/A2;

    .line 64
    .line 65
    new-instance p1, Lcom/google/android/gms/measurement/internal/z2;

    .line 66
    .line 67
    const-string v0, "allow_remote_dynamite"

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {p1, p0, v0, v4}, Lcom/google/android/gms/measurement/internal/z2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->p:Lcom/google/android/gms/measurement/internal/z2;

    .line 74
    .line 75
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 76
    .line 77
    const-string v0, "first_open_time"

    .line 78
    .line 79
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->f:Lcom/google/android/gms/measurement/internal/B2;

    .line 83
    .line 84
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 85
    .line 86
    const-string v0, "app_install_time"

    .line 87
    .line 88
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->g:Lcom/google/android/gms/measurement/internal/B2;

    .line 92
    .line 93
    new-instance p1, Lcom/google/android/gms/measurement/internal/D2;

    .line 94
    .line 95
    const-string v0, "app_instance_id"

    .line 96
    .line 97
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/D2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->h:Lcom/google/android/gms/measurement/internal/D2;

    .line 101
    .line 102
    new-instance p1, Lcom/google/android/gms/measurement/internal/z2;

    .line 103
    .line 104
    const-string v0, "app_backgrounded"

    .line 105
    .line 106
    invoke-direct {p1, p0, v0, v4}, Lcom/google/android/gms/measurement/internal/z2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->t:Lcom/google/android/gms/measurement/internal/z2;

    .line 110
    .line 111
    new-instance p1, Lcom/google/android/gms/measurement/internal/z2;

    .line 112
    .line 113
    const-string v0, "deep_link_retrieval_complete"

    .line 114
    .line 115
    invoke-direct {p1, p0, v0, v4}, Lcom/google/android/gms/measurement/internal/z2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->u:Lcom/google/android/gms/measurement/internal/z2;

    .line 119
    .line 120
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 121
    .line 122
    const-string v0, "deep_link_retrieval_attempts"

    .line 123
    .line 124
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->v:Lcom/google/android/gms/measurement/internal/B2;

    .line 128
    .line 129
    new-instance p1, Lcom/google/android/gms/measurement/internal/D2;

    .line 130
    .line 131
    const-string v0, "firebase_feature_rollouts"

    .line 132
    .line 133
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/D2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->w:Lcom/google/android/gms/measurement/internal/D2;

    .line 137
    .line 138
    new-instance p1, Lcom/google/android/gms/measurement/internal/D2;

    .line 139
    .line 140
    const-string v0, "deferred_attribution_cache"

    .line 141
    .line 142
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/D2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->x:Lcom/google/android/gms/measurement/internal/D2;

    .line 146
    .line 147
    new-instance p1, Lcom/google/android/gms/measurement/internal/B2;

    .line 148
    .line 149
    const-string v0, "deferred_attribution_cache_timestamp"

    .line 150
    .line 151
    invoke-direct {p1, p0, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J)V

    .line 152
    .line 153
    .line 154
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->y:Lcom/google/android/gms/measurement/internal/B2;

    .line 155
    .line 156
    new-instance p1, Lcom/google/android/gms/measurement/internal/A2;

    .line 157
    .line 158
    const-string v0, "default_event_parameters"

    .line 159
    .line 160
    invoke-direct {p1, p0, v0, v3}, Lcom/google/android/gms/measurement/internal/A2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E2;->z:Lcom/google/android/gms/measurement/internal/A2;

    .line 164
    .line 165
    return-void
.end method


# virtual methods
.method final A(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->l:Lcom/google/android/gms/measurement/internal/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/B2;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sub-long/2addr p1, v0

    .line 8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->q:Lcom/google/android/gms/measurement/internal/B2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/B2;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmp-long p1, p1, v0

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method protected final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected final j()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->d()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "com.google.android.gms.measurement.prefs"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/E2;->c:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    const-string v2, "has_been_opened"

    .line 17
    .line 18
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput-boolean v1, p0, Lcom/google/android/gms/measurement/internal/E2;->s:Z

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/E2;->c:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance v4, Lcom/google/android/gms/measurement/internal/C2;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->w()Lcom/google/android/gms/measurement/internal/m;

    .line 42
    .line 43
    .line 44
    sget-object v0, Lcom/google/android/gms/measurement/internal/d2;->d:Lcom/google/android/gms/measurement/internal/c2;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    const-wide/16 v2, 0x0

    .line 58
    .line 59
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v7

    .line 63
    const-string v6, "health_monitor"

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    move-object v5, p0

    .line 67
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/C2;-><init>(Lcom/google/android/gms/measurement/internal/E2;Ljava/lang/String;J[B)V

    .line 68
    .line 69
    .line 70
    iput-object v4, v5, Lcom/google/android/gms/measurement/internal/E2;->e:Lcom/google/android/gms/measurement/internal/C2;

    .line 71
    .line 72
    return-void
.end method

.method final o(Ljava/lang/String;)Landroid/util/Pair;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->w()Lcom/google/android/gms/measurement/internal/E3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lj9/v;->b:Lj9/v;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/E3;->o(Lj9/v;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->e()Lcom/google/android/gms/common/util/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Lcom/google/android/gms/common/util/d;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/E2;->i:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-wide v5, p0, Lcom/google/android/gms/measurement/internal/E2;->k:J

    .line 33
    .line 34
    cmp-long v5, v2, v5

    .line 35
    .line 36
    if-ltz v5, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Landroid/util/Pair;

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/E2;->j:Z

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p1, v4, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->w()Lcom/google/android/gms/measurement/internal/m;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v5, Lcom/google/android/gms/measurement/internal/d2;->b:Lcom/google/android/gms/measurement/internal/c2;

    .line 56
    .line 57
    invoke-virtual {v4, p1, v5}, Lcom/google/android/gms/measurement/internal/m;->D(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/c2;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    add-long/2addr v2, v4

    .line 62
    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/E2;->k:J

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->a(Z)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->d()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/E2;->i:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->i:Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception p1

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/E2;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->v()Lcom/google/android/gms/measurement/internal/o2;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v2, "Unable to get advertising id"

    .line 107
    .line 108
    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/E2;->i:Ljava/lang/String;

    .line 112
    .line 113
    :goto_3
    const/4 p1, 0x0

    .line 114
    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->a(Z)V

    .line 115
    .line 116
    .line 117
    new-instance p1, Landroid/util/Pair;

    .line 118
    .line 119
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->i:Ljava/lang/String;

    .line 120
    .line 121
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/E2;->j:Z

    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_3
    new-instance p1, Landroid/util/Pair;

    .line 132
    .line 133
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-direct {p1, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-object p1
.end method

.method protected final p()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/B3;->l()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->c:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->c:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    return-object v0
.end method

.method protected final q()Landroid/content/SharedPreferences;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/B3;->l()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->d:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->d()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "_preferences"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v3, "Default prefs file"

    .line 40
    .line 41
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->d()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->d:Landroid/content/SharedPreferences;

    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->d:Landroid/content/SharedPreferences;

    .line 56
    .line 57
    return-object v0
.end method

.method final r()Landroid/util/SparseArray;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->o:Lcom/google/android/gms/measurement/internal/A2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A2;->a()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "uriSources"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "uriTimestamps"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    array-length v2, v0

    .line 25
    array-length v3, v1

    .line 26
    if-eq v3, v2, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Trigger URI source and timestamp array lengths do not match"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroid/util/SparseArray;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    new-instance v2, Landroid/util/SparseArray;

    .line 50
    .line 51
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    :goto_0
    array-length v4, v1

    .line 56
    if-ge v3, v4, :cond_2

    .line 57
    .line 58
    aget v4, v1, v3

    .line 59
    .line 60
    aget-wide v5, v0, v3

    .line 61
    .line 62
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    return-object v2

    .line 73
    :cond_3
    :goto_1
    new-instance v0, Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method final s(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "measurement_enabled"

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method final t()Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "measurement_enabled"

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return-object v0
.end method

.method final u()Lcom/google/android/gms/measurement/internal/y;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "dma_consent_settings"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/y;->g(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method final v(I)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "consent_source"

    .line 6
    .line 7
    const/16 v2, 0x64

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/E3;->u(II)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method final w()Lcom/google/android/gms/measurement/internal/E3;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "consent_settings"

    .line 9
    .line 10
    const-string v2, "G1"

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "consent_source"

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/E3;->f(Ljava/lang/String;I)Lcom/google/android/gms/measurement/internal/E3;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method protected final x(Lcom/google/android/gms/measurement/internal/O5;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, ""

    .line 9
    .line 10
    const-string v2, "stored_tcf_param"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/O5;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return p1
.end method

.method final y(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "App measurement setting deferred collection"

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/E2;->p()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "deferred_analytics_collection"

    .line 32
    .line 33
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method final z()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E2;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const-string v1, "deferred_analytics_collection"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

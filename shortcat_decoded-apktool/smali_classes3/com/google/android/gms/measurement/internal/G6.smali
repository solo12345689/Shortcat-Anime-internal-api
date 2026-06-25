.class public final Lcom/google/android/gms/measurement/internal/G6;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/X2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/X2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method final synthetic a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->N()Lcom/google/android/gms/measurement/internal/D4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/google/android/gms/measurement/internal/d2;->D:Lcom/google/android/gms/measurement/internal/c2;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/D4;->o(J)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q2;->r()Lcom/google/android/gms/measurement/internal/o2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "App receiver called with null intent"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q2;->r()Lcom/google/android/gms/measurement/internal/o2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "App receiver called with null action"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    const v0, -0x72ee9a21

    .line 46
    .line 47
    .line 48
    if-eq p2, v0, :cond_3

    .line 49
    .line 50
    const v0, 0x4c497878    # 5.2814304E7f

    .line 51
    .line 52
    .line 53
    if-eq p2, v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const-string p2, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const-string v0, "[sgtm] App Receiver notified batches are available"

    .line 75
    .line 76
    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Lcom/google/android/gms/measurement/internal/D6;

    .line 84
    .line 85
    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/D6;-><init>(Lcom/google/android/gms/measurement/internal/G6;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/T2;->t(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    const-string p2, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 101
    .line 102
    invoke-static {}, Lcom/google/android/gms/internal/measurement/j7;->a()Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->w()Lcom/google/android/gms/measurement/internal/m;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const/4 v0, 0x0

    .line 110
    sget-object v1, Lcom/google/android/gms/measurement/internal/d2;->R0:Lcom/google/android/gms/measurement/internal/c2;

    .line 111
    .line 112
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/measurement/internal/m;->H(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/c2;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-nez p2, :cond_4

    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    const-string v0, "App receiver notified triggers are available"

    .line 128
    .line 129
    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    new-instance v0, Lcom/google/android/gms/measurement/internal/E6;

    .line 137
    .line 138
    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/E6;-><init>(Lcom/google/android/gms/measurement/internal/X2;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/T2;->t(Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/G6;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q2;->r()Lcom/google/android/gms/measurement/internal/o2;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string p2, "App receiver called with unknown action"

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

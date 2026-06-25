.class final Lcom/android/billingclient/api/d0;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Z

.field private final b:Z

.field final synthetic c:Lcom/android/billingclient/api/e0;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e0;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/android/billingclient/api/d0;->b:Z

    .line 10
    .line 11
    return-void
.end method

.method private final d(Landroid/os/Bundle;Lcom/android/billingclient/api/e;ILcom/google/android/gms/internal/play_billing/Y2;JZ)V
    .locals 2

    .line 1
    const-string v0, "FAILURE_LOGGING_PAYLOAD"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/android/billingclient/api/e0;->b(Lcom/android/billingclient/api/e0;)Lcom/android/billingclient/api/V;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/z1;->a()Lcom/google/android/gms/internal/play_billing/z1;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/J2;->C([BLcom/google/android/gms/internal/play_billing/z1;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p2, p1, p5, p6, p7}, Lcom/android/billingclient/api/V;->c(Lcom/google/android/gms/internal/play_billing/J2;JZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->b(Lcom/android/billingclient/api/e0;)Lcom/android/billingclient/api/V;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->x:Lcom/google/android/gms/internal/play_billing/R2;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, p3, p2, v1, p4}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p1, p2, p5, p6, p7}, Lcom/android/billingclient/api/V;->c(Lcom/google/android/gms/internal/play_billing/J2;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    const-string p1, "BillingBroadcastManager"

    .line 49
    .line 50
    const-string p2, "Failed parsing Api failure."

    .line 51
    .line 52
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/d0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-lt v0, v1, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/android/billingclient/api/d0;->b:Z

    .line 16
    .line 17
    if-eq v2, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x2

    .line 22
    :goto_0
    invoke-static {p1, p0, p2, v0}, Lt2/U;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    :goto_1
    iput-boolean v2, p0, Lcom/android/billingclient/api/d0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw p1
.end method

.method public final declared-synchronized b(Landroid/content/Context;Landroid/content/IntentFilter;Ljava/lang/String;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean p3, p0, Lcom/android/billingclient/api/d0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const-string v3, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    .line 11
    .line 12
    const/16 v0, 0x21

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    if-lt p3, v0, :cond_2

    .line 16
    .line 17
    iget-boolean p3, p0, Lcom/android/billingclient/api/d0;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    if-eq v6, p3, :cond_1

    .line 20
    .line 21
    const/4 p3, 0x4

    .line 22
    :goto_0
    move v5, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p3, 0x2

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const/4 v4, 0x0

    .line 27
    move-object v1, p0

    .line 28
    move-object v0, p1

    .line 29
    move-object v2, p2

    .line 30
    :try_start_2
    invoke-static/range {v0 .. v5}, LN4/J;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    :goto_2
    move-object p1, v0

    .line 36
    goto :goto_4

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    move-object v1, p0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v1, p0

    .line 41
    move-object v0, p1

    .line 42
    move-object v2, p2

    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {v0, p0, v2, v3, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    :goto_3
    iput-boolean v6, v1, Lcom/android/billingclient/api/d0;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    throw p1
.end method

.method public final declared-synchronized c(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/d0;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/android/billingclient/api/d0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    const-string p1, "BillingBroadcastManager"

    .line 17
    .line 18
    const-string v0, "Receiver is not registered."

    .line 19
    .line 20
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw p1
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, -0x58756162

    .line 10
    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const v1, -0x141f9074

    .line 15
    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const v1, 0x14937179

    .line 20
    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string v0, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->e:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 34
    .line 35
    :goto_0
    move-object v4, p1

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const-string v0, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->d:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string v0, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->c:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    :goto_1
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->b:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_2
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->d:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 63
    .line 64
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, 0x2

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->e:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    :cond_4
    move v0, v1

    .line 80
    move v3, v0

    .line 81
    goto :goto_4

    .line 82
    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->c:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    const/16 v0, 0x20

    .line 91
    .line 92
    :goto_3
    move v3, v0

    .line 93
    move v0, v1

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/4 v0, 0x1

    .line 96
    goto :goto_3

    .line 97
    :goto_4
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const/4 v8, 0x0

    .line 102
    const-string v9, "BillingBroadcastManager"

    .line 103
    .line 104
    if-nez v1, :cond_8

    .line 105
    .line 106
    const-string p1, "Bundle is null."

    .line 107
    .line 108
    invoke-static {v9, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 112
    .line 113
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->b(Lcom/android/billingclient/api/e0;)Lcom/android/billingclient/api/V;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    sget-object v0, Lcom/google/android/gms/internal/play_billing/R2;->l:Lcom/google/android/gms/internal/play_billing/R2;

    .line 118
    .line 119
    sget-object v1, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 120
    .line 121
    invoke-static {v0, v3, v1, v8, v4}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {p2, v0}, Lcom/android/billingclient/api/V;->b(Lcom/google/android/gms/internal/play_billing/J2;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->c(Lcom/android/billingclient/api/e0;)LN4/m;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-eqz p2, :cond_7

    .line 133
    .line 134
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->c(Lcom/android/billingclient/api/e0;)LN4/m;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1, v1, v8}, LN4/m;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_7
    move-object v0, p0

    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_8
    const/4 v2, 0x0

    .line 146
    if-ne v3, v0, :cond_c

    .line 147
    .line 148
    sget v0, Lcom/google/android/gms/internal/play_billing/V;->a:I

    .line 149
    .line 150
    invoke-static {}, Lcom/android/billingclient/api/e;->d()Lcom/android/billingclient/api/e$a;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-static {v5, v9}, Lcom/google/android/gms/internal/play_billing/V;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-virtual {v0, v5}, Lcom/android/billingclient/api/e$a;->d(I)Lcom/android/billingclient/api/e$a;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    if-nez v5, :cond_9

    .line 170
    .line 171
    const-string v5, "Unexpected null bundle received!"

    .line 172
    .line 173
    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_5
    move v5, v2

    .line 177
    goto :goto_6

    .line 178
    :cond_9
    const-string v6, "SUB_RESPONSE_CODE"

    .line 179
    .line 180
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    if-nez v5, :cond_a

    .line 185
    .line 186
    const-string v5, "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK"

    .line 187
    .line 188
    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    instance-of v6, v5, Ljava/lang/Integer;

    .line 193
    .line 194
    if-eqz v6, :cond_b

    .line 195
    .line 196
    check-cast v5, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    goto :goto_6

    .line 203
    :cond_b
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    const-string v6, "Unexpected type for bundle sub response code: "

    .line 212
    .line 213
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :goto_6
    invoke-virtual {v0, v5}, Lcom/android/billingclient/api/e$a;->c(I)Lcom/android/billingclient/api/e$a;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-static {p2, v9}, Lcom/google/android/gms/internal/play_billing/V;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {v0, p2}, Lcom/android/billingclient/api/e$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/e$a;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Lcom/android/billingclient/api/e$a;->a()Lcom/android/billingclient/api/e;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    goto :goto_7

    .line 240
    :cond_c
    invoke-static {p2, v9}, Lcom/google/android/gms/internal/play_billing/V;->g(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/e;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    :goto_7
    const-string v0, "billingClientTransactionId"

    .line 245
    .line 246
    const-wide/16 v5, 0x0

    .line 247
    .line 248
    invoke-virtual {v1, v0, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    const-string v0, "wasServiceAutoReconnected"

    .line 253
    .line 254
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    sget-object v0, Lcom/google/android/gms/internal/play_billing/Y2;->c:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 259
    .line 260
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-nez v0, :cond_d

    .line 265
    .line 266
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_e

    .line 271
    .line 272
    :cond_d
    move-object v0, p0

    .line 273
    move-object v2, p2

    .line 274
    goto :goto_9

    .line 275
    :cond_e
    sget-object p1, Lcom/google/android/gms/internal/play_billing/Y2;->e:Lcom/google/android/gms/internal/play_billing/Y2;

    .line 276
    .line 277
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    if-eqz p1, :cond_7

    .line 282
    .line 283
    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->c()I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_f

    .line 288
    .line 289
    move-object v0, p0

    .line 290
    move-object v2, p2

    .line 291
    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/d0;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/e;ILcom/google/android/gms/internal/play_billing/Y2;JZ)V

    .line 292
    .line 293
    .line 294
    iget-object p1, v0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 295
    .line 296
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->c(Lcom/android/billingclient/api/e0;)LN4/m;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-interface {p1, v2, p2}, LN4/m;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_f
    move-object v0, p0

    .line 309
    iget-object p1, v0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 310
    .line 311
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->a(Lcom/android/billingclient/api/e0;)LN4/s;

    .line 312
    .line 313
    .line 314
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->e(Lcom/android/billingclient/api/e0;)LN4/p;

    .line 315
    .line 316
    .line 317
    const-string p1, "AlternativeBillingListener and UserChoiceBillingListener is null."

    .line 318
    .line 319
    invoke-static {v9, p1}, Lcom/google/android/gms/internal/play_billing/V;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    iget-object p1, v0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 323
    .line 324
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->b(Lcom/android/billingclient/api/e0;)Lcom/android/billingclient/api/V;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    sget-object v1, Lcom/google/android/gms/internal/play_billing/R2;->Y0:Lcom/google/android/gms/internal/play_billing/R2;

    .line 329
    .line 330
    sget-object v2, Lcom/android/billingclient/api/W;->h:Lcom/android/billingclient/api/e;

    .line 331
    .line 332
    invoke-static {v1, v3, v2, v8, v4}, Lcom/android/billingclient/api/U;->b(Lcom/google/android/gms/internal/play_billing/R2;ILcom/android/billingclient/api/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/J2;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-interface {p2, v1, v5, v6, v7}, Lcom/android/billingclient/api/V;->c(Lcom/google/android/gms/internal/play_billing/J2;JZ)V

    .line 337
    .line 338
    .line 339
    invoke-static {p1}, Lcom/android/billingclient/api/e0;->c(Lcom/android/billingclient/api/e0;)LN4/m;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N;->t()Lcom/google/android/gms/internal/play_billing/N;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-interface {p1, v2, p2}, LN4/m;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 348
    .line 349
    .line 350
    :goto_8
    return-void

    .line 351
    :goto_9
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/V;->k(Landroid/os/Bundle;)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-virtual {v2}, Lcom/android/billingclient/api/e;->c()I

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    if-nez p2, :cond_10

    .line 360
    .line 361
    iget-object p2, v0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 362
    .line 363
    invoke-static {p2}, Lcom/android/billingclient/api/e0;->b(Lcom/android/billingclient/api/e0;)Lcom/android/billingclient/api/V;

    .line 364
    .line 365
    .line 366
    move-result-object p2

    .line 367
    invoke-static {v3, v4}, Lcom/android/billingclient/api/U;->c(ILcom/google/android/gms/internal/play_billing/Y2;)Lcom/google/android/gms/internal/play_billing/O2;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-interface {p2, v1, v5, v6, v7}, Lcom/android/billingclient/api/V;->h(Lcom/google/android/gms/internal/play_billing/O2;JZ)V

    .line 372
    .line 373
    .line 374
    goto :goto_a

    .line 375
    :cond_10
    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/d0;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/e;ILcom/google/android/gms/internal/play_billing/Y2;JZ)V

    .line 376
    .line 377
    .line 378
    :goto_a
    iget-object p2, v0, Lcom/android/billingclient/api/d0;->c:Lcom/android/billingclient/api/e0;

    .line 379
    .line 380
    invoke-static {p2}, Lcom/android/billingclient/api/e0;->c(Lcom/android/billingclient/api/e0;)LN4/m;

    .line 381
    .line 382
    .line 383
    move-result-object p2

    .line 384
    invoke-interface {p2, v2, p1}, LN4/m;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 385
    .line 386
    .line 387
    return-void
.end method

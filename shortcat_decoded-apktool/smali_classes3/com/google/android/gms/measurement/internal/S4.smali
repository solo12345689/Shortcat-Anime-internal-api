.class final Lcom/google/android/gms/measurement/internal/S4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/B6;

.field final synthetic c:Lcom/google/android/gms/measurement/internal/w5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/w5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/S4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/S4;->b:Lcom/google/android/gms/measurement/internal/B6;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/S4;->c:Lcom/google/android/gms/measurement/internal/w5;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/S4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/S4;->c:Lcom/google/android/gms/measurement/internal/w5;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->x()Lcom/google/android/gms/measurement/internal/E2;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/E2;->w()Lcom/google/android/gms/measurement/internal/E3;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    sget-object v4, Lj9/v;->c:Lj9/v;

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/E3;->o(Lj9/v;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q2;->t()Lcom/google/android/gms/measurement/internal/o2;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "Analytics storage consent denied; will not get app instance id"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->B()Lcom/google/android/gms/measurement/internal/x4;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/x4;->E(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->x()Lcom/google/android/gms/measurement/internal/E2;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/E2;->h:Lcom/google/android/gms/measurement/internal/D2;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/D2;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    .line 58
    .line 59
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 60
    .line 61
    .line 62
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    goto :goto_4

    .line 66
    :catchall_1
    move-exception v1

    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception v1

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/w5;->N()Lj9/d;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "Failed to get app instance id"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/S4;->b:Lcom/google/android/gms/measurement/internal/B6;

    .line 91
    .line 92
    invoke-static {v4}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-interface {v3, v4}, Lj9/d;->w1(Lcom/google/android/gms/measurement/internal/B6;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/X2;->B()Lcom/google/android/gms/measurement/internal/x4;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4, v3}, Lcom/google/android/gms/measurement/internal/x4;->E(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->x()Lcom/google/android/gms/measurement/internal/E2;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/E2;->h:Lcom/google/android/gms/measurement/internal/D2;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/D2;->b(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/w5;->J()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    .line 130
    .line 131
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/S4;->a:Ljava/util/concurrent/atomic/AtomicReference;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_1
    :try_start_4
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/S4;->c:Lcom/google/android/gms/measurement/internal/w5;

    .line 135
    .line 136
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v3, "Failed to get app instance id"

    .line 147
    .line 148
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    .line 151
    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/S4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 154
    .line 155
    .line 156
    monitor-exit v0

    .line 157
    return-void

    .line 158
    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/S4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 165
    throw v1
.end method

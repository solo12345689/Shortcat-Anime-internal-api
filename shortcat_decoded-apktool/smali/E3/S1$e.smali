.class LE3/S1$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/S1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;

.field final synthetic b:LE3/S1;


# direct methods
.method public constructor <init>(LE3/S1;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LE3/S1$e;->a:Landroid/os/Bundle;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onBindingDied(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 2
    .line 3
    invoke-virtual {p1}, LE3/S1;->z3()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LE3/S1$e;->b:LE3/S1;

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/S1;->z3()LE3/A;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v1, LE3/h0;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LE3/h0;-><init>(LE3/A;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1
    const-string v0, "MCImplBase"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, LE3/S1$e;->b:LE3/S1;

    .line 4
    .line 5
    invoke-static {v1}, LE3/S1;->a3(LE3/S1;)LE3/Y6;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LE3/Y6;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "Expected connection to "

    .line 29
    .line 30
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LE3/S1$e;->b:LE3/S1;

    .line 34
    .line 35
    invoke-static {v1}, LE3/S1;->a3(LE3/S1;)LE3/Y6;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, LE3/Y6;->e()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, " but is connected to "

    .line 47
    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {v0, p2}, Lt2/w;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 62
    .line 63
    invoke-virtual {p1}, LE3/S1;->z3()LE3/A;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p2, p0, LE3/S1$e;->b:LE3/S1;

    .line 68
    .line 69
    invoke-virtual {p2}, LE3/S1;->z3()LE3/A;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance v0, LE3/h0;

    .line 77
    .line 78
    invoke-direct {v0, p2}, LE3/h0;-><init>(LE3/A;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {p1, v0}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :cond_0
    :try_start_1
    invoke-static {p2}, LE3/s$a;->c(Landroid/os/IBinder;)LE3/s;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-nez p2, :cond_1

    .line 93
    .line 94
    const-string p2, "Service interface is missing."

    .line 95
    .line 96
    invoke-static {v0, p2}, Lt2/w;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 100
    .line 101
    invoke-virtual {p1}, LE3/S1;->z3()LE3/A;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p2, p0, LE3/S1$e;->b:LE3/S1;

    .line 106
    .line 107
    invoke-virtual {p2}, LE3/S1;->z3()LE3/A;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    new-instance v0, LE3/h0;

    .line 115
    .line 116
    invoke-direct {v0, p2}, LE3/h0;-><init>(LE3/A;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    :try_start_2
    new-instance v1, LE3/h;

    .line 121
    .line 122
    iget-object v2, p0, LE3/S1$e;->b:LE3/S1;

    .line 123
    .line 124
    invoke-virtual {v2}, LE3/S1;->x3()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    iget-object v4, p0, LE3/S1$e;->a:Landroid/os/Bundle;

    .line 137
    .line 138
    iget-object v5, p0, LE3/S1$e;->b:LE3/S1;

    .line 139
    .line 140
    invoke-static {v5}, LE3/S1;->b3(LE3/S1;)LE3/A;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, LE3/A;->e1()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-direct {v1, v2, v3, v4, v5}, LE3/h;-><init>(Ljava/lang/String;ILandroid/os/Bundle;I)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, LE3/S1$e;->b:LE3/S1;

    .line 152
    .line 153
    iget-object v2, v2, LE3/S1;->c:LE3/X2;

    .line 154
    .line 155
    invoke-virtual {v1}, LE3/h;->b()Landroid/os/Bundle;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {p2, v2, v1}, LE3/s;->s3(LE3/q;Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :catch_0
    :try_start_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v1, "Service "

    .line 169
    .line 170
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string p1, " has died prematurely"

    .line 177
    .line 178
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 189
    .line 190
    invoke-virtual {p1}, LE3/S1;->z3()LE3/A;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object p2, p0, LE3/S1$e;->b:LE3/S1;

    .line 195
    .line 196
    invoke-virtual {p2}, LE3/S1;->z3()LE3/A;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    new-instance v0, LE3/h0;

    .line 204
    .line 205
    invoke-direct {v0, p2}, LE3/h0;-><init>(LE3/A;)V

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :goto_1
    iget-object p2, p0, LE3/S1$e;->b:LE3/S1;

    .line 210
    .line 211
    invoke-virtual {p2}, LE3/S1;->z3()LE3/A;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    iget-object v0, p0, LE3/S1$e;->b:LE3/S1;

    .line 216
    .line 217
    invoke-virtual {v0}, LE3/S1;->z3()LE3/A;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    new-instance v1, LE3/h0;

    .line 225
    .line 226
    invoke-direct {v1, v0}, LE3/h0;-><init>(LE3/A;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 230
    .line 231
    .line 232
    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p1, p0, LE3/S1$e;->b:LE3/S1;

    .line 2
    .line 3
    invoke-virtual {p1}, LE3/S1;->z3()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LE3/S1$e;->b:LE3/S1;

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/S1;->z3()LE3/A;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v1, LE3/h0;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LE3/h0;-><init>(LE3/A;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

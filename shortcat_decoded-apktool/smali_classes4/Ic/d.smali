.class public LIc/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LIc/f;


# instance fields
.field private final a:Landroidx/core/app/q;

.field private b:LIc/e;

.field private final c:LDc/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;LIc/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 9
    .line 10
    new-instance v0, LDc/e;

    .line 11
    .line 12
    invoke-direct {v0, p1}, LDc/e;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LIc/d;->c:LDc/e;

    .line 16
    .line 17
    iput-object p2, p0, LIc/d;->b:LIc/e;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->g(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 1

    .line 1
    iget-object v0, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/CharSequence;ILqb/b;)Landroid/app/NotificationChannel;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lr4/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2, p4}, LIc/d;->f(Ljava/lang/Object;Lqb/b;)V

    .line 6
    .line 7
    .line 8
    iget-object p3, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 9
    .line 10
    invoke-virtual {p3, p2}, Landroidx/core/app/q;->e(Landroid/app/NotificationChannel;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LIc/d;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/app/q;->o()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(Lqb/b;)Z
    .locals 3

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    iget-object v0, p0, LIc/d;->c:LDc/e;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LDc/e;->c(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method protected f(Ljava/lang/Object;Lqb/b;)V
    .locals 3

    .line 1
    invoke-static {p1}, LIc/c;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_0

    .line 8
    .line 9
    :cond_0
    invoke-static {p1}, Lr4/N;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "bypassDnd"

    .line 14
    .line 15
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p2, v0}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p1, v0}, Lr4/n;->a(Landroid/app/NotificationChannel;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const-string v0, "description"

    .line 29
    .line 30
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {p2, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p1, v0}, Lr4/o;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    const-string v0, "lightColor"

    .line 44
    .line 45
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-interface {p2, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {p1, v0}, Lr4/r;->a(Landroid/app/NotificationChannel;I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const-string v0, "groupId"

    .line 63
    .line 64
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    invoke-interface {p2, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, LIc/d;->b:LIc/e;

    .line 75
    .line 76
    invoke-interface {v1, v0}, LIc/e;->c(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    iget-object v1, p0, LIc/d;->b:LIc/e;

    .line 83
    .line 84
    new-instance v2, Lqb/a;

    .line 85
    .line 86
    invoke-direct {v2}, Lqb/a;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, v0, v0, v2}, LIc/e;->a(Ljava/lang/String;Ljava/lang/CharSequence;Lqb/b;)Landroid/app/NotificationChannelGroup;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :cond_4
    invoke-static {v1}, Lr4/K;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p1, v0}, Lr4/p;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    const-string v0, "lockscreenVisibility"

    .line 101
    .line 102
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    invoke-interface {p2, v0}, Lqb/b;->getInt(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, LMc/e;->b(I)LMc/e;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    invoke-virtual {v0}, LMc/e;->k()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-static {p1, v0}, Lr4/s;->a(Landroid/app/NotificationChannel;I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    const-string v0, "showBadge"

    .line 126
    .line 127
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-interface {p2, v0}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-static {p1, v0}, Lr4/k;->a(Landroid/app/NotificationChannel;Z)V

    .line 138
    .line 139
    .line 140
    :cond_7
    const-string v0, "sound"

    .line 141
    .line 142
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const-string v1, "audioAttributes"

    .line 147
    .line 148
    if-nez v0, :cond_8

    .line 149
    .line 150
    invoke-interface {p2, v1}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    :cond_8
    invoke-virtual {p0, p2}, LIc/d;->h(Lqb/b;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {p2, v1}, Lqb/b;->c(Ljava/lang/String;)Lqb/b;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {p0, v1}, LIc/d;->g(Lqb/b;)Landroid/media/AudioAttributes;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {p1, v0, v1}, Lr4/m;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 169
    .line 170
    .line 171
    :cond_9
    const-string v0, "vibrationPattern"

    .line 172
    .line 173
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    invoke-interface {p2, v0}, Lqb/b;->a(Ljava/lang/String;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p0, v0}, LIc/d;->i(Ljava/util/List;)[J

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {p1, v0}, Lr4/v;->a(Landroid/app/NotificationChannel;[J)V

    .line 188
    .line 189
    .line 190
    :cond_a
    const-string v0, "enableLights"

    .line 191
    .line 192
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_b

    .line 197
    .line 198
    invoke-interface {p2, v0}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    invoke-static {p1, v0}, Lr4/q;->a(Landroid/app/NotificationChannel;Z)V

    .line 203
    .line 204
    .line 205
    :cond_b
    const-string v0, "enableVibrate"

    .line 206
    .line 207
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    invoke-interface {p2, v0}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    invoke-static {p1, p2}, Lr4/u;->a(Landroid/app/NotificationChannel;Z)V

    .line 218
    .line 219
    .line 220
    :cond_c
    :goto_0
    return-void
.end method

.method protected g(Lqb/b;)Landroid/media/AudioAttributes;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "usage"

    .line 11
    .line 12
    invoke-interface {p1, v1}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, v1}, Lqb/b;->getInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, LMc/b;->b(I)LMc/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, LMc/b;->k()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string v1, "contentType"

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lqb/b;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, LMc/a;->b(I)LMc/a;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, LMc/a;->k()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 54
    .line 55
    .line 56
    :cond_2
    const-string v1, "flags"

    .line 57
    .line 58
    invoke-interface {p1, v1}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-interface {p1, v1}, Lqb/b;->c(Ljava/lang/String;)Lqb/b;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v1, "enforceAudibility"

    .line 69
    .line 70
    invoke-interface {p1, v1}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const-string v2, "requestHardwareAudioVideoSynchronization"

    .line 75
    .line 76
    invoke-interface {p1, v2}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    or-int/lit8 v1, v1, 0x10

    .line 83
    .line 84
    :cond_3
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method protected h(Lqb/b;)Landroid/net/Uri;
    .locals 2

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_1
    iget-object v0, p0, LIc/d;->c:LDc/e;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, LDc/e;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method protected i(Ljava/util/List;)[J
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [J

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    instance-of v2, v2, Ljava/lang/Number;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    aput-wide v2, v0, v1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v0, LHc/f;

    .line 42
    .line 43
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, v1, p1}, LHc/f;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    return-object v0
.end method

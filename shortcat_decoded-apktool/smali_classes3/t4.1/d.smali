.class public Lt4/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt4/d$a;
    }
.end annotation


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:I

.field public c:Ljava/util/concurrent/TimeUnit;

.field public d:Ljava/lang/Boolean;

.field public e:Lt4/d$a;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lt4/d;->b:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lt4/d;->c:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object v1, p0, Lt4/d;->d:Ljava/lang/Boolean;

    .line 13
    .line 14
    sget-object v1, Lt4/d$a;->c:Lt4/d$a;

    .line 15
    .line 16
    iput-object v1, p0, Lt4/d;->e:Lt4/d$a;

    .line 17
    .line 18
    iput-object v0, p0, Lt4/d;->f:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lt4/d;->g:Ljava/lang/Long;

    .line 21
    .line 22
    iput-object p1, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 23
    .line 24
    const-string v0, "repeatFrequency"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 v2, 0x2

    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-object v0, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 45
    .line 46
    const-string v4, "timestamp"

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lcg/q;->d(Ljava/lang/Object;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lt4/d;->g:Ljava/lang/Long;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    if-eq p1, v3, :cond_1

    .line 65
    .line 66
    if-eq p1, v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const/4 p1, 0x7

    .line 70
    iput p1, p0, Lt4/d;->b:I

    .line 71
    .line 72
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 73
    .line 74
    iput-object p1, p0, Lt4/d;->c:Ljava/util/concurrent/TimeUnit;

    .line 75
    .line 76
    const-string p1, "WEEKLY"

    .line 77
    .line 78
    iput-object p1, p0, Lt4/d;->f:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iput v3, p0, Lt4/d;->b:I

    .line 82
    .line 83
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 84
    .line 85
    iput-object p1, p0, Lt4/d;->c:Ljava/util/concurrent/TimeUnit;

    .line 86
    .line 87
    const-string p1, "DAILY"

    .line 88
    .line 89
    iput-object p1, p0, Lt4/d;->f:Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput v3, p0, Lt4/d;->b:I

    .line 93
    .line 94
    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 95
    .line 96
    iput-object p1, p0, Lt4/d;->c:Ljava/util/concurrent/TimeUnit;

    .line 97
    .line 98
    const-string p1, "HOURLY"

    .line 99
    .line 100
    iput-object p1, p0, Lt4/d;->f:Ljava/lang/String;

    .line 101
    .line 102
    :cond_3
    :goto_0
    iget-object p1, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 103
    .line 104
    const-string v0, "alarmManager"

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    const-string v4, "allowWhileIdle"

    .line 111
    .line 112
    if-eqz p1, :cond_a

    .line 113
    .line 114
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    iput-object p1, p0, Lt4/d;->d:Ljava/lang/Boolean;

    .line 117
    .line 118
    iget-object p1, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string v0, "type"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    invoke-static {v0}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    :cond_4
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/4 v5, 0x3

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    move v2, v5

    .line 150
    :cond_5
    if-eqz v2, :cond_9

    .line 151
    .line 152
    if-eq v2, v3, :cond_8

    .line 153
    .line 154
    if-eq v2, v5, :cond_7

    .line 155
    .line 156
    const/4 p1, 0x4

    .line 157
    if-eq v2, p1, :cond_6

    .line 158
    .line 159
    iput-object v1, p0, Lt4/d;->e:Lt4/d$a;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_6
    sget-object p1, Lt4/d$a;->e:Lt4/d$a;

    .line 163
    .line 164
    iput-object p1, p0, Lt4/d;->e:Lt4/d$a;

    .line 165
    .line 166
    return-void

    .line 167
    :cond_7
    sget-object p1, Lt4/d$a;->d:Lt4/d$a;

    .line 168
    .line 169
    iput-object p1, p0, Lt4/d;->e:Lt4/d$a;

    .line 170
    .line 171
    return-void

    .line 172
    :cond_8
    sget-object p1, Lt4/d$a;->b:Lt4/d$a;

    .line 173
    .line 174
    iput-object p1, p0, Lt4/d;->e:Lt4/d$a;

    .line 175
    .line 176
    return-void

    .line 177
    :cond_9
    sget-object p1, Lt4/d$a;->a:Lt4/d$a;

    .line 178
    .line 179
    iput-object p1, p0, Lt4/d;->e:Lt4/d$a;

    .line 180
    .line 181
    return-void

    .line 182
    :cond_a
    iget-object p1, p0, Lt4/d;->a:Landroid/os/Bundle;

    .line 183
    .line 184
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_b

    .line 189
    .line 190
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 191
    .line 192
    iput-object p1, p0, Lt4/d;->d:Ljava/lang/Boolean;

    .line 193
    .line 194
    sget-object p1, Lt4/d$a;->d:Lt4/d$a;

    .line 195
    .line 196
    iput-object p1, p0, Lt4/d;->e:Lt4/d$a;

    .line 197
    .line 198
    :cond_b
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lt4/d;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lt4/d;->g:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lt4/d;->f:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, -0x1

    .line 22
    sparse-switch v3, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v3, "HOURLY"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x2

    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v3, "DAILY"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v4, 0x1

    .line 47
    goto :goto_0

    .line 48
    :sswitch_2
    const-string v3, "WEEKLY"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v4, 0x0

    .line 58
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    const-wide/16 v2, 0x0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_0
    const-wide/32 v2, 0x36ee80

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :pswitch_1
    const-wide/32 v2, 0x5265c00

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    const-wide/32 v2, 0x240c8400

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v4

    .line 79
    cmp-long v4, v0, v4

    .line 80
    .line 81
    if-gez v4, :cond_4

    .line 82
    .line 83
    add-long/2addr v0, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lt4/d;->g:Ljava/lang/Long;

    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :sswitch_data_0
    .sparse-switch
        -0x679d8b7f -> :sswitch_2
        0x3dce5f9 -> :sswitch_1
        0x7f5e0e71 -> :sswitch_0
    .end sparse-switch

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

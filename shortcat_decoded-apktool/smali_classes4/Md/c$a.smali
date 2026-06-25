.class public final LMd/c$a;
.super Landroid/view/OrientationEventListener;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMd/c;-><init>(Landroid/content/Context;Lexpo/modules/video/records/FullscreenOptions;Lie/a;Lie/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LMd/c;


# direct methods
.method constructor <init>(LMd/c;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LMd/c$a;->a:LMd/c;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    if-le p1, v3, :cond_1

    .line 9
    .line 10
    :cond_0
    const/16 v3, 0x15e

    .line 11
    .line 12
    if-lt p1, v3, :cond_2

    .line 13
    .line 14
    const/16 v3, 0x168

    .line 15
    .line 16
    if-ge p1, v3, :cond_2

    .line 17
    .line 18
    :cond_1
    :goto_0
    move p1, v2

    .line 19
    goto :goto_2

    .line 20
    :cond_2
    const/16 v3, 0x50

    .line 21
    .line 22
    if-lt p1, v3, :cond_3

    .line 23
    .line 24
    const/16 v3, 0x64

    .line 25
    .line 26
    if-gt p1, v3, :cond_3

    .line 27
    .line 28
    :goto_1
    move p1, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    const/16 v3, 0xaa

    .line 31
    .line 32
    if-lt p1, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0xbe

    .line 35
    .line 36
    if-gt p1, v3, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    const/16 v3, 0x104

    .line 40
    .line 41
    if-lt p1, v3, :cond_5

    .line 42
    .line 43
    const/16 v3, 0x118

    .line 44
    .line 45
    if-gt p1, v3, :cond_5

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_5
    move p1, v0

    .line 49
    :goto_2
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 50
    .line 51
    invoke-virtual {v3}, LMd/c;->g()Lexpo/modules/video/records/FullscreenOptions;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Lexpo/modules/video/records/FullscreenOptions;->getAutoExitOnRotate()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_6

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_6
    if-ne p1, v2, :cond_7

    .line 64
    .line 65
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 66
    .line 67
    invoke-static {v3}, LMd/c;->c(LMd/c;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_7

    .line 72
    .line 73
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 74
    .line 75
    invoke-static {v3}, LMd/c;->b(LMd/c;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_7

    .line 80
    .line 81
    move v3, v2

    .line 82
    goto :goto_3

    .line 83
    :cond_7
    move v3, v0

    .line 84
    :goto_3
    if-ne p1, v1, :cond_8

    .line 85
    .line 86
    iget-object v4, p0, LMd/c$a;->a:LMd/c;

    .line 87
    .line 88
    invoke-static {v4}, LMd/c;->d(LMd/c;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    iget-object v4, p0, LMd/c$a;->a:LMd/c;

    .line 95
    .line 96
    invoke-static {v4}, LMd/c;->b(LMd/c;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_8

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_8
    if-eqz v3, :cond_a

    .line 104
    .line 105
    :goto_4
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 106
    .line 107
    invoke-virtual {v3}, LMd/c;->i()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_9

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_9
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 115
    .line 116
    invoke-virtual {v3}, LMd/c;->f()Lie/a;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 124
    .line 125
    invoke-virtual {v3}, LMd/c;->m()V

    .line 126
    .line 127
    .line 128
    :cond_a
    if-ne p1, v2, :cond_b

    .line 129
    .line 130
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 131
    .line 132
    invoke-static {v3}, LMd/c;->d(LMd/c;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_b

    .line 137
    .line 138
    iget-object v3, p0, LMd/c$a;->a:LMd/c;

    .line 139
    .line 140
    invoke-static {v3}, LMd/c;->b(LMd/c;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_b

    .line 145
    .line 146
    move v3, v2

    .line 147
    goto :goto_5

    .line 148
    :cond_b
    move v3, v0

    .line 149
    :goto_5
    if-ne p1, v1, :cond_c

    .line 150
    .line 151
    iget-object p1, p0, LMd/c$a;->a:LMd/c;

    .line 152
    .line 153
    invoke-static {p1}, LMd/c;->c(LMd/c;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_c

    .line 158
    .line 159
    iget-object p1, p0, LMd/c$a;->a:LMd/c;

    .line 160
    .line 161
    invoke-static {p1}, LMd/c;->b(LMd/c;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_c

    .line 166
    .line 167
    move v0, v2

    .line 168
    :cond_c
    if-nez v3, :cond_e

    .line 169
    .line 170
    if-eqz v0, :cond_d

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_d
    :goto_6
    return-void

    .line 174
    :cond_e
    :goto_7
    iget-object p1, p0, LMd/c$a;->a:LMd/c;

    .line 175
    .line 176
    invoke-static {p1, v2}, LMd/c;->e(LMd/c;Z)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

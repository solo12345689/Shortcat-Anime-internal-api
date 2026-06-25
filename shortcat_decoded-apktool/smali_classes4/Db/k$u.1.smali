.class public final LDb/k$u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/k;


# direct methods
.method public constructor <init>(LDb/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$u;->a:LDb/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, Lexpo/modules/filesystem/legacy/RelocatingOptions;

    .line 10
    .line 11
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getFrom()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, LDb/k$u;->a:LDb/k;

    .line 24
    .line 25
    const-string v3, ".."

    .line 26
    .line 27
    invoke-static {v1, v3}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "withAppendedPath(...)"

    .line 32
    .line 33
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object v4, Lexpo/modules/kotlin/services/FilePermissionService$a;->b:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 37
    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v6, "Location \'"

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v6, "\' isn\'t movable."

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v2, v3, v4, v5}, LDb/k;->D(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lexpo/modules/filesystem/legacy/RelocatingOptions;->getTo()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LDb/l;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v2, p0, LDb/k$u;->a:LDb/k;

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2, p1, v4}, LDb/k;->C(LDb/k;Landroid/net/Uri;Lexpo/modules/kotlin/services/FilePermissionService$a;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v3, "file"

    .line 88
    .line 89
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    iget-object v0, p0, LDb/k$u;->a:LDb/k;

    .line 96
    .line 97
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v2, p0, LDb/k$u;->a:LDb/k;

    .line 105
    .line 106
    invoke-static {v2, p1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_0

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    new-instance v0, LDb/g;

    .line 118
    .line 119
    invoke-direct {v0, v1, p1}, LDb/g;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 120
    .line 121
    .line 122
    throw v0

    .line 123
    :cond_1
    iget-object v2, p0, LDb/k$u;->a:LDb/k;

    .line 124
    .line 125
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v1}, LDb/k;->R(LDb/k;Landroid/net/Uri;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    iget-object v2, p0, LDb/k$u;->a:LDb/k;

    .line 135
    .line 136
    invoke-static {v2, v1}, LDb/k;->N(LDb/k;Landroid/net/Uri;)LY1/a;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    invoke-virtual {v2}, LY1/a;->f()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_2

    .line 147
    .line 148
    iget-object v1, p0, LDb/k$u;->a:LDb/k;

    .line 149
    .line 150
    invoke-static {v1, p1}, LDb/k;->X(LDb/k;Landroid/net/Uri;)Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object v1, p0, LDb/k$u;->a:LDb/k;

    .line 155
    .line 156
    invoke-static {v1, v2, p1, v0}, LDb/k;->Y(LDb/k;LY1/a;Ljava/io/File;Z)V

    .line 157
    .line 158
    .line 159
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_2
    new-instance v0, LDb/g;

    .line 163
    .line 164
    invoke-direct {v0, v1, p1}, LDb/g;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 169
    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v2, "Unsupported scheme for location \'"

    .line 176
    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, "\'."

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LDb/k$u;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

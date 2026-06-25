.class public final Lqd/d;
.super Lqd/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/d$c;
    }
.end annotation


# static fields
.field public static final e:Lqd/d$c;


# instance fields
.field private final a:LM3/q;

.field private final b:LM3/i;

.field private final c:Lpd/b;

.field private final d:LM3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqd/d$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqd/d$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqd/d;->e:Lqd/d$c;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LM3/q;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqd/c;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lpd/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lpd/b;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqd/d;->c:Lpd/b;

    .line 15
    .line 16
    iput-object p1, p0, Lqd/d;->a:LM3/q;

    .line 17
    .line 18
    new-instance v0, Lqd/d$a;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lqd/d$a;-><init>(LM3/q;Lqd/d;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lqd/d;->b:LM3/i;

    .line 24
    .line 25
    new-instance v0, Lqd/d$b;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lqd/d$b;-><init>(LM3/q;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lqd/d;->d:LM3/w;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic j(Lqd/d;)Lpd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lqd/d;->c:Lpd/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scopeKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/d;->d:LM3/w;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-interface {v0, v1, p1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    invoke-interface {v0, p1, p2}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 31
    .line 32
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 39
    .line 40
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    .line 42
    .line 43
    :try_start_2
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 44
    .line 45
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lqd/d;->d:LM3/w;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_0

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    :try_start_3
    iget-object p2, p0, Lqd/d;->a:LM3/q;

    .line 58
    .line 59
    invoke-virtual {p2}, LM3/q;->i()V

    .line 60
    .line 61
    .line 62
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    :goto_0
    iget-object p2, p0, Lqd/d;->d:LM3/w;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public b(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "keys"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-super {p0, p1}, Lqd/c;->b(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 15
    .line 16
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 20
    .line 21
    invoke-virtual {p1}, LM3/q;->i()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {v0}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method protected c(Ljava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "keys"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LO3/d;->b()Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "DELETE FROM json_data WHERE `key` IN ("

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0, v1}, LO3/d;->a(Ljava/lang/StringBuilder;I)V

    .line 25
    .line 26
    .line 27
    const-string v1, ")"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "toString(...)"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lqd/d;->a:LM3/q;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, LM3/q;->f(Ljava/lang/String;)LS3/k;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v1, 0x1

    .line 52
    move v2, v1

    .line 53
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {v0, v2, v3}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    add-int/2addr v2, v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 71
    .line 72
    invoke-virtual {p1}, LM3/q;->e()V

    .line 73
    .line 74
    .line 75
    :try_start_0
    invoke-interface {v0}, LS3/k;->Z()I

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 79
    .line 80
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 84
    .line 85
    invoke-virtual {p1}, LM3/q;->i()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 91
    .line 92
    invoke-virtual {v0}, LM3/q;->i()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method protected d(Lrd/b;)V
    .locals 1

    .line 1
    const-string v0, "jsonDataEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/d;->b:LM3/i;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/i;->j(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p1}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 34
    .line 35
    invoke-virtual {v0}, LM3/q;->i()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method protected e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 13

    .line 1
    const-string v0, "getString(...)"

    .line 2
    .line 3
    const-string v1, "key"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "scopeKey"

    .line 9
    .line 10
    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, LM3/t;->i:LM3/t$a;

    .line 14
    .line 15
    const-string v3, "SELECT * FROM json_data WHERE `key` = ? AND scope_key = ? ORDER BY last_updated DESC LIMIT 1;"

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    invoke-virtual {v2, v3, v4}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {v2, v3, p1}, LM3/t;->Z0(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v4, p2}, LM3/t;->Z0(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 30
    .line 31
    invoke-virtual {p1}, LM3/q;->d()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {p1, v2, p2, v3}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :try_start_0
    invoke-static {p1, v1}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    const-string v1, "value"

    .line 47
    .line 48
    invoke-static {p1, v1}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const-string v4, "last_updated"

    .line 53
    .line 54
    invoke-static {p1, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const-string v5, "scope_key"

    .line 59
    .line 60
    invoke-static {p1, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const-string v6, "id"

    .line 65
    .line 66
    invoke-static {p1, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    new-instance v7, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_2

    .line 84
    .line 85
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_0

    .line 104
    .line 105
    move-object v10, v3

    .line 106
    goto :goto_1

    .line 107
    :cond_0
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v10

    .line 111
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    :goto_1
    iget-object v11, p0, Lqd/d;->c:Lpd/b;

    .line 116
    .line 117
    invoke-virtual {v11, v10}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    if-eqz v10, :cond_1

    .line 122
    .line 123
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v12, Lrd/b;

    .line 131
    .line 132
    invoke-direct {v12, v8, v9, v10, v11}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    invoke-virtual {v12, v8, v9}, Lrd/b;->f(J)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    move-exception p2

    .line 147
    goto :goto_2

    .line 148
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    const-string v0, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 151
    .line 152
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, LM3/t;->k()V

    .line 160
    .line 161
    .line 162
    return-object v7

    .line 163
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, LM3/t;->k()V

    .line 167
    .line 168
    .line 169
    throw p2
.end method

.method public g(Lqd/c$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scopeKey"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/q;->e()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lqd/c;->g(Lqd/c$a;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 25
    .line 26
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 30
    .line 31
    invoke-virtual {p1}, LM3/q;->i()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    iget-object p2, p0, Lqd/d;->a:LM3/q;

    .line 37
    .line 38
    invoke-virtual {p2}, LM3/q;->i()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public h(Ljava/util/Map;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "fields"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scopeKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-super {p0, p1, p2}, Lqd/c;->h(Ljava/util/Map;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 20
    .line 21
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 25
    .line 26
    invoke-virtual {p1}, LM3/q;->i()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    iget-object p2, p0, Lqd/d;->a:LM3/q;

    .line 32
    .line 33
    invoke-virtual {p2}, LM3/q;->i()V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public i(Lqd/c$a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scopeKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updater"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/d;->a:LM3/q;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/q;->e()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lqd/c;->i(Lqd/c$a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 25
    .line 26
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lqd/d;->a:LM3/q;

    .line 30
    .line 31
    invoke-virtual {p1}, LM3/q;->i()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    iget-object p2, p0, Lqd/d;->a:LM3/q;

    .line 37
    .line 38
    invoke-virtual {p2}, LM3/q;->i()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
